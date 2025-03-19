package K15_doWhileLoop.D02_OrnekSoruCozumu;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        //         o harfleri ve aralarindaki harfleri yazdirin.
        //         kullanici bir harf degil
        //         bir metin veya harf disinda karakter girerse
        //         uyari verip, yeniden harf girmesini isteyin
        //         kullanici harf girinceye kadar tekrar isteyin

        Scanner scanner = new Scanner(System.in);

        char baslangicKarakter = 'a';
        char bitisKarakter = 's';
        String girilenBaslangic = "";
        String girilenBitis = "";

        // asagidaki do-while loop'un gorevi
        // kullanicidan baslangic ve bitis degerleri olarak
        // harf almak

        do {
            System.out.println("Lutfen baslangic icin bir harf giriniz...");
            girilenBaslangic = scanner.nextLine();
            baslangicKarakter = girilenBaslangic.charAt(0);

            System.out.println("Lutfen bitis icin bir harf giriniz...");
            girilenBitis = scanner.nextLine();
            bitisKarakter = girilenBitis.charAt(0);

            if (!(girilenBaslangic.length() == 1 && girilenBitis.length()==1 &&
                    Character.isLetter(baslangicKarakter) && Character.isLetter(bitisKarakter) ) ){
                System.out.println("Girilen degerler harf degil");
            }

        } while(  !(girilenBaslangic.length() == 1 && girilenBitis.length()==1 &&
                 Character.isLetter(baslangicKarakter) && Character.isLetter(bitisKarakter) ) );

        // yukardaki loop bittiginde
        // biz kullanicidan istedigimiz ozelliklere sahip girdi aldigimizdan emin olacagiz
        // artik baslangicKarakter ve bitisKarakter'in birer harf oldugunu biliyoruz

        // simdi artik bu harfleri ve aralrindaki harfleri yazdirabiliriz

        if (baslangicKarakter<bitisKarakter){

            for (char i = baslangicKarakter; i <=bitisKarakter ; i++) {
                System.out.print(i + " ");

            }

        } else { // baslangic bitisten kucuk degil

            for (char i = baslangicKarakter; i >=bitisKarakter ; i--) {
                System.out.print(i + " ");

            }

        }














    }
}
