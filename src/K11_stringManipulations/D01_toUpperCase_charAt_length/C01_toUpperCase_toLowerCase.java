package K11_stringManipulations.D01_toUpperCase_charAt_length;

import java.util.Locale;

public class C01_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase());  // JAVA CANDIR


        // str'i kucuk harf olarak yazdirin
        System.out.println(str.toLowerCase()); // java candir



        /*
            String method'lari kullanmak
            str'i kalici olarak degistirmez
            SADECE kullanildigi satir icin degistirir
         */

        // str 'i yazdiralim
        System.out.println("str : " + str);



        str.toUpperCase();  // Result of 'String.toUpperCase()' is ignored
                            // method sonucu kullanilmadi

        /*
         yukardaki satirda kod calisir
         AMMA yazdirma veya atama olmadigindan
         yaptigi islem 25.satirda kalir
         ne konsolda gorunur, ne de kalici bir degisiklik yapar

         Kalici degisiklik yapmak istedigimizde ATAMA yapmaliyiz
         */

        // str'i kalici olarak buyuk harflerden olusan bir metne cevirin

        str = str.toUpperCase();

        System.out.println("Kalici olarak buyuk harf olan str : " + str);


        // str'i kalici olarak kucuk harflerden olusan bir metne cevirin

        System.out.println( str = str.toLowerCase() ); // java candir



        /*
            Eger bir dilde herhangi bir harfin buyuk/kucuk harf degisimi
            latin alfabesinden farkli ise toUpperCase() veya toLowerCase() kullanirken
            Localle tercihi kullanilabilir.

            ornegin str'i kucuk harfe cevirirsek,
            ingilizce alfabe kullandigi icin CANDIR ==> candir olur
            Eger I'yi toLowerCase() yaptigimizda turkce kucuk ı olmasini istersek
            Locale tercihi kullanabiliriz
         */

        String s = "Bağ bağcınındır";

        System.out.println(s = s.toUpperCase()); // BAĞ BAĞCININDIR

        System.out.println(s.toLowerCase()); // bağ bağcinindir

        String t = "Çok güzel bir maç oldu";

        System.out.println( t = t.toUpperCase()); // ÇOK GÜZEL BIR MAÇ OLDU

        System.out.println(t.toLowerCase()); // çok güzel bir maç oldu


        s = "Bağ bağcınındır";
        // s'yi turkce local ozelligi ile buyuk harf yapin

        s = s.toUpperCase(Locale.forLanguageTag("TR"));

        System.out.println(s); // BAĞ BAĞCININDIR

        // s'yi turkce local ozelligi ile kucuk harf yapin

        s = s.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(s); // bağ bağcınındır


        t = "Çok güzel bir maç oldu";

        // t'yi turkce local ozelligi ile buyuk harf yapin

        t = t.toUpperCase(Locale.forLanguageTag("TR"));

        System.out.println(t); // ÇOK GÜZEL BİR MAÇ OLDU

        // t'yi turkce local ozelligi ile kucuk harf yapin

        t = t.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(t); // çok güzel bir maç oldu

    }
}
