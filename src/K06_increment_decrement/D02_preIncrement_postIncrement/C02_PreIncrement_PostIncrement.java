package K06_increment_decrement.D02_preIncrement_postIncrement;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

          /*
            ++ ve --'nin ozel bir kullanimi vardir
            EGER bir satirda sadece ++a veya a++ varsa,
            ikisi de ayni islevi gorur, a'nin degerini bir artirirlar.

            ayni sekilde bir satirda sadece --a veya a-- varsa
            ayni islevi yapip a'yi bir azaltirlar.

            Farklari ++ ve -- kullanilan satirda
            baska bir islem daha yapilirsa ortaya cikar

            ++ veya -- 'nin diger islemden once mi sonra mi yapilacagina
            ++ veya -- 'nin variable'dan once veya sonra yazilmasina
            gore karar veririz.

            --a , ++b   ++ veya -- variable'dan once yazilmissa
                        once artirma veya azaltma yapilir, sonra diger islem yapilir

            a++ , b--   ++ veya -- variable'dan sonra yazilmissa
                        artirma veya azaltma sonra yapilir, once diger islem yapilir

         */

        int a = 20;
        int b = 40;


        // pre/post increment ile ayni satirda yazdirma varsa


        System.out.println(  ++b );

        System.out.println("39.satirda b : " + b);


        System.out.println( a-- );

        System.out.println("44.satirda a : " + a);


        a = 20;
        b = 40;

        // pre/post increment ile ayni satirda atama varsa


        int c = a--;

        System.out.println("55.satirda a : " + a + ", c : " + c);
        // 55.satirda a : 19, c : 20


        c = ++b;


        System.out.println("62.satirda b : " + b + ", c : " + c);
        // 62.satirda b : 41, c : 41



        // pre/post increment ile ayni satirda baska matematiksel islemler varsa

        a = 20;
        b = 40;


        c = 2 * --a + 1;


        System.out.println("76.satirda a : " + a + ", c : " + c);



        c = b++ + 5 ;



        System.out.println("81.satirda b : " + b + ", c : " + c);




    }
}
