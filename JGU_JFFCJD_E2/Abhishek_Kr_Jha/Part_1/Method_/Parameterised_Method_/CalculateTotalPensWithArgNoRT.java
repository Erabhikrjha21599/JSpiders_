package Abhishek_Kr_Jha.Part_1.Method_.Parameterised_Method_;

public class CalculateTotalPensWithArgNoRT {

    public static void calculatePens( int ram_pens, int hari_pens, int raghu_pens, int shyam_pens) {
        int total_pens = ram_pens+hari_pens+raghu_pens+shyam_pens;

        System.out.println(total_pens);
        
    }

    
    public static void main(String[] args) {
        calculatePens(4, 7, 9, 11);
        
    }
    
}
