package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

public class C01_IsmiDuzenle {

    public static void main(String[] args) {

        //   Verilen isim ve soyismi alip
        //   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //   isim bosluk soyisim seklinde donduren bir method olusturun
        //   input : isim : Ali  soyisim :YILMAZ.     method return : Ali Yilmaz

        /*
        String str = "Ali Can";

        str.toUpperCase();
        // method gorevini yapar
        // ancak yazdirmadigimiz icin konsolda goremeyiz
        // kaydetmedigimiz icin bundan sonra str'i kullansak ilk olusturuldugu haliyle kullanabiliriz

        System.out.println(str.toUpperCase()); // ALI CAN
        // method'un getirdigi sonucu yazdirdigimiz icin konsolda goruruz
        // kaydetmedigimiz icin bundan sonra str'i kullansak ilk olusturuldugu haliyle kullanabiliriz


        str = str.toLowerCase();
        // yazdirmadigimiz icin konsolda goremeyiz
        // kaydettigimiz icin bundan sonra str'i kullansak
        // ilk olusturuldugu haliyle degil yeni haliyle kullanabiliriz
        */


        getDuzenlenmisIsim("ali","YILMAZ");
        // method gorevini yapar
        // ancak yazdirmadigimiz icin konsolda goremeyiz
        // kaydetmedigimiz icin duzenlenmisIsim'i kullanamayiz

        System.out.println(getDuzenlenmisIsim("ali", "YILMAZ"));
        // method'un getirdigi sonucu yazdirdigimiz icin konsolda goruruz
        // kaydetmedigimiz icin duzenlenmisIsim'i kullanamayiz

        String isimSonHali = getDuzenlenmisIsim("mehmet","TOZKOPARAN");
        // yazdirmadigimiz icin konsolda goremeyiz
        // ama kaydettigimiz icin bundan sonra isimSonHali'ni kullanabiliriz
        System.out.println(isimSonHali); // Mehmet Tozkoparan


    }

    public static String getDuzenlenmisIsim(String isim , String soyisim){

        String duzenlenmisIsim =    isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase()+
                " "+
                soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).toLowerCase();

        return duzenlenmisIsim;

    }







}
