package day02_ifElseStatements;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
        Write a program to find the factorial value of any number
         entered through the scanner class.
        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girjniz");

        String strNum=scan.nextLine();

        int faktorial=1;
        int number=Integer.parseInt(strNum);

        for (int i = 1; i <=number ; i++) {
           faktorial*=i;     //faktor= 1  i = 1  = faktoro
        }
        System.out.println(faktorial);






    }
}
