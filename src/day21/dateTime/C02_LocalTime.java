package day21.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tmForLoopOncesi= LocalTime.now();
        System.out.println("tmForLoopOncesi "+tmForLoopOncesi);

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=1;
        }

        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println("tmLoopSonrasi = " + tmLoopSonrasi);


        double nano1= tmLoopSonrasi.getNano();
        double nano2=tmForLoopOncesi.getNano();

        System.out.println("nano1-nano2 = " + (nano1 - nano2));

        System.out.println("tmLoopSonrasi.plusHours(2) = " + tmLoopSonrasi.plusHours(2));

    }
}
