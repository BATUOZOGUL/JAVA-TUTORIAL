package day15_OOP_project_staticKeyword_passByValue;

public class C05_PassByValue {
    /* eger bor method da yapilan degisikligin kalici olmasini istiyorsak
        bu yontem kullanabiliriz
        1) variable i class level da static olarak olusturabilirz
     */
    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();

    }

    public static void kaliciIndirimYap() {
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("etiketFiyati = " + etiketFiyati);

    }

}
