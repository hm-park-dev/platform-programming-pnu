
import javax.swing.JApplet;
import java.awt.Graphics;
import java.util.Random;

public class HW1 extends JApplet {
	//TODO Define global variables
	Random random = new Random(); //Create Random object
	int problem = generate(); //Genearte the even number between 4 and 10000
	
	private int generate() {
		//TODO Write codes for generate random even number
		int evenNumber = random.nextInt(9997)+4; // 0+4 ~ 9996+4
		
		while(evenNumber%2!=0)		// 짝수가 나올때 까지 random.nextInt() 반복
		{
			evenNumber = random.nextInt(9997)+4;
		}
		
		return evenNumber;
	}
	
	public void init() {
		// 문제 출력 및 입력을 위한 init 함수
		//TODO Write codes for input
		setSize(400,300); //Set JApplet size
	}
	
	public void paint(Graphics canvas) {
		//TODO Write codes for output
		canvas.drawString("Solution is ", 10, 20); //Output for solution
	}
	
	public static void main(String args[]) {
		
	}
}
