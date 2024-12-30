package FileHandeling;

import java.io.FileReader;
import java.io.IOException;

public class ProgramWrite1 {
public static void main(String[] args) {
	FileReader ref=null;
	try {
		ref=new FileReader("f:/My Handel/demo.txt");
		int val=ref.read();
		while(val!=-1) {
			System.out.print((char)val);
			val=ref.read();
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			ref.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
