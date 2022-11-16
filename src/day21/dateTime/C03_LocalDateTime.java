package day21.dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println("tarihSaat = " + tarihSaat);

        System.out.println("tarihSaat.plusYears(3).minusDays(30).plusMonths(3) = " +
                tarihSaat.plusYears(3).minusDays(30).plusMonths(3));


    }

}
