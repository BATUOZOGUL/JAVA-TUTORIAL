package day05_loops;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");

        double yukseklik = scan.nextDouble();

        int yerevurmaSayisi = 0;
        double topunToplamYolu = 0;
//        do{
//            yerevurmaSayisi++; //top yere carpti
//            topunToplamYolu += yukseklik; //yer carpana kadar gelen mesafe topin topklam yoluna atandi
//            yukseklik*=(0.75); //top yukseldi
//            topunToplamYolu += yukseklik;
//        }while (yukseklik>=1);


        while (yukseklik >= 1) {
            yerevurmaSayisi++; //top yere carpti
            topunToplamYolu += yukseklik; //yer carpana kadar gelen mesafe topin topklam yoluna atandi
            yukseklik *= (0.75); //top yukseldi
            topunToplamYolu += yukseklik;

        }
        System.out.println("yerevurmaSayisi = " + yerevurmaSayisi);
        System.out.println("topunToplamYolu = " + topunToplamYolu);



    }
}