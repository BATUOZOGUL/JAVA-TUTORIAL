package day18_inheritance_mutable_immutable;


public class MySingleton04 {

    static MySingleton04 instance = null;
    public int x = 10;

    private MySingleton04() {

    }

    static public MySingleton04 getInstance() {
        if (instance == null)
            instance = new MySingleton04();

        return instance;
    }

}

class Main {
    public static void main(String[] args) {
        MySingleton04 a = MySingleton04.getInstance();
        MySingleton04 b = MySingleton04.getInstance();
        a.x += 10;

        System.out.println("b.x = " + b.x);

        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);

    }
}







    /*
    ax'in değerini değiştirdik, bx'in değeri de güncellendi çünkü hem 'a' hem de 'b'
    aynı nesneyi ifade ediyor, yani bunlar tek bir sınıfın nesneleri.
     */
