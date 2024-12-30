package FileHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramBufferReader {
public static void main(String[] args) {
	BufferedReader ref=null;
	try {
		ref=new BufferedReader(new FileReader("f:/My Handel/demo.txt"));
		String line=ref.readLine();
		while(line!=null) {
			System.out.println(line);
			line=ref.readLine();
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			ref.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
