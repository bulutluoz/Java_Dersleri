package K03_kullanicidanDataAlma.D02_ScannerKullanma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        //        asagidaki formatta yazdirin.
        //		  girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        System.out.println("isminiz...");
        String isim = scanner.nextLine();

        System.out.println("soyisminiz...");
        String soyisim = scanner.nextLine();

        System.out.println("yasiniz...");
        int yas = scanner.nextInt();


        System.out.println(
                "girilen bilgiler : " +
                isim.toUpperCase().charAt(0)  + // charAt(0) ilk harfi bize getirir
                " " +
                soyisim +
                ", " +
                yas
        );

    }
}
