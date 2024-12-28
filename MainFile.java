import java.io.File;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
        File ref=new File("f:/My File/Demo.txt");
           boolean flag=ref.exists();
           if(flag==false){
            try {
                ref.createNewFile();
                System.out.println("A new file is creared");
            } catch (IOException e) {
                e.printStackTrace();
            }
           
           }
           else{
   System.out.println("File is already present");
           }
    }
}
