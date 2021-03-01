import java.util.Scanner;

public class RemoveVowel {
	public static void main(String[] args)
	{
		String str_now, str_new;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string -> ");
		str_now = sc.nextLine();
		str_new = str_now.replaceAll("[aeiouAEIOU]", "");
		System.out.println("All vowels are removed successfully!!!");
		System.out.println("The New String is -> "+str_new);
	}
}
