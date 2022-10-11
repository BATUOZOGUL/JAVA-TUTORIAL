package day13_constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
//asList()--> String olarak verilen ifadelerin hepsini ArrayList!'in içine atar.
// Yani list oluşturur. tek tek add demek zorunda kalmayiz
        ArrayList<String> aOlmayanIsimler = new ArrayList<>();//a olmayan ismlerin atanacagı bos list create edildi



    }

}
