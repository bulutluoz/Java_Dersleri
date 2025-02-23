package K11_stringManipulations.D05_nullPointer;

public class C01_isEmpty_isBlank {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = " ";
        String s3 = "     ";
        String s4 = "Hello World";

        System.out.println(s4.isEmpty()); // false
        // Returns true if, and only if, length() is 0.
        // sadece ve sadece length() 0 oldugunda true verir
        System.out.println(s4.isBlank()); // false
        // Returns true if the string is empty
        // or contains only white space codepoints, otherwise false.

        // String bos oldugunda veya
        // SADECE space karakterleri iceriyorsa true doner

        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // true

        System.out.println(s2.isEmpty()); // false
        System.out.println(s2.isBlank()); // true

        System.out.println(s1.isEmpty()); // true
        System.out.println(s1.isBlank()); // true


    }
}
