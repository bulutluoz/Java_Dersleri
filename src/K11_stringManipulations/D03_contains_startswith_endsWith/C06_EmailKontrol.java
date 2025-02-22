package K11_stringManipulations.D03_contains_startswith_endsWith;

import java.util.Scanner;

public class C06_EmailKontrol {

    public static void main(String[] args) {

        //SORU : kullanicidan gmail’den alinmis bir mail isteyin,
        //       mail’i inceleyip asagidaki sartlari kontrol edin
        //       ve buldugunuz ilk hatayi yazdirin
        //          - mail @ icermiyorsa "gecersiz mail"
        //          - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //          - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"  yazdirin.


        /*
            Eger tum kontrolleri yapmasini ve hatalari yazdirmasini istersek
            BAGIMSIZ IF cumleleri
            Eger buldugu ilk hatayi yazdirsin, ilk hata duzeltildikten sonra
            diger sartlari kontrol etsin istiyorsaniz
            If Else Statement kullanmalisiniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email = scanner.nextLine();

        if (  !email.contains("@") ){
            System.out.println("gecersiz mail");
        } else if (  !email.contains("@gmail.com")  ) {
            System.out.println("mail gmail olmali");
        } else if (  !email.endsWith("@gmail.com") ) {
            System.out.println("mailde yazim hatasi var");
        }


    }
}
