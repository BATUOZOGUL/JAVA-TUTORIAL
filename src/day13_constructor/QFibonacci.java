package day13_constructor;


import java.util.*;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tamsayı giriniz : ");
        int sayi = scan.nextInt();


        System.out.println("fibonacci(sayi) = " + fibonacci(sayi));

    }
    public static List<Integer> fibonacci(int sayi){
        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        System.out.println("fibo = " + fibo);
        for (int i = 0; fibo.get(i)+ fibo.get(i+1 ) <sayi ; i++) {
            fibo.add(fibo.get(i )+ fibo.get(i+1 ));
        }
        return fibo;



    }

}
