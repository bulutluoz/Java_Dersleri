package K05_wrapperClass_MatematikselIslemler.D02_modulus_concatenation;

public class C02_Concatenation {

    public static void main(String[] args) {



        // Bir String ile herhangi bir primitive data turundeki degeri + toplarsak
        // Java String'in yanina geleni de String'lestirir


        System.out.println( "Ali" + 3 + 4 + 5 + 6); // "Ali3" + 4 => "Ali34"
        // Ali3456

        System.out.println( "A" + true + 'd' + 45.6 + 34.5F);
        // Atrued45.634.5

        System.out.println( 3 + 'a' + "Ali"); // 3 + 'a' => 3 + 97 => 100
        // 100Ali




        // 3 ve 4'u kullanarak 34 olarak yazdirin
        System.out.println(   3 + 4 ); // 7
        System.out.println(  ""+ 3 + 4 ); // "3" + 4 => "34"
        System.out.println(   3 + "" + 4 ); // "3" + 4 => "34"

        // herhangi bir degeri, hic degistirmeden String'lestirmek icin "" kullanilir




        // String'de + islemi CONCATENATION (birlestirme) demektir
        // + disinda hicbir matematiksel islem String ile kullanilamaz

        String str = "a";

        System.out.println(  str + 5 );
        // System.out.println(  str - 5 ); // Operator '-' cannot be applied to 'String', 'int'
        // System.out.println(  str * 5 );
        // System.out.println(  str / 5 );



        // Sadece verilen variable'lari kullanarak
        // istenen String'leri yazdirin

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";

        int a = 3;
        int b = 4;

        // 12 Java Candir
        System.out.println( a*b + s2 + s1 + s2 + s3  );

        // 7 Java
        System.out.println(  a + b  + s2 + s1 );

        // 34 Candir
        System.out.println(  s4 + a + b + s2 + s3     );

        // Java7
        System.out.println(  s1 + a + b ); // Java34
        System.out.println(  s1 + (a + b) ); // Java7

        // Java12Candir
        System.out.println(  s1 + a * b + s3  );

        // Java34candir
        System.out.println( s1 + a + b + s3 );




    }
}
