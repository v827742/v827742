package fileWriterAndReader;

import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		FileWriter fr=new FileWriter("A.java");
		fr.write("A");
		fr.write('a');
		fr.write("\n");
		fr.write("pqr");
		fr.flush();
		fr.close();
		
	}

}
