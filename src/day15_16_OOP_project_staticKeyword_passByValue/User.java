package day15_16_OOP_project_staticKeyword_passByValue;

import java.time.LocalDateTime;
import java.time.Month;

//@AllArgsConstructor
public class User {//POJO class  yani objeleri create edecegim constructorun bulunduug yer

    String name ;

    private LocalDateTime registerDate;

    int year=LocalDateTime.now().getYear();
    Month month =LocalDateTime.now().getMonth();
    int dayOfMonth=LocalDateTime.now().getDayOfMonth();

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }


    public User() {//pm siz
    }

    public User(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }

    public User(String name, int year, Month month, int dayOfMonth) {
        this.name = name;
        this.year = year;
        this.month=month;
        this.dayOfMonth=dayOfMonth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registerDate=" + registerDate +
                ", year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                '}';
    }
}
