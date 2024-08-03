

public class SubString {

    public static void subString1() {
        String s = "Hello";
        System.out.println(s.substring(0, 3));
        
    }

    public static void subString2() {
        String s = "qspider@gmail.com";
        System.out.println(s.substring(0, 7));
        
    }

    public static void subString3() {
        String s1 = "WooHoo";
        String s2 = "HelloThere";
        String s3 = "abcdef";

        System.out.println(s1.substring(0, 3));
        System.out.println(s2.substring(0, 5));
        System.out.println(s3.substring(0, 3));
        
    }


    public static void main(String[] args) {
        String s = "Abhishek kr jha";
        char c = 'e';

        String temp = "";
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                flag = true;

            }
            if ( flag == true) {
                temp = temp + s.charAt(i);
                
            }
        }
        System.out.println(temp);

        subString1();
        subString2();
        subString3();

    }
}
