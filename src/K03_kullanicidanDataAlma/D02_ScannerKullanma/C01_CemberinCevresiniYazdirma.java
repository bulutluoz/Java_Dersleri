package K03_kullanicidanDataAlma.D02_ScannerKullanma;

import java.util.Scanner;

import static java.lang.Math.PI;

public class C01_CemberinCevresiniYazdirma {

    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //         cevresini ve alanini yazdirin.
        //         cevre = 2* PI * yaricap , alan = PI * yaricap * yaricap

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz...");

        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin cevresi : " +    (2* PI * yaricap)    );

        System.out.println("Dairenin alani : " + (PI * yaricap * yaricap)  );



    }
}
