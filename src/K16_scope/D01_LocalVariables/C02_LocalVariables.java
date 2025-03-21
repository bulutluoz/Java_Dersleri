package K16_scope.D01_LocalVariables;

public class C02_LocalVariables {

    /*
        Local variable'lar deger atamadan DEKLARE edilebilir,
        ANCAKKK deger atamadan kullanilamazlar
     */

    public static void main(String[] args) {

        String str ="Ali Can";
        System.out.println(str.toUpperCase());

        str = str.toLowerCase();

        String metin;

        // System.out.println(metin);
        // Variable 'metin' might not have been initialized

        // metin.toUpperCase();
        // Variable 'metin' might not have been initialized

        metin = "Java cok guzel";

        for (int i = 0; i <10 ; i++) {
            System.out.println(metin);
            str = str.toLowerCase();
            // main method icerisinde loop'dan once olusturulan local variable'lar
            // loop icerisinde de kullanilabilir
            // o variable'lar main method {} icerisinde olusturulduklari icin
            // main method icerisinde heryerden kullanilabilirler

            int sayi = 20;
            System.out.println(sayi);
            sayi++;

            System.out.println(i);

        }

        /*
            sayi variable'i her ne kadar main method icinde olsa da
            for loop'un {} icerisinde olusturulmustur

            local variable'lar icinde olusturulduklari
            {} disindan KULLANILAMAZLAR

            loop'larda olusturulan int i = 0; da local bir variable'dir
            ve sadece loop icerisinde kullanilabilir

            Gorevi yaparken
            hem loop icerisinde hem de loop disinda kullanmamiz gereken variable varsa
            loop'dan once olusturmaliyiz.
         */
//        System.out.println(sayi);
//        sayi = 45;
//        System.out.println(i);
//        i +=20;

        String cumle;

        for (int i = 0; i < 20; i++) {
//            if (!cumle.isEmpty()){
//                System.out.println(cumle.toUpperCase());
//            }
        }

    }


    public static void method1(int sayi){

        char ch1;

        // System.out.println(ch1);
        // Variable 'ch1' might not have been initialized

        System.out.println(sayi);
        sayi += 20;
        // parametre olarak olusturulan variable'larin
        // degerleri method call yapilan yerden geldigi icin
        // onlari deger atanmamis olarak dusunemeyiz

    }


}
