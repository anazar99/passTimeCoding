package funTimes;

/**
 * Largeset Palindrom Product
 * @author Ahmad Nazar
 * Code that finds the largest palindrom product of two 3 digit numbers
 * Uses a dynamic programming approach
 * Runtime: O(n^2)
 *
 */
public class LargestPalindromeProduct
{
	private static int[][] array = new int[1000][1000];

	public static void main(String[] args)
	{
		checkLargest();
		System.out.println(findMax(array));
		
	}

	public static boolean isPalindrome(int value)
	{
		String val = Integer.toString(value);
		int half = val.length() / 2;

		String valHalfa = val.substring(0, (val.length() / 2));
		String valHalfb = val.substring(half, half * 2);
		StringBuilder input = new StringBuilder();

		input.append(valHalfb);
		input = input.reverse();
		valHalfb = input.toString();

		return valHalfa.equals(valHalfb);
	}

	public static void checkLargest()
	{
		int product = 0;
		int begin = 100;
		int end = 999;

		for (int i = begin; i <= end; i++)
		{
			for (int j = begin; j <= end; j++)
			{
				product = i * j;
				if((isPalindrome(product)))
				{
					array[i][j] = product;
				}
			}
		}
	}

	public static int findMax(int arr[][])
	{
		int maxElement = Integer.MIN_VALUE;

		for (int i = 0; i < 1000; i++)
		{
			for (int j = 0; j < 1000; j++)
			{
				if(arr[i][j] > maxElement)
				{
					maxElement = arr[i][j];
				}
			}
		}

		return maxElement;
	}
}
