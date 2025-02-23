package K11_stringManipulations.D06_replace;

import java.util.Scanner;

public class C02_replaceFirst {

    public static void main(String[] args) {


        String str = "Java ile yazilim dunyasina giris yap";

        // sadece ilk "a" harfini "A" ile degistirip yazdirin

        System.out.println(str.replace("a", "A"));
        // JAvA ile yAzilim dunyAsinA giris yAp

        System.out.println(str.replaceFirst("a", "A"));
        // JAva ile yazilim dunyasina giris yap


        // sadece ilk 'e' harfini 'E' olarak degistirip yazdirin

        // System.out.println(str.replaceFirst('e', 'E'));
        /*
            replaceFirst() char parametre kabul etmez
         */

        System.out.println(str.replaceFirst("e", "E"));
        // Java ilE yazilim dunyasina giris yap



        str = "Java 1-3 ayda ogrenilir";

        // str'daki 1 rakamini 2 olarak degistirip yazdirin
        System.out.println(str.replaceFirst("1", "2"));
        //Java 2-3 ayda ogrenilir


        // str'daki ilk rakami 0 olarak degistirip yazdirin
        System.out.println(str.replaceFirst("\\d", "0"));
        //Java 0-3 ayda ogrenilir

        /*
            regex regular expression  ==> belirlenmis kisaltmalar
                \\d	Bir rakam (0-9)
                \\D	Rakam olmayan karakter

                \\w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
                \\W	Kelime karakteri olmayan bir karakter

                \\s	Beyaz boşluk karakteri (boşluk, tab, yeni satır vb.)
                \\S	Beyaz boşluk olmayan karakter
                \\s+ birden fazla yanyana space
         */


        // Kullanicidan bir cumle isteyin
        // eger cumle icinde rakam varsa, ilk rakam yerine X yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();

        System.out.println(cumle.replaceFirst("\\d", "X"));


    }
    }
