package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class C02_KucukOlmayaniYazdir {

    public static void main(String[] args) {

        // verilen iki tamsayidan kucuk olmayani yazdiran bir method olusturun

        kucukOlmayaniYazdir(24,57); // 57

        kucukOlmayaniYazdir(3,-6); // 3

        kucukOlmayaniYazdir(7,7); // 7




    }


    public static void kucukOlmayaniYazdir( int sayi1 , int sayi2  ){


        System.out.println(  sayi1<sayi2 ? sayi2 : sayi1  );

    }



}
