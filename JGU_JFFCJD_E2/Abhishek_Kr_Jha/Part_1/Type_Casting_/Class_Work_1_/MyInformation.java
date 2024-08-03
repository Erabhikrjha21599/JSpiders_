package Abhishek_Kr_Jha.Part_1.Type_Casting_.Class_Work_1_;

/**
 * StudentInformation
 
 */
class AllProgram {
    void myInformation(){
        String my_name = "Abhishek kr jha";
        int my_age = 22;
        String my_dob = "21-may";
        long my_contact_number = 8002564538L;

        System.out.println(my_name);
        System.out.println(my_age);
        System.out.println(my_dob);
        System.out.println(my_contact_number);

    }
    

    
}

public class MyInformation {
    public static void main(String[] args) {
        AllProgram AllProgramObj_1 = new AllProgram();
        AllProgramObj_1.myInformation();
        
    }
    
}
