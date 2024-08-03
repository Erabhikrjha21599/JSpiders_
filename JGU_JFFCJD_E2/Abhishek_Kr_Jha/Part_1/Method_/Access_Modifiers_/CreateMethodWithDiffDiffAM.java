package Abhishek_Kr_Jha.Part_1.Method_.Access_Modifiers_;

/**
 * InnerCreateMethodWithDiffDiffAM
 */
class InnerCreateMethodWithDiffDiffAM {
    public static void methodA() {
        System.out.println("this is methodA with public access modifier which is in another class");
    }

    protected static void methodB() {
        System.out.println("this is methodB with protected access modifier which is in another class");

    }

    private static void methodC() {
        System.out.println("this is methodC with private access modifier which in another class ");

    }

}

public class CreateMethodWithDiffDiffAM {

    public static void methodD() {
        System.out.println("this is methodA with public access modifier which is present in same class");
    }

    protected static void methodE() {
        System.out.println("this is methodB with protected access modifier which is present in same class");

    }

    private static void methodF() {
        System.out.println("this is methodC with private access modif which is present in same class ");

    }

    public static void main(String[] args) {
        InnerCreateMethodWithDiffDiffAM myObj_1 = new InnerCreateMethodWithDiffDiffAM();
        // methodA(); // CTE
        myObj_1.methodA();
        InnerCreateMethodWithDiffDiffAM.methodA();

        // methodB(); // CTE
        myObj_1.methodB();
        InnerCreateMethodWithDiffDiffAM.methodB();

        /*
         * methodC(); // CTE
         * myObj_1.methodC(); // CTE
         * InnerCreateMethodWithDiffDiffAM.methodC(); // CTE
         */

        CreateMethodWithDiffDiffAM myObj_2 = new CreateMethodWithDiffDiffAM();

        methodD();
        myObj_2.methodD();
        CreateMethodWithDiffDiffAM.methodD();

        methodE();
        myObj_2.methodE();
        CreateMethodWithDiffDiffAM.methodE();

        methodF();
        myObj_2.methodF();
        CreateMethodWithDiffDiffAM.methodF();

    }
}
