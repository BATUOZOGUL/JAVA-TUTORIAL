package day02_ifElseStatements;

import java.util.Scanner;

public class IfElseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gunismi girniz");


        String gun=scan.nextLine().toLowerCase(); //Pazar


        if (gun.equals("pazar") || gun.equals("cumartesi")){
            System.out.println("hafta sonu");
        }



    }
}
