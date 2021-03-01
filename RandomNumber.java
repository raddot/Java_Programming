import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args)
	{
		int length,cnt,rand_num;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many random numbers you want to generate ?");
		length = sc.nextInt();
		Random rand = new Random();
		System.out.println("Generating "+ length + " Random Numbers in the range 0 ... 999");
		for(cnt=0;cnt<length;cnt++)
		{
			rand_num = rand.nextInt(1000);
			System.out.println(rand_num + " ");
		}
	}
}
