package K02_VariableVeData.D02_VariableOlusturmaVeKullanma;

public class C03_DikkatEdilecekKonular {

    public static void main(String[] args) {

        /*
            1-
            Java'da deklarasyon ve atama ayri islemlerdir
            ikisi ayni satirda yapilabildigi gibi
            farkli satirlarda da yapilabilir
         */

        int sayi = 10;

        int rakam;


        /*
            2-
            Deger atamadan deklarayon olur
            ama deger atamadan KULANIM OLMAZ
         */
        // System.out.println(rakam);


        rakam = 3;


        /*
            3-
            Deklarasyon SADECE 1 kere olur
            ama deger atamasi istediginiz kadar olabilir
         */

        // int sayi = 25;
        // Variable 'sayi' is already defined in the scope
        // sayi zaten tanimlandi bir daha tanimlayamazsiniz


        // String sayi = "Java candir";


        /*
            4-
            esitligin sol tarafinda SADECE variable olur
            sag tarafta ise deger olur
            Java once sagdaki degeri hesaplar
            sonra buldugu degeri soldaki variable'a atama yapar
         */

        // 2 * sayi = sayi + 5;
        // Variable expected


        //40 = sayi;
        //Variable expected

        sayi = 2 * sayi + 20;

    }
}
