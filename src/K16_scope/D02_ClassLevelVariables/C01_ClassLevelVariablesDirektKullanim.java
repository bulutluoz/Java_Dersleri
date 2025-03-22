package K16_scope.D02_ClassLevelVariables;

public class C01_ClassLevelVariablesDirektKullanim {

    /*
        - static variable'lar TUM Class'dan direkt olarak kullanilabilirler
    */
    /*
        - instance variable'lar
              static olmadiklarindan
              secim hakki method'a gecer
               * eger method static ise instance variable'larin direkt
                 kullanilmasini kabul etmez
               * eger method da static degilse (method'da secici olmaz)
                 instance variable'lar direkt kullanilabilir
    */
    /*
         Ister static ister instance olsun
         Class level variable'lar deger atamadan deklare edilebilir
         VE deger atamadan kullanilabilir

         Bir class level variable'a biz deger atamazsak
         Java belirlenmis olan degerlerin(default deger) atamasini yapar
         non-primitive ==> null
         sayisal primitive ==> 0
         boolean ==> false
         chr ==> hiclik
     */

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {
        System.out.println(strS); // Ali
        System.out.println(sayiS); // 0
        System.out.println(chrS); // #
        System.out.println(blS); // false
        method1();

//        System.out.println(strI);
//        System.out.println(sayiI);
//        System.out.println(chrI);
//        System.out.println(blI);
//        method2();
        // Non-static method 'method2()' cannot be referenced from a static context
        // static olan main method'dan static olmayan method2'yi cagiramazsiniz



    }
    public static void method1(){
        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        // Non-static field 'strI' cannot be referenced from a static context
        // static olan method1'den static olmayan strI'yi cagiramazsiniz

//        System.out.println(strI);
//        System.out.println(sayiI);
//        System.out.println(chrI);
//        System.out.println(blI);

    }

    public void method2(){
        // method2 static olmadigi icin
        // hicbir kontrol yapmaz
        // tum variable'lar method2'den kullanilabilir
        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        System.out.println(strI);
        System.out.println(sayiI);
        System.out.println(chrI);
        System.out.println(blI);


    }
}




