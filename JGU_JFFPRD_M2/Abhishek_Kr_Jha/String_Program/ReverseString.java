public class ReverseString {

    
    public static void main(String[] args) {
        String s = "java";
        String rev_str = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev_str = rev_str + s.charAt(i);
        }

        System.out.println(rev_str);
    }
}
