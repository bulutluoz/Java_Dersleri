package K02_variableVeData.D02_VariableOlusturmaVeKullanma;

public class C01_VariableOlusturma {

    public static void main(String[] args) {

        // tamsayi degerleri kaydetmek icin
        // ismi sayi olan bir variable olusturun

        int sayi;

        // main method icinde deger atamadan
        // variable deklarasyonu yapabiliriz
        // ama deger atamadan bu variable'i KULLANAMAYIZ

        // System.out.println(sayi);
        // Variable 'sayi' might not have been initialized

        /*
            Java ile kod yazarken
            yanlis bir kod yazarsaniz
            Java kodun altini KIRMIZI cizerek bize hatayi soyler

            Mouse ile kirmizi cizgi uzerine yaklasirsaniz
            hatanin ne oldugunu da aciklar

            Kod'da herhangi bir yerde
            Alti kirmizi cizili bolum varsa
            Java HICBIR KODU calistirmaz
         */

        sayi = 20;

        System.out.println(sayi); // 20


        /*
            Java ile konsolda bir metin yazdirmak isterseniz
            " " icinde istediginiz metni yazdirabilirsiniz

            Eger bir variable'in degerini yazdirmak isterseniz
            o zaman sadece variable ismini yazmaniz yeterlidir

            Hem metin hem de variable'in degerini yazdirmak isterseniz
            aralarina + yazabilirsiniz
         */

        System.out.println( "Bu bir deneme yazisidir.");


        System.out.println("Sayi variable'nin degeri : " + sayi);


    }
}
