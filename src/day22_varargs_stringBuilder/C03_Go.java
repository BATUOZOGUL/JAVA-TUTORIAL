package day22_varargs_stringBuilder;

public class C03_Go {

    public static void main(String[] args) {
        new C03_Go().go(1,"hello");
        new C03_Go().go(2,"hello","hola");
        new C03_Go().go(2,"hola","hello","merhaba");

    }
    private void go(int x, String... y) {
        System.out.println("y[y.length-x] = " + y[y.length - x]);
        System.out.println("y[y.length-x] = " + y.length);
        System.out.println("y[0].length() = " + y[0].length());
    }
}
