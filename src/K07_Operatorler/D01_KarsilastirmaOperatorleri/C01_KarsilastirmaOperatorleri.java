package K07_Operatorler.D01_KarsilastirmaOperatorleri;

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

        System.out.println(   a == b ); //

        System.out.println( b == a+c ); //

        System.out.println( b > c ); //

        System.out.println( c > a ); //

        System.out.println( a = b); //

        System.out.println( c = a-b ); //

        System.out.println( a != c); //

        System.out.println( a != b ); //

        System.out.println( a >= b ); //



        /*
         char data turu matematiksel islemlerde
         ASCII table'daki degerleri ile isleme girer
         biz kucuk yerine once, buyuk yerine sonra diye dusunebiliriz
         */


        System.out.println(   'a'  <= 'c'); //

        System.out.println( 'a' == 'a'); //

        System.out.println( 'b' != 'b'); //

        System.out.println( 'd' != 'e'); //




        // String'de ise == bekledigimiz sonuclari vermeyebilir

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;
        String s7 = new String("Ali");

//        System.out.println( s1 == s2 ); // Ali == Ali ==>
//        System.out.println( s1 == s3 ); // Ali == Ali ==>
//        System.out.println( s1 == s6 ); // Ali == Ali ==>
//        System.out.println( s1 == s7 ); // Ali == Ali ==>


        /*
         SIMDILIK =='i String'leri karsilastirmak icin kullanmayacagiz
         eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
         equals() kullanmaliyiz
         */


//        System.out.println( s1.equals(s2) ); // Ali equals Ali ==>
//        System.out.println( s1.equals(s3) ); // Ali equals Ali ==>
//        System.out.println( s1.equals(s6) ); // Ali equals Ali ==>
//        System.out.println( s1.equals(s7) ); // Ali equals Ali ==>

//        System.out.println(s1.equals("ali")); // Ali equals ali ==>
//        System.out.println(s1.equals("ALI")); // Ali equals ALI ==>
//        System.out.println(s1.equals("Ali ")); // Ali equals Ali  ==>


    }
}
