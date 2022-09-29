package day05_loops;

import java.util.Scanner;

public class Q09_ForLoop04 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.  aeiou

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

 */

    static String sesliHarfler = "aeiou";//static variabler heryerden ulasilabilir
    static String sessizHarfler = "aqzswxdcrfvtgbyhnjmklip";//static variabler heryerden ulasilabilir

    //static String harf;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kelime giriniz :");


        try {
            String   harf = scan.next().toLowerCase();
            if (harf.length()==1){
                // for (int i = 0; i <sesliHarfler.length() ; i++) { fazla oldugunu gormus olduk neden cunku loop gibi dolasma icini contains methodu yapiyor
                if (sesliHarfler.contains(harf)){
                    System.out.println(harf+ "  sesli harf tir");
                    // break;
                } else if (sessizHarfler.contains(harf)) {
                    System.out.println(harf+ "  sessiz harf tir");
                    // break;
                }else{
                    System.out.println("yanlis tek karakter girdiniz");
                    // break;
                }
                //  }
            }else System.out.println("Yanlis karakter girdiniz!");

        } catch (Exception e) {
            throw new RuntimeException(e);



        }




    }



}
