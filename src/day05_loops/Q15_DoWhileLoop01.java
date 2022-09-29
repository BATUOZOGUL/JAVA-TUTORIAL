package day05_loops;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
    static String okunan;    //okunan null
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        do{
//            System.out.println("harf giriniz");
//             okunan=scan.next();
//            System.out.println("program calisiyor");
//
//        }while(!okunan.equalsIgnoreCase("x"));
//        System.out.println("program bitti");



        while(!okunan.equalsIgnoreCase("x")){
            System.out.println("harf giriniz");
            okunan=scan.next();
            System.out.println("program calisiyor");

            if (okunan.equalsIgnoreCase("x")){
                System.out.println("program bitti");
                break;
            }
        }
    }


}
