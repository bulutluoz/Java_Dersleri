package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class C05_MethodlariKullanma {

    public static void main(String[] args) {

        int sayi = 101237 ;

        // verilen sayinin asal olup olmadigini yazdirin

        C01_AsalMiYazdir.asalMiYazdir(sayi); // Asal degil 67'ye bolunuyor

        C01_AsalMiYazdir.asalMiYazdir(345417); // Asal degil 3'ye bolunuyor



        int a = 457;
        int b = 321;

        // a ile b'den kucuk olmayani yazdirin
        C02_KucukOlmayaniYazdir.kucukOlmayaniYazdir(a,b); // 457


        C03_MetniTerstenYazdir.metniTerstenYazdir("Ali okula git");
        // tig aluko ilA
    }
}
