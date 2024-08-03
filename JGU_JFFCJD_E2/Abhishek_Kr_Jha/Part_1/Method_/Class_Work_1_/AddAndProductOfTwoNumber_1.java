package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class AddAndProductOfTwoNumber_1 {

    public static void addTwoNumber(int num_1, int num_2) {
        // int num_1 = 5;
        // int num_2 = 6;
        int add_two_num = num_1 + num_2;

        System.out.println(add_two_num);

        //productTwoNumber(num_1, num_2, add_two_num);
        int product = productTwoNumber(num_1, num_2 /*add_two_num*/);
        finalSum(product, add_two_num);


    }

    public static int productTwoNumber(int num_1, int num_2 /*int add_two_num*/) {
        // int num_1 = 5;
        // int num_2 = 6;
        int product_of_num = num_1 * num_2;

        System.out.println(product_of_num);

        return product_of_num;

        //finalSum(product_of_num /*add_two_num*/);
    }

    public static void finalSum(int product_of_num, int add_two_num) {
        int final_sum = add_two_num + product_of_num;

        System.out.println(final_sum);
        
    }

    
    public static void main(String[] args) {
        addTwoNumber(5,6);
        
    }
}
