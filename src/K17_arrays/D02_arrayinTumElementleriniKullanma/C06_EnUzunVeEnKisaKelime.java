package K17_arrays.D02_arrayinTumElementleriniKullanma;

public class C06_EnUzunVeEnKisaKelime {

    public static void main(String[] args) {

        // Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdirin

        String[] isimler = {"hamza", "esra", "serat", "ali", "cansu","ibrahim","can","yasemin"};


        enKisaVeEnUzunKelimeyiYazdir(isimler);
        //Array'deki en kisa metin : ali
        //Array'deki en uzun metin : ibrahim





    }


    // Verilen String bir array’deki
    // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void enKisaVeEnUzunKelimeyiYazdir(String[] metinler){

        String enKisaKelime = metinler[0];
        String enUzunKelime = metinler[0];

        for (int i = 0; i <metinler.length ; i++) {

            if (metinler[i].length() < enKisaKelime.length()){
                enKisaKelime = metinler[i];
            }

            if (metinler[i].length()>enUzunKelime.length()){
                enUzunKelime = metinler[i];
            }

        }

        System.out.println("Array'deki en kisa metin : " + enKisaKelime +
                "\nArray'deki en uzun metin : " + enUzunKelime );

    }



}
