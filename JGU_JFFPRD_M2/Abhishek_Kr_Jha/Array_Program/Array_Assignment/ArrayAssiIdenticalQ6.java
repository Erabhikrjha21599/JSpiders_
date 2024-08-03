public class ArrayAssiIdenticalQ6 {

    public static void identicalArray() {
        int array1[] = {1,2,3,4,5};
        int array2[] = {1,2,3,4,5};

        System.out.println("array1: ");
        for(int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);

        }

        System.out.println("array2: ");
        for(int i = 0; i < array2.length; i++)
        {
            System.out.println(array2[i]);

        }

        System.out.println("check array1 and array2 is identical or not");
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                System.out.println("idetical");
                break;
            }else{
                System.out.println("not identical");
                break;
            }
        }

    }
    public static void main(String[] args) {
        identicalArray();
    }
}
