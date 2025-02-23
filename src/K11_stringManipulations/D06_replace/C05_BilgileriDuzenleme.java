package K11_stringManipulations.D06_replace;

import java.util.Scanner;

public class C05_BilgileriDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen isim-soyisim : C** D****,
        // Kredi kart numarasi  : **** **** **** 4567


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen 16 hane olarak kredi karti numaranizi giriniz...");
        String kkNo = scanner.nextLine();


        System.out.println(

                "Girilen isim-soyisim : " +
                 isim.substring(0,1).toUpperCase() + // ismin ilk harfi buyuk harf olarak
                 isim.substring(1).replaceAll("\\w" ,"*")+  // ismin kalan kisminda harf yerine *
                 " " +
                 soyisim.substring(0,1).toUpperCase() + // soyismin ilk harfi buyuk harf olarak
                 soyisim.substring(1).replaceAll("\\w" ,"*")+  // soyismin kalan kisminda harf yerine *
                ",\n" +
                "Kredi kart numarasi  : **** **** **** " +
                kkNo.substring(kkNo.length()-4)

        );

    }
}
