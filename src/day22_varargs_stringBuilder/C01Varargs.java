package day22_varargs_stringBuilder;

public class C01Varargs {
    public static void main(String[] args) {

        String str1=" Ali";
        String str2=" Veli";
        String str3=" Oguzhan";
        String str4=" Oguzhandad";
        String str5=" Oguzhadasdasan";
        String str6=" Oguzhadasdasdan";

        //task en uzun str i bulun
        enuzunKelime(str1,str2,str3,str4,str5,str6);
        enuzunKelime(str1,str2,str3);
    }

    private static void enuzunKelime(String... str) {
    String enUzunStr="";

        for (String w :str) {
            if (w.length()>enUzunStr.length()){
                enUzunStr=w;
            }
        }
        System.out.println("enUzunStr = " + enUzunStr);

    }
}
