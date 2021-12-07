package HW01_01;

public class HW1_goldbach {
	public int evenNumber=0;
	// prime1Num < prime2Num
	public int primeNum1=0;
	public int primeNum2=0;
	public int subtract;
	
	public void setNumber(int num)
	{
		evenNumber = num;
	}
	
	// ���� ���̰� ���� �Ҽ� �� ���� ã�� �Լ�
	public void findAnswer(int num)	// 2���� ū ¦���� num
	{
		subtract = evenNumber;
		for(int i=3; i<num/2; i++)
		{
			if(isPrime(i)&&isPrime(num-i))	// �� ���� ��� �Ҽ����
			{
				int temp1 = i;
				int temp2 = num-i;
				
				if(temp2-temp1 <= subtract)
				{
					primeNum1 = temp1;
					primeNum2 = temp2;
					subtract = primeNum2 - primeNum1;
				}
			}
		}
	}
	
	public boolean checkAnswer(int num1, int num2)
	{
		int temp;
		if (num1 > num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1==primeNum1 && num2==primeNum2)
			return true;
		else
			return false;
	}
	
	// num�� �Ҽ����� Ȯ���ϴ� �Լ�
	// return true : num == prime
	// return false : num != prime
	public boolean isPrime(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
