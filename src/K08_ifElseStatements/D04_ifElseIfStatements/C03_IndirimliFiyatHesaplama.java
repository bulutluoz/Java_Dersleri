package K08_ifElseStatements.D04_ifElseIfStatements;

import java.util.Scanner;

public class C03_IndirimliFiyatHesaplama {

    public static void main(String[] args) {

        // Kullaniciya kac adet urun aldigini ve bir urunun fiyatini sorun
        // eger kullanici 100 adet veya daha fazla aldiysa %25,
        // eger 50 adet veya daha fazla aldiysa %20
        // eger 10 adet veya daha fazla aldiysa %10 indirim yaparak
        // odeyecegi toplam miktari yazdirin
        // Kullanici negatif bir fiyat veya adet girerse uyari verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac urun aldiginizi giriniz...");
        int adet = scanner.nextInt();

        System.out.println("Lutfen bir urun fiyatini giriniz...");
        double urunFiyati = scanner.nextDouble();

        double toplamIndirimsizFiyat = adet * urunFiyati;




    }
}
