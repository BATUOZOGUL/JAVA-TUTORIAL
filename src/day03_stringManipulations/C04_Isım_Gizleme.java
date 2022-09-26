package day03_stringManipulations;

public class C04_Isım_Gizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim ="Batu bey";
        String soyIsim="ozogul";
        String kKartNo="2142342342421434";

        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        System.out.println("yeniIsim = " + yeniIsim);

        String soyIsimSon=soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\S","*");
        System.out.println("soyIsimSon = " + soyIsimSon);

        String kartno=kKartNo.substring(0,12).replaceAll("\\d","*")+" "+kKartNo.substring(12);
        //String kartno="**** **** **** " +kKartNo.substring(12);
        System.out.println("kartno = " + kartno);


    }
}
