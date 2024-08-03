package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Array_Program.Array_Assignment;

public class ArrayAssignmentQ4 {

    public static void array() {
        char a[] = { 'a', 'b', 'b', 'a' };

        int start = 0;
        int end = a.length - 1;
        boolean flag = true;
        while (start < end) {
            if (a[start] != a[end]) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if (flag == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

    public static void main(String[] args) {
        array();

        

    }
}
