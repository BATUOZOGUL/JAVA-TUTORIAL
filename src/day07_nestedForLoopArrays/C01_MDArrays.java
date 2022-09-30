package day07_nestedForLoopArrays;

import java.util.Arrays;
import java.util.Scanner;


public class C01_MDArrays {

    public static void main(String[] args) {

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int aNumRows=arr1.length;    //3
        int aNumCols=arr1[0].length;  //2
        int bNumCols=arr2[0].length ;//3

        int [][] m=new int[aNumRows][bNumCols];   //8 9
        System.out.println("Arrays.deepToString(m) = " + Arrays.deepToString(m));

        for (int r = 0; r <aNumRows ; ++r) {
            for (int c = 0; c < bNumCols; ++c) {
                m[r][c]=0;//bos degeri sifir olan container create etmis
                for (int i = 0; i <aNumCols ; ++i) {
                    m[r][c]+= arr1[r][i] * arr2[i][c];
                    System.out.printf("%3d" ,r , c);
                    System.out.println("Arrays.deepToString(m) = " + Arrays.deepToString(m));

                }
            }
        }







//        System.out.println(arr[0][2]); //7
//        System.out.println(arr[1][1]); //10

        //TODO
//        int arr[][]= {{3,1,7}, {6,10,2}};
//
//
//        int arrYeni[] = new int[arr.length];
//        System.out.println("arr.length = " + arr.length);
//
//        for (int kat = arr[0][0]; kat <arr.length ; kat++) {        //2 kat var
//            for (int daire = arr[0][0]; daire <arr[kat].length ; daire++) {// 3 elaman  yine 3 elaman
//                arrYeni[kat]*=arr[kat][daire];
//                System.out.println("Arrays.toString(arrYeni) = " + Arrays.toString(arrYeni));
//            }
//
//        }

        // ilk inner array'in tum elementlerini yazdirin
       // System.out.println(Arrays.toString(arr[0]));   //3 1 7

      //  System.out.println(Arrays.toString(arr));




//        Scanner scan = new Scanner(System.in);
//        double a=scan.nextDouble();
//        double b=scan.nextDouble();
//        int sonuc= (int) (1/((1/a)+(1/b)));
//        System.out.println("sonuc = " + sonuc);


        // MDArray'de tum elementleri bir array olarak yazdirmak istersek




    }
}
