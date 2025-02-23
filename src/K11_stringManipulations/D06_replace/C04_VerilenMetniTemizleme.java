package K11_stringManipulations.D06_replace;

import java.util.Scanner;

public class C04_VerilenMetniTemizleme {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan herseyi silin
        // ornek : input  : J1a4v*a )G*&^56uzel_!dir.
        //         output : Java Guzeldir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine(); // J1a4v*a )G*&^56uzel_!dir.


        // sayilardan kurtulalim
        metin = metin.replaceAll("\\d" ,"");


        /*
                 space'i koruma altina almaliyiz
                 yukarda sayilari yok ettigimiz icin
                 metinde sayi olmadigini biliyoruz
                 gecici olarak space yerine herhangi bir sayi yazdiralim,
                 en sonda yeniden space'e ceviririz
         */
        // space yerine gecici olarak 3 atayalim
        metin = metin.replace(" ","3");

        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W" ,"");

        // _    \\W' nun kapsamina girmediginden kaliyor
        // ozel olarak _'yi yok edelim
        metin = metin.replaceAll("_","");

        // space yerine 3 yazmistik, eski haline dondurelim

        metin = metin.replaceAll("3"," ");







        System.out.println("Metnin son hali : " + metin); // Metnin son hali : Java Guzeldir.
    }
}
