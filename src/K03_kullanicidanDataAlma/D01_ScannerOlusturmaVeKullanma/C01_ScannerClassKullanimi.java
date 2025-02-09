package K03_kullanicidanDataAlma.D01_ScannerOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.

        // 1.adim : Bir Scanner objesi olusturun
        Scanner scanner = new Scanner(System.in);

        // 2.adim : Kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen bir ondalikli sayi giriniz...");

        // 3.adim : kullanicidan alacaginiz bilgiye uygun bir variable olusturup
        //          uygun next...() kullanarak bilgiyi alip, KAYDEDIN
        double ondalikliSayi = scanner.nextDouble();


        /*
            Bir class'da kullanicidan birden fazla kez bilgi alinacaksa
            her seferinde yeni scanner objesi olusturmaya gerek OLMAZ
            obje 1 kere olusturulur
            2. ve 3. adimlar istendigi kadar tekrar edilebilir
         */

        // yeniden 2. adim
        System.out.println("Lutfen bir tamsayi giriniz...");

        // yeniden 3.adim
        int tamsayi = scanner.nextInt();


        // Artik kullanicidan bir ondalikli sayi, bir tane de tamsayi aldik
        //         bunlarin toplamini ve carpimini yazdirin.


        System.out.println( "girilen sayilarin toplami : " +  (ondalikliSayi + tamsayi)   );

        System.out.println( "girilen sayilarin carpimi : "  + (ondalikliSayi * tamsayi)    );


    }
}
