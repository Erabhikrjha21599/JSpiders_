// package JGU_JFFPRD_M2.Abhishek_Kr_Jha.Array_Program.Array_Assignment;

public class ArrayAssiAverageQ5 {

    public static void averageOfArray() {
        
        int array[] = {1,2,3,4,5,10};
    
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];

        }
        System.out.println(sum);

        int array_avg = sum/array.length;
        System.out.println(array_avg);

    }

    public static void main(String[] args) {
        averageOfArray();
    }
}
