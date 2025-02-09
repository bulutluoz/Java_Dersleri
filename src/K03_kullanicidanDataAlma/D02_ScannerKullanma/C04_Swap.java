package K03_kullanicidanDataAlma.D02_ScannerKullanma;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //                     ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1.tamsayiyi girin : ");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2.tamsayiyi girin : ");
        int sayi2 = scanner.nextInt();

        int temp = 0;


        temp = sayi2;




        sayi2 = sayi1;



        sayi1 = temp;


        System.out.println("Sayilarin degerini degistirdim" +
                            "\nsayi1'in yeni degeri : " + sayi1 +
                            "\nsayi2'nin yeni degeri : " + sayi2);
    }
}
