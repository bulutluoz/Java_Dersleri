package K16_scope.D02_ClassLevelVariables;

public class C01_ClassLevelVariablesDirektKullanim {

    /*
        - static variable'lar TUM Class'dan direkt olarak kullanilabilirler
    */
    /*
        - instance variable'lar
              instance variable'lar static olmadiklarindan
              secim hakki method'a gecer
               * eger method static ise instance variable'larin direkt kullanilmasini kabul etmez
               * eger method da static degilse instance variable'lar direkt kullanilabilir
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


    }

    public static void method1(){


    }


    public void method2(){


    }
}




