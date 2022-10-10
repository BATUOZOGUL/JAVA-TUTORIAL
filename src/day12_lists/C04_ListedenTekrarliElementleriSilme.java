package day12_lists;
import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {

    static List<Integer> sayilar = new ArrayList<>();
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]




        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar);
        //System.out.println(sayilar);

    }
    private static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsizList=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println("sayilar.get(i) = " + sayilar.get(i));
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }

        }
        System.out.println(tekrarsizList);
        return tekrarsizList;

    }

}
