package day07_nestedForLoopArrays;

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {


        // Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int sinir=0;
        //int toplam=0;

        int [][]toplam= new int[3][2];
        System.out.println(" toplam inexteki elemanlarin " + Arrays.deepToString(toplam));


        for (int i = 0; i <arr1.length ; i++) {
            sinir=arr1[i].length;//her seferinde degeri degiscek
            if (arr1[i].length > arr2[i].length){
                sinir=arr2[i].length;
            }
            for (int j = 0; j < sinir; j++) {
                toplam[i][j] =  arr1[i][j] * arr2[i][j];
                if (arr1[i][j] * arr2[i][j]== toplam[2][0]){

                }

                System.out.println(i + " " + j +" toplam inexteki elemanlarin " + Arrays.deepToString(toplam));
            }
        }




    }
}
