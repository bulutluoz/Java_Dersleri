package K09_ternaryOperator;

import java.util.Scanner;

public class C03_IfElse_Ternary {

    public static void main(String[] args) {

        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen 3 basamakli bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int rakam = 0;
        int rakamlarToplami = 0 ;

        if (sayi > 500){

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi /= 10;

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi /= 10;

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi /= 10;

            System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);


        } else {

            sayi /= 10; // birler basamagindan kurtuldum

            rakam = sayi % 10;

            System.out.println("Sayinin onlar basamagindaki rakamin karesi : " + rakam*rakam);


        }



    }
}
