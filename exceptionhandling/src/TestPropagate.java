import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestPropagate {
	public void m1() throws FileNotFoundException
	{
		File f=new File("abc.txt");
		FileReader fr=null;
	
		fr=NewFileReader(f);
    try{
    	fr.read();
    }
    catch(IOException e1)
    {
    	e1.printStackTrace();
    }
	
	}

	private FileReader NewFileReader(File f) {
		// TODO Auto-generated method stub
		return null;
	}}


