package day01_swapVariable;

public class Casting {
    public static void main(String[] args) {

        int sayi1= 8;
        int sayi2= 4;

        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);//2.6666

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;
        System.out.println("sayi1 = " + sayi1);

        sayi1=4895;
        double sayi3=10;
        sayi1= (int) (sayi1/sayi3);
        System.out.println("sayi1 = " + sayi1);





    }
}