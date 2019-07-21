package funTimes;

import java.util.Arrays;

/**
 * @author Ahmed Nazar
 * Program that finds the order of all elements in a set S {1..... p - 1} where p is a prime number
 * Order the number n when x^n mod p = 1
 *
 */
public class OrderSetsPrimeNumber
{
	/**
	 * @param p is any prime number
	 */
	private static int p = 41;
	
	public static void main(String[] args)
	{
		//p is any prime number
		int i = 1, n = 1;;
		
		/**
		 * tests recursive
		 */
		while(i < p)
		{
			orderRecursive(i, n, p);
			i++;
		}
		
		/**
		 * tests dynamic programming
		 */
		int array[] = orderDP();
		System.out.println(Arrays.toString(array));
	}
	
	/**
	 * recursive version of the ordered set for a given number
	 * @param number
	 * number to find order
	 * @param n
	 * number raised to a specific exponential power, starts at 1
	 * @param p
	 * prime number p
	 * @return
	 * returns the order of the number 
	 */
	public static int orderRecursive(int number, int n, int p)
	{
		if((number % p) == 1)
			return n;
		
		else
		{
			n++; 
			number = number * number;
			return orderRecursive(number, n, p);
		}
	}
	
	/**
	 * computes the order of a given set of elements from 1....p - 1 using dynamic programming
	 * @return
	 */
	public static int[] orderDP()
	{
		int array[] = new int[p - 1];
		array[1] = 1; array[p - 1] = 2;
		
		for(int i = p - 2; i > 1; i--)
		{
			if((i * i) > p - 1) 
			{
				array[i] = computeOrder(i);		
			}
			
			else
			{
				array[i] = 2 * array[i * i];
			}
		}
		return array;
	}
	
	/**
	 * helper method to compute order
	 * @param number
	 * number to compute order of
	 * @return
	 * order of specific number
	 */
	private static int computeOrder(int number)
	{
		int product = number, order = 1;
		
		while((int) Math.pow(number, order) % p != 1)
		{
			product = product * number;
			order++;
		}
		
		return order;
	}
}
