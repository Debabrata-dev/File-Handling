import java.io.File;

public class MainDelete {
    public static void main(String[] args) {
        File ref=new File("f:/My File/Demo.txt");
        boolean flag=ref.exists();
        if(flag==true){
            ref.delete();
            System.out.println("Delete");
        }
        else{
            System.out.println("Your file is not exist");
        }
    }
}
