package day09_arraysMD;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";


        String arr[]=str.split(" ");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int toplamDolar=0;
        int toplamPound=0;

        for (int i = 0; i <arr.length ; i++) {
          //  if (arr[i].contains("$")){
            if (arr[i].startsWith("$")){
               // arr[i]=arr[i].replace("$" , "");
                arr[i]=arr[i].substring(1);

                toplamDolar+= Integer.parseInt(arr[i]);
            }else {
               // arr[i]=arr[i].replace("£" , "");
                arr[i]=arr[i].substring(1);
                toplamPound+=Integer.parseInt(arr[i]);
            }
        }

        System.out.println("toplamDolar = " + toplamDolar);
        System.out.println("toplamPound = " + toplamPound);

    }
}


