package K17_arrays.D02_arrayinTumElementleriniKullanma;

import java.util.Arrays;

public class C01_TumElementleriKullanma {

    public static void main(String[] args) {

        int[] sayilar = {4,7,1,3,4,8,0,1};

        // sayilar array'ini yazdirin
        System.out.println(sayilar); // [I@2752f6e2
        System.out.println(Arrays.toString(sayilar)); // [4, 7, 1, 3, 4, 8, 0, 1]


        // sayilar array'inin tum elementlerini
        // aralarinda bir bosluk birakarak yan yana yazdirin

        System.out.println(sayilar[0]); // 4
        System.out.println(sayilar[1]); // 7
        System.out.println(sayilar[sayilar.length-1]); // 1

        /*
            EGER bir array'in tum elementleri ile
            istenen bir islem yapacaksak
            for loop kullaniriz
         */

        for (int i = 0; i < sayilar.length ; i++) {

            System.out.print(sayilar[i] + " ");
        }
        System.out.println();



        // sayilar array'indeki tum elementlerin toplamini yazdirin

        int toplam = 0;

        // array'deki tum elementleri elden gecirmemiz gerekiyor mu ?  evet
        // [4, 7, 1, 3, 4, 8, 0, 1]

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];
        }

        System.out.println("Array'deki elementlerin toplami : " + toplam);  // 28

        // sayilar array'indeki cift sayilarin carpimini yazdirin

        int carpim = 1;

        for (int i = 0; i < sayilar.length ; i++) {

            if (  sayilar[i] % 2 == 0){
                carpim *= sayilar[i];
            }
        }

        System.out.println("Array'deki cift sayilarin carpimi : " + carpim); // 0






    }
}
