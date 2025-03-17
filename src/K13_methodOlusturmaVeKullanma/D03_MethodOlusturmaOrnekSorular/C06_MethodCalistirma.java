package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C01_AsalMiYazdir;
import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C02_KucukOlmayaniYazdir;
import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C03_MetniTerstenYazdir;

public class C06_MethodCalistirma {

    public static void main(String[] args) {

        // kullanicidan ismini ve soyismini alip
        // isim ve soyismin ilk harfleri buyuk, kalan harfler kucuk olacak sekilde yazdirin

        String girilenIsim = "hasan";
        String girilenSoyisim = "bulut";

        System.out.println(C01_IsmiDuzenle.getDuzenlenmisIsim(girilenIsim, girilenSoyisim));
        // Hasan Bulut


        String ogrenci1 = C01_IsmiDuzenle.getDuzenlenmisIsim("AHMET","KILIC");
        String ogrenci2 = C01_IsmiDuzenle.getDuzenlenmisIsim("sena","gunes");

        System.out.println(ogrenci1); // Ahmet Kilic
        System.out.println(ogrenci2); // Sena Gunes


        String metin = "Java'ya helal olsun";
        // metin'i tersten yazdirin
        System.out.println(C02_MetniTerseCevirme.getTersMetin(metin));
        // nuslo laleh ay'avaJ

        System.out.println(C02_MetniTerseCevirme.getTersMetin("Ali baba hindi"));
        // idnih abab ilA


        String sifre = "alibabahindi9";
        // sifreyi kontrol edip,
        // gecerli sifre ise "Sifre kaydedildi"
        // gecerli sifre degilse hatalari ve "Yeniden deneyin" yazdirin

        boolean sonuc = C04_SifreKontrol.isValid(sifre);

        if (sonuc){ //  sifre basarili
            /*
                'sonuc == true' can be simplified to 'sonuc'

                sonuc variable'i zaten boolean
                bir daha true ile karsilastirmaya gerek yok
             */


            System.out.println("Sifre kaydedildi");
        }else { // sifre gecerli degil
            System.out.println("Yeniden deneyin");
        }

    }
}
