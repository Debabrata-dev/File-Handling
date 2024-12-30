package FileHandeling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class ProgramBuffer {
public static void main(String[] args) {
	BufferedWriter ref=null;
	
	try {
		ref=new BufferedWriter(new FileWriter("f:/My Handel/Sample.txt"));
		ref.write("JAVA");
		ref.newLine();
		ref.write("SQL");
		ref.newLine();
		ref.write(65);
		ref.newLine();
		char[] c= {'J','2','E','E'};
		ref.write(c);
		ref.flush();
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
