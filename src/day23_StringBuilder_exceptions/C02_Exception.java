package day23_StringBuilder_exceptions;

import java.util.Scanner;

public class C02_Exception {

    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
        // toplam 500'u gecerse programi bitirsin veya
        // kullanici bitirmek istediginde Q'ya basmalidir

        Scanner scan=new Scanner(System.in);
        int toplam=0;


        do {
            System.out.println("sayilari girmeye basla \n bitimek icin q ya bas");


            int sayi= 0;
            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
                //throw new RuntimeException(e);
                System.out.println("**");
            } finally {
                toplam+=sayi;
            }


           String cikis=scan.next();
            if (cikis.hashCode()=="q".hashCode()){
               System.out.println(toplam);
               break;
           }


        }while (toplam<500);
            System.out.println("toplam "+ toplam);






    }
}
