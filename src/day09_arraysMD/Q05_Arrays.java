package day09_arraysMD;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        System.out.println("arr = " + arr);

        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i +" . nci elemani girin");
            arr[i]=scan.nextInt();

            if (arr[i] % 3==0 ){
                counter++;
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("3 e bolunen sayi "+counter);






    }
}
