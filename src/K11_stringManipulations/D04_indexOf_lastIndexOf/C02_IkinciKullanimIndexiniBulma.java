package K11_stringManipulations.D04_indexOf_lastIndexOf;

import java.util.Scanner;

public class C02_IkinciKullanimIndexiniBulma {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // girilen metin'de 2. a'nin index'ini yazdirin
        // eger 2. a yoksa metin 2 a icermeli yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz...");
        String str = scanner.nextLine();


        int ilkAninIndexi = str.indexOf('a');

        int ikinciAninIndexi = str.indexOf('a',ilkAninIndexi+1);


        // Eger 2.a varsa index'i 0'dan buyuk bir sayi olmali
        // eger 2.a'nin index'i olarak -1 sonucunu aliyorsak
        // 2.a yok demektir

        if (ikinciAninIndexi > 0){
            System.out.println("Metindeki 2. a'nin index'i : " + ikinciAninIndexi);
        } else {
            System.out.println("metin 2 a icermeli");
        }

    }
}
