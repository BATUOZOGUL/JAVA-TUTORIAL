package day12_lists;
import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();


        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        System.out.println("isimler.set(0,\"muzaffer\") = " + isimler.set(0, "muzaffer"));
        System.out.println("isimler = " + isimler);

    }
}