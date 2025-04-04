package K12_forLoop.D01_forLoop;

public class C01_BasitDonguler {

    public static void main(String[] args) {

        // 1'den baslayip, 50'ye kadar (50 dahil) tek sayilari yazdirin

        for (       int i = 1       ;        i <=50         ;          i+=2    ) {
           // nereden baslayacagiz    nereye kadar gidecek    kacar kacar artacak?

           // for body'si yukardaki boolean sart true oldukca
           // tekrar tekrar calisacak

            System.out.print( i + " ");

        }

        System.out.println("");
        // yukardaki loop yan yana yazdiriryor
        // loop'un isi bittiginde alt satira gecmek icin
        // "" yazdirabiliriz





        // 207'den baslayip 5'er artirarak, 400'den kucuk olan sayilari yazdirin


        for (int i = 207 ; i < 400 ; i+=5 ) {

            System.out.print(i + " ");

        }

        System.out.println("");

        // 2 basamakli cift sayilarin toplami kactir?

        int toplam = 0;

        for (int i = 10; i <100 ; i+=2 ) {

            toplam += i ;

        }

        System.out.println("iki basamakli pozitif cift sayilarin toplami : " + toplam);


        // 40 sayisini kalansiz bolebilen pozitif tamsayilari yazdirin


        for (int i = 1; i <=40 ; i++) {

            if (40 % i == 0) System.out.print(i + " ");

        }

        System.out.println("");







        // 1000'den geriye dogru 3 basamakli 37 ile bolunebilen sayilari yazdirin


        for (int i = 1000; i >=100 ; i--) {

            if ( i % 37 == 0) System.out.print(i + " ");

        }
        System.out.println("");


        // verilen baslangic ve bitis degerleri dahil olmak uzere
        // bu sayilar arasinda 7 ile bolunebilen sayi adedini yazdirin


        int baslangic = 7234 ;
        int bitis = 8902;


        for (int i = baslangic; i <= bitis  ; i++) {

            if (i % 7 == 0) System.out.print(i + " ");

        }




    }

}
