package K03_kullanicidanDataAlma.D02_ScannerKullanma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //        dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dikdortgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " +   (kenar1*kenar2)  );

    }
}
