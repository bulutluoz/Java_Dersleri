package K17_arrays.D05_multiDimensionalArrays;

import java.util.Arrays;

public class C01_ElemanlaraUlasma {

    public static void main(String[] args) {


        /*
            Array'lerde herhangi bir yazdirma islemi yapacagimiz zaman
            ne yazdirdigimizi iyi bilmeliyiz
                - eger bir String veya primitive bir deger yazdiracaksak direkt sout
                - eger yazdirmak istedigimiz sey tek katli bir array ise Arrays.toString(arr[3])
                - eger yazdirmak istedigimiz sey multiDimensionalArray ise Arrays.deepToString(arr)
         */

        int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };

        // 1-  Multidimentional array'de bir elemani yazdirmak istersek

        System.out.println(arr[0][0]); // 2

        // 7'yi yazdirin
        System.out.println(arr[0][2]); // 7

        // 5'yi yazdirin
        System.out.println(arr[1][1]); // 5

        // 4'yi yazdirin
        System.out.println(arr[2][0]); // 4

        // 8'yi yazdirin
        System.out.println(arr[3][4]); // 8


        // 2- Multidimentional bir array'de inner array'i yazdirmak istersek
        //    int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };


        //    arr[3][1] 'ini yazdir
        System.out.println(arr[3][1]); // 2


        //    arr[1] 'i yazdir

        System.out.println(arr[1]);
        // arr[1] icinde 3 ve 5'in oldugu bir array {3,5}
        // bir array'i direkt sout icerisinde yazdirirsak bize referansini yazdirir
        // [I@2752f6e2

        System.out.println(Arrays.toString(arr[1])); // [3, 5]

        System.out.println(Arrays.toString(arr[2])); // [4]




        // 3- Multidimentional bir array'i yazdirmak istersek
        //    { {2,3,7},{3,5},{4},{1,2,3,6,8} }

        System.out.println(arr); // [[I@e580929

        System.out.println(Arrays.toString(arr)); // [[I@1cd072a9, [I@2752f6e2, [I@7c75222b, [I@4c203ea1]

        System.out.println(Arrays.deepToString(arr)); // [[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]





    }


}
