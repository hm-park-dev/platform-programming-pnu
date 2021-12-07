
public class ArrowDemo {
	public static final int INDENT = 5;
	public static final int TAIL = 16;
	public static final int WIDTH = 7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightArrow ra = new RightArrow(INDENT, TAIL, WIDTH);
		ra.drawHere();
		
		System.out.println();
		
		LeftArrow la = new LeftArrow(INDENT, TAIL, WIDTH);
		la.drawHere();
		
		RightArrow unvaild = new RightArrow(INDENT, TAIL, 6);
	}

}
