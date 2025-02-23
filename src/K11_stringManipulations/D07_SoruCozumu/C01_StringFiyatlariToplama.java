package K11_stringManipulations.D07_SoruCozumu;

public class C01_StringFiyatlariToplama {

    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari
        // toplayip yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €
        // NOT : sondaki para birimi degisken olmalidir



        String fiyatStr1 = "15.30 €";
        String fiyatStr2 = "11.45 €";

        System.out.println(  fiyatStr1 + fiyatStr2 ); // 15.30 €11.45 €


        // once para birimini kaydedelim
        // space'in index'ini bulup, space'den sonraki kismi para birimi olarak kaydedelim

        int spaceIndex = fiyatStr1.indexOf(" ");  // 5
        String paraBirimi = fiyatStr1.substring( spaceIndex);//  " €"



        // fiyatlari sayiya cevirelim
        // once sayi olmayan herseyi yok etmeliyiz

        fiyatStr1 = fiyatStr1.replaceAll("\\D",""); // "1530"
        fiyatStr2 = fiyatStr2.replaceAll("\\D",""); // "1145"


        // artik bunlari sayiya cevirebiliriz
        double fiyat1Dbl = Double.parseDouble(fiyatStr1) / 100 ; // 15.30
        double fiyat2Dbl = Double.parseDouble(fiyatStr2) / 100 ; // 11.45



        // toplamini ve para birimini yazdiralim

        System.out.println(fiyat1Dbl + fiyat2Dbl + paraBirimi); // 26.75 €





    }
}
