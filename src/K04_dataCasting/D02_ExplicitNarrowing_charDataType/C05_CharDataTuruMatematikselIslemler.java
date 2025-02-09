package K04_dataCasting.D02_ExplicitNarrowing_charDataType;

public class C05_CharDataTuruMatematikselIslemler {

    public static void main(String[] args) {

        char chr1 = 'a'; // 97
        char chr2 = 'b'; // 98
        char chr3 = 'c'; // 99

        // char data turundeki bir variable'i veya degeri
        // matematiksel islemlerde kullanirsaniz
        // Java direk ASCII table'daki degeri ile isleme alir

        System.out.println(  chr1 + chr2 + chr3 ); // 97 + 98 + 99 => 294


        System.out.println(   2 + 3 + 4 ); // 9

        System.out.println( '2' + '3' + '4' ); // 50 + 51 + 52 => 153

        System.out.println(  'ç' +  'ğ' + 'ü' ); // 770


        // sayi olarak verilmis bir degerin char karsiligini yazdirin

        int sayi1 = 97; // a
        int sayi2 = 65; // A


        System.out.println(  (char)sayi1  ); // a
        System.out.println(  (char)sayi2 ); // A



        // verilen bir harfin sonrasindaki 3 karakteri yazdirin
        // Orn : verilen harf : k ise sonraki 3 karakter : l, m, n

        char ch5 = 'k';

        System.out.println("sonraki 1.harf : " +     (char)(ch5+1)   );
        System.out.println("sonraki 2.harf : " +     (char)(ch5+2)   );
        System.out.println("sonraki 3.harf : " +     (char)(ch5+3)   );

    }
}
