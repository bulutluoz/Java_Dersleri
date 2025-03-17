package K13_methodOlusturmaVeKullanma.D04_MethodOverloading;

public class C01_Overloading {
    public static void main(String[] args) {

        /*
            Java'da bir class'da ayni isimde method'lar olusturulabilir
            Buradaki amac bir islemi farkli sekillerde yapabilmektir

            Bir class'da ISMI AYNI  farkli method'lar olusturulmasina
            OVERLOADING denir
         */


        /*
            Java'da bir class icerisinde ayni isim ve ayni parametrelere sahip
            birden fazla method OLUSTURULAMAZ.
            method'daki parametre olarak kullanilan variable isimlerini degistirmek
            veya method body'sini degistirmek bu sorunu cozmez

            Java'da AYNI CLASS icerisinde AYNI ISIMDE method olusturmak istersek
            bu method'larin SIGNATURE'lari farkli olmalidir

            Method Signature = method adi + parametrelerin data turleri ve dizilisi

            Ismi farkli olan method'lar icin OVERLOADING'den bahsedilemez

            overloading olmasi icin signature degismeli ama isim degismemeli
            bunun yontemi parametreler ile oynamak

            1- parametre sayisini degistirebiliriz
            2- parametrelerin data turlerini degistirebiliriz
            3- farkli data turundeki parametrelerin yerlerini degistirebiliriz
        */

        topla(2); // tek tam sayinin toplami : 4
        topla(2,3); // Iki tam sayinin toplami : 5
        topla(3.5,6); // double ve int 2 sayinin toplami : 9.5
        topla(3,4.5); // int ve double 2 sayinin toplami : 7.5

        //topla(3.2,4.3); // signature'i "topla double double" olan bir method olmadigi icin Java kabul etmez

        // topla("a","b"); // signature'i "topla String String" olan bir method olmadigi icin Java kabul etmez
        /*
            Bir method call'un calismasi icin
            method call'da yazdigimiz argumentler ile
            method'daki parametreler uyumlu olmalidir

            Eger method call'daki argumentler icin UYGUN bir method yoksa
            CTE olusur, Java kodu kirmizi cizer ve kod calismaz
         */




    }

    public static void topla(int a , int b){
        System.out.println("Iki tam sayinin toplami : " + (a+b));
    } // method signature : topla int int

    // 'topla(int, int)' is already defined in 'C01_Overloading'
//    public static void topla(int sayi1 , int sayi2){
//        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
//    } // method signature : topla int int

    public static void topla(int a){
        System.out.println("tek tam sayinin toplami : " + (a+a));
    } // method signature : topla int

    public static void topla(double a , int b){
        System.out.println("double ve int 2 sayinin toplami : " + (a+b));
    } // method signature : topla double int

    public static void topla(int a , double b){
        System.out.println("int ve double 2 sayinin toplami : " + (a+b));
    } // method signature : topla int double



}
