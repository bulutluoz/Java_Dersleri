    package K16_scope.D03_ClassLevelVariableKullanimi;

    public class Hastane {
        static String hastaneIsmi  = "Yildiz Hastanesi";
        static String hastaneAdresi = "Yenimahalle";
        static String bashekim = "Doktor Ali";
        String perIsmi = "Isim atanmadi";
        String perAdres = "Adres atanmadi";
        String perTel ="Telefon atanmadi";

        public static void main(String[] args) {
            /*
                Bir class'dan bir obje olusturuldugunda
                Java ait oldugu class'daki Instance variable'larin bir kopyasini alir
                ve olusturulan objeye yapistirir

                Obje olusturulduktan sonra objeye ait bir bilgi kullanildiginda
                Java class'daki instance variable'a degil
                Obje'ye yapistirdigi kopya variable'a gider

                Static variable'lar objeye yapistirilmaz
                Onlar class'a aittir
             */

            Hastane per1 = new Hastane();





































    }

}
