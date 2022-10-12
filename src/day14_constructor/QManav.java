package day14_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QManav {
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1","elma - urun kodu : 2",
            "muz - urun kodu : 3",
            "biber - urun kodu : 4", "balcan - urun kodu : 5" ));//urunlerin atanacagi bos list
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0,7.5,1.3,8.7,9.2));//urun fiyatlarinin atanacagi bos list
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        System.out.println(urunListesi);
        musteriSecim();



    }

    private static void musteriSecim() {
        System.out.println("hangi urun alican");
        int secim= scan.nextInt();

        System.out.println("sectigin urunden kac kilo alcan");
        double kilo = scan.nextDouble();

       double urunTutar= urunFiyatlari.get(secim-1);
       double urunToplamTutar=kilo*urunTutar;

       toplamOdenecekTutar+=urunToplamTutar;

        System.out.println("devam icin 1 kasa icin 2");

        int karar= scan.nextInt();
        if (karar==1){
            musteriSecim();
        }else{
            kasa();
        }

    }

    private static void kasa() {
        System.out.println("toplamOdenecekTutar  gule gule = " + toplamOdenecekTutar);
    }


}

