package filehandling;
import java.io.File;
import java.io.IOException;
public class FolderFile {
	public static void main(String args[]) throws IOException
	{
		File f=new File("XYZ");
		f.mkdir();
		File f1=new File(f,"abc.txt");
		f1.createNewFile();
		System.out.println("sucessfully");
	}

}
