public class ZigZagArray {
    public static void zigZag() {
        int array1[] = {1,2,3};
        int array2[] = {4,5,6,7,8,9};
        int array3[] = new int[array1.length + array2.length];


        int k = 0;
        for(int i = 0; i < array3.length; i++){
            if(i < array1.length){
                array3[k++] = array1[i];

            }
            if (i < array2.length) {
                array3[k++] = array2[i];

            }

        }

        for( int i = 0; i < (array1.length + array2.length); i++){
            System.out.println(array3[i]);
        }

        System.out.println("using foreach loop");
        for (int i : array3) {
            System.out.println(array3[i]);
            
        }
    }


    public static void main(String[] args) {
        zigZag();
    }
}
