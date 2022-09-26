package day03_stringManipulations;

import java.util.Locale;

public class A_StringMethods {
    public static void main(String[] args) {


        /** indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         */
        String text="Good";
        System.out.println("text.indexOf(\"G\") = " + text.indexOf("G"));
        System.out.println("text.indexOf('o') = " + text.indexOf('o'));
        //overloading class icinde ayni method birden fazla kullanilirsa fakat method farkli parameterlerde olmali
        System.out.println("-------------------------");

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         */
        System.out.println("text.lastIndexOf('d') = " + text.lastIndexOf('d'));

        /**
         * charAt()
         * İstenen noktadaki karakteri verir,
         * karakterlerin sırası 0 dan başlar, buna index denir.
         * Metin icerisinde, istenilen indexteki karaktere ulasimi saglar. Sonuc char dir.
         *  0123456789012
         */
        System.out.println("text.charAt(3) = " + text.charAt(3));



        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */

        String ss= "Her ders Java gibi olsa";
        System.out.println("ss.substring(10) = " + ss.substring(10));
        System.out.println("ss.length()-10 = " + ss.substring((ss.length() - 10)));

        System.out.println("-------------------------");
        System.out.println("ss.substring(10) = " + ss.substring(3,4));
        // ilk 10 karakteri alma

        /**trim()
         *Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.
         */
            String city= "ds  istanbul   ";
        System.out.println("city = " + city);
        System.out.println("city.trim() = " + city.trim());

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..
         */
        String city2= "   istanbul izmir   ";
        System.out.println("city2.trim().replace('i','@') = " + city2.trim().replace('i', '@'));
        System.out.println("city2.trim().replace(' ','@') = " + city2.trim().replaceFirst("i", "@"));


        System.out.println("-------------------------");
        /** ReplaceFirst
        * Replace ile aynı sadece ilk bulunanı değiştirir
         */

        /** replaceAll()
         */
        String numara="  $1800 Milyon      ";
        System.out.println("numara.replaceAll(\"[a-z A-Z]\",\"*\") = " + numara.replaceAll(" ", "*"));


        /**
         * contains()
         * Metin icerisinde arama yapmamizi saglar.
         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
         * Sonuc boolean dir.
         *
         * equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        String str1="Batu";
        String str2="Batu holannnda";

        if (str1==str2){//esit esit referans degerine bakiyor
            System.out.println(" int icin ok");
        }else {
            System.out.println(str1.equals(str2));//equals direk degerine bakiyor
        }
        System.out.println("str2.contains(\"Batu\") = " + str2.contains("Batu"));
        System.out.println("str2.contains(\"Batu\") = " + str2.contains(str1));
        System.out.println("str2.contains(\"Batu\") = " + str1.contains("Batu"));



        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        System.out.println("str1.startsWith(\"Ba\") = " + str1.startsWith("Ba"));
        System.out.println("str1.startsWith(\"u\") = " + str1.endsWith("u"));


        /**
    * StringConcat
    * bir stringe diğerini ekler
     * Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
     * her ikisi String ise Java toplama degil BIRLESTIRME yapar
     * */
        System.out.println(15+20+"merhaba");
        System.out.println("merhaba"+15+20);
        System.out.println("str1.concat(\"jjava\") = " + str1.concat("jjava"));


        /**
         * StringIsEmpty
         *  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false
         */


        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */







        // equals() methodu sadece String'lerin degerlerini karsilastirir
        // bu ornekte sA ile sB nin degerleri AYNI oldugu icin true dondurur


        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */



    }


}
