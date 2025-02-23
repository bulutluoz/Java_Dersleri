package K11_stringManipulations.D07_SoruCozumu;

import java.util.Locale;
import java.util.Scanner;

public class C05_IsmiDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // Kullanici 3 isimli olsa da
        // isimlerin ilk harfi buyuk harf, kalanlar * olacak sekilde yazdirin
        // Ornek input  : ali mert can  , aysel yilmaz ,  Kemal
        //       output : A** M*** C**  , A**** Y***** ,  K****


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();


        // once kelime sayisini int olarak bulalim
        // metinde space sayisina bakalim
        //   space yoksa 1 isim  => ilkSpaceIndex ==> -1
        // 1 space varsa 2 isim  => ilkSpaceIndex != -1 , ikinciSpaceIndex ==> -1
        // 2 space varsa 3 isim var demektir  => ilkSpaceIndex != -1 , ikinciSpaceIndex != -1

        int ilkSpaceIndex = isim.indexOf(" ");
        int ikinciSpaceIndex = isim.indexOf(" ", ilkSpaceIndex+1);


        if (ilkSpaceIndex == -1){
            // tek isim var    kemal ==> K****

            System.out.println(

                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1).replaceAll("\\w","*")
            );


        } else if ( ikinciSpaceIndex ==-1) { // ilkSpaceIndex != -1 && yukardaki elek bunu zaten eledi
            // iki isim var    ali mert => A** M***

            System.out.println(

                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")+
                    " "+
                    isim.substring(ilkSpaceIndex+1 , ilkSpaceIndex+2).toUpperCase()+
                    isim.substring(ilkSpaceIndex+2)  .replaceAll("\\w","*")
            );



        } else {
            // ikiden fazla isim var

            System.out.println(

                    isim.substring(0,1).toUpperCase()+
                    isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")+
                    " "+
                    isim.substring(ilkSpaceIndex+1 ,ilkSpaceIndex+2).toUpperCase()+
                    isim.substring(ilkSpaceIndex+2 , ikinciSpaceIndex).replaceAll("\\w","*")+
                    " "+
                    isim.substring(ikinciSpaceIndex+1, ikinciSpaceIndex+2).toUpperCase()+
                    isim.substring(ikinciSpaceIndex+2).replaceAll("\\w","*")


            );


        }


    }
}
