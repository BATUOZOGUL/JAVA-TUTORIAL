package day01_swapVariable;

public class AutoWidening {

    public static void main(String[] args) {
        boolean dogruMu =true;

        //String str=dogruMu;

        byte sayi1=44;

        System.out.println(sayi1);

        short sayi2=sayi1;//java bunu kabul eder akra planda bunu auto widening

        System.out.println("sayi2 = " + sayi2);




    }

}
