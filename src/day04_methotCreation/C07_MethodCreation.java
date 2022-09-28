package day04_methotCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {

        // string'i yazdiran method olusturalim  //method call
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazn bir method olustur


        hosgeldinYazdir();

    }

    public static void hosgeldinYazdir(){
        System.out.println("str =  hosgeldin ");
        stringYazdir("bu method call");
        kapanmaMeyhodu();
        //hosgeldinYazdir(); sonsuz dongu olsuturur ram ine guveniyorsan calistir
    }
    private static void stringYazdir(String str){
        System.out.println("str = " + str);
    }
    private static void kapanmaMeyhodu(){
        System.out.println("gule gule");
    }




}
