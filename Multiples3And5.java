/**
 * 
 * @author Ahmed Nazar
 *  Program to find the sum of n numnbers that are multiples of 3 or 5
 */


public class Multiples3And5
{
	/**
	 * constructor that does nothing
	 */
	public Multiples3And5()
	{
		//do nothing
	}
	
	/**
	 * method to check if multiple of 3
	 * @param n
	 * number to check
	 * @param sumBound
	 * bound of sum
	 * @return
	 * true if multiple, false otherwise
	 */
	public boolean isMultiple3(int n, int sumBound)
	{
		if(n > sumBound && n < 0) throw new NullPointerException("invalid argument");
		if(n % 3 == 0) return true;
		else return false;
	}
	
	/**
	 * method to check if multiple of 5
	 * @param n
	 * number to check
	 * @param sumBound
	 * bound of sum
	 * @return
	 * true if multiple, false otherwise
	 */
	public boolean isMultiple5(int n, int sumBound)
	{
		if(n > sumBound && n < 0) throw new NullPointerException("invalid argument");
		if(n % 5 == 0) return true;
		else return false;
	}
	
	/**
	 * method that returns n if it is a multiple to check sum
	 * @param n
	 * number to check
	 * @param sumBound
	 * bound of sum
	 * @return
	 * multiple of 3 or 5
	 */
	public int findSum(int n, int sumBound)
	{
		if(n > sumBound && n < 0) throw new NullPointerException("invalid argument");
		if(isMultiple3(n, sumBound) || isMultiple5(n, sumBound)) return n;
		else return 0;
	}
	
	/**
	 * tests the program to find the sum of n numbers
	 */
	public void testApp(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum = sum + findSum(i, n);
		}
		
		System.out.println("Sum of " + n + " numbers that are multiples of 3 or 5 is " + sum);
	}
	
	public static void main(String[] args)
	{
		Multiples3And5 testIt = new Multiples3And5();
		testIt.testApp(1000);
	}
}
