package FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class ProgramWrite {
public static void main(String[] args) {
	FileWriter ref=null;
	try {
	ref=new FileWriter("f:/My Handel/demo.txt",true);//true is over write this 
	ref.write("JAVA");
	ref.write("\n");
	ref.write("SQL");
	ref.write("\n");
	ref.write(65);
	ref.write("\n");
	char[] c= {'J','2','E','E'};
	ref.write(c);
	ref.flush();
	System.out.println("FIle Writing is done");
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

