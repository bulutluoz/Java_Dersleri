package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class C01_AsalMiYazdir {

    public static void main(String[] args) {


        // Verilen bir tamsayinin,
        // asal sayi olup olmadigini kontrol edip,
        // sonucu yazdiran bir method olusturun


        asalMiYazdir(7);
        asalMiYazdir(12);
        asalMiYazdir(7891);


    }


    public static void asalMiYazdir(int sayi){

        for (int i = 2; i <sayi  ; i++) {

            if ( sayi % i == 0){
                System.out.println("Asal degil " + i + "'ye bolunuyor");
                break;
                // bu kod calistiysa
                // for loop'un geriye kalani calismasin diyorsak
                // break yazabiliriz
            }

            if ( i == sayi-1){
                System.out.println(sayi + " sayisi asal...");
            }
        }


    }





}
