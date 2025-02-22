package K11_stringManipulations.D02_equals_substring;

public class C03_substring_TekParametre {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";
        // karakter sayisini yazdirin
        System.out.println( str.length()); // 30

        // 12.karakteri yazdirin
        System.out.println( str.charAt(11)); // c


        // 12.karakterden baslayip, sona kadar butun metni yazdirin
        System.out.println( str.substring(11)); // ctikce guzellesiyor


        // ilk kelime haric geriye kalan metni yazdirin  "gun gectikce guzellesiyor"
        System.out.println(str.substring(5));


        // ilk harf haric, kalan metni yazdirin
        System.out.println( str.substring(1));


        // sondan 5.karakteri yazdirin
        System.out.println(str.charAt(str.length() - 5)); // s


        // son 5 karkteri yazdirin
        System.out.println(  str.substring( str.length()-5 )); // siyor



        // son karakteri charAt() ile yazdirin
        System.out.println(str.charAt(str.length() - 1)); // r

        // son karakteri substring() ile yazdirin
        System.out.println(str.substring(str.length() - 1)); // r



        /*
            charAt() ve substring() method'lari farkli sonuclar verebilir

            index olarak str.lengt()'i kullanarak
            charAt() ve substring ile
            son index'deki elemani yazdiralim
         */

        //   Java gun gectikce guzellesiyor

        // index olarak length degeri girilirse sonuclari karsilastiralim

        // System.out.println(str.charAt( str.length()   )); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length())); // Hiclik yazdirir


        // index olarak str.lengt()'den buyuk bir deger girerek
        // charAt() ve substring'i kullanalim

        //System.out.println(str.charAt(45)); //  StringIndexOutOfBoundsException
        // System.out.println(str.substring(45)); // StringIndexOutOfBoundsException


        // index olarak str.lengt()'den buyuk bir deger kullanirsak
        // hem char() hem de substring() hata verir
    }
}
