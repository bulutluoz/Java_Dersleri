package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Random;
import java.util.Scanner;

public class C01_SinifGecme {

    public static void main(String[] args) {

        /*

        NOTLAR :
        1-
         if'in onundeki parantezin icinde
         boolean disinda bir data turunden deger OLAMAZ

        2-
            Basit if cumleleri
            if'in onundeki () icine odaklanir
            () ici true ise IF BODY calisir
            () ici false ise IF BODY calismaz

         3-
            sart saglanmadigi icin
            if body calismazsa
            IF STATEMENT CALISMADI demeyiz
            IF STATEMENT CALISTI ama deger uygun olmadigi icin
            IF BODY DEVREYE GIRMEDI deriz

         */


        // kullanicidan notunu alin
        // notu 50 veya daha buyukse "sinifi gectin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();


        if (not >= 50) {
            System.out.println("sinifi gectin");
        }




    }
}
