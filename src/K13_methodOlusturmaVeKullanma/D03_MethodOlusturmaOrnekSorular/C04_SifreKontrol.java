package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

public class C04_SifreKontrol {

    public static void main(String[] args) {

        //Soru 4 : verilen sifre icin
        //         asagidaki sartlari kontrol edip
        //         kullaniciya duzeltmesi gereken tum eksikleri yazdiran,
        //         tum sartlari kontrol ettikten sonra
        //         sifrede hata yoksa true, hata varsa false donduren
        //         bir method olusturun
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        System.out.println(isValid("aliCan")); // false
        // hatalari method'da yazdirdi, sonuc olan false'u main method'a dondurdu
        //son karakter rakam olmali
        //sifrenin uzunlugu en az 10 karakter olmali


        System.out.println(isValid("aliMertCan12"));
        // hata olmadigi icin method'da bir sey yazdirmayacak
        // method true dondurecek


    }

    public static boolean isValid(String sifre){
        int sayac = 0;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }


        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt( sifre.length() -1  );

        if (sonKarakter< '0' || sonKarakter > '9'){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }



        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }


        //         - uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }



        /*
            basta sayaca 0 degeri atadik
            4 kontrol yaptik
            sona gelindiginde sayac 0 - 1 - 2 - 3 - 4 olabilir

            sayac 0 ise hic hata yok, sifre gecerli sonucunu cikarabilir
            sayac 0 degilse hata var, sifre gecerli degil diyebiliriz
         */


        if (sayac == 0){
            return true;
        } else {
            return false;
        }


    }



}
