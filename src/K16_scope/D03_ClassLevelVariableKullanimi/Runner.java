package K16_scope.D03_ClassLevelVariableKullanimi;

public class Runner {



    public static void main(String[] args) {

        Hastane per1 = new Hastane();

        System.out.println(per1.perAdres); // adres atanmadi
        System.out.println(per1.perIsmi); // isim atanmadi

        System.out.println(per1.hastaneIsmi); // Yildiz Hastanesi


        per1.perIsmi = "Kemal";
        per1.perAdres = "cankaya";
        per1.perTel = "5323232341";

        System.out.println(per1.perAdres); // cankaya
        System.out.println(per1.perIsmi); // Kemal

        System.out.println(per1.hastaneIsmi); // Yildiz Hastanesi


        Hastane per2 = new Hastane();


        System.out.println(per2.perIsmi); // Isim atanmadi
        System.out.println(per1.perIsmi); // Kemal

        System.out.println(per2.perAdres); // Adres atanmadi
        System.out.println(per1.perAdres); // 532.....

        System.out.println(per1.bashekim); // Doktor Ali
        System.out.println(per2.bashekim); // Doktor Ali





    }

}
