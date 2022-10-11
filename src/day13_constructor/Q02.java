package day13_constructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class Q02 {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        yeniList(isim);
    }
    private static void yeniList(String[][] isim) {

        List<String> list1=new ArrayList<>();

        for (int i = 0; i < isim.length ; i++) {
            for (int j = 0; j < isim[i].length; j++) {
                list1.add(isim[i][j]);//ilk elemanin icindeki ilk eleman ==>i ve j sifir ike {"Ali", "Veli", "Ayse"} dan aliyi alir
            }
        }
        System.out.println("list1 = " + list1);
        sort(list1);
        //Collections.sort(list1);
        System.out.println("list1 = " + list1);


    }


}
