package day04_methotCreation;

import java.util.Scanner;

public class Armstrong {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
        numbers(4 digit-> exclusive)
            Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
             toplami o sayiyi veriyorsa sayi  Armstrong sayidir
                (0, 1, 153, 370, 371, 407)
                153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
                370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

              soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
              amstrong sayı olup olmadıgını
              gösteren program yazınız */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi=scan.nextInt();//iki tane method create diniz

        armstrong(sayi);//alinan sayi methoda pm olarak verildi ve method calistiirldi
       girilenSayiyaKadarOlanArmstrong(sayi);//giriln sayiyay kadar olan arm sayialairi tespit eden bir logic gelistirildi
            //bunun for looop kullandik
    }
        //soru 2
    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 0; i <=sayi ; i++) {// recursive 153
            armstrong(i);
        }
    }

    private static void armstrong(int n) {
        int sayininKupleriToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=n;

        while(n>0){ //153
            basamaktakiSayi= n % 10; //3 u aldi
            sayininKupleriToplami +=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);//3 un kupounu aldi
            n=n/10;//15 oldu
            //n=n/10;//1 oldu
           // n=n/10;//0 oldu
        }
        if (girilenSayi==sayininKupleriToplami)
            System.out.println(girilenSayi+ " sayisi bir armstroong sayidir " +sayininKupleriToplami);
        else System.out.println(girilenSayi+ " arm degeildiur");

    }


}
