package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

public class C02_MetniTerseCevirme {

    public static void main(String[] args) {

        // verilen metnin tersten yazilisini donduren bir method olusturun

        String metin = "Java Candir";

        System.out.println(getTersMetin(metin));

        System.out.println(getTersMetin("Ali Baba")); // abaB ilA


    }

    public static String getTersMetin(String metin){

        String tersMetin = "";

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        return tersMetin;
    }



}
