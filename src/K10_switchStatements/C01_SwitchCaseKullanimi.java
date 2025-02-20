package K10_switchStatements;

import java.util.Scanner;

public class C01_SwitchCaseKullanimi {

    public static void main(String[] args) {


        // kullaniciya haftanin kacinci gununu yazdirmak istedigini sorun
        // 1-7 arasindaki degerler icin pazartesi'den pazar'a kadar gun isimlerini yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girerse hata mesaji verin

          /*
            switch(kontrolEdilecekVariable) {  }
            Java kontrolEdilecekVariable'in degerine
            uygun olan case'den calismaya baslar

            ve switch statement'in sonuna kadar calisir

            EGER case'lerin birbirinden bagimsiz olmasini isterseniz
            her case'in bitimine break; yazmaliyiz

            EGER kullanici case olarak belirlenen degerlerin disinda
            ne deger girerse girsin
            standart bir islem yapmasini istersek
            default :  ile bu islemi tanimlayabiliriz
             */
        Scanner scanner = new Scanner(System.in);
        System.out.println("haftanin kacinci gununu yazdirmak istersiniz ?");
        int gunNo = scanner.nextInt();

        if (gunNo == 1) System.out.println( "Pazartesi");
        else if (gunNo == 2) System.out.println( "Sali");
        else if (gunNo == 3) System.out.println( "Carsamba");
        else if (gunNo == 4) System.out.println( "Persembe");
        else if (gunNo == 5) System.out.println( "Cuma");
        else if (gunNo == 6) System.out.println( "Cumartesi");
        else if (gunNo == 7) System.out.println( "Pazar");
        else System.out.println("Gun numarasi 1 ile 7 arasinda olmalidir");

        System.out.println("=================");

        switch (gunNo){

            case 1:
                System.out.println( "Pazartesi");
                break;
            case 2:
                System.out.println( "Sali");
                break;
            case 3:
                System.out.println( "Carsamba");
                break;
            case 4:
                System.out.println( "Persembe");
                break;
            case 5:
                System.out.println( "Cuma");
                break;
            case 6:
                System.out.println( "Cumartesi");
                break;
            case 7:
                System.out.println( "Pazar");
                break;
            default:
                System.out.println("Gun numarasi 1 ile 7 arasinda olmalidir");

        }







    }
}
