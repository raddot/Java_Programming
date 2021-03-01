import java.io.IOException;

public class OpenNotepad {
	public static void main(String[] args)
	{
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("Text Editor");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
