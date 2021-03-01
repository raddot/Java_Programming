import java.util.Scanner;

public class PronicNumbers {
	public static void main(String[] args)
	{
		int cnt,number, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number -> ");
		number = sc.nextInt();
		for(cnt=0;cnt<number;cnt++)
		{
			if(cnt*(cnt+1) == number)
			{
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println("Number is pronic!!!");
		}
		else
		{
			System.out.println("Number is not pronic");
		}
	}
}
