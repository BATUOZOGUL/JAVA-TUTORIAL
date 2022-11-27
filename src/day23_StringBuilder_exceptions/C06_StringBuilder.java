package day23_StringBuilder_exceptions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("hollanda");//stack de sb1    heap de   hollanda
        System.out.println("sb1.insert(12,\"merhaba\") = " + sb1.insert(8, " merhaba"));

        String str="batu";
        char[] cr={'a','b'};
        String[] sr={"aaa","sss"};

        System.out.println("sb1.append(\"a\") = " + sb1.append("a"));
        System.out.println("sb1.append(cr) = " + sb1.append(cr));
        System.out.println("sb1.append(sr) = " + sb1.append(Arrays.toString(sr)));

        System.out.println("sb1.insert(0,str,0,4) = " + sb1.insert(0, str, 0, 4));

//        for (String w:str.split("") ) {
//            System.out.println("w = " + w);
//        }
//
//        String b = "asdasdasdasds";
//        for (int i = 0; i < b.length(); i++) {
//            System.out.println(b.split("")[i]);
//
//        }

        System.out.println("sb1.substring(3,4) = " + sb1.substring(3, 4));
        System.out.println("sb1.substring(3,3) = " + sb1.substring(3, 3));
        System.out.println("sb1.substring(3,3) = " + sb1.substring(3, 3).hashCode());
        System.out.println("\"\".hashCode() = " + "".hashCode());

        String a="abc";
        String b="";
        String c=b+"abc";
        System.out.println("a==b = " + (a==b));     //true
        System.out.println( (a==c));               //false
        System.out.println("a.equals(b) = " + a.equals(b));  //true

        String a1=new String("");
        String b1=new String("");
        System.out.println(a1 == b1);
        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(a1.equals(b1));


    }
}
