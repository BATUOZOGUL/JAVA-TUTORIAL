package day03_stringManipulations;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //  String str1 = “$13.99”
        //  String str2 = “$10.55”
        //  ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";

        System.out.println("str1.replaceAll(\"\\\\D\",\"\") = " + str1.replaceAll("\\D", ""));
        // \\D non digit demek rakam hariuci herseyi kapsar
        // \\d  digit demek tum rakamlari kapsar

        str1= str1.replaceAll("\\D", "");
        str2= str2.replaceAll("\\D", "");

        System.out.println("str2.replaceAll(\"\\\\D\",\"\") = " + str2.replaceAll("\\D", ""));

        Double str1Sayi =Double.parseDouble(str1);
        System.out.println("str1Sayi = " + str1Sayi);

        double str2Sayi=Double.valueOf(str2);
        System.out.println("str2Sayi = " + str2Sayi);

        System.out.println("$ "+(str1Sayi+str2Sayi));

    }
}
