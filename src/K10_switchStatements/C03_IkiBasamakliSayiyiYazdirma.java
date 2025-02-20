package K10_switchStatements;

import java.util.Scanner;

public class C03_IkiBasamakliSayiyiYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 100'den kucuk pozitif bir tamsayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        // 29 ==> yirmi dokuz
        // 87 ==> seksen yedi

        if (sayi < 0 || sayi>=100){

            System.out.println("Sayi 2 basamakli pozitif bir deger olmali");

        } else {

            int birlerBasamagindakiRakam = sayi % 10;
            int onlarBasamagindakiRakam = sayi / 10;

            switch (onlarBasamagindakiRakam){

                case 0 :
                    break;
                case 1 :
                    System.out.print("On");
                    break;
                case 2 :
                    System.out.print("Yirmi");
                    break;
                case 3 :
                    System.out.print("Otuz");
                    break;
                case 4 :
                    System.out.print("Kirk");
                    break;
                case 5 :
                    System.out.print("Elli");
                    break;
                case 6 :
                    System.out.print("Altmis");
                    break;
                case 7 :
                    System.out.print("Yetmis");
                    break;
                case 8 :
                    System.out.print("Seksen");
                    break;
                case 9 :
                    System.out.print("Doksan");
                    break;
            }

            switch (birlerBasamagindakiRakam){

                case 0 :
                    break;
                case 1 :
                    System.out.print("bir");
                    break;
                case 2 :
                    System.out.print("iki");
                    break;
                case 3 :
                    System.out.print("uc");
                    break;
                case 4 :
                    System.out.println("dort");
                    break;
                case 5 :
                    System.out.println("bes");
                    break;
                case 6 :
                    System.out.println("alti");
                    break;
                case 7 :
                    System.out.println("yedi");
                    break;
                case 8 :
                    System.out.println("sekiz");
                    break;
                case 9 :
                    System.out.println("dokuz");
                    break;
            }



        }






    }
}
