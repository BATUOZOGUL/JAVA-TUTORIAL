package day02_ifElseStatements;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b,c;

        System.out.println("enter threee num");
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();

        int large =a>b ? (a>c ? a : c) : (b > c ? b : c);
        System.out.println("large = " + large);


    }
}
