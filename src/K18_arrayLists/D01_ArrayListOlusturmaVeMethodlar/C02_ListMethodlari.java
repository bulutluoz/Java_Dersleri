package K18_arrayLists.D01_ArrayListOlusturmaVeMethodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));

        System.out.println(sayilar); // [5, 7, 2, 9, 1, 2, 5, 9, 3]

        // listede kac element oldugunu yazdirin
        System.out.println(sayilar.size()); // 9


        // listenin bos olup olmadagini yazdirin
        System.out.println(sayilar.isEmpty());  // false


        // listede eleman olarak 5 olup olmadigini yazdirin

        System.out.println(sayilar.contains(5));

        // listede 8 yoksa listeye ekleyin

        if (!sayilar.contains(8)){ // sayilar.contains(8) == false
            sayilar.add(8);
        }


        // listede 3 yoksa listeye ekleyin

        if (!sayilar.contains(3)){
            sayilar.add(3);
        }

        System.out.println(sayilar);



        // listede 3 varsa listenin eleman sayisini yazdirin
        if (sayilar.contains(3) == true){
            System.out.println("Listedeki eleman sayisi : " + sayilar.size());
        }
        // Listedeki eleman sayisi : 10

        // [5, 7, 2, 9, 1, 2, 5, 9, 3, 8]
        // listede en bastaki elementi yazdirin
        // sayilar[0]  List'de index ile array'deki gibi direkt cagiramayiz
        // bunun yerine
        System.out.println(sayilar.get(0)); // 5


        // listede en bastan 3. elementi yazdirin
        System.out.println(sayilar.get(2)); // 2


        // listede en sondaki elementi yazdirin
        System.out.println(sayilar.get(sayilar.size()-1) ); // 8

        // listede sondan 3. elementi yazdirin
        System.out.println(sayilar.get(sayilar.size()-3) ); // 9
















    }
}
