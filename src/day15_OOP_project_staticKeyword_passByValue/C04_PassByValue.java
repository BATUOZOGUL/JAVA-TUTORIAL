package day15_OOP_project_staticKeyword_passByValue;

public class C04_PassByValue {
    public static void main(String[] args) {
        /* java Pass By Value bir programlama dilidri
        yanni bir primitive variaable i argument olarak bir method a yollarsaniz
        java o variable i degil degerini(value) method a aktarir pass eder

         */

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra etiketFiyati = " + etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {
        //etiketFiyati=133; bunu yazarsan passbyvalue olmaz
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("%10 indirimli etiketFiyati = " + etiketFiyati);

    }
}
