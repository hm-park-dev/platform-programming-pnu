import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LifeDethProbabilityDemo {
	public static void main(String[] args)
	{
		String fileName = "LifeDethProbability.txt";
		Scanner inputStream = null;
		
		try
		{
			inputStream = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the sex: (man: 1 / woman: 2)");
		int inputSex = keyboard.nextInt();
		if (!(inputSex == 1 || inputSex == 2))
		{
			System.out.println("Error: invalid number");
			System.exit(0);
		}
		
		System.out.println("Enter the age: (0 ~ 119)");
		int inputAge = keyboard.nextInt();
		int expectationAge = inputAge;
		int fileAge = -1;
		
		String line = null;
		String words[] = null;
		
		while((inputAge!=fileAge) && (inputStream.hasNextLine()))
		{
			line = inputStream.nextLine();
			words = line.split("\\s");
			fileAge = Integer.parseInt(words[0]);
			
		}
		
		double dethProbability = 0;
		if(inputSex == 1)	// man
		{
			while(inputStream.hasNextLine())
			{
				if (0 <= expectationAge && 10>expectationAge)
				{
					dethProbability = Double.parseDouble(words[2]);
				}
				else
				{
					dethProbability = Double.parseDouble(words[1]);
				}
				
				double random = Math.random();
				
				if (random < dethProbability)
				{
					System.out.println("Death - expection life: " + expectationAge);
					System.exit(0);
				}
				else
				{
					expectationAge++;
					System.out.println("Live - Age: " + expectationAge + " man");
				}
				
				line = inputStream.nextLine();
				words = line.split("\\s");
			}
			dethProbability = Double.parseDouble(words[1]);
			
			double random = Math.random();
			if (random < dethProbability)
			{
				System.out.println("Death - expection life: " + expectationAge);
				System.exit(0);
			}
			else
			{
				expectationAge++;
				System.out.println("Live - Age: " + expectationAge + " man");
			}
		}
		else				// woman
		{
			while(inputStream.hasNextLine())
			{
				if (0 <= expectationAge && 10>expectationAge)
				{
					dethProbability = Double.parseDouble(words[3]);
				}
				else
				{
					dethProbability = Double.parseDouble(words[2]);
				}
				double random = Math.random();
				
				if(random < dethProbability)
				{
					System.out.println("Death - expection life: " + expectationAge);
					System.exit(0);
				}
				else
				{
					expectationAge++;
					System.out.println("Live - Age: " + expectationAge + " woman");
				}
				
				line = inputStream.nextLine();
				words = line.split("\\s");				
			}
			dethProbability = Double.parseDouble(words[2]);
			
			double random = Math.random();
			
			if (random < dethProbability)
			{
				System.out.println("Death - expection life: " + expectationAge);
				System.exit(0);
			}
			else
			{
				expectationAge++;
				System.out.println("Live - Age: " + expectationAge + " man");
			}
		}
		
		inputStream.close();
	}
}
