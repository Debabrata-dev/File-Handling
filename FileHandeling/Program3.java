package FileHandeling;

import java.io.File;

public class Program3 {
public static void main(String[] args) {
	File ref=new File("c:/My Handel/Demo.txt");
	boolean flag=ref.exists();
	if(flag==true) {
		ref.delete();
		System.out.println("Deleted");
	}
	else {
		System.out.println("Not found");
	}
}
}
