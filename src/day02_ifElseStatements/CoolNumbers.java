package day02_ifElseStatements;

public class CoolNumbers {

    public static void main(String[] args) {
        //This is just to test your method
        int n = 16;
        int theNumber = 2438;
        System.out.println("isCoolNumber " +theNumber +" "+ isCoolNumber(theNumber, n));

    }

    /**
     * method isCoolNumber will return true if* num % 3-6 all have a remainder of 1*it will return false otherwize
     */
    public static boolean isCoolNumber(int num1, int num2) {
        //if ((num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1) && (num % 6 == 1)) {


        int rakam = num1 % 10;//2418 in 8 rakama atandi

        if (num2 % rakam == 0) {//16 / 8 tam bolunme sarti kontrol edildi
            num1 /= 10;  //241 haline getirildi
            rakam = num1 % 10;//rakam a 1 atandi
            if (num2 % rakam == 0) { //16 / 1 e tam bolunme sarti kontrol edildi
                num1 /= 10;      //24 haline getirildi
                rakam = num1 % 10; //rakam a 4 atandi
                if (num2 % rakam == 0) { //16 / 4 e bolunmesi
                    num1 /= 10;      //2 haline getirildi
                    rakam = num1 % 10; //rakam a 2  atandi
                    if (num2 % rakam == 0) { //16 / 2 e bolunmesi
                        num1 /= 10;      //0 haline getirildi
                        if (num1 == 0) {
                            System.out.println("ok ");
                        }
                    }
                }
            }
        } else {
            System.out.println("olumsuz");
            return false;
        }
        return true;
    }
}

//    public static boolean isCool(int x, int n) {
//        // your code here
//    }
//
//    public static int countCools(int n, int a, int b) {
//        // your code here
//
//
//    }



