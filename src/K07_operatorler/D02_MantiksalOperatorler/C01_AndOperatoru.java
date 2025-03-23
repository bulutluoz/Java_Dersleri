package K07_operatorler.D02_MantiksalOperatorler;

public class C01_AndOperatoru {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        /*
         Eger sonuca odakli bir islem yapiyorsak
         ilk false bulundugunda genel sonuc false olacagindan
         geriye kalan islemleri yapmaya gerek KALMAZ
         boylece islem HIZLI yapilmis olur
         */


        boolean genelSonuc1 = a>=b     &&   a<b     &&      a>b-8 ;

        System.out.println(genelSonuc1); // false


        boolean genelSonuc2 = a>=b     &   a<b     &      a>b-8 ;

        System.out.println(genelSonuc2); // false



        /*
         bazen 2. ve 3.islemlerde atamalar olabilir
         eger o islemler yapilmazsa atamalar da yapilmamis olur
         bu durumda sonuc yine false olsa da
         tum islemlerin yapilmasini isteriz
         bunun icin & kullanmayi tercih ederiz

         ozetle

         hizli sonuc onemli ise    &&
         tum islemlerin yapilmasi onemli ise   &


         */



        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;

        System.out.println( "& sonuc1 : " + sonuc1);
        System.out.println( "& sonuc2 : " + sonuc2);
        System.out.println( "& sonuc3 : " + sonuc3);
        System.out.println( "& genelSonuc : " + genelSonuc);


        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6=true;

        boolean genelSonuc3 =  (sonuc4= a>=b)     &&  (sonuc5 = a<b)     &&      (sonuc6=a>b-8) ;

        System.out.println( "&& sonuc4 : " + sonuc4);
        System.out.println( "&& sonuc5 : " + sonuc5);
        System.out.println( "&& sonuc6 : " + sonuc6);
        System.out.println( "&& genelSonuc3 : " + genelSonuc3);


    }
}
