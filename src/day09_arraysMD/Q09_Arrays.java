package day09_arraysMD;

import java.util.Arrays;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int multiArr [][] = {{1,3,6},{2,8},{5,7,9,14}};

        System.out.println("ciftElemanToplami(multiArr) = " + Arrays.toString(ciftElemanToplami(multiArr)));

    }
    private static int[] ciftElemanToplami(int[][] multiArr) {
        int sum1[]=new int[1];
        int toplama=0;
        for (int i = 0; i <multiArr.length ; i++) {
            for (int j = 0; j <multiArr[i].length ; j++) {
                if (multiArr[i][j] % 2==0){
                    //sum[i]=multiArr[i][j];
                  //  int sum[]=new int[multiArr.length+1];
                    toplama += multiArr[i][j];
                   sum1[0]=toplama;

                }
            }
        }
        return sum1;


    }


}
