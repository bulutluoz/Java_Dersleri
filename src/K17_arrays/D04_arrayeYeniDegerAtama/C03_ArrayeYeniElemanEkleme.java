package K17_arrays.D04_arrayeYeniDegerAtama;

import java.util.Arrays;

public class C03_ArrayeYeniElemanEkleme {


    public static void main(String[] args) {

        int[] sayilar = {3,5,6,2,1};
        // sayilar array'ine 8 ekleyin


        // sayilar[5] = 8;


        // once sayilar array'inden 1 fazla eleman alan yeni bos bir array olusturalim
        // sayilar array'indeki elemanlari yeniArr'e kopyalayalim
        int[] yeniArr = Arrays.copyOf(sayilar,sayilar.length+1);


        System.out.println(Arrays.toString(yeniArr)); // [3, 5, 6, 2, 1, 0]

        yeniArr[yeniArr.length-1] = 8;

        System.out.println(Arrays.toString(yeniArr)); // [3, 5, 6, 2, 1, 8]


        sayilar = yeniArr;

        System.out.println("sayilar array'inin yeni hali : " + Arrays.toString(sayilar));
        // sayilar array'inin yeni hali : [3, 5, 6, 2, 1, 8]







    }



    // Verilen int bir array'e istenen bir elemani ekleyip
    // son halini donduren bir method olusturun


    public static int[] arrayeElemanEkle(int[] eskiArr , int eklenecekSayi){

        int[] yeniArr = Arrays.copyOf(eskiArr,eskiArr.length+1);
        yeniArr[yeniArr.length-1] = eklenecekSayi;

        return yeniArr;
    }


    public static String[] arrayeElemanEkle(String[] eskiArr , String eklenecekEleman){

        String[] yeniArr = Arrays.copyOf(eskiArr,eskiArr.length+1);
        yeniArr[yeniArr.length-1] = eklenecekEleman;

        return yeniArr;
    }




}
