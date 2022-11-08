package day18_inheritance_mutable_immutable;

public class Derived02 extends Base02 {//implements

     Derived02() {
         this(0);
         System.out.println("no args const derived classdan");
    }

     Derived02(int name) {
      //  super();
        System.out.println("pm li coinst derived classdan");
    }
    /*
    Not : Yapıcı zincirleme aynı sınıfa benzer şekilde, süper sınıfın yapıcısı alt sınıfın
    kurucusundan önce çağrıldığı için super() yapıcının ilk satırı olmalıdır.

*/
    public static void main(String args[]) {
        // calls parameterized constructor 4
        new Derived02();

        // Calls No-argument constructor
        // Derived02 obj = new Derived02();
    }
}
