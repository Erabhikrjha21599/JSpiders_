public class CountSpecialChar {


    public static void main(String[] args) {
        String s = "@#aql%*936";
        int albhabet = 0;
        int ch = 0;
        int sc = 0;
        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                albhabet++;
                
            } else if (c >= '0' && c <= '9') {
                num++;

                
            }
            else {
                sc++;
            }
        }
        System.out.println("alphabet: " + albhabet);
        System.out.println("number: " + num);
        System.out.println("special char: " + sc);

    }
}
