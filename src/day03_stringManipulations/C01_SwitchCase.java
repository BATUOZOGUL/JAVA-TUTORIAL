package day03_stringManipulations;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("kacinci ayi oldugunu gir");
        //int ayNo = scan.nextInt();
        String ayIsmi = scan.next().toLowerCase().replaceAll(" ","");


        switch(ayIsmi){
            case "ocak":
                System.out.println("1 ay");
                break;
          /*  case 2:
            case 2:
            case 2:
            case 2:
            case 2:
            case 2:
            case 2:
            case 2:*/
            case "12":
                break;
            default:
                System.out.println("duzgun bise gir");

        }

    }
}
