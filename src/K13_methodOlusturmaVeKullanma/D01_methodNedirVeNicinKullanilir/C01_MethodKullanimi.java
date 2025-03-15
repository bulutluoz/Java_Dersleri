package K13_methodOlusturmaVeKullanma.D01_methodNedirVeNicinKullanilir;

public class C01_MethodKullanimi {

    public static void main(String[] args) {

        String str = "Java Candir";


        str.toUpperCase();
        // Result of 'String.toUpperCase()' is ignored

        // method gorevini yapti, str'i buyuk harfe cevirip bize getirdi
        // kapicinin istedigimiz ekmegi alip bizim kapimiza gelmesi gibi


        System.out.println(str.toUpperCase()); // JAVA CANDIR
        // method gorevini yapti,
        // biz de degistirilmis halini hemen yazdirip konsolda gorduk
        // ama kaydetmedigimiz icin kodun ilerleyen asamalarinda
        // str ==> Java Candir olacaktir

        System.out.println(str.charAt(1)); // a

        str = str.toLowerCase();
        // method gorevini yapti,
        // biz de yeni halini SONRA KULLANMAK uzere kaydettik
        // yazdirmadigimiz icin bu halini konsolda goremeyiz
        // ama bu satirdan itibaren str ==> java candir olacaktir

        System.out.println(str.charAt(0)); // j





    }
}
