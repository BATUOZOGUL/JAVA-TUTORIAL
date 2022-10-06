package day10_MDArrays;

import java.util.Arrays;

public class ArrayDuplicate {

    // How to find the duplicate in an array?
    public static void main(String[] args) {


        String str = "HI HI RAHUL I AM I FINE RAHUL"; // String with a duplicate word.
        String[]tek=new String[1];
        tek[0]=str;
        System.out.println("tek = " + Arrays.toString(tek));
        System.out.println("tek = " + Arrays.toString(tek).replaceAll(" ",""));


        String [] words = str.split(" ");//splitting and converting to array

        for (int i = 0; i <words.length ; i++) {

            for (int j = i+1; j < words.length ; j++) {

                if (words[i].equals(words[j])){
                    System.out.println(words[j]);
                }
            }

        }

    }
}
