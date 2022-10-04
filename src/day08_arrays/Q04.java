package day08_arrays;

public class Q04 {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int istenenToplam = 9;
        int[] arr = {2, 7, -6, 4, 2, 15, 3, 8, 1};

        for (int i = 0; i < arr.length; i++) {//arr kontrolu outer array icin

            for (int j = i + 1; j < arr.length; j++) {//sorunun ozel yeri burasi

                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ile " + arr[j] + " toplami " + istenenToplam);
                }
            }
        }
    }
}


