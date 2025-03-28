package K17_arrays.D06_multiDimensionalArrays_OrnekSorular;

import java.util.Arrays;

public class C01_TumElementleriGozdenGecirme {

    public static void main(String[] args) {

        int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };


        // arr'deki cift sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0){
                    toplam += arr[i][j] ;
                }

            }
        }

        System.out.println("arr'deki cift sayilarin toplami : " + toplam); // 22



        // arr'deki tek sayilardan en buyuk olani yazdirin
        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }

        int enBuyukSayi = Integer.MIN_VALUE ;
        // ilk atadigimiz degerin
        // array'deki elementlerle durumunu bilemeyecegimiz icin
        // verebilecegimiz en kucuk degeri atadik

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {


                if ( arr[i][j]%2 != 0 &&  arr[i][j] > enBuyukSayi ){
                    enBuyukSayi = arr[i][j];
                }

            }


        }

        System.out.println("arr'deki en buyuk tek sayi : " + enBuyukSayi); // 7







        // arr'deki tum sayilari 1 artirin
        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] += 1 ;
            }

        }

        System.out.println(Arrays.deepToString(arr));
        // [[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 9]]



    }
}
