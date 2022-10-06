package day10_MDArrays;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran
         bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        //hard task
        String str = "Javacilar cook afilli";

        int count[]=new int[280];

        for (int i = 0; i <str.length() ; i++) {
            count[str.charAt(i)]++; //TODO
        }

        char ch[]=new char[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            ch[i] = str.charAt(i);

            int find=0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==ch[j]){
                    find++;

                }

            }
            if (find==1){
                System.out.print(str.charAt(i)+" = "+count[str.charAt(i)] +" ");
           }
        }
        System.out.println("2 .yol *************************");
        String []arr=str.split("");
        Arrays.sort(arr);

        int counter=0;
        for (int i = 0; i < arr.length ; i++) {
            counter=1;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i].charAt(0)==arr[j].charAt(0)){
                    counter++;
                }else{
                    i=j-1;
                    break;
                }
            }
            System.out.print(arr[i].charAt(0) + " = " +counter+" ");

        }


    }

}
    

