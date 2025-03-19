package K15_doWhileLoop.D02_OrnekSoruCozumu;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16 (4*4) , output: true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        int karekokDegeri  = 1 ;


        do {
            if (karekokDegeri* karekokDegeri == sayi){
                System.out.println(true);
                break;
            }

            if (karekokDegeri*karekokDegeri > sayi){
                System.out.println(false);
            }

            karekokDegeri++;

            if (karekokDegeri*karekokDegeri > sayi){
                System.out.println(false);
            }

        }while ( karekokDegeri * karekokDegeri <= sayi );








    }
}
