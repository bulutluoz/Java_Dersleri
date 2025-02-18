package K08_ifElseStatements.D05_IfElseIf_cokluDegisken;

import java.util.Scanner;

public class C03_EmeklilikHesabi_NestedIfElse {
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

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        /*
            Eger bir if else'de karar vermek icin baktigimiz
            variable sayisi birden fazla ise nested if else statement tercih edilebilir

            Oncelikle bakacagimiz 2 degiskenden birini
            ana degısken kabul edip sadece ona gore bir if else olustururuz

            biz cinsiyeti ana degisken kabul edelim
         */

        if (cinsiyet == 'K'){ // bu if Kadinlari secer
            // Kadinlar bolgesi
            if (yas<15 || yas>80){
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas >= 60) {
                System.out.println("Kadin ve 60 yasdan buyuk, emekli olabilir");
            } else {
                System.out.println("Kadinlar 60 yasinda emekli olabilir, daha " +(60-yas)+ " yil calismalisiniz");
            }

        } else if (cinsiyet == 'E') { // bu if erkekleri secer
            // erkekler bolgesi
            if (yas<15 || yas>80){
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas >= 65) {
                System.out.println("Erkek ve 65 yasdan buyuk, emekli olabilir");
            } else {
                System.out.println("Erkekler 65 yasinda emekli olabilir, daha " +(65-yas)+ " yil calismalisiniz");
            }

        } else { // yukardaki 2 if erkek ve kadinlari secti, o if'lerden gecen deger uygun olmayacaktir
            System.out.println("Cinsiyet olarak E veya K girmelisiniz!!!!");
        }


    }
}
