public class FindMaxElement {

    public static void findMaxElement() {
        int array1[] = {1,5,6,8,2};
    
        int max = array1[0];
        for(int i = 0; i < array1.length; i++ ){
            if (array1[i] > max) {
                max = array1[i];
                
            }
        }

        System.out.println(max);
        
    }

    public static void main(String[] args) {
        findMaxElement();
    }
    
}
