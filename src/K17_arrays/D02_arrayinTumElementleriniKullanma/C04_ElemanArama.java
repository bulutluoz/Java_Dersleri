package K17_arrays.D02_arrayinTumElementleriniKullanma;

public class C04_ElemanArama {

    public static void main(String[] args) {

        // Verilen String bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        String arananHarf = "f";

        /*
        int sayac = 0;

        for (int i = 0; i < harfler.length ; i++) {

            if ( harfler[i].equals(arananHarf)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("Aranan " + arananHarf + " harfi array'de bulunmamaktadir");
        } else {
            System.out.println("Aranan " + arananHarf + " harfi array'de " + sayac + " adet bulunmaktadir");

        }

         */

        arraydeElemanArama(harfler,arananHarf);
        // Aranan f harfi array'de 1 adet bulunmaktadir

        arraydeElemanArama(harfler,"t");
        // Aranan t harfi array'de bulunmamaktadir

        arraydeElemanArama(harfler,"a");
        // Aranan a harfi array'de 5 adet bulunmaktadir




    }

    // Verilen String bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun

    public static void arraydeElemanArama(String[] metinler , String arananEleman){

        int sayac = 0;

        for (int i = 0; i < metinler.length ; i++) {

            if ( metinler[i].equals(arananEleman)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("Aranan " + arananEleman + " harfi array'de bulunmamaktadir");
        } else {
            System.out.println("Aranan " + arananEleman + " harfi array'de " + sayac + " adet bulunmaktadir");

        }


    }

}
