package day08_arrays;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random random=new Random();
        int sayi=random.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while(sayi!=tahmin){
            System.out.println("sayi giriniz");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("buyuk oldu kucult");
            } else if (tahmin<sayi) {
                System.out.println("kuvcuk oldu buyult");
            }
            sayac++;
        }
        System.out.println("tuttugum sayiyi "+sayac+ " tahminde buldun");





            
    }
}
