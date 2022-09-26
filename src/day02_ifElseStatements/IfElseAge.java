package day02_ifElseStatements;

import java.util.Scanner;

public class IfElseAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        if(yas>=60){
            System.out.println("emeklsin");
        }else System.out.println("olamazsin emekli");







    }
}
