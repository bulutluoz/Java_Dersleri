package K17_arrays.D02_arrayinTumElementleriniKullanma;

public class C03_PozitifElementlerinToplami {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilarin toplamini yazdirin

        int[] arr = {9,4,0,-2,-5,0,7,1};

        /*

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){
                toplam += arr[i];
            }

        }

        System.out.println("Pozitif sayilarin toplami : " + toplam);

         */

        System.out.println(getPozitifElemanlarinToplami(arr)); // 21



    }

    // Verilen bir int array’deki pozitif tamsayilari toplayip
    // sonucu donduren bir method yaziniz.


    public static int getPozitifElemanlarinToplami(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){
                toplam += arr[i];
            }

        }

       return toplam;

    }



}
