import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean anagram_str(String str1, String str2)
	{
		char[] w1 = str1.replaceAll("[s]", "").toCharArray();
		char[] w2 = str2.replaceAll("s","").toCharArray();
		Arrays.sort(w1);
		Arrays.parallelSort(w2);
		return Arrays.equals(w1,w2);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1 -> ");
		String str1 = sc.nextLine();
		System.out.println("Enter string2 -> ");
		String str2 = sc.nextLine();
		boolean result = anagram_str(str1,str2);
		if(result  == true)
		{
			System.out.println("String1 and String2 are anagrams");
		}
		else
		{
			System.out.println("String1 and String2 are not anagrams");
		}
		
		
	}
}
