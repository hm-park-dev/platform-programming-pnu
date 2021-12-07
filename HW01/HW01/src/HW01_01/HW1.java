package HW01_01;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class HW1 extends JApplet {
	// set face variable
	public static final int FACE_DIAMETER = 200;
	public static final int X_FACE = 100;
	public static final int Y_FACE = 50;
	public static final int EYE_WIDTH = 10;
	public static final int EYE_HEIGHT = 20;
	public static final int X_RIGHT_EYE = 155;
	public static final int Y_RIGHT_EYE = 100;
	public static final int X_LEFT_EYE = 230;
	public static final int Y_LEFT_EYE = Y_RIGHT_EYE;
	public static final int MOUTH_WIDTH = 100;
	public static final int MOUTH_HEIGHT = 50;
	public static final int X_MOUTH = 150;
	public static final int Y_MOUTH = 160;
	public static final int MOUTH_START_ANGLE_ANSWER = 180;
	public static final int MOUTH_EXTENT_ANGLE_ANSWER = 180;
	public static final int MOUTH_START_ANGLE_WRONG = 0;
	public static final int MOUTH_EXTENT_ANGLE_WRONG = 180;
	
	//TODO Define global variables
	Random random = new Random(); //Create Random object
	int problem = generate(); //Genearte the even number between 4 and 10000
	int userNumber1;
	int userNumber2;
	HW1_goldbach goldbach = new HW1_goldbach(); // Create goldbach object
	
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
		
		JOptionPane.showMessageDialog(null, "The number is " + problem);
		goldbach.setNumber(problem);
		goldbach.findAnswer(problem);
		
		String num1String = JOptionPane.showInputDialog("Enter the first number:");
		userNumber1  = Integer.parseInt(num1String);
		
		String num2String = JOptionPane.showInputDialog("Enter the second number:");
		userNumber2 = Integer.parseInt(num2String);
		
	}
	
	public void paint(Graphics canvas) {
		//TODO Write codes for output
		if(goldbach.checkAnswer(userNumber1, userNumber2))
		{
			super.paint(canvas);
			canvas.setColor(Color.GREEN);
			canvas.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
			canvas.setColor(Color.BLACK);
			canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
			canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
			canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
			canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE_ANSWER, MOUTH_EXTENT_ANGLE_ANSWER);
		}
		else
		{
			super.paint(canvas);
			canvas.setColor(Color.RED);
			canvas.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
			canvas.setColor(Color.BLACK);
			canvas.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
			canvas.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
			canvas.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
			canvas.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_START_ANGLE_WRONG, MOUTH_EXTENT_ANGLE_WRONG);
		}
		canvas.drawString("Solution is " + goldbach.primeNum1 + "," + goldbach.primeNum2, 10, 20); //Output for solution
		
	}
	
}

