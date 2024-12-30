package BestFile_Writer;

import java.io.IOException;
import java.io.PrintWriter;
//print Writer
public class Program {
public static void main(String[] args) {
	PrintWriter ref=null;
	try {
		ref=new PrintWriter("f:/My Handel/demo1.txt");
		ref.println("JSPIDER");
		ref.println("JAVA FULL STACK");
		ref.println("PYSPIDER");
		ref.println("PYTHON SPIDER");
		ref.println(95);
		ref.flush();
		System.out.println("Writing is completed");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		ref.close();
	}
}
}
