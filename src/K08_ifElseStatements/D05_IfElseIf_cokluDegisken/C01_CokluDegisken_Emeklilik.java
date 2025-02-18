package K08_ifElseStatements.D05_IfElseIf_cokluDegisken;

import java.util.Scanner;

public class C01_CokluDegisken_Emeklilik {

    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: erkek, K:kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        // kullanici kucuk buyuk harf girebilir diye
        // kontrolu kolay yapabilmek icin toUpperCase() kullandik

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if ( !( cinsiyet == 'K' || cinsiyet == 'E' )  || yas < 15  || yas > 80   ){
            System.out.println("Girilen degerler icin emeklilik hesaplanamaz");
        } else if (cinsiyet == 'K'  && yas >=60) {
            System.out.println("Kadin ve 60 yasdan buyuk, emekli olabilir");
        } else if (cinsiyet == 'K' && yas <60) {
            System.out.println("Kadinlar 60 yasinda emekli olabilir, daha " +(60-yas)+ " yil calismalisiniz");
        } else if (cinsiyet == 'E'  && yas >=65) {
            System.out.println("Erkek ve 65 yasdan buyuk, emekli olabilir");
        } else if (cinsiyet == 'E' && yas <65) {
            System.out.println("Erkekler 65 yasinda emekli olabilir, daha " +(65-yas)+ " yil calismalisiniz");
        }


    }
}
