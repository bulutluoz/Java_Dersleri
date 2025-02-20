package K09_ternaryOperator;

public class C06_Ternary_AtamaYazdirma {

    public static void main(String[] args) {

        /*
            ternary operatoru bir deger HESAPLAR
            bu degeri MUTLAKA kullanmalisiniz

            YA sout icinde kullanilmali
            YA DA mutlaka ATAMA yapilmalidir

            verilen gorevde hem yazdirma hem atama varsa
            ternary yazarken dikkat edilmelidir
         */

        int a = 34;

        // a>20 ? a+10 : a-4 ; // Not a statement


        int sayi = 11;

        // verilen sayi variable'inin degerini kontrol edip
        // sayi ciftse "cift sayilari sevmem" yazdirin
        // sayi tek ise sayinin degerini 10 artirin


        // if-else ile yapalim

        if ( sayi % 2 == 0){
            System.out.println("cift sayilari sevmem");
        } else {
            sayi += 10;
        }


        // ternary ile yapalim

        // gorevde sayi cift degilse yazdirmamizi istemiyor
        // bu durumda direkt ternary ile yapamayiz
        // mutlaka ek bir islem yapmamiz gerekir

        // System.out.println( sayi % 2 == 0 ? "cift sayilari sevmem" : );


        // EGER sayi cift degilse sayinin degerinin 10 fazlasiniYAZDIRIN deseydi

        System.out.println(sayi % 2 == 0 ? "cift sayilari sevmem" : sayi+10 );




    }
}
