public class ReverseWord {
    
    public static void main(String[] args) {
        String s = "my name is java";
        String rev = "";
        String temp = "";

        for(int i = 0; i < s.length(); i++){
            temp = temp + s.charAt(i);
            if (s.charAt(i) == ' ') {
                rev = temp + rev;
                temp = "";
                
            }
            if (i == s.length() - 1) {
                temp = temp + ' ';
                rev = temp + rev;
                temp = "";
            }
        }

        System.out.println(rev);
    }
}
