package day06_;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
    static Scanner scan = new Scanner(System.in);
    static String word = "";

    public static void main(String[] args) {


       // do {
            System.out.println("birsey giriniz ");

            word = scan.next();

            if (word.length()<3){
                System.out.println("string ifaden 3 karakterden az");//break dene
            }
            if (word.length() % 2==1 && word.length()>=3){              //qwert icin 0. ci indexte ki eleman =q
                                                                        //qwert icin 1.ci eleman mANTIK length ine gore = q
                                                                        //qwert icin length()-1 index teki = t nin index sayisi = 4
                                                                        // qwert icin lenth() = 5

                System.out.println(" string ortasinda karakter : "+ word.charAt(word.length() / 2));
                System.out.println(word.length());
                System.out.println(word.length()/2);
               // qwert
                System.out.println("word.indexOf(2) = " + word.indexOf("er")); //e

            }
            else{
                System.out.println("You entered wrong word. * /");
            }


       // } while ();


    }

}
