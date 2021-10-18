package filehandling;
import java.io.File;
import java.io.IOException;

public class A 
	{
	public static void main(String args[]) throws IOException 
	{
	File f=new File("abc.txt");
	f.createNewFile();
	System.out.println("create new file Successfuly");
	}
	}


