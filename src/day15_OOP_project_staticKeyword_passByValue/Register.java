package day15_OOP_project_staticKeyword_passByValue;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {

    static List<User> users = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static List<User> register() {
        System.out.println("adini gir");
        String name = scan.nextLine();
        //user class dn obj creta et
        //localdate time i parametre olarak contstrustor a ver
        // ve bu objeyi liste ekle

        User obj = new User(name, LocalDateTime.now());
        users.add(obj);

        return users;
    }

    public static void printHappyUsers(List<User> usr) {
        for (User each : usr) {
            if(each.registerDate.getSecond()<10){
                System.out.println("sansli kisisiniz " +each.name + " iyi gundesin");
            }else System.out.println("maalesef "+each.name+ " sansli gununde degilsin");
        }
    }
    public static void list (List<User> users){
        for (User w: users ) {
            System.out.println(" adi : " +w.name+ " kayit zaman : "+w.registerDate);
        }
    }


}
