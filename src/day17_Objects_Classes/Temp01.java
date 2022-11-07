package day17_Objects_Classes;

// Java program to illustrate Constructor Chaining
//Using this() keyword
public class Temp01 {

    Temp01(){
        this(5);
        System.out.println("the default const");
    }
    Temp01(int n){
        this(6,15);
        System.out.println("tek pm li const "+n);
    }
    Temp01(int x ,int y){

        System.out.println("2 pm li const "+x*y);
    }


    public static void main(String[] args) {
        new Temp01();
    }
}

/*
Yapıcı zincirleme kuralları:

this() ifadesi her zaman kurucunun ilk satırı olmalıdır .
this() anahtar sözcüğü olmayan en az bir yapıcı olmalıdır (yukarıdaki örnekte yapıcı 3).
Yapıcı zincirleme herhangi bir sırada gerçekleştirilebilir.
 */