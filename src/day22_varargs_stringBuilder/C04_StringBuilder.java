package day22_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("hollanda merhaba merhaba");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());

        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());

        sb1.append("java").append("guzel");
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        System.out.println("sb1 = " + sb1);
        sb1.append(556633222);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1 = " + sb1);

        sb1.append(true);
        System.out.println("sb1 = " + sb1);

        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.trimToSize();
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());


        //stirng builder thread safe degildir
        //stringbuilder stirngbuffer a benzer.
        //fakat vuilder buffer dan daha hizldiri
        //multi thread icin StringBuffer tercih edilmeli

        System.out.println("sb2.reverse() = " + sb2.reverse());


        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.insert(1,\"batu\") = " + sb1.insert(0, "batu"));
        System.out.println("sb1.substring(0,5) = " + sb1.substring(3, 4)); //""
        System.out.println("sb1.substring(0,5) = " + sb1.substring(3, 4).hashCode()); //""
        System.out.println("sb1.substring(0,5) = " + ((sb1.substring(3, 4))+0)); //""
        System.out.println('u'+0);

    }
}
