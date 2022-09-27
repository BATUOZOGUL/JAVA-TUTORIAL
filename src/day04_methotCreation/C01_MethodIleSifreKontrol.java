package day04_methotCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        // bu 4 kontrolu method ile yap

        String sifre = "Asd123aaa";//array tipinde olmali
                                 // forloop ile diolasiriz
                                //regex lazim [A-Z] sartini saglayan bir elment contains ile if blogunda bakilir


        boolean ilkharf=ilkHarfKontrolEt(sifre);
       // System.out.println("ilkharf = " + ilkharf);

        boolean sonHarf=sonHarfKontrolEt(sifre);
       // System.out.println("sonHarf = " + sonHarf);

       boolean bosluk= boslukKontrolEt(sifre);
       // System.out.println("bosluk = " + bosluk);

       boolean uzunluk= uzunlukKontrolEt(sifre);
       // System.out.println("uzunluk = " + uzunluk);

        if (ilkharf && sonHarf && bosluk && uzunluk ){
            System.out.println("sifre basarili");
        }


    }

    private static boolean uzunlukKontrolEt(String sifre) {
        if (sifre.length()>=8){
            return true;
        }else return false;


    }

    private static boolean boslukKontrolEt(String sifre) {
        if (!sifre.contains(" ")){
            return true;
        }else{
            System.out.println("bosluk girme");
            return false;
        }
    }
    private static boolean sonHarfKontrolEt(String sifre) {
            //batu  length = 4 
        char sonHarf = sifre.charAt(sifre.length()-1) ;
        // boolean ilkHarfSonuc=false;

        if (sonHarf >= 'a' && sonHarf <= 'z') {
            // ilkHarfSonuc=true;
            System.out.println("flag kullanmadan");
            return true;
        } else {
            System.out.println("sifre son harf buyuk olmaili");
            // ilkHarfSonuc=false;
            return false;
        }
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
       // boolean ilkHarfSonuc=false;

        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
           // ilkHarfSonuc=true;
            System.out.println("flag kullanmadan");
            return true;
        }else{
            System.out.println("sifre ilk harf buyuk olmaili");
            // ilkHarfSonuc=false;
            return false;
        }

        //return ilkHarfSonuc ;
    }

}