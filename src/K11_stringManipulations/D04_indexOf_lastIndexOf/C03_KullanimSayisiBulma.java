package K11_stringManipulations.D04_indexOf_lastIndexOf;

import java.util.Scanner;

public class C03_KullanimSayisiBulma {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metni girin...");
        String metin = scanner.nextLine();

        int metninIlkKullanimIndexi = cumle.indexOf(metin);
        int metninIkinciKullanimIndexi = cumle.indexOf(metin,metninIlkKullanimIndexi+1);


        if (  ! cumle.contains(metin) ){
            System.out.println("cumle aranan metni icermiyor");
        } else if (metninIlkKullanimIndexi >=0 && metninIkinciKullanimIndexi == -1) {
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        } else if (metninIlkKullanimIndexi>=0 && metninIkinciKullanimIndexi>0) {
            System.out.println("cumle aranan metni 1'den fazla iceriyor");
        }


    }
}
