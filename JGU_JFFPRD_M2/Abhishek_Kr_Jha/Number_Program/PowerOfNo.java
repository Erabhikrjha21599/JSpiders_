public class PowerOfNo {
    public static void power() {
        int base = 12;
        int exponent = 2;

        int resut = 1;
        for (int i = 0; i < exponent; i++) {
            resut *= base;

        }
        System.out.println(resut);

    }

    public static void main(String[] args) {
        power();
    }

}
