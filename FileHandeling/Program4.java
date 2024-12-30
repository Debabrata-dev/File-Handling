package FileHandeling;

import java.io.File;

public class Program4 {
public static void main(String[] args) {
	File ref=new File("f:/My Handel/Demo.txt");
	boolean flag=ref.exists();
	if(flag==true) {
		System.out.println("File location "+ref.getAbsolutePath());
		System.out.println("Length "+ref.length());
	}
	else {
		System.out.println("File is not found");
	}
}
}
