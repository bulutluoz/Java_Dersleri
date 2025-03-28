package K18_arrayLists.D01_ArrayListOlusturmaVeMethodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {

    public static void main(String[] args) {

        int[] arr = {3,5,6,8,1};
        // arr'deki tum elementleri toplayin

        int toplam = 0;



        System.out.println( "Array'deki elementlerin toplami : " + toplam); // 23



        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,1,4,0));

        // sayilar listesinin 2.index'indeki sayiyi yazdirin



        // sayilar listesindeki tum elementleri toplayin

        toplam = 0;



        System.out.println("sayilar listesindeki elementlerin toplami : " + toplam); // 22




        // 2.index'deki elementi 5 yapin ==>




        // 4.index'deki elementi yazdirin




        // sayilar listesinde 4.index'deki elementi 11 yapin



        // sayilar listesindeki 4.index'e 23 ekleyin




        /*
            add() yeni bir element ekler, element sayisi 1 artar
            ve eklendigi index'den sonraki elementler 1 geriye itilir

            set() yeni element eklemez, listenin eleman sayisi ayni kalir
            sadece verilen index'deki element update edilmis olur
         */

    }
}
