package K17_arrays.D02_arrayinTumElementleriniKullanma;

import java.util.Arrays;
import java.util.Scanner;

public class C05_KullaniciyaArrayOlusturtma {



    // Kullanicidan array’in boyutunu ve Integer elementlerini alip
    // array’i olusturan ve olusturulan array'i donduren bir method olusturun.


    public static Integer[] arrayOlustur(){

        int boyut=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen olusturulacak array'in eleman sayisini giriniz...");
        boyut = scanner.nextInt();

        Integer[] arr = new Integer[boyut];

        for (int i = 0; i < arr.length ; i++) {

            System.out.println(i+1 + ". elemani giriniz...");
            arr[i] = scanner.nextInt();

        }

        return arr;


    }



}
