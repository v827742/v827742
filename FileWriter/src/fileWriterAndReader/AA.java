package fileWriterAndReader;
import java.io.FileReader;
import java.io.IOException;
public class AA {
	public static void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("A.java ");
		int i=fr.read();
		System.out.println(i);
		int j=fr.read();
		System.out.println(j);
		char d=(char)fr.read();
		System.out.println(d);
		
	}

}
