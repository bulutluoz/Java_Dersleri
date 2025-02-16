package K08_ifElseStatements.D06_nestedIfElseStatements;

import java.util.Scanner;

public class C04_HarfKontrolu {
    public static void main(String[] args) {

        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici harfler disinda bir karakter girerse
                - "Tanimlanmamis karakter" yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter giriniz..");
        char karakter= scanner.next().charAt(0);




    }
}
