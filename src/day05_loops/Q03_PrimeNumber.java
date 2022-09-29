package day05_loops;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        boolean asalMi = true;

        int sayi = scan.nextInt();

        if (sayi >= 2) {
            for (int i = 2; i <sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) System.out.println("asal sayi");
            else System.out.println("asal degil");
        }else System.out.println("asal degil");


    }

}
