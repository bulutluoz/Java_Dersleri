package K13_methodOlusturmaVeKullanma.D03_MethodOlusturmaOrnekSorular;

public class C03_PalindromeKontrol {

    public static void main(String[] args) {

        // verilen metnin palindrome olup olmadigini kontrol edip,
        // palindrome ise true,
        // palindrome degilse false donduren bir method olusturun


        System.out.println(isPalindrome("Madam")); // true
        System.out.println(isPalindrome("Ey edip adanada pide ye")); // true
        System.out.println(isPalindrome("Java")); // false

    }


    public static boolean isPalindrome(String metin){

        String tersMetin = C02_MetniTerseCevirme.getTersMetin(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            return true;
        } else {
            return false;
        }

    }


}
