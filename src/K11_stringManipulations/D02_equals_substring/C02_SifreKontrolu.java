package K11_stringManipulations.D02_equals_substring;

import java.util.Scanner;

public class C02_SifreKontrolu {

    public static void main(String[] args) {

        // Kullanicidan sifre olusturmak uzere bir metin girmesini isteyin.
        // Metni iki kere isteyin
        // eger metin ayni oldugu halde yazim farkliligi varsa
        // "Lutfen yazimi kontrol edin" yazdirin
        // Eger karakter farkliligi varsa
        // "Girilen sifreler farkli" yazdirin
        // Eger metinler ayni ise
        // "Sifreniz basarili olarak kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz sifreyi giriniz...");
        String sifre1 = scanner.nextLine();

        System.out.println("Lutfen sifreyi tekrar giriniz...");
        String sifre2 = scanner.nextLine();

        if (sifre1.equals(sifre2)){
            System.out.println("Sifreniz basarili olarak kaydedildi");
        } else if (sifre1.equalsIgnoreCase(sifre2)) {
            System.out.println("Lutfen yazimi kontrol edin");
        } else {
            System.out.println("Girilen sifreler farkli");
        }


    }
}
