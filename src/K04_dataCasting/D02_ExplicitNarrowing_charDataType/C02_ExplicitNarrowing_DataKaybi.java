package K04_dataCasting.D02_ExplicitNarrowing_charDataType;

public class C02_ExplicitNarrowing_DataKaybi {

    public static void main(String[] args) {

        // asagidaki sayilari int bir variable'a atayip yazdirin

        double db1 = 34.01;
        double db2 = 45.99;
        float fl1 = 23.7F;

        int sayi = (int)db1;
        System.out.println("34.01 'in int'a cast edilen degeri : " +  sayi); // 34

        sayi = (int)db2;
        System.out.println("45.99 'un int'a cast edilen degeri : " +  sayi); // 45

        sayi = (int)fl1;
        System.out.println("23.7 'nin int'a cast edilen degeri : " +  sayi); // 23



        // asagidaki sayilari byte data turunde bir variable'a atayip yazdirin
        int sayi1 = 29;
        short sayi2 = 130;
        long sayi3 = 140;
        float sayi4 = 258.5F;
        double sayi5 = 530;



        byte byt = (byte)sayi1;
        System.out.println("29'un byt'a cast edilen degeri : " +  byt); // 29

        byt = (byte)sayi2;
        System.out.println("130'un byt'a cast edilen degeri : " +  byt); // -126

        byt = (byte)sayi3;
        System.out.println("140'in byt'a cast edilen degeri : " +  byt); // -116

        byt = (byte)sayi4;
        System.out.println("258.5'in byt'a cast edilen degeri : " +  byt); // 2
        // 256'da yeniden sifira donmus olur

        byt = (byte)sayi5;
        System.out.println("530'un byt'a cast edilen degeri : " +  byt); // 18
        // 256'da ve 512'de  yeniden sifira donmus olur











    }
}
