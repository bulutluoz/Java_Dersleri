package K11_stringManipulations.D04_indexOf_lastIndexOf;

public class C04_lastIndexOf {

    public static void main(String[] args) {

        String str = "ali topu tut, tut ali tut";

        // cumlede "tut" un ilk kullanim index'i
        System.out.println(str.indexOf("tut")); // 9

        // cumlede "tut" un ikinci kullanim index'i
        System.out.println(str.indexOf("tut", 10)); // 14

        // cumlede "tut" un ucuncu kullanim index'i
        System.out.println(str.indexOf("tut", 15)); // 22

        // cumlede "tut" un son kullanim index'i nedir?
        System.out.println(str.lastIndexOf("tut")); // 22


        // "ali topu tut, tut ali tut";

        // cumlede "ali" nin ilk kullanim index'i
        System.out.println(str.indexOf("ali")); // 0

        // cumlede "ali" nin son kullanim index'i
        System.out.println(str.lastIndexOf("ali")); // 18


        // cumlede "top" nin ilk kullanim index'i
        System.out.println(str.indexOf("top")); // 4

        // cumlede "top" nin son kullanim index'i
        System.out.println(str.lastIndexOf("top")); // 4


        /*

            top icin ilk kullanim indexi = 4, son kullanim indexi = 4 ==> 1 kere kullanilmis

            tut icin ilk kullanim indexi = 9, son kullanim indexi = 22 ==> 1'den fazla kullanilmis

            Varol icin ilk kullanim indexi = -1, son kullanim indexi = -1 ==> yok

         */





    }
}
