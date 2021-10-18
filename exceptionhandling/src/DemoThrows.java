import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class DemoThrows {
	public void m1()throws IOException
	{
		File f=new File("CDMA.java");
		f.createNewFile();
		
		System.out.println("successfully");
	}

	public void m2()throws IOException
	{
		System.out.println("m2---control");
		m1();
	}
	public void m3()throws IOException
	{
		System.out.println("m3-----control");
		m2();
	}
	public static void main(String[] args) {
		System.out.println("main      Start");
		DemoThrows d=new DemoThrows();
		try {
			d.m3();
		} catch (Exception e1) {
			System.out.println("catch-----block");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
