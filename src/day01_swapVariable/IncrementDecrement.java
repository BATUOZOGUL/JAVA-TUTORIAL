package day01_swapVariable;

public class IncrementDecrement {

    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi+10);
        System.out.println(sayi);

        sayi=sayi+10;
        System.out.println("sayi = " + sayi);//30

        System.out.println(sayi= sayi+=10);
        System.out.println("sayi son hali = " + sayi);//40

        System.out.println(sayi+=10);//sayi = sayi+10
        System.out.println("sayi en son hali = " + sayi);//50

        System.out.println("20. satir :" +sayi++);//50 //postinrement
        System.out.println("21. satir :" +sayi);//51

        System.out.println("23.satir :"+ ++sayi );//52 /preincrememnt
        System.out.println("24. satir :" + sayi);//52


    }

}
