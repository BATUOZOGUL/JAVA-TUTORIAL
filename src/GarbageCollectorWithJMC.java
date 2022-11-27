import java.util.Scanner;

public class GarbageCollectorWithJMC {

    public static void main(String[] args) {
        String str1 = new String("garbage");     //stack de str1       heap de garbage
        String str2 = new String("garbage");   //stack de str2      heap de garbage
        int number = 10;                          //stack de number=10

        //islem bitimi stack bosalir heap dekiler kalir cop kalir
        //java da otomatik gc vardir silmemize gerek yoktur


        if (str2.equals(str1)) {
            System.out.println("esit");
        } else System.out.println("esit degil");

        if (str2 == (str1)) {
            System.out.println("esit");
        } else System.out.println("esit degil");


        System.out.println("temizlik icin runtime yaziniz");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();


        if (input.equalsIgnoreCase("runtime")) {
            Runtime.getRuntime().gc();
            System.out.println("temizlik yapildi");
        }

        System.out.println("temizlik icin runtime yaziniz");

        String input2 = scan.next();

        if (input2.equalsIgnoreCase("runtime")) {
            Runtime.getRuntime().gc();
            System.out.println("temizlik yapildi");
        }
    }
}
