package K18_arrayLists.D01_ArrayListOlusturmaVeMethodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {

    public static void main(String[] args) {

        int[] arr = {3,5,6,8,1};
        // arr'deki tum elementleri toplayin

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam +=  arr[i];

        }
        System.out.println(toplam); // 23





        List<Integer> sayilar= new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));
        // sayilar listesindeki tum elementleri toplayin
        toplam = 0;

        for (int i = 0; i < sayilar.size() ; i++) {

            toplam += sayilar.get(i);

        }

        System.out.println(toplam); // 43



        // sayilar listesinde verilen sinirlar icinde olan sayilarin toplamini yazdirin
        // not : sinir degerleri de toplama dahil olacak

        //   5,7,2,9,1,2,5,9,3
        toplam = 0;

        int enKucuk = 3;
        int enBuyuk = 7;

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) >= enKucuk  && sayilar.get(i)<=enBuyuk){
                toplam += sayilar.get(i);
            }

        }

        System.out.println(toplam); // 20



    }
}
