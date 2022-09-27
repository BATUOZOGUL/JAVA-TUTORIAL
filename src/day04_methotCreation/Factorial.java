package day04_methotCreation;

public class Factorial {

    public static long factorial(int n){
        if ( n == 1 ){
            return 1;
        }
        else{
            return n * factorial( n - 1 );//5 * factorial(4)  5*4*3*2

        }
    }
    public static void main(String[] args) {
        System.out.println( factorial(1) );
        System.out.println("factorial(4) = " + factorial(4));
        //Print 120 (5!) to the console
    }
}
