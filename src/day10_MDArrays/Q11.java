package day10_MDArrays;

import java.util.Arrays;

public class Q11 {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        //System.out.println("arrToplam = " + Arrays.toString(arrToplam));
        System.out.println( Arrays.toString(arrayShow(arr1, arr2)));
    }
    public static int[] arrayShow(int arr1[][], int arr2[][]) {
        int arrToplam[] = new int[2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arrToplam[0] += arr1[i][j];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arrToplam[1] +=arr2[i][j];
            }
        }

        return arrToplam;
    }
}