package day15_OOP_project_staticKeyword_passByValue;

import java.time.LocalDateTime;

public class User {//POJO class  yani objeleri create edecegim constructorun bulunduug yer

    String name ;

    LocalDateTime registerDate;

    public User() {//pm siz
    }

    public User(String name, LocalDateTime registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }
}
