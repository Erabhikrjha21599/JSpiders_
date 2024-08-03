package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_3_;

public class CreateMethodCallInAnotherMethod {

    public static int add() {
        int i1 = 5;
        int i2 = 6;
        int i3 = i1 + i2;
        System.out.println(i3);

        return 9;
    }

    public static void main(String[] args) {

        add();
        System.out.println(add());

    }
}
