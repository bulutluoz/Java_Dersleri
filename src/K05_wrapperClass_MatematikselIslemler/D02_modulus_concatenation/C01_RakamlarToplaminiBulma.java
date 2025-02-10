package K05_wrapperClass_MatematikselIslemler.D02_modulus_concatenation;

import java.util.Scanner;

public class C01_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt(); // 245

        int rakamlarToplami = 0;
        int siradakiRakam = 0;

        // sayi ==> 245    rakamlarToplami => 0  siradakiRakam => 0
        // once birler basamagindaki rakami bulup
        // rakamlar toplamina ekleyelim

        siradakiRakam = sayi % 10 ;  //    245 % 10 ==> 5
        rakamlarToplami = rakamlarToplami + siradakiRakam ; // 0 + 5 ==> 5

        // 245'i 5'den kurtulup 24 haline getirmek istiyorum
        sayi = sayi / 10 ;  //  245 / 10 => 24,5  ama java 24 yapar


        // sayi ==> 24    rakamlarToplami => 5  siradakiRakam => 5
        // onlar basamagindaki rakami bulup
        // rakamlar toplamina ekleyelim

        siradakiRakam = sayi % 10 ;  // 24 % 10 ==> 4
        rakamlarToplami = rakamlarToplami + siradakiRakam; // 5 + 4 => 9
        sayi = sayi / 10; // 24 / 10 => 2.4 ama java 2 verir


        // sayi ==> 2   rakamlarToplami => 9  siradakiRakam => 4
        // yuzler basamagindaki rakami bulup
        // rakamlar toplamina ekleyelim

        // geriye sadece asil sayinin yuzler basamaginda olan 2 kaldigi icin
        // daha fazla uzatmaya gerek yok, toplama yapabiliriz
        rakamlarToplami = rakamlarToplami + sayi ; // 9 + 2 ==> 11

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);



















    }
}
