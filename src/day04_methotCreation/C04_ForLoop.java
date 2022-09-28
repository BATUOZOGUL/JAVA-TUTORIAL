package day04_methotCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        String str = "java harika cok guzel dehset";
        //for loop ile tersten yazdir
        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print( str.charAt(i));
            System.out.print(str.substring(i, i + 1));//str.substring(0,1);
        }



    }

}