package K14_whileLoop.D01_whileLoopNasilCalisir;

public class C01_WhileLoopVsForLoop {

    public static void main(String[] args) {

        /*
            Eger baslangic ve bitis degerleri biliniyorsa
            veya bir islemi kac kere tekrarlayacigimizi biliyorsak
            For Loop avantajlidir

            Cunku while loop
            - baslangic degeri
            - bitis degeri
            - ve artis/azalis miktarini otomatik olarak bize vermez

         */

        // 1'den 10'a kadar (1 ve 10 dahil) tum sayilari toplayin

        int toplam = 0;

        for (int i = 1; i <=10 ; i++) {

            toplam += i;

        }

        System.out.println("For loop ile toplama sonucu : " + toplam);


        // ayni islemi while loop ile yapalim

        toplam = 0;

        int sayi = 1;

        while ( sayi<=10 ){ // loop'un devam etmesi icin aranan sart

            toplam += sayi ;

            sayi++; // degisim seklini girmezsek sonsuz loop olusur

        }

        System.out.println("While loop ile toplama sonucu : " + toplam);






        // 20'den 30'a kadar olan sayilari (20 ve 30 dahil)
        // tam sayilari carpin ve yazdirin

        int carpim = 1;

        for (int i = 20; i <=30 ; i++) {

            carpim *= i;
        }

        System.out.println("For loop ile carpim sonucu : " + carpim); // 702395392



        // while loop ile yapalim
        carpim = 1;
        int i = 20;

        while (i <= 30){
            carpim *= i;

            i++;
        }


        System.out.println("While loop ile carpim sonucu : " + carpim); // 702395392



    }
}
