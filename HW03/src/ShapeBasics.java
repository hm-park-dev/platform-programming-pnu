
public class ShapeBasics extends ShapeBase{
	private int offset;
	public ShapeBasics()
	{
		offset = 0;
	}
	public ShapeBasics(int theOffset)
	{
		offset = theOffset;
	}
	
	public void setOffset(int newOffset)
	{
		offset = newOffset;
	}
	public int getOffset()
	{
		return offset;
	}
	public void drawHere()
	{
		for (int count=0; count<offset; count++)
			System.out.print(' ');
		System.out.println('*');
	}
}
