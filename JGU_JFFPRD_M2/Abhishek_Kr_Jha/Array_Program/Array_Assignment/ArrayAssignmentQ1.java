package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Array_Program.Array_Assignment;

public class ArrayAssignmentQ1 {
    public static void array1() {

        System.out.println("first array");
        int [] a = new int[5];

        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        a[3] = 5;
        a[4] = 6;

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("second array");
// copy 1st array inside second array
        int[] b = new int[a.length];
        // b = a; // this is not a good way 

        for(int i = 0; i<b.length; i++){
            b[i] = a[i]; // this is a good way 
        }
        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }

        

        
    }

    public static void main(String[] args) {

        array1();
    }
}
