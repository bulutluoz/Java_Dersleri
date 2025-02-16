package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_SusluParentezKullanimi {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        // ek gorev
        // sayi 3'e bolunebiliyorsa "3 ile bolunen sayiya selam olsun"
        // sayi 5'e bolunuyorsa "5 ile bolunen sayiya selam olsun"

        if ( sayi % 3 == 0 ) {
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("3 ile bolunen sayiya selam olsun");
        }

        if ( sayi % 5 == 0 )
            System.out.println("Bes ile bolunebilen sayi");
        System.out.println("5 ile bolunen sayiya selam olsun");


           /*
            if cumlelerinde eger if body'de sadece 1 satir kod olacaksa
            {} kullanilmayabilir

            ANCAK suslu parantez KULLANILMADIGINDA
            if body'nin ilk ;'e kadar olan kisim kabul edilecegi UNUTULMAMALIDIR

            yukardaki kod'da 3 kontroku yaparken
            suslu parantez kullandigimiz icin
            2 satir kod da if body'si icinde

            AMMMAA 5 kontrolu yaparken
            suslu parantez kullanilmadigi icin
            SADECE 1.satir if ile ilintili
            2.satir if'den bagimsizdir.


         */


    }
}
