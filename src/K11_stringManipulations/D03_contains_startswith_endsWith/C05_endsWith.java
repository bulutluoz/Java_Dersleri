package K11_stringManipulations.D03_contains_startswith_endsWith;

public class C05_endsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // metin "zevkli" ile mi bitiyor ?
        System.out.println(str.endsWith("zevkli")); // son 7 harfe bakar  true

        // metin "zevkli" iceriyor mu?
        System.out.println(str.contains("zevkli")); // true

        // metin "zevkli" ile mi basliyor?
        System.out.println(str.startsWith("zevkli")); // ilk 7 harfe bakar Java og false

        // metin "zevkli" mi?
        System.out.println(str.equals("zevkli")); // false


        // "Java ogrenmek cok zevkli";

        // metin "li" ile mi bitiyor ?
        System.out.println(str.endsWith("li")); // son 2 harfe bakar true


        // metin "vkli" ile mi bitiyor ?
        System.out.println(str.endsWith("vkli")); // son 4 harfe bakar true


        // metin "Java ogrenmek cok zevkli" ile mi bitiyor ?
        System.out.println(str.endsWith("Java ogrenmek cok zevkli")); // true

        // metin "Java ogrenmek cok zevkli" ile mi basliyor ?
        System.out.println(str.startsWith("Java ogrenmek cok zevkli")); // true

        // metin "Java ogrenmek cok zevkli" ye esit mi ?
        System.out.println(str.equals("Java ogrenmek cok zevkli")); // true

        // metin "Java ogrenmek cok zevkli" iceriyor mu ?
        System.out.println(str.contains("Java ogrenmek cok zevkli")); // true


        // metin "" ile mi bitiyor ?

        System.out.println(str.endsWith("")); // true


    }
}
