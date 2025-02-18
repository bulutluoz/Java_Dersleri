package K08_ifElseStatements.D03_ifElseStatements;

import java.util.Scanner;

public class C02_SinifGecme {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not=scanner.nextDouble();


        if (not >= 50){
            System.out.println("Sinifi Gectin");
        }

        if (not<50){
            System.out.println("Maalesef kaldin");
        }



        if (not >= 50){
            System.out.println("Sinifi Gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }

    }
}
