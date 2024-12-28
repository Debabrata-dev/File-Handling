import java.io.File;

public class MainFolder{
public static void main(String[] args) {
        File ref=new File("f:/My File");//Location
       boolean flag=ref.exists();
       if(flag==false){
        ref.mkdirs();
        System.out.println("File is created");
       }
       else{
        System.out.println("File is already present");
       }
    }
}