package K08_ifElseStatements.D03_ifElseStatements;

import java.util.Scanner;

public class C03_BuyukHarfKontrolu {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);


        // 1.yontem ascii table'i kullanarak

        if ( karakter >= 'A'  && karakter <= 'Z'  ){
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Buyuk harf degil");
        }



        // 2.yontem Character Wrapper Class ozelliklerini kullanalim

        if (  Character.isUpperCase(karakter) ){
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Buyuk harf degil");
        }

    }
}
