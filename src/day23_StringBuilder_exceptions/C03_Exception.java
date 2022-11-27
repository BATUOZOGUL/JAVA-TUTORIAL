package day23_StringBuilder_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class C03_Exception {
    public static void main(String[] args)  {//throws FileNotFoundException,ArithmeticException, IOException,SQLException

        String dosyaYolu="C:\\Users\\pc\\IdeaProjects\\Maastricht\\src\\day23_StringBuilder_exceptions\\hollanda.txt";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;

            while((k=fis.read())!=-1){
                System.out.println("(char)k = " + (char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi");
        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.out.println("dosya bulunamadi");
        }
        System.out.println("*********");


        File myObj = new File("hollanda.txt");
        System.out.println("myObj = " + myObj);

    }
}
