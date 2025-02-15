package K06_increment_decrement.D01_increment_decrement_yontemleri;

public class C01_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 20 ;

        // sayinin degerini 2 katina cikarin

        sayi = sayi * 2;

        System.out.println("13.satirda sayinin degeri : " + sayi); // 40

        sayi *= 2;

        System.out.println("17.satirda sayinin degeri : " + sayi); // 80

        // sayinin degerini 5 azaltin

        sayi = sayi - 5 ;

        System.out.println("23.satirda sayinin degeri : " + sayi); // 75

        sayi -= 5;

        System.out.println("27.satirda sayinin degeri : " + sayi); // 70


        // sayiyi 5'e bolup, sonucu sayi variable'na atayin

        // sayi = sayi / 5 ;
        sayi /= 5;

        System.out.println("35.satirda sayinin degeri : " + sayi); // 14


        // sayi variable'inin degerini 1 artirin

        sayi = sayi + 1;

        System.out.println("42.satirda sayinin degeri : " + sayi); // 15

        // sayi variable'inin degerini 1 artirin

        sayi += 1;

        System.out.println("48.satirda sayinin degeri : " + sayi); // 16


        // sayi variable'inin degerini 1 artirin

        sayi++;

        System.out.println("55.satirda sayinin degeri : " + sayi); // 17


        // sayi+++;   bu yontem sadece sayi++ veya sayi-- icin kullanilir
        // sayi//;    bu yontem sadece sayi++ veya sayi-- icin kullanilir
        // sayi** ;   bu yontem sadece sayi++ veya sayi-- icin kullanilir



    }
}
