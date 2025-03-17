package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C01_AsalMiYazdir;
import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C02_KucukOlmayaniYazdir;
import K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular.C03_MetniTerstenYazdir;

public class C06_MethodCalistirma {

    public static void main(String[] args) {

        String isim = "YASAR";
        String soyisim = "kucuk";

        String ogrenci1 = C01_IsmiDuzenle.ismiDuzenle(isim,soyisim);
        String ogrenci2 = C01_IsmiDuzenle.ismiDuzenle("kemal","konyali");


        System.out.println(ogrenci1); // Yasar Kucuk
        System.out.println(ogrenci2); // Kemal Konyali


        String str = "Java her gun daha guzellesiyor";

        // str'i terse cevirin
        str = C02_MetniTerseCevirme.getTersMetin(str);

        System.out.println("str'in son hali : " + str);
        // str'in son hali : royisellezug ahad nug reh avaJ



    }
}
