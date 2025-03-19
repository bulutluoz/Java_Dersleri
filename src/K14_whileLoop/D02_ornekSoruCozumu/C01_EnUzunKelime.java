package K14_whileLoop.D02_ornekSoruCozumu;

import java.util.Scanner;

public class C01_EnUzunKelime {

    public static void main(String[] args) {
        // asagidaki gorevi yapan bir method olusturun

        // kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
        // esit sayida harfe sahip isimlerden herhangi biri olabilir

        enuzunIsmiYazdir();

    }

    public static void enuzunIsmiYazdir(){

        Scanner scanner = new Scanner(System.in);

        String girilenIsim = "";
        String enUzunIsim = "";

        while ( !girilenIsim.equalsIgnoreCase("Q") ){ // devam etmesi icin gerekli sart


            System.out.println("Lutfen bir isim girin. " +
                                "\nBitirmek icin Q'ya basin");

            girilenIsim = scanner.nextLine();


            if (girilenIsim.equalsIgnoreCase("Q")){
                // kullanici bitirmek istiyor
                System.out.println(enUzunIsim);
            } else {
                // kullanici Q'ya basmamis demektir
                // girilen ismin var olan en uzun isimden
                // daha uzun olup olmadigini kontrol edelim

                if (girilenIsim.length()>enUzunIsim.length()){
                    enUzunIsim = girilenIsim;
                }
            }

        }

    }





}
