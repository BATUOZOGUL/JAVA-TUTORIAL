package day07_nestedForLoopArrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int tersArray[] = new int[5];

        // TODO
        //   int tersArray[]=new int {3,5,6,1,9};

        System.out.println("Arrays.toString(tersArray) = " + Arrays.toString(tersArray));
        System.out.println("terstenSiralamaYazdir(arr) = " + Arrays.toString(terstenSiralamaYazdir(arr)));


    }

    private static int[] terstenSiralamaYazdir(int[] array) {
        Arrays.sort(array);

        int tersArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tersArray[i] = array[array.length - 1 - i];

        }
        return tersArray;
    }


}

