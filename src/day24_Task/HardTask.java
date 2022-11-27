package day24_Task;

import java.util.ArrayList;
import java.util.Collections;

public class HardTask {
     /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun  ***
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
Colections.sort(arr1)
     */
     public static void main(String[] args) {
         ArrayList <Integer> arr1=new ArrayList<>();
         ArrayList <Integer> arr2;

         arr1=elemanEkle(10,0,20);//arr3 10 elemanli arr1 e atandi
         arr2=elemanEkle(5,0,20);//arr3 5 elemanli arr2 ye atandi

         System.out.println("arr1 = " + arr1);
         System.out.println("arr2 = " + arr2);

         ArrayList <Integer> fark=new ArrayList<>(arr1);

         ArrayList <Integer> arr2Copy=new ArrayList<>(arr2);

         System.out.println("fark = " + fark);

         arr1.removeAll(arr2);
         System.out.println("arr1 = " + arr1);
       //  arr2.removeAll(fark);
         System.out.println("arr2 = " + arr2);

         //iki cozum bir arada
         arr2Copy.removeAll(fark);
         arr2.removeAll(arr2Copy);
         System.out.println("arr2 = " + arr2);
         System.out.println("arr2Copy = " + arr2Copy);
         arr2Copy.stream().filter(b->b %2==0).forEach(System.out::println);



         arr1.addAll(arr2);
         Collections.sort(arr1);
         Collections.reverse(arr2);


         System.out.println("arr1 = " + arr1);
         System.out.println("arr2 = " + arr2);


     }
     private static ArrayList<Integer> elemanEkle(int size,int min,int max){
         ArrayList <Integer> arr3=new ArrayList<>();
//         for (int i = 0; i <size ; i++) {
//             arr3.add(getRandom(min,max));
//         }
//         return arr3;
         for (int i = 0; i <size ; i++) {
             int a = (int) (Math.random() * 20);
             arr3.add(a);

         }
         return arr3;
     }
     private static int getRandom(int min , int max){
         return (int) (Math.random() *(max - min +1));//syntax
     }



}
