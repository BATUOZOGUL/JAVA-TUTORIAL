package day09_arraysMD;

import java.util.Arrays;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 18.7 ile carp
         *  String de € varsa 18.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"},
                {"€12", "$2", "$0"}};

        double toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*18.7;
                }else  {
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*18.2;
                }

            }
        }
        double dbb[]=new double[1];
        dbb[0]=toplam;
        System.out.println("Arrays.toString(dbb) = " + Arrays.toString(dbb));


    }
}
