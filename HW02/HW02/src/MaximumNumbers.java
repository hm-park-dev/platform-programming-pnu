
public class MaximumNumbers {
	// �Է¹��� ���ڿ��� ������ �Լ�
	public static String[] makeArray(String _input, int length)
	{
		String[] result = new String[length];
		result = _input.split(" ");
		
		return result;
	}
	
	// ���� ū ���� ã�� �Լ�
	// return: String
	// param: String, int
	
	public static String findMaximum(String _input, int length)
	{
		String result = "";
		String[] arr = makeArray(_input, length);
		
		for(int i=0; i<arr.length-1; i++)
		{
			for (int j=0; j<arr.length-1; j++)
			{
				if((arr[j]+arr[j+1]).compareTo(arr[j+1]+arr[j])<0) // ��ġ�� �ٲ����
				{
					String temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
			result += arr[i];

		if(result.charAt(0) == '0')
			result = "0";
	
		return result;
	}
}