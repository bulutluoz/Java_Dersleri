package K13_methodOlusturmaVeKullanma.D04_MethodOverloading;

public class C02_Overloading {

    public static void main(String[] args) {
     /*
        Java method call'daki argumentler ile
        method'daki parametreleri kontrol eder
        Eger signature'a %100 uyumlu olan bir method bulursa onu calistirir
     */

        topla(3,4); // topla int int 1 ==> 3+4+1 ==> 8
        topla(2.4,3.25); // topla double double 2 ==> 2.4+3.25+2 ==> 7.65
        topla(5,4.5); // topla int double 3 ==> 5+4.5+3 ==> 12.5

     /*
        Java method call'daki signature'a %100 uyumlu olan bir method bulamazsa
        auto-widening kullanarak calistirabilecegi method var mi diye kontrol eder
        ve varsa calistirir
     */
        topla(3.4f, 4.2f); // topla float float
        // Iki double'in toplami : 9.599999904632568
        // 1.ve 3.method float'i kabul etmeyecegi icin 2.method calisti

        topla(3L, 4); // topla long int
        // Iki double'in toplami : 9.0



     /*
        %100 uyumlu method olmadigi durumda,
        auto-widening kullanarak calistirabilecegi
        birden fazla method varsa
        en az casting yaparak calistirabilecegi method'u tercih eder
     */

        topla(4,5L);  // topla int long
        // int ve double'in toplami : 12.0

        topla(3,4.1F);
        // int ve double'in toplami : 10.099999904632568


        topla('a','b'); // topla char char
        // Iki int'in toplami : 196

    }


    public static void topla(int a, int b){

        System.out.println("Iki int'in toplami : " + (a+b+1));
    } // topla int int   ==> 1



    public static void topla(double a, double b){

        System.out.println("Iki double'in toplami : " + (a+b+2));
    } // topla double double ==>2



    public static void topla(int a, double b){

        System.out.println("int ve double'in toplami : " + (a+b+3));
    } // topla int double ==>3




}
