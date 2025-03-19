package K15_doWhileLoop.D02_OrnekSoruCozumu;

import java.util.Scanner;

public class C03_BolmeSonucuBulma {

    public static void main(String[] args) {
        // Soru 3- Kullanicidan bolunecek ve bolecek sayilari alip
        //         bolme islemi yapmadan bolum sonucunun tamsayi kismini
        //         yazdirin.
        //         Orn : Bolunecek sayi : 27 , bolecek sayi : 4 ==> Output : 6

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolunecek sayiyi giriniz...");
        int bolunecekSayi = scanner.nextInt();

        System.out.println("Lutfen boecek sayiyi giriniz...");
        int bolecekSayi = scanner.nextInt();

        int bolumSonucu = 0;

        while (bolunecekSayi>bolecekSayi){

            bolunecekSayi -= bolecekSayi;
            bolumSonucu++;

        }

        System.out.println("bolme sonucu : " + bolumSonucu);

    }




}
