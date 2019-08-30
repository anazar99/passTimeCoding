package funTimes;

public class SmallestMultiple
{

	public static void main(String[] args)
	{
		System.out.println(findSmallest());

	}
	
	public static int findSmallest()
	{
		for(int i = 21; i < Integer.MAX_VALUE; i++)
		{
			for(int j = 1; j <= 20; j++)
			{
				if(i % j != 0)
					break;
				
				else if(j == 20 && i % j == 0)
					return i;
			}
		}
		return 0;
	}

}
