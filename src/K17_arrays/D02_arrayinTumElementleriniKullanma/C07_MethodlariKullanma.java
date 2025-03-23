package K17_arrays.D02_arrayinTumElementleriniKullanma;

import java.util.Arrays;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        int[] numbers = {3,5,7,8};

        numbers = C02_TumElementleriArtirma.elemanlariArtir(numbers,3);

        System.out.println(Arrays.toString(numbers)); // [6, 8, 10, 11]


        // numbers'daki pozitif tamsayilarin toplamini yazdirin

        System.out.println(C03_PozitifElementlerinToplami.getPozitifElemanlarinToplami(numbers)); // 35


        Integer[] arr = C05_KullaniciyaArrayOlusturtma.arrayOlustur();

        System.out.println(Arrays.toString(arr));

    }
}
