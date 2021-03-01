import java.util.Scanner;

public class SpyNumbers {
	public static void main(String[] args)
	{
		int number,sum=0,product=1,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		number = sc.nextInt();
		while(number > 0)
		{
			temp = number % 10;
			sum += temp;
			product *= temp;
			number = number/10;
		}
		if(sum == product)
		{
			System.out.println("Given number is spy!!!");
		}
		else
		{
			System.out.println("Given number is not spy");
		}
	}
}
