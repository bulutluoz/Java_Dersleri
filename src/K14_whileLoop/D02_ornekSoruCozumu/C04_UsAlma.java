package K14_whileLoop.D02_ornekSoruCozumu;

import java.util.Scanner;

public class C04_UsAlma {

    public static void main(String[] args) {


        // Soru 5- Verilen bir sayi ve pozitif tamsayi us icin
        //         While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //         bir method olusturun.

        // Ornek  sayi 2, us 5 ise
        //        sonuc : 2 * 2 * 2 * 2 * 2 ==> 32

        usHesapla(2,5); // 32

        usHesapla(3,4); // 81

        usHesapla(5,2); // 25

        System.out.println(Math.pow(3, 2)); // 9.0

        System.out.println(Math.pow(9, 0.5)); // 3.0


    }

    public static void usHesapla( int sayi , int us){

        int sonuc = 1;

        while (us > 0){

            sonuc *= sayi ;
            us--;
        }

        System.out.println(sonuc);

    }


}
