public class StringExample {

    
    public static void main(String[] args) {
        String s = new String("hello");
        String s1 = new String("hello");

        System.out.println(s.equals(s1));
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s1.toLowerCase());
        System.out.println(s.toUpperCase());

        char[] c = s.toCharArray();
        for (char d : c) {
            System.out.print(d);
        }

    }
}
