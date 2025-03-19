package K14_whileLoop.D02_ornekSoruCozumu;


import K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular.C04_SifreKontrol;

import java.util.Scanner;

public class C02_BasariliSifreAlma {

    public static void main(String[] args) {

        // daha once yaptigimiz sifre kontrolu method'unu kullanarak
        // kullanici hatasiz bir sifre girinceye kadar tekrar tekrar sifre isteyin
        // kabul edilebilir bir sifre girdiginde
        // "Sifreniz basarili olarak kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);

        String girilenSifre = "ali";
        boolean sifreKontrolSonucu = false;

        while (sifreKontrolSonucu == false){

            System.out.println("Lutfen sifrenizi giriniz...");
            girilenSifre = scanner.nextLine();


            sifreKontrolSonucu = C04_SifreKontrol.isValid(girilenSifre);

            if (sifreKontrolSonucu == true){
                System.out.println("Sifreniz basarili olarak kaydedildi");
            }


        }




    }


}
