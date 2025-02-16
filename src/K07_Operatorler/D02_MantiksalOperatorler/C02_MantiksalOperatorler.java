package K07_Operatorler.D02_MantiksalOperatorler;

public class C02_MantiksalOperatorler {

    public static void main(String[] args) {

        // Eger bir degerin verilen aralikta olup olmadigina bakmak istersek
        // && operatoru tercih edilir

        char verilenHarf = 'c';

        // verilen harfin kucuk harf oldugunu kontrol edin

        System.out.println(  verilenHarf >= 'a'  && verilenHarf <='z'   );


        System.out.println(  Character.isLowerCase(verilenHarf)   );


        // verilen harfin a ile k arasinda (a ve k dahil degil) oldugunu kontrol edin


        System.out.println(  verilenHarf > 'a'  &  verilenHarf < 'k'   );





        int sayi = 145;
        // verilen sayinin 2 basamakli oldugunu kontrol edin

        System.out.println( sayi >= 10    && sayi <=99 );
        System.out.println( sayi >= 10    && sayi < 100 );


        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) oldugunu kontrol edin

        System.out.println( sayi >=100  && sayi<=200);







        // Eger bir degerin verilen araligin disinda oldugunu kontrol etmek istersek
        // || operatoru kullanilmalidir

        verilenHarf = 'A';


        // verilen harfin kucuk harf olmadigini kontrol edin

        System.out.println( verilenHarf < 'a' || verilenHarf > 'z');

        //    y  false
        //    9  true
        //    A  true




        // verilen harfin a ile t arasinda (a ve t dahil) olmadigini kontrol edin


        System.out.println(  verilenHarf < 'a'  || verilenHarf > 't'  );





        sayi = 7777;


        // verilen sayinin 3 basamakli pozitif sayi olmadigini kontrol edin

        System.out.println(   sayi <100 ||  sayi>999  );
        /// 777 false
        /// 77 true
        /// 7777 true



        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) olmadigini kontrol edin






    }
}
