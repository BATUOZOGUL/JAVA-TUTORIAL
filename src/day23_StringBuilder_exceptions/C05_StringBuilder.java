package day23_StringBuilder_exceptions;

public class C05_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder("ahollanda");//stack de sb1    heap de   hollanda
        StringBuilder sb2=new StringBuilder("hollanda");//stack de sb2    heap de   hollanda

        String str="hollanda";                          //stack de str    heap de   hollanda

        System.out.println("sb1.compareTo(sb2) = " + sb1.compareTo(sb2));
        System.out.println("\"a\".hashCode() = " + "a".hashCode());
        //System.out.println("sb1.compareTo(sb2) = " + sb1.compareTo(str));

        System.out.println("sb1.compareTo(sb2) = " + sb1==str);
        System.out.println("sb1.compareTo(sb2) = " + sb1.equals(sb2));//degere bakar

       // System.out.println("sb1.compareTo(sb2) = " + sb1==(sb2));


    }
}
