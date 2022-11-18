package day22_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        addInt(5,7);
        addInt(5,7,8);
        addInt(5,7,8,9);
        addInt(5,7,8,9,55);


    }

    private static void addInt(int... i) {
        int toplam=0;
        for (int w:i ) {
            toplam+=w;

        }

        System.out.println("toplam = " + toplam);
    }


}
