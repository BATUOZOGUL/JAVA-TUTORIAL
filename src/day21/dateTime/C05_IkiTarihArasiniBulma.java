package day21.dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(2003,11,16);

        System.out.println("Period.between(dogumGunu,bugun) = " + Period.between(dogumGunu, bugun));

    }
}
