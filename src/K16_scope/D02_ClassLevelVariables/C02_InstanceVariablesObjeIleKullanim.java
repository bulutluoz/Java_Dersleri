package K16_scope.D02_ClassLevelVariables;

import java.util.Scanner;

public class C02_InstanceVariablesObjeIleKullanim {
    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {

        int localInt;
        // static String st = "";
        // Modifier 'static' not allowed here
        // Local variable'lar static olarak TANIMLANAMAZ



        // static alanda instance variable'i direkt kullanamayiz
        // System.out.println(sayiI);

        // instance variable'lari static alanda kullanabilmek icin
        // class'dan obje olusturmaliyiz

        Scanner scanner = new Scanner(System.in);

        C02_InstanceVariablesObjeIleKullanim obj = new C02_InstanceVariablesObjeIleKullanim();
        System.out.println(obj.blI); // true
        System.out.println(obj.sayiI); // 10
        System.out.println(obj.strI); // null
        System.out.println(obj.chrI); // hiclik

        obj.blI = false;
        obj.sayiI = 45;

        // static olan bir variable'i obje uzerinden kullanabilir miyiz?

        strS = "Java Guzeldir";
        sayiS = 23;

        System.out.println(obj.sayiS);
        // Static member 'sayiS' accessed via instance reference
        // static olan sayiS'i instance gibi kullaniyorsun

        obj.blS = false;


    }

    public static void method1(){
        C02_InstanceVariablesObjeIleKullanim obj = new C02_InstanceVariablesObjeIleKullanim();

        System.out.println(obj.blI); // true
        System.out.println(obj.sayiI); // 10
        System.out.println(obj.strI); // null
        System.out.println(obj.chrI); // hiclik

        obj.blI = false;
        obj.sayiI = 45;

    }

    public void method2(){
        // Instance variable'lari method2'den kullanmak istersek
        System.out.println(blI); // true
        System.out.println(sayiI); // 10
        System.out.println(strI); // null
        System.out.println(chrI); // hiclik


    }
}
