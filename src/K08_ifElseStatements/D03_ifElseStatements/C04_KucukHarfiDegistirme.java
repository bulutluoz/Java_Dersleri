package K08_ifElseStatements.D03_ifElseStatements;

import java.util.Scanner;

public class C04_KucukHarfiDegistirme {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);

        // 1.yontem ascii table kullanarak

        if ( karakter >= 'a' && karakter <= 'z' ){
            // girilen karakter kucuk harf ve onu buyuk harf olarak yazdiracagiz

            System.out.println("Girilen karakter : " + (char)(karakter - 32) );


        } else {
            // girilen karakter kucuk harf  degil,onu oldugu gibi yazdiracagiz
            System.out.println("Girilen karakter : " + karakter);

        }



        // 2.yontem Wrapper class ozelliklerini kullanarak

        if ( Character.isLowerCase(karakter) ){
            // girilen karakter kucuk harf ve onu buyuk harf olarak yazdiracagiz

            System.out.println("Girilen karakter : " +  Character.toUpperCase(karakter)      );


        } else {
            // girilen karakter kucuk harf  degil,onu oldugu gibi yazdiracagiz
            System.out.println("Girilen karakter : " + karakter);

        }


    }
}
