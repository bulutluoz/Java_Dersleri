package K18_arrayLists.D02_ArrayListMethodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_sublist_arrayiListeCevirme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        // listenin ilk 3 elemanini yazdirin


        // listenin son 3 elemanini yazdirin


        // listenin ilk ve son elemani haric tum elemanlarini yazdirin




        int[] sayilar = {2,3,4,7,2,3,8,1,2,9,2,3,7,4,5};

        // sayilar array'indeki tum elementleri bir liste olarak kaydedin

        /*
            verilen array'i copy paste yapmak disinda
            arrayList'e cevirmek isterseniz asList() kulllanilabilir
            ama 2 buyuk negatif yan etkisi olur
            1- her ne kadar hazirMethodList bir List olsa da
               ekleme ve silme gibi uzunlugu etkileyen method'lari kullanamazsiniz

            2- hazir methodla cevrilen list ve array ortak hareket ederler
               birinde yapilan degisiklik
               otomatik olarak otekine de islenir

             Bu yuzden bu yontem cok kullanilmaz

         */






    }
}
