
public class LeftArrow extends ShapeBase{
	private int tail;
	private int width;
	
	public LeftArrow()
	{
		super();
		tail = 0;
		width = 0;
	}
	public LeftArrow(int theOffset, int theTail, int theWidth)
	{
		super(theOffset);
		if(checkEven(theWidth))
		{
			System.out.println("Width must be odd!");
			return ;
		}

		tail = theTail;
		width = theWidth;
	}
	public void set(int newTail, int newWidth)
	{
		if(checkEven(newWidth))
		{
			System.out.println("Width must be odd!");
			return ;
		}
		
		tail = newTail;
		width = newWidth;
	}
	
	public void drawHere()
	{
		drawTop();
		drawTail();
		drawBottom();
	}
	// 화살표의 삼각형 윗부분을 그리기
	public void drawTop()
	{
		int insideWidth = 1 + 2 * (width/2 -1);
		int startOfLine = getOffset() + insideWidth;
		int lineCount = width/2-1;
		
		skipSpaces(startOfLine);
		System.out.println('*');
		insideWidth = 1;
		startOfLine = startOfLine-2;
		
		for(int count = 0; count<lineCount; count++)
		{
			skipSpaces(startOfLine);
			System.out.print('*');
			skipSpaces(insideWidth);
			System.out.println('*');
			
			insideWidth = insideWidth + 2;
			startOfLine = startOfLine - 2;
		}
		
	}
	public void drawBottom()
	{
		int startOfLine = getOffset() + 1;
		int insideWidth = 1 + 2 * (width/2 - 1 -1);
		int lineCount = width/2-1;
		
		for(int count = 0; count<lineCount; count++)
		{
			skipSpaces(startOfLine);
			System.out.print('*');
			skipSpaces(insideWidth);
			System.out.println('*');
			
			startOfLine = startOfLine + 2;
			insideWidth = insideWidth - 2;
		}
		
		skipSpaces(startOfLine);
		System.out.println('*');
	}
	public void drawTail()
	{
		int startOfLine = getOffset();
		int insideWidth = 2 * (width/2 - 1 );
		
		skipSpaces(startOfLine);
		System.out.print('*');
		
		skipSpaces(insideWidth);
		for(int count=0; count<tail; count++)
		{
			System.out.print('*');
		}
		System.out.println();

	}
	private static void skipSpaces(int number)
	{
		for(int count=0; count<number; count++)
		{
			System.out.print(' ');
		}
	}
	private static boolean checkEven(int number)
	{
		if (number%2==0)
			return true;
		else
			return false;
	}
}
