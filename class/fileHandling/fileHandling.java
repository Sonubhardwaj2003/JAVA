package fileHandling;
import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException{
        File f1=new File("File");
        f1.createNewFile();
        System.out.println("Is exist : "+f1.exists());
        System.out.println("file size :"+f1.length());
    }
}
