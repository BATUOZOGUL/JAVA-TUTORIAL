package day01_swapVariable;

public class Swap_variables {

    public static void main(String[] args) {
  /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
	     Orn 	: sayi1=10 ve sayi2=20;
		  kod calistiktan sonra
		 sayi1=20 ve sayi2=10

         */
        int sayi1= 30;
        int sayi2=20;
        System.out.println("swap dan once sayi2 = " + sayi2);
        System.out.println("swap dan once sayi1 = " + sayi1);
        
        //1 .adim bos bir container create edildi
        int temp=sayi1;
        
        //2 .adim
        sayi1=sayi2;

        sayi2=temp;
        System.out.println("swap dan sonra sayi2 = " + sayi2);
        System.out.println("swap dan sonra sayi1 = " + sayi1);

        
        
        

    }

}
