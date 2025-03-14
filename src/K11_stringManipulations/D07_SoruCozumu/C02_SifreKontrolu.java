package K11_stringManipulations.D07_SoruCozumu;

import java.util.Scanner;

public class C02_SifreKontrolu {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        int sayac = 0;


        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }



        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt( sifre.length() -1  );

        if (sonKarakter< '0' || sonKarakter > '9'){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }



        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }


        //         - uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }



        /*
            basta sayaca 0 degeri atadik
            4 kontrol yaptik
            sona gelindiginde sayac 0 - 1 - 2 - 3 - 4 olabilir

            sayac 0 ise hic hata yok sonucunu cikarabilir
         */


        if (sayac == 0){
            System.out.println("sifre basariyla kaydedildi");
        }


    }


}
