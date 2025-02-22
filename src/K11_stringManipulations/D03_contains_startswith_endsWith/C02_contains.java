package K11_stringManipulations.D03_contains_startswith_endsWith;

public class C02_contains {

    public static void main(String[] args) {

        String str = "Hayatin her asamasinda Java kullanilir.";

        /*
            Verilen bir String'in istenen bir harf
            veya metni icerip icermedigini anlamak icin kullanilir
         */

        System.out.println(str.contains("a")); // true

        System.out.println(str.contains("H")); // true

        System.out.println(str.contains("x")); // false

        /*
           contains method'u aranan harf veya metnin kac kere kullanildigi ile ILGILENMEZ
         */



        // Hayatin her asamasinda Java kullanilir.

        /*
             contains method'u aradigi metni case sensitive olarak
             ve metinde kullanildigi sekilde arar
         */

        System.out.println(str.contains("k")); // true

        System.out.println(str.contains("her")); // true

        System.out.println(str.contains("r a")); // true

        System.out.println(str.contains("ra")); // false

        System.out.println(str.contains("H y")); // false

        System.out.println(str.contains("A")); // false

        System.out.println(str.contains("Java")); // true

        System.out.println(str.contains("java")); // false

        System.out.println( str.equalsIgnoreCase("java")); // false




        /*
            contains() char parametre kabul etmez
         */



    }
}
