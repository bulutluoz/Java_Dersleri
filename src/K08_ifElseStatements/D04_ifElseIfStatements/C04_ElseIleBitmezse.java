package K08_ifElseStatements.D04_ifElseIfStatements;

import java.util.Scanner;

public class C04_ElseIleBitmezse {

    public static void main(String[] args) {

        /*
            EGER bir if else if... statement
            else ile bitmiyorsa, bu if-else tum durumlari KAPSAYAMAZ
            yani bazi degerler icin hicbir if body'si calismaz
         */

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();



    }
}
