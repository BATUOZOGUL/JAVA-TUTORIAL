package day02_ifElseStatements;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("tam sayi gir");

        int sayi=scan.nextInt();

        if (sayi % 2==0){
            System.out.println("cift");
        }else System.out.println("tek");

        System.out.println(sayi % 2==0 ? "cifti sayi ternary" : "tek sayi ternary");


    }
}
