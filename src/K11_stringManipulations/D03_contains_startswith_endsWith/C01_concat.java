package K11_stringManipulations.D03_contains_startswith_endsWith;

public class C01_concat {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "candir";
        String s3 = " ";
        String s4 = "";
        int sayi1 = 3;
        int sayi2 = 4;

        // sadece variable'lari kullanarak "java candir 34" yazdirin

        System.out.println(s1 + s3 + s2 + s3 + sayi1 + sayi2);

        System.out.println( s1.concat(s3).concat(s2).concat(s3)
                            .concat(sayi1+s4).concat(sayi2+s4));


        // sadece variable'lari kullanarak "34 candir" yazdirin

        System.out.println(sayi1 + sayi2 + s3 + s2); // 7 candir
        System.out.println(s4 + sayi1 + sayi2 + s3 + s2); // 34 candir

        System.out.println( (sayi1+s4).concat(sayi2+s4).concat(s3).concat(s2));






    }
}
