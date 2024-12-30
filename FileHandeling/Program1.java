package FileHandeling;

import java.io.File;

public class Program1 {
public static void main(String[] args) {
	File ref=new File("f:/My Handel");
	boolean flag=ref.exists();
	if(flag==false) {
		ref.mkdir();//Create a folder 
		System.out.println("FIle is created");
	}
	else {
		System.out.println("File is already present");
	}
}
}
