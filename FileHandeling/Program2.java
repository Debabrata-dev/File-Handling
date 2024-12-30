package FileHandeling;

import java.io.File;
import java.io.IOException;

public class Program2 {
public static void main(String[] args) {
	File ref=new File("f:/My Handel/Demo.txt");
	boolean flag=ref.exists();
	if(flag==false) {
		try {
			ref.createNewFile();
			System.out.println("A new File is created");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	else {
		System.out.println("Already exist");
	}
}
}
