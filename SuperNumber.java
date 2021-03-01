import java.util.Scanner;

public class SuperNumber {
	public static void main(String[] args)
	{
		int number,temp,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		number = sc.nextInt();
		while(number >= 10)
		{
			temp = number;
			sum = 0;
			while(temp > 0)
			{
				sum = sum + (temp%10);
				temp = temp/10;
			}
			number = sum;
		}
		System.out.println("\nSuper digit of the given number is -> "+number);
	}
}
