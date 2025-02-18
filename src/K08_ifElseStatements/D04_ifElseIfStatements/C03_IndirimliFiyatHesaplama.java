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

        if (adet<0 || urunFiyati<0){
            System.out.println("Girilen degerler negatif olamaz");
        } else if (adet<10) {
            System.out.println("az urun aldiniz, indirimsiz toplam fiyat : " + toplamIndirimsizFiyat);
        } else if ( adet <50) {
            System.out.println("%10 indirim kazandiniz, toplam fiyat : " + toplamIndirimsizFiyat *90/100 ) ;
        } else if ( adet < 100) {
            System.out.println("%20 indirim kazandiniz, toplam fiyat : " + toplamIndirimsizFiyat*80/100 ) ;
        } else {
            System.out.println("%25 indirim kazandiniz, toplam fiyat : " + toplamIndirimsizFiyat*75/100 ) ;
        }


    }
}
