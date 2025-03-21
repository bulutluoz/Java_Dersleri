package K16_scope.D01_LocalVariables;

public class C01_LocalVariables {
    /*
        Local variable;
        bir kod blogu icerisinde olusturulan variable'lara denir.

        Local varible'larin scope'u
        icinde olusturulduklari kod blogudur.

        Kendi kod bloklarinin disindan KULLANILAMAZLAR
     */

    public static void main(String[] args) {

        int sayi = 10;
        // System.out.println(str);

        int num = 3;
        // int num = 6;
        // Variable 'num' is already defined in the scope
    }

    public static  void method1(){
        // System.out.println(sayi);
        String str = "Java Candir";
        int num = 45;
        // bu method'daki num ile main method'daki num
        // farkli ailelerde ismi ali olan 2 cocuk gibidir
        // isimlerinin ayni olmasi, bu variable'larin ayni oldugu anlamina gelmez
    }

    public void method2(int numara){
        // sayi = 20;
        // str = "Tava Candir";

        // parametre olarak olusturulan variable'lar da local variable'dir.
        // degerleri method call yapilan yerden gelir
        System.out.println(numara);

        // int numara= 56;
        //Variable 'numara' is already defined in the scope
    }
}
