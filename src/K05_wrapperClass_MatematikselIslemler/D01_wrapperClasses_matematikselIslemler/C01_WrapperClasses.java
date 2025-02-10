package K05_wrapperClass_MatematikselIslemler.D01_wrapperClasses_matematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi = 34;

        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.charAt(0)); // J

        System.out.println(sayi); // 34

        /*
         Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
         WRAPPER CLASS'lari olusturmustur
         boolean, char     , byte, short, int    , long, float, double
         Boolean, Character, Byte, Short, Integer, Long, Float, Double
         */

        /*
         primitive variable'lar ile ayni data turunun wrapper class'indaki variable'lar arasinda
         gecis mumkundur
         Ammma farkli wrapper class'lar arasinda gecis mumkun degildir
         Ayni sekilde Wrapper class'dan olusturulan bir variable'a
         baska isimdeki primitive data turundeki degeri de ATAYAMAYIZ
         */


        int sayiIntPri = 20;
        Integer sayiIntWrap = sayiIntPri;
        int sayi2 = sayiIntWrap;


        int sayi3 = 25;
        short shrt1 = (short)sayi3; // explicit narrowing

        int sayi4 = shrt1; // Auto Widening



        Short shrtWrap = 23;
        // Integer sayiIntWrapp = (Integer) shrtWrap;
        // Integer sayiIntWrapp = shrtWrap;

        // Non-primitive data turlerinde casting cok ozel bir sarta baglidir
        // bunun icin data turleri arasinda Parent-Child iliskisi olmalidir
        // Wrapper class'lar arasinda parent-child iliskisi OLMADIGINDAN
        // Wrapper class'lari birbirine direkt cast etmemiz MUMKUN DEGILDIR
        // primitive'leri araci olarak kullanip cast yapabiliriz


        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        System.out.println(fiyat1 + fiyat2); // 2345

        /*
         Icinde SADECE sayilar oldugundan emin oldugumuz String'leri
         Wrapper class'lari kullanarak sayiya cevirebiliriz
         */

        int fiyat1Int = Integer.parseInt(fiyat1);
        int fiyat2Int = Integer.valueOf(fiyat2);

        System.out.println( fiyat1Int + fiyat2Int); // 68


        fiyat1 = "23.45";
        fiyat2 = "15.24";

        System.out.println(  Double.parseDouble(fiyat1) + Double.parseDouble(fiyat2)  );
        // 38.69


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768



        // verilen bir karakter'in Buyuk Harf olup olmadigini yazdirin
        char harf = 's';
        System.out.println(Character.isUpperCase(harf)); // false


        // verilen karakterin Kucuk Harf olup olmadigini yazdirin
        System.out.println(Character.isLowerCase(harf)); // true


        // verilen karakterin Sayi olup olmadigini yazdirin
        System.out.println(Character.isDigit(harf)); // false


        // verilen karakterin Harf olup olmadigini yazdirin
        System.out.println(Character.isLetter(harf)); // true


        // verilen karakterin Alfabetik olup olmadigini yazdirin
        System.out.println(Character.isAlphabetic(harf)); // true


        // verilen karakteri buyuk harf olarak yazdirin

        // s
        System.out.println(Character.toUpperCase(harf)); // S


    }
}
