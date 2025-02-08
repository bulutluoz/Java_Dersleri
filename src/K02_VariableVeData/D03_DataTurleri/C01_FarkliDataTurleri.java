package K02_VariableVeData.D03_DataTurleri;

public class C01_FarkliDataTurleri {

    public static void main(String[] args) {

        boolean bl1 = true;
        boolean bl2 = false;

        // boolean bl3 = "true";
        // boolean bl4 = 'true';

        char chr1 = 'r';
        char chr2 = '3';
        char chr3 = '*';
        char chr4 = ' ';
        // JavaCandir    Java Candir
        // char chr5 = "a";
        // char chr6 = 'a '; // Too many characters in character literal
        // char chr5 = 'java candir'; // Too many characters in character literal
        // tek tirnak icinde tek bir karakter kabul eder


        byte byt1 = 23; // hafizada 8 bit yer kaplar
        short shr1 = 23; // hafizada 16 bit yer kaplar
        int int1 = 23; // hafizada 32 bit yer kaplar
        long lng1 = 23; // hafizada 64 bit yer kaplar


        int int2 = 3; // hafizada 32 bit yer kaplar
        int int3 = 3000; // hafizada 32 bit yer kaplar
        int int4 = 3000000; // hafizada 32 bit yer kaplar
        int int5 = 2000000000; // hafizada 32 bit yer kaplar


        // float fl1 = 2.4;
        // ondalikli bir sayinin yanina f veya F yazmazsaniz double olarak kabul eder
        float fl2 = 23.45F;

        double dbl1 = 3.4;


        float fl3 = 20f;
        float fl4 = 3f;

        System.out.println(fl3/fl4); // 6.6666665


        double db2 = 20;
        double db3 = 3;

        System.out.println(db2/db3); // 6.666666666666667


        String str = "Java Candir";

        System.out.println(  str.toLowerCase()   ); // java candir

        System.out.println( str.toUpperCase()    ); // JAVA CANDIR

        System.out.println( str ); // Java Candir




    }
}
