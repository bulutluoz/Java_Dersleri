package K12_forLoop.D02_soruCozumu;

import java.util.Scanner;

public class C05_StringiTersineCeviripKaydetme {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve
        // String’i tersine cevirip tersMetin isminde bir variable'a kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();


        String tersMetin = "";

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        System.out.println("Girilen metnin tersi : " + tersMetin);



        // Girilen metnin Palindrome olup olmadigini yazdirin
        // Palindrome tersi kendisine esit olan metin    madam ==> madam

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("girilen metin Palindrome");
        } else {
            System.out.println("girilen metin Palindrome degil");

        }





    }
}
