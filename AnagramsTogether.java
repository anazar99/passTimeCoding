package funTimes;

import java.util.*;

/**
 * 
 * @author Ahmad Nazar
 *	Code that takes in an input of strings that contain anagrams of each other, and sorts them together.
 *  Uses hashing
 */

public class AnagramsTogether
{
	private static void printAnagrams(String arr[])
	{
		HashMap<String, List<String>> hashbrown = new HashMap<>();

		for (int i = 0; i < arr.length; i++)
		{
			String anagram = arr[i];
			char[] letters = anagram.toCharArray();
			
			Arrays.sort(letters);
			String newAnagram = new String(letters);

			if(hashbrown.containsKey(newAnagram))
				hashbrown.get(newAnagram).add(anagram);

			else
			{
				List<String> words = new ArrayList<>();
				words.add(anagram);
				hashbrown.put(newAnagram, words);
			}
		}

		for (String s : hashbrown.keySet())
		{
			List<String> values = hashbrown.get(s);

			if(values.size() > 1)
				System.out.print(values);

		}
	}

	public static void main(String[] args)
	{
		String arr[] = { "cat", "dog", "tac", "god", "mat", "tam"};
		printAnagrams(arr);
	}

}
