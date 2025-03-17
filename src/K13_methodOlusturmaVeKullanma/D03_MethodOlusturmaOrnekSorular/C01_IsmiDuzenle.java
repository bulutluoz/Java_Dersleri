package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

public class C01_IsmiDuzenle {

    public static void main(String[] args) {

        //   Verilen isim ve soyismi alip
        //   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //   isim bosluk soyisim seklinde donduren bir method olusturun
        //   input : isim : Ali  soyisim :YILMAZ.     method return : Ali Yilmaz

        System.out.println(ismiDuzenle("ali", "can")); // Ali Can

        String isim = ismiDuzenle("MEHMET","OYUNBOZAN");
        System.out.println(isim); // Mehmet Oyunbozan

    }

    public static String ismiDuzenle(String isim, String soyisim){

        String duzenlenmisIsim = isim.substring(0,1).toUpperCase() +
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyisim.substring(0,1).toUpperCase() +
                                soyisim.substring(1).toLowerCase();

        return duzenlenmisIsim;

    }





}
