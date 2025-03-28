package K17_arrays.D06_multiDimensionalArrays_OrnekSorular;

public class C03_SonElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli int bir array’de
        // her bir inner array’in son elementlerinin toplaminini
        // yazdiran bir method olusturun.

        int[][] arr = { {2,3,7,1,2,4},{3,5,1,2,1},{4,1,2,3},{1,2,3,1,2,1},{2,4,7,6,1} };

        int toplam = 0;


        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i][arr[i].length-1];
        }

        System.out.println("her inner array'in son elementlerinin toplami : " + toplam);

    }

}








