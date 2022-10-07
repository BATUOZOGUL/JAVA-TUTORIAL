package day11_MDarrays;

import java.util.Scanner;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı dizisi giriniz: ");
        String str = scanner.nextLine();

        String[] diziStr=str.trim().split("");
        int [] dizi=new int[diziStr.length];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=Integer.parseInt(diziStr[i]);
        }

        boolean sonuc=threeEvenOrOdd(dizi);
        System.out.println("sonuc = " + sonuc);

    }

    private static boolean threeEvenOrOdd(int[] arr) {
        int sayacCift=0;
        int sayacTek=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2==0){
                sayacCift++;
            }
            if (arr[i] % 2==1){
                sayacTek++;
            }

            if (sayacCift==3 || sayacTek==3){
                return true;
            }
        }
        return false;
    }


}
