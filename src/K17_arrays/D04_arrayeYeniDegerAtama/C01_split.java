package K17_arrays.D04_arrayeYeniDegerAtama;

import java.util.Arrays;

public class C01_split {
    public static void main(String[] args) {

        String metin = "Ali topu at, at Ali at";


        System.out.println(Arrays.toString(metin.split("a")));
        // [Ali topu , t, , t Ali , t]


        System.out.println(Arrays.toString(metin.split(", ")));
        // [Ali topu at, at Ali at]

        System.out.println(Arrays.toString(metin.replaceAll(",","").split(" ")));
        // [Ali, topu, at, at, Ali, at]


        System.out.println(Arrays.toString(metin.split("")));
        // [A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]


        String str = "Java gun gectikce daha da guzellesiyor";
        // cumledeki en kisa ve en uzun kelimeyi yazdirin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Java, gun, gectikce, daha, da, guzellesiyor]

        String enKisaKelime = kelimeler[0];
        String enUzunKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length() < enKisaKelime.length()){
                enKisaKelime = kelimeler[i];
            }

            if (kelimeler[i].length() > enUzunKelime.length()){
                enUzunKelime = kelimeler[i];
            }

        }

        System.out.println("Cumledeki en kisa kelime : " + enKisaKelime +
                "\nCumledeki en uzun kelime : " + enUzunKelime);









    }
}
