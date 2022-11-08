package day18_inheritance_mutable_immutable.inheritance;

public class Child extends Parent{
    public Child() {
       // super();
        System.out.println("Child Cons Calisti");
    }
        /*tum class larda biz gormesek bile Java nin olusturdugu default
        constructor vardir
        extends keyword kullanan class lardaki tum
        CONSTRUCTOR larin ilk satirinda biz gormesek bile super();
        cons call vardir yani parent class in parametresiz constructor call

         */
    public static void main(String[] args) {
   new Child();

    }
}
