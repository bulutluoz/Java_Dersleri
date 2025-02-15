package K06_increment_decrement.D01_increment_decrement_yontemleri;

public class C02_BirArtirmaVeyaAzaltma {

    public static void main(String[] args) {

        int a = 20;
        int b = 40;

        // a'nin degerini 1 artirin

        a++;

        System.out.println("14.satirda a'nin degeri : " + a); // 21


        ++a;

        System.out.println("19.satirda a'nin degeri : " + a); // 22



        // b'nin degerini 1 azaltin

        b--;

        System.out.println("27.satirda b'nin degeri : " + b); // 39


        --b;

        System.out.println("32.satirda b'nin degeri : " + b); // 38



        /*
            a++ ve ++a   veya b-- ve --b
            yazildiklari satirda tek baslarina iseler
            yani bu islemin yaninda yazdirma, atama, matematiksel islem gibi
            baska islemler yoksa
            TAMAMEN ayni isleve sahiptirler

            ister variable'dan once yazin
            ister variable'dan sonra yazin
            variable'in degerini 1 artirir veya 1 azaltirlar
         */


        a = 20;
        b = 40;

        System.out.println( "52.satirda a : " + a++  ); // 20
        System.out.println( "53.satirda a : " + a ); // 21

        a = 20;
        System.out.println( "56.satirda a : " + ++a  ); // 21
        System.out.println( "57.satirda a : " + a ); // 21



        a = 20;
        b = a++;

        System.out.println("64. satirda a : " + a +", b : " + b);
        // 64. satirda a : 21, b : 20



        a = 20;
        b = ++a;

        System.out.println("72. satirda a : " + a +", b : " + b);
        // 72. satirda a : 21, b : 21
    }
}
