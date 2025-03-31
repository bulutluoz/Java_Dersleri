package K18_arrayLists.D01_ArrayListOlusturmaVeMethodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ListedekiTekElementleriAlma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));
        // sayilar listesindeki tek sayilari ayri bir liste olarak kaydedin


        System.out.println(getTekSayilarListesi(sayilar));   // [1, 9, 3]

        List<Integer> tekSayilarListesi  = getTekSayilarListesi(sayilar);

        System.out.println(tekSayilarListesi); // [1, 9, 3]

    }


    // verilen Integer bir listedeki
    // tek sayilari bir liste olarak donduren
    // bir method olusturun.

    public static List<Integer> getTekSayilarListesi(List<Integer> sayiList){

        List<Integer> tekSayilarListesi = new ArrayList<>();

        for (int i = 0; i < sayiList.size() ; i++) {

            if (sayiList.get(i) % 2 != 0 ){
                tekSayilarListesi.add(sayiList.get(i));
            }
        }


        return tekSayilarListesi;

    }

}
