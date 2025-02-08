package K02_VariableVeData.D03_DataTurleri;

public class C02_VariableNamingConvention {

    public static void main(String[] args) {

        /*
            1- Variable isimleri buyuk-kucuk harf duyarlidir (case sensitive).
	            YAS, Yas, yas, yAS … birbirinden farklidir.
         */

        int YAS = 40;
        int Yas = 67;
        int yas = 30;
        int yAS = 23;
        int yaS = 89;
        // int YAS = 56; // Variable 'YAS' is already defined in the scope
        // System.out.println(  yAs ); // boyle bir variable yok

        /*
            2- Variable isimlerinde harf, rakam, _ ve $ kullanilabilir,
	           bosluk veya * gibi ozel karakterler kullanilamaz.
         */

        // String okul adi = "Yildiz Koleji";
        // String okul&adi = "Yildiz Koleji";
        String okul$adi = "Yildiz Koleji";
        String okul_adi = "Yildiz Koleji";

        /*
            3- Variable isimleri harf ile baslamalidir, rakam ile baslayamaz.
	           _ ve $ ile baslayabilir ama kullanilmasi tavsiye edilmez.
         */

        byte by1 = 23;
        byte $y1 = 23; // Java hata vermez ama naming convention'a uygun degildir
        byte _y1 = 23; // Java hata vermez ama naming convention'a uygun degildir
        //byte 3ali = 34;
        byte ali3 = 56;

        /*
            4- Variable isimleri olarak keyword (Java’da tanimli anahtar kelimeler) kullanilamaz.
	           for, int, short, class vb. variable ismi olamaz.
         */
        //int int = 34; // int keyword'dur , variable ismi olarak kullanilamaz
        int int1 = 45;
        int classA = 34;


        /*
            5- Variable isimleri kucuk harfle baslar,
               birden fazla kelime iceriyorsa camelCase kullanilir,
               yani ilk kelime kucuk harfle baslar
               sonraki her kelimenin ilk harfi buyuk harf,
               diger harfleri kucuk harf yapilir.
         */
        String okulIsmi = "Yildiz Kioleji";
        System.out.println(  okulIsmi.toLowerCase() );
        System.out.println(okulIsmi.toUpperCase());
        String OkulIsmi = "Cumhuriyet Ilkokulu";
        // ilk harfi buyuk yaparsak Java hata vermez ama naming convention'a uygun degildir



    }
}
