package K11_stringManipulations.D06_replace;

public class C03_replaceAll {

    public static void main(String[] args) {

        String str = "Ali okula gitti. 3 saat sonra gelecek";

        // tum t'leri T yapin
        System.out.println(str.replace('t', 'T'));
        System.out.println(str.replace("t","T"));
        System.out.println(str.replaceAll("t","T"));

        System.out.println(str.replaceAll("Ali", "Veli"));
        // Veli okula gitti. 3 saat sonra gelecek


        // 3'u yerine 2 yazin
        System.out.println(str.replace('3', '2'));
        System.out.println(str.replace("3","2"));
        System.out.println(str.replaceAll("3","2"));



        /*
            replace() method'u verilen metinde aranan char veya string'in
            tum kullanimlarini bulur ve istenen yeni deger ile degistirir

            replaceAll() da ayni islevi yapabilir,
            ama asil kullanim amaci ve farki regex kullanilmasidir

         */


        str = "Kredi karti numaram 1234 3456 3421 6754";

        // tum sayilari * yapin
        System.out.println(str.replaceAll("\\d", "*"));


        str = "mehmet siyavusligil./%";
        // str'i ilk harfi buyuk harf, kalan tum harfleri * olacak sekilde degistirin
        // bosluk ve ozel karakterlere dokunmayin

        str = str.substring(0,1).toUpperCase() +  //kalan tum harfleri * olacak
             str.substring(1).replaceAll("\\w","*");

        System.out.println(str);




    }
 }
