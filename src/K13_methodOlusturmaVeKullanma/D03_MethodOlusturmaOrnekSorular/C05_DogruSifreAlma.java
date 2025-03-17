package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

import java.util.Scanner;

public class C05_DogruSifreAlma {

    public static void main(String[] args) {


        // Kullanicidan bir sifre isteyin
        // C05'deki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin


        Scanner scanner = new Scanner(System.in);

        int sayac = 0;
        boolean sonuc = false;

        while ( !sonuc ){ // sonuc == false devam etmesi icin gerekli sarti yaziyoruz
            /*
                sonuc variable'i zaten boolean
                yani true veya false sonucu barindiriyor

                sonuc == false
                yazdigimizda, bu islem de boolean bir sonuc verir

                sonuc == false yazdigimizda
                Java diyor ki
                zaten boolean olan sonuc'u
                bir daha == ile karsilastirip bir boolean elde etmek yerine
                bunu daha basit sekilde yazabilirsin
             */

            System.out.println("Lutfen bir sifre giriniz...");
            String sifre = scanner.nextLine();
            sayac++;
            sonuc = C04_SifreKontrol.isValid(sifre);


        }

        System.out.println("Tebrikler... "+ sayac + " kere deneme yapinca gecerli sifre girebildiniz..");




    }
}
