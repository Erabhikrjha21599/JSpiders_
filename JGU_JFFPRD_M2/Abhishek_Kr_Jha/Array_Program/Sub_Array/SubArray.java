package Sub_Array;

public class SubArray {

    public static void array1() {
        int array1[] = {1,2,3,4};

        int all_sum = 0;
        int max_sum = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = i; j < array1.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print( array1[k] + "," );
                    all_sum += array1[k];
                    sum += array1[k];

                }
                System.out.println( "=" + sum);
                if (sum > max_sum) {
                    max_sum = sum;
                }
                System.out.println();
            }
            
        }
        System.out.println(all_sum);
        System.out.println("max sum of sub array: " + max_sum);
    }

    public static void main(String[] args) {

        array1();
        
    }
}
