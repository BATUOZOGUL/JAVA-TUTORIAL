package day21.dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {//Date LocalDate LocalDateTime
    String name;
    LocalDate registerDate = LocalDate.now();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }



    @Override
    public String toString() {
        return "C01_LocalDate{" +
                "name='" + name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }

    public static void main(String[] args) {
        LocalDate trh = LocalDate.now();

        LocalDate trh2 = LocalDate.of(1991, 8, 23);
        System.out.println("trh2 = " + trh2);

        System.out.println("trh = " + trh);
        C01_LocalDate user=new C01_LocalDate();
        user.setName("batu");
        System.out.println("user = " + user);
        System.out.println("user = " + user.getRegisterDate().plusDays(5));

        System.out.println("trh2.atStartOfDay() = " + trh2.atStartOfDay());
        System.out.println("trh2.getDayOfWeek() = " + trh2.getDayOfWeek());
        System.out.println("trh2.getMonthValue() = " + trh2.getMonthValue());

        System.out.println("trh2.minusYears(10) = " + trh2.minusYears(10));
        System.out.println("trh2.plusMonths(10) = " + trh2.plusMonths(10));

        System.out.println("LocalDate.now().isLeapYear() = " + LocalDate.now().isLeapYear());

        LocalDate zoneTime=LocalDate.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("zoneTime = " + zoneTime);

    }


}
