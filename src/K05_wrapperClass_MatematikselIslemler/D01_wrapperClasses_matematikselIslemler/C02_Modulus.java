package K05_wrapperClass_MatematikselIslemler.D01_wrapperClasses_matematikselIslemler;

import java.util.Scanner;

public class C02_Modulus {

    public static void main(String[] args) {

        int sayi = 45;

        // verilen sayinin cift olup olmadigini yazdirin
        // sayi 2'ye bolunuyorsa yani kalan 0 ise yani %2 ==> 0 ise sayi cifttir

        System.out.println(  sayi % 2  );
        // 1 bu sayi cift degil



        // girilen sayinin 5'e bolunup bolunmedigini yazdirin
        System.out.println(  sayi % 5  ); // 0
        // sayi 5 ile bolunuyor



        // girilen sayinin 3'un tam kati olup olmadigini yazdirin

        System.out.println(  sayi % 3    ); // 0
        // sayi 3'un kati




        // verilen sayinin birler basamagini yazdirin
        System.out.println(  sayi % 10   ); // 5




        sayi = 243;
        // verilen sayinin onlar basamagini yazdirin

        // once birler basamagindan kurtulalim

        sayi = sayi / 10;  // 243 / 10 ==> 24,3 ama java 24
        // sayi variable'nin degeri artik 24

        System.out.println("Sayinin onlar basamagi : " +   sayi%10  );




    }
}
