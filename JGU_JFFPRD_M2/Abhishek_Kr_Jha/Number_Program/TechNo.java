public class TechNo {
    public static void techNo() {
        int num, n = 2025;
        int count_of_digit = 0;
        int sqr_of_sum = 0;
        int fp;
        int lp;

        num = n;
        while (num != 0) {
            count_of_digit++;
            num /= 10;

        }

        if (count_of_digit % 2 == 0) {
            num = n;
            fp = num % (int)Math.pow(10, count_of_digit/2);
            lp = num / (int)Math.pow(10, count_of_digit/2);

            sqr_of_sum = (fp + lp) * (fp + lp);

        }

        if (n == sqr_of_sum) {
            System.out.println("tech no.");
        } else {
            System.out.println("not tech no");
        }
        // System.out.println((fp + lp) * (fp + lp));

    }

    public static void main(String[] args) {
        techNo();
    }
}
