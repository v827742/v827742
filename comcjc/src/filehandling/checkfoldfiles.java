package filehandling;
import java.io.*;
import java.io.IOException;
public class checkfoldfiles {
	public static void main(String[] args)throws IOException
	{
		File f=new File("c:XYZ");
		String[]s=f.list();
		for(int i=0;i<=s.length;i++)
		{
			System.out.println(s[0]);
		}
	}

}
