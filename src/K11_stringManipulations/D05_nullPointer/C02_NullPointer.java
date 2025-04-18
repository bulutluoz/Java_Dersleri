package K11_stringManipulations.D05_nullPointer;

public class C02_NullPointer {
    public static void main(String[] args) {

        String isim1 = "";      // hiclik degeri ATANMIS
        String isim2;           // deger atanmamis
        String isim3 = null;    // deger atanmamis, null olarak ISARETLENMIS


        // isim1' i yazdirin
        System.out.println(isim1); // hiclik

        // isim1'in length'ini yazdirin
        System.out.println(isim1.length()); // "" 'in length'i 0 olur

        /*
                isim1'e bir deger atanmistir,
                Java acisindan atanan degerin Ali, Veli olmasi ile
                "" olmasi arasinda bir fark yoktur

                EGER Java'dan deger atanmayan variable'lari istersek
                isim 1'i bize getirmez, cunku onun bir degeri var
         */

        // isim2' i yazdirin
        // System.out.println(isim2);
        // Variable 'isim2' might not have been initialized
        // isim2'ye deger atanmamis olabilir


        // isim2'in length'ini yazdirin
        //System.out.println(isim2.length());
        //Variable 'isim2' might not have been initialized

        /*
                Bir method icerisinde(local) deger atamadan variable deklare edebiliriz,
                AMMA deger atamadan kullanmak istersek
                Java altini kirmizi cizer
                ve kullanmamiza izin vermez (Compile Time Error, CTE)
         */


        // isim3' i yazdirin
        System.out.println(isim3); // null

        // yazdirirken baska seylerle birlikte yazdirabilirsiniz
        System.out.println(isim3 + " ne guzel"); // null ne guzel


        // isim3'in length'ini yazdirin
        // System.out.println(isim3.length()); // NullPointerException
        System.out.println(isim3.toUpperCase()); // NullPointerException

        /*
                null pointer bir deger degil ISARETCIDIR
                her ne kadar = isareti ile kullanilsa da
                Java null'un bir deger degil isaretci oldugunu bilir

                - deger atanmayanlari istemek icin null olarak isaretlenenleri getir diyebiliriz
                - yazdirmak istersek YAZDIRABILIRIZ
                - AMMA baska hic bir islemde KULLANAMAYIZ.
                  kullanmaya kalkarsaniz Java altini cizmez ama calistirinca NullPointerException verir
         */








    }
}
