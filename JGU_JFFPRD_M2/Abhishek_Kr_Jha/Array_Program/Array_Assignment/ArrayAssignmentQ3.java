package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Array_Program.Array_Assignment;

public class ArrayAssignmentQ3 {

    public static void reverse() {
        
        int a[] = {1,2,3,4,5};
        // reverse an array 
    
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int swap = a[start];
            a[start] = a[end];
            a[end] = swap;
            start++;
            end--;
    
        }
    
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        reverse();
        // int a = 1;
        // int b = 2;

        // a = a + b; // 1 + 2 = 3
        // b = a - b; // 3 - 2 = 1
        // a = a + b; // 3 - 1 = 2
    }
}
