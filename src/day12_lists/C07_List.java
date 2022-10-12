
package day12_lists;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C07_List {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini bulunuz
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        // ortalamayi bul

        double ortalama=0.0;
        double toplam=0.0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+=sayilar.get(i);
        }
        ortalama=toplam/sayilar.size();
        //System.out.println("ortalama = " + ortalama);
        List<Double> ortalamaUstundeki=new ArrayList<>();
        int arr[]= new int[sayilar.size()];






        for (int i = 0; i < sayilar.size() ; i++) {

//            if (ortalama< sayilar.get(i)){
//                ortalamaUstundeki.add(sayilar.get(i));
//            }

        }
        //System.out.println(ortalamaUstundeki);

    }
}