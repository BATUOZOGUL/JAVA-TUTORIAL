package day01_swapVariable;

import java.util.Scanner;

public class RakamlarToplami {

    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz


        Scanner scan = new Scanner(System.in);
        System.out.println("4 haneli sayi girniz");
        int sayi=scan.nextInt();// 1 5 6 4

        int rakamlarToplami=0;

        int [] sayilar={2,3,56,8};//69
        for (int i = 0; i <sayilar.length ; i++) {
            rakamlarToplami+=sayilar[i];

        }
        System.out.println("rakamlarToplami arrayden gelen = " + rakamlarToplami);

        int rakam=0;


        //1. adim
        rakam=sayi % 10;
        rakamlarToplami+=rakam;
        sayi/=10; //156

        //2. adim
        rakam=sayi % 10;
        rakamlarToplami+=rakam;
        sayi/=10; //15


        //3. adim
        rakam=sayi % 10;
        rakamlarToplami+=rakam;
        sayi/=10; //1


        //4 . adim
        rakam=sayi % 10;
        rakamlarToplami+=rakam;
        sayi/=10; //0

        System.out.println("rakamlarToplami = " + rakamlarToplami);


    }

}
