public class RotateArray {

    public static void arrayRotation() {
        int array1[] = {1,2,3,4,5};
        // int array2[] = new int[array1.length];

        int x = array1[0];
        for(int i = 0; i < array1.length - 1; i++){
            array1[i] = array1[i + 1];
           
        }
        array1[array1.length-1] = x;


        // for(int i = 0; i < array1.length - 1; i++){
        //     System.out.println(array1[i]);

        // }

        for (int i : array1) {
            System.out.println(i);
        }
    }

    public static void reverse() {
        int array1[] = {1,2,3,4,5};

        int x = array1[0];
        for(int i = 0; i < array1.length - 1; i++){
            array1[i] = array1[i + 1];
           
        }
        array1[array1.length-1] = x;
        
    }


    public static void main(String[] args) {
        arrayRotation();
    }
}
