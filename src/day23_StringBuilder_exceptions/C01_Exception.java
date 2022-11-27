package day23_StringBuilder_exceptions;

import java.util.Scanner;

public class C01_Exception {

    public static void main(String[] args) {
        // Kullanicidan iki sayi alip, bolerek
        // soonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);

        int kontrol=0;
        while (kontrol !=2){
            System.out.println("bolmek icin sayi gir");
            int sayi1= scan.nextInt();

            System.out.println("kaca bolceksin sayi gir");
            int sayi2= scan.nextInt();

            double sonuc= 0;

            try {
                sonuc = sayi1/sayi2;
            } catch (ArithmeticException e) {
                System.out.println("0 a bolunemz");

            }


            catch (IndexOutOfBoundsException e) {


            }
            catch (IllegalCallerException e) {


            }
            catch (Exception e) {

            }

            System.out.println("sonuc = " + sonuc);
            System.out.println("devam icin 1 bitirmek icin 2");
            kontrol= scan.nextInt();

        }



    }
}
