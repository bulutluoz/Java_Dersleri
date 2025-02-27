package K12_forLoop.D02_soruCozumu;

import java.util.Scanner;

public class C03_AsalMi {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        for (int i = 2; i <sayi  ; i++) {

            if ( sayi % i == 0){
                System.out.println("Asal degil " + i + "'ye bolunuyor");
                break;
                // bu kod calistiysa
                // for loop'un geriye kalani calismasin diyorsak
                // break yazabiliriz
            }

            if ( i == sayi-1){
                System.out.println(sayi + " sayisi asal...");
            }
        }






    }
}
