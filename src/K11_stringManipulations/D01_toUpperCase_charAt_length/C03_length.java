package K11_stringManipulations.D01_toUpperCase_charAt_length;

import java.util.Scanner;

public class C03_length {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // ve girilen metinde kac karakter kullanildigini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz..");
        String str = scanner.nextLine(); // Java candir, suphe yok

        System.out.println( str.length()); // 22

        // girilen metnin son karakterini yazdirin
        System.out.println(  str.charAt(   22 -1   )  ); // k


        System.out.println(  str.charAt(   str.length() -1   )  ); // k


        // bastan 3.karakteri yazdirin
        System.out.println(  str.charAt(2)); // v

        // sondan 3.karakteri yazdirin
        System.out.println( str.charAt( str.length()-3  )  ); // y


        /*

            1- Karakter sayisi      = son harfin index'i + 1
               son harfin index'i   = length -1

            2- charAt(index) kullanirken
               length() degerini veya daha buyuk bir sayiyi kullanirsak
               Java StringIndexOutOfBoundsException verir

            3- bastan 5. karakter icin  str.charAt(5-1)
               sondan 5. karakter icin str.charAt( str.length() - 5 ) kullanilir

         */




        // metindeki bastan 2. ve sondan 3. karakterleri yan yana yazdirin

        System.out.println(  str.charAt(1) + str.charAt( str.length()-3 ) ); // 218

        System.out.println( ""+ str.charAt(1) + str.charAt( str.length()-3 ) ); // ay





    }
}
