/**
 * 
 * @author Ahmed Nazar
 *  Program to find the sum of even Fibonacci numbers
 */

import java.util.Map;
import java.util.HashMap;

public class EvenFibonaccisSum
{

	private static final int MAX_NUMBERS = 4000000;

	private static Map<Integer, Integer> results = new HashMap<>();

	/**
	 * recursively defined fibonacci number generator.
	 * uses hashmap to check if number has been previously generated, this decreases run time
	 * @param n
	 * n fibonacci number
	 * @return
	 * returns nth fibonacci number
	 */
	public static int fibonacci(int n) 
	{
		if(n == 0)
			return 0;
		
		if(n <= 2)
			return 1;
		
		if(results.get(n) != null)
			return results.get(n);
	
		else
		{
			int fibs = fibonacci(n - 1) + fibonacci(n - 2);
			results.put(n, fibs);
			return fibs;
		}
	}

	/**
	 * Checks if the fibonacci is even
	 * @param number
	 * to check
	 * @return
	 * true if even, false otherwise.
	 */
	public static boolean isEven(int number)
	{
		if((number % 2) == 0) 
			return true;

		return false;
	}

	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 2; i < 10; i++) System.out.print(fibonacci(i) + " "); System.out.println();
		
		for(int n = 2; n < MAX_NUMBERS; n++) 
		{
			int number = fibonacci(n);
			
			if(number >= MAX_NUMBERS)
				break;
			
			if(isEven(number))
				sum += number;
			
			else continue;
		}
		
		System.out.println(sum);
	}
	
}
