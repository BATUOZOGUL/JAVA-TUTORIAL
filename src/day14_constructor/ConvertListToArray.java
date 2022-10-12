package day14_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

    public static void main(String[] args) {
        List<String> stockList = new ArrayList<>();
        stockList.add("stock1");
        stockList.add("stock2");
        stockList.add("stock2");
        stockList.add("stock2");
        stockList.add("stock2");
        stockList.add("stock2");
        stockList.add("stock2");
        stockList.add("stock2");

        String[] stockArr = new String[stockList.size()];
        stockArr = stockList.toArray(stockArr);
        System.out.println("Arrays.toString(stockArr) = " + Arrays.toString(stockArr));


    }
}
