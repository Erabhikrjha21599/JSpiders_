public class FindElement {
    
    public static void linearSearch() {
        int array1[] = {1,2,3,4,5};
    
        int num = 5;
        for(int i = 0; i < array1.length; i++){
            if (num == array1[i]) {
                System.out.println(i);
            }
        }
        
    }

    public static void main(String[] args) {
        linearSearch();
    }
}
