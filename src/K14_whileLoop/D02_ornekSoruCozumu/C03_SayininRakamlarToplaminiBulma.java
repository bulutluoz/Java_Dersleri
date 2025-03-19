package K14_whileLoop.D02_ornekSoruCozumu;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz..");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;

        int rakam = 0;
        int rakamlarToplami = 0;


        while (  sayi>0 ){
            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi = sayi/10 ;
        }


        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
