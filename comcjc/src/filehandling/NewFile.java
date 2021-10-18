package filehandling;
import java.io.File;
import java.io.IOException;
public class NewFile {
	public static void main(String args[]) throws IOException
	{
	
		
			File f=new File("C:XYZ","abc.txt");
			f.createNewFile();
		
	System.out.println("successfully");
	System.out.println(f.isFile());
	System.out.println(f.exists());
	System.out.println(f.isDirectory());
	}

}