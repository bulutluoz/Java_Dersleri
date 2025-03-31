package K18_arrayLists.D01_ArrayListOlusturmaVeMethodlar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C01_ListOlusturmaVeElemanEkleme {

    public static void main(String[] args) {

        // Icine String elementler koyabilecegimiz bir ArrayList olusturun

        String[] arr = {"a","b","c"};

        // List<String> harfler =  {"a","b","c"};

        List<String> harfler = new ArrayList<>();

        // List<String> harfler2 = new List<>();
        // 'List' is abstract; cannot be instantiated
        // List abstract bir yapi oldugu icin esitligin sag tarafinda kullanilamaz

        ArrayList<String> harfler3 = new ArrayList<>();
        ArrayList<String> harfler4 = new ArrayList<String>();




        // icine int elementler koyabilecegimiz
        // sayilar isminde bir ArrayList olusturun
        List<Integer> sayilar = new ArrayList<>();

        /*
            Type argument cannot be of primitive type
            icine konulacak elementlerin data turu primitive OLAMAZ
         */



        // Listeye 3,6,8 ve 9 ekleyin

        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(9);

        System.out.println(sayilar); // [3, 6, 8, 9]


        // listenin 3.index'ine element olarak 2 ekleyin
        sayilar.add(3,2);

        System.out.println(sayilar); // [3, 6, 8, 2, 9]






        // element olarak 3,4,5,6,2,3,4,2,3,4,5,4,7,8,9 bulunduran
        // bir ArrayList olusturun

        // List<Integer> liste = new ArrayList<>(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9);

        List<Integer> liste = new ArrayList<>(Arrays.asList(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9));
        System.out.println(liste); // [3, 4, 5, 6, 2, 3, 4, 2, 3, 4, 5, 4, 7, 8, 9]

        /*
            eger List olusturulurken konulacak elementler belli ise
            Arrays class'indan asList() ile direkt eklenebilir
         */



        // icinde 10,20,30 elementlerini bulunduran yeni bir liste olusturun

        List<Integer> yeniList = new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(yeniList); // [10, 20, 30]


        // yukarda olusturdugumuz sayilar listesine yeni listenin tamamini ekleyin

        liste.addAll(yeniList);

        System.out.println("listenin son hali : " + liste);
        // [3, 4, 5, 6, 2, 3, 4, 2, 3, 4, 5, 4, 7, 8, 9, 10, 20, 30]

        System.out.println("yeni listenin son hali : " + yeniList);
        // yeni listenin son hali : [10, 20, 30]


        /*
            String'de method ile yapilan degisiklikler
            atama olmazsa kalici degisiklik OLMAZ

            ama Array ve ArrayList icin
            method ile yapilan degisiklikler KALICI olur
            atama yapmaya gerek kalmaz
         */

        String str = "java candir";

        str.toUpperCase();
        // str'i buyuk harfe cevirir
        // ama yazdirilmadigi icin konsolda goremeyiz
        // atama olmadigi icin str kalici olarak degismez

        System.out.println(str); // java candir

    }
}
