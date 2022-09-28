package day04_methotCreation;

import java.util.Scanner;

public class Q04_MethodCreation04 {
    /*
     * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
     * toplamini dondursun.
     *
     * Ornek
     * input : ade1r4d3
     * output : 8
     *

     */
		/*
            Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500


	        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");
        String yazi = scan.nextLine();

        sumOfDigit(yazi);

        Scanner sc = new Scanner(System.in);
        char variable = sc.findInLine(".").charAt(0);
        System.out.println("variable = " + variable);


    }

    private static void sumOfDigit(String str) {

        int sum=0;

        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                sum+=Integer.valueOf(""+str.charAt(i));
            }

        }
        System.out.println("girilen stringdeki sayilarin toplami " + sum);


    }

}

