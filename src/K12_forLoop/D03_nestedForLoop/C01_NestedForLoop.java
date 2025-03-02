package K12_forLoop.D03_nestedForLoop;

public class C01_NestedForLoop {

    public static void main(String[] args) {

        // bir for loop kullanarak 1 2 3 4 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i + " ");
        }

        System.out.println("");


        // bir for loop kullanarak 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print( 2*i + " ");
        }

        System.out.println("");


        // bir for loop kullanarak 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }

        System.out.println("");


        // bir for loop kullanarak 4 8 12 16 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");
        }

        System.out.println("");



        /*
            for loop kullanarak asagidaki sayilari yazdirin
                    1 2 3
                    2 4 6
                    3 6 9
                    4 8 12
        */


        for (int i = 1; i <=4 ; i++) { // 4 satir olusturmak icin kullaniyoruz

            for (int j = 1; j <=3 ; j++) { // her bir satirda kac sayi var

                System.out.print(i*j + " ");
            }

            System.out.println("");

        }



        /*
            Eger for loop ile 2 boyutlu bir sekil olusturacaksak
            ic ice 2 loop kullanmamiz gerekir

            DISARDAKI loop (outer loop) satirlari kontrol eder
                      kac satir olusturacaksak bu loop ile olusturabiliriz
            ICERDEKI loop (inner loop) her satirdaki sutunlari kontrol eder
                     her satirda kac sayi(eleman) varsa bu loop ile olusturabiliriz

             disardaki loop'da i'ye bir deger atadigimizda
             icerdeki loop j'ye sirasiyla butun degerleri atayip islem yapar
             sonra disardaki loop'a doner
             (disliler gibi, outer loop 1 dis attiginda,
              inner loop tam bir tur doner)
         */


    }
}
