public class MoveZeroArray {
    
    public static void moveZeroRight() {
        int array1[] = {10, 0, 8, 2, 0, 4, 0, 1};
        int array2[] = new int[array1.length];

        int k = 0;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != 0){
                array2[k++] = array1[i];
            }
        }
        
        // for (int i : array2) {
        //     System.out.println(array2[i]);
            
        // }

        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }

    public static void main(String[] args) {
        moveZeroRight();
    }
}
