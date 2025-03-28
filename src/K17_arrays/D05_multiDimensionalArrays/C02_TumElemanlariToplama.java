package K17_arrays.D05_multiDimensionalArrays;

public class C02_TumElemanlariToplama {

    public static void main(String[] args) {

        int[] sayilar = {3, 6, 9, 1};

        // sayilar array'inin tum elementlerinin toplamini yazdirin

        int toplam =0 ;

        for (int i = 0; i < sayilar.length ; i++) {
            toplam += sayilar[i];
        }


        System.out.println("sayilar array'indeki elementlerin toplami : " + toplam); // 19




        toplam =0;
        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};


        for (int i = 0; i < arr.length ; i++) { // outer array'in elemani olan inner array'leri getirir

            for (int j = 0; j < arr[i].length; j++) { // inner array icindeki elementleri getirir
                                                      // her inner array'de farkli sayida element olacagi icin
                                                      // inner loop'un length'ine kadar gitmeli

                toplam += arr[i][j];
            }

        }

        System.out.println("arr'deki sayilarin toplami : " + toplam); // 44




        // arr'deki tum elementleri yanyana yazdirin
        // {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};

        for (int i = 0; i < arr.length ; i++) { // outer array'i kontrol eder
            for (int j = 0; j <arr[i].length ; j++) { // inner array'leri kontrol eder

                System.out.print(arr[i][j] + " ");
            }

        }









    }
}
