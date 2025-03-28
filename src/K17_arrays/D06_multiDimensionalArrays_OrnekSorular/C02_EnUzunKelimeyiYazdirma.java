package K17_arrays.D06_multiDimensionalArrays_OrnekSorular;

public class C02_EnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        String[][] arr = { {"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};

        // iki katli array'deki en uzun kelimeyi yazdirin

        String enuzunKelime = arr[0][0];


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {


                if ( arr[i][j].length() > enuzunKelime.length()){

                    enuzunKelime = arr[i][j];
                }


            }
        }

        System.out.println("arr'deki en uzun kelime : " + enuzunKelime);


    }
}
