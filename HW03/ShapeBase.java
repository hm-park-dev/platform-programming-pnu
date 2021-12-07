
public abstract class ShapeBase implements ShapeInterface {
	private int offset;
	public abstract void drawHere();
	
	public ShapeBase()
	{
		offset = 0;
	}
	public ShapeBase(int theOffset)
	{
		offset = theOffset;
	}
	public void setOffset(int theOffset)
	{
		offset = theOffset;
	}
	public int getOffset()
	{
		return offset;
	}
	
	public void drawAt(int lineNumber)
	{
		for(int count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}
}
