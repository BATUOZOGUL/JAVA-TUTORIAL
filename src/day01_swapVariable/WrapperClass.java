package day01_swapVariable;

public class WrapperClass {
    public static void main(String[] args) {


        String str="Java";


        int sayi =10;

        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str = " + str);

        //double sayi2=20.5;//primitive

        Double sayi3=15.2;

        short sayi1=20;
        Short sayi2=30;

        sayi1=sayi2;
        System.out.println("sayi1 = " + sayi1);

        String str1="54321";
        String str2="12345";

        System.out.println(str1+str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));


        System.out.println("str1+str2 = " + str1 + str2);


    }
}
