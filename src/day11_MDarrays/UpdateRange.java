package day11_MDarrays;

import java.util.Arrays;

public class UpdateRange {


    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


   /*
        UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

   Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

    public static void main(String[] args) {

        int[] array = {1, 6, 12, 15, 22, 18, 30, 16};

        int min = 10;
        int max = 20;

       int[] dizi=uRange(array,min,max);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

    }

    private static int[]  uRange(int[] array, int min, int max) {
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>min &&     array[i]<max ){
                array[i]=-1;
            }
        }
        return array;
    }

}
