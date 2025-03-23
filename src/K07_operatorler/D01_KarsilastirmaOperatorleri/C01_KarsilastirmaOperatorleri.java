package K07_operatorler.D01_KarsilastirmaOperatorleri;

public class C01_KarsilastirmaOperatorleri {

    public static void main(String[] args) {
        /*
            sayisal data turlerinde matematikte yaptigimiz gibi
            karsilastirmalar yapabiliriz

            == esit mi?
            > buyuk mu ?
            >= buyuk veya esit mi?
            < kucuk mu?
            <= kucuk veya esit mi?

            ! isareti karsilastirmayi tersine cevirir
            != esit degildir (mi?)
            !> buyuk degildir (mi?)
            !< kucuk degildir (mi?)
         */

        int a = 5;
        int b = 8;
        int c = 3;

        System.out.println(   a == b ); // 5 == 8 false

        System.out.println( b == a+c ); // 8 == 5+3 true

        System.out.println( b > c ); // 8 > 3 true

        System.out.println( c > a ); // 3 > 5  false

        System.out.println( a = b); //  8

        System.out.println( c = a-b ); // 0

        System.out.println( a != c); // 8 != 0    true

        System.out.println( a != b ); // 8 != 8   false

        System.out.println( a >= b ); // 8 >= 8   true

        System.out.println("============================");


        /*
         char data turu matematiksel islemlerde
         ASCII table'daki degerleri ile isleme girer
         biz kucuk yerine once, buyuk yerine sonra diye dusunebiliriz
         a==> 97  A==> 65
         */


        System.out.println(   'a'  <= 'c'); // 97 <= 99   true

        System.out.println( 'a' == 'a'); // 97 == 97     true

        System.out.println( 'b' != 'b'); //  98 != 98     false

        System.out.println( 'd' != 'e'); //  100 != 101   true

        System.out.println("============================");


        // String'de ise == bekledigimiz sonuclari vermeyebilir

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;  // Ali
        String s7 = new String("Ali");

        System.out.println( s1 == s2 ); // Ali == Ali ==>  true
        System.out.println( s1 == s3 ); // Ali == Ali ==>  true
        System.out.println( s1 == s6 ); // Ali == Ali ==>  false
        System.out.println( s1 == s7 ); // Ali == Ali ==>  false


        /*
         SIMDILIK =='i String'leri karsilastirmak icin kullanmayacagiz
         eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
         equals() kullanmaliyiz
         */

        System.out.println("============================");

        System.out.println( s1.equals(s2) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s3) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s6) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s7) ); // Ali equals Ali ==> true

        // equals() case sensitive'dir
        // yani buyuk / kucuk harf ve karakter farkliliklarina bakar
        // Metinler tamamen ayni ise true, yoksa false dondurur

        System.out.println(s1.equals("ali")); // Ali equals ali ==> false
        System.out.println(s1.equals("ALI")); // Ali equals ALI ==> false
        System.out.println(s1.equals("Ali ")); // Ali equals Ali  ==> false


    }
}
