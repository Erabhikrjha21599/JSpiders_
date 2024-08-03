package Abhishek_Kr_Jha.Part_1.Program_.Pattern_Program_;

public class HPattern {
    public static void hPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if(j == 1 || j == 5 || i == 3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
    public static void main(String[] args) {
        hPattern(5);
    }
}
