package K11_stringManipulations.D03_contains_startswith_endsWith;

public class C04_startsWith {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyor ?
        System.out.println( str.startsWith("Java")); // ilk 4 harfe bakar  true

        // str J ile mi basliyor ?
        System.out.println( str.startsWith("J")); // ilk harfe bakar true

        // str Ja ile mi basliyor ?
        System.out.println(str.startsWith("Ja")); // ilk 2 harfe bakar true

        // str "Java cok" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok")); // ilk 8 harfe bakar true

        // str "j" ile mi basliyor ?
        System.out.println(str.startsWith("j")); // ilk harfe bakar J false

        // str "a" ile mi basliyor ?
        System.out.println(str.startsWith("a")); // ilk harfe bakar J false


        // "Java cok guzel";

        // str "Java cok guzel" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok guzel")); // ilk 14 harfe bakar true

        // str "" ile mi basliyor ?
        System.out.println(str.startsWith("")); // true

        // str "cok" ile mi basliyor?
        System.out.println(str.startsWith("cok")); // ilk 3 harfe bakar Jav false


        // "Java cok guzel";
        // 5.index ve sonrasi "cok" ile mi basliyor ?  ==> cok guzel

        System.out.println(str.startsWith("cok", 5));
        // 5.index ve sonrasina bakilirsa
        // bu bolum cok ile mi basliyor?
        // kontrol edilecek bolum "cok guzel"
        // bu metin cok ile mi basliyor true


        // 8.index ve sonrasi " " ile mi basliyor ? ==> " guzel"

        System.out.println(str.startsWith(" ", 8)); // true


    }
}
