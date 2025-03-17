package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

import java.util.Scanner;

public class C05_DogruSifreAlma {

    public static void main(String[] args) {


        // Kullanicidan bir sifre isteyin
        // C05'deki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin


        Scanner scanner = new Scanner(System.in);

        int sayac=0;


        for (int i = 0; i <=10000 ; i++) {


            System.out.println("Lutfen sifrenizi giriniz...");
            String sifre = scanner.nextLine();
            sayac++;

            boolean sonuc = C04_SifreKontrol.isValid(sifre);


            if (sonuc){ // sonuc == true
                System.out.println("Tebrikler, " + sayac + " denemede uygun bir sifre girdiniz...");
                break;
            }


        }





    }
}
