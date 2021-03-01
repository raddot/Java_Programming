import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime 
{
	public static void main(String[] args)
	{
		Date date = new Date();
		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat df2 = new SimpleDateFormat("E");
		SimpleDateFormat df3 = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("The Current Date is - "+df1.format(date));
		System.out.println("Today is - "+df2.format(date));
		System.out.println("The Current Time is - "+df3.format(date));
	}
}
