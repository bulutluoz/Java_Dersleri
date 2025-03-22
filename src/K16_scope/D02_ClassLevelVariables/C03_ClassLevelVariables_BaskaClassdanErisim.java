package K16_scope.D02_ClassLevelVariables;

public class C03_ClassLevelVariables_BaskaClassdanErisim {

    /*
        Bir class'dan
        baska class'daki method'lara
        ve class level variable'lara ulasabiliriz

        Ancak bu kullanim icin dogru yontemi bilmeliyiz
     */
    public static void main(String[] args) {
    // baska class'dan herhangi bir variable veya method'u direkt kullanamayiz
//        System.out.println(strS);
//        System.out.println(sayiI);
//        System.out.println(localInt);
//        method1();
//        method2();


    // static class uyeleri classIsmi.classUyeIsmi seklinde kullanilabilir
        C02_InstanceVariablesObjeIleKullanim.sayiS= 20;
        System.out.println(C02_InstanceVariablesObjeIleKullanim.blS);
        C02_InstanceVariablesObjeIleKullanim.method1();


    // static olmayan method'lar ve instance variable'lar ise
    // obje uzerinden kullanilabilir

        C02_InstanceVariablesObjeIleKullanim obj = new C02_InstanceVariablesObjeIleKullanim();
        obj.method2();
        System.out.println(obj.blI);
        System.out.println(obj.sayiI);


        System.out.println(obj.chrS);
        obj.sayiS = 67;
        // Static member 'sayiS' accessed via instance reference
        // static olan sayiS'i instance gibi kullaniyorsun


     // Baska class'daki LOCAL VARIABLE'lar ASLA kullanilamazlar



    }
}
