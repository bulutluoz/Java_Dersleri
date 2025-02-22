package K11_stringManipulations.D01_toUpperCase_charAt_length;

public class C02_charAt {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // str'in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // str'daki bastan 9.karakteri yazdirin
        System.out.println( str.charAt(8) ); // e

        // son harfi yazdirin
        System.out.println( str.charAt(12)); // r


        // cumlede 13 karakter oldugu biliniyorsa son harfi yazdirin
        System.out.println(str.charAt(13 - 1)); //


        // cumlede 13 karakter oldugu biliniyorsa sondan 3. harfi yazdirin
        System.out.println( str.charAt(13-3)); // d


        // cumlede 13 karakter oldugu biliniyorsa sondan 5. harfi yazdirin
        System.out.println( str.charAt( 13-5)); // e


        /*
            charAt() ile son harfin index'inden buyuk bir sayi kullanildiginda
            Java StringIndexOutOfBounds (Verilen index String'in sinirlari disinda) hatasi verir
         */

        // System.out.println(str.charAt(20));
        // StringIndexOutOfBoundsException


        // System.out.println(str.charAt(13));
        // StringIndexOutOfBoundsException


    }
}
