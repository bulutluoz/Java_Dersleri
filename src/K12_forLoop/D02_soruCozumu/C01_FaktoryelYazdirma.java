package K12_forLoop.D02_soruCozumu;

import java.util.Scanner;

public class C01_FaktoryelYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


        Scanner scanner = new Scanner(System.in);
        System.out.println("faktoryel hesaplamak icin pozitif tamsayi giriniz...");
        int sayi = scanner.nextInt();
        int faktoryelDegeri = 1;

        System.out.print(sayi + "! = " );

        for (int i = sayi; i >=1 ; i--) {

            faktoryelDegeri *= i;

            if (i == 1) System.out.print(" " +i );
            else System.out.print(" " +i +" *");
        }

        System.out.print( " = " + faktoryelDegeri);


    }
}
