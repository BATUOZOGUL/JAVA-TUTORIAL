package day15_16_OOP_project_staticKeyword_passByValue;

import java.util.ArrayList;
import java.util.List;

import static day15_16_OOP_project_staticKeyword_passByValue.Register.*;

public class EntryPanel {

    public static void panel(){

        ///TODO user dan yeni bir obj create edip liste atamasini yapip uc ve ya
        // daha fzala user listte tutup bunlari listeleyin
        boolean exit =true;
        while (exit) {
            System.out.println("lutfen \n 1:register al\n2:printHappyUsers\n3:kişileri listele\n 4cıkıs");
            System.out.print("isleminizi seciniz : ");

            int islem = scan.nextInt();
            switch (islem) {
                case 1:
                 register();
                scan.nextLine();
                    break;
                case 2:
                    printHappyUsers(users);
                    break;
                case 3:
                    list(users);
                    break;
                case 4:
                    //System.exit(1);
                    exit = false;
                    break;
                default:
                    System.out.println("hatali veri girdiniz");
                    break;
            }
        }
    }


































}
