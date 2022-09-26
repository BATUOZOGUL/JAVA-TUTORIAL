package day02_ifElseStatements;

import java.util.Scanner;

public class IfElseChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch=scan.next().charAt(0);

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') ){
            System.out.println("girdiginiz karakter harftir");
            System.out.println(ch+1);
            System.out.println(ch);

        }else{
            System.out.println(" girilen karaktrer = ");
        }



    }
}
