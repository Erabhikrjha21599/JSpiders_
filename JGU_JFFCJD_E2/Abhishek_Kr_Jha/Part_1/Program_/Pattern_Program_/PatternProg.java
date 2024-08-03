/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package Abhishek_Kr_Jha.Part_1.Program_.Pattern_Program_;

public class PatternProg {
    public static void separate() {
        System.out.println("########################################################");
    }

    public static void hPattern(int num_1) {
        for (int i = 1; i <= num_1; i++) {
            for (int j = 1; j <= num_1; j++) {
                if (j == 1 || j == 5 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void iPattern(int num_1) {
        for (int i = 1; i <= num_1; i++) {
            for (int j = 1; j <= num_1; j++) {
                if (j == 2 || (i == 1 && j <= 3) || (i == 5 && j <= 3)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void squar(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirroredRhombus(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirroredRightTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedRightTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirroredInvertedRightTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamond(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void halpDiamond(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalpDiamond(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightArrow(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftArrow(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print("* ");
            }
            // for(int j = i; j <= number; j++){
            // System.out.print("* ");
            // }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            // for(int j = i; j <= number; j++ ){
            // System.out.print(" ");
            // }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void kPattern(int num_1) {
        for (int i = 1; i <= num_1; i++) {
            for (int j = 1; j <= num_1; j++) {
                if (j == 1 || (i + j == 4) || (i == 4 && i + j == 6) || (i == 5 && i + j == 8)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void mPattern(int num_1) {
        for (int i = 1; i <= num_1; i++) {
            for (int j = 1; j <= num_1; j++) {
                if (j == 1 || (i == j && i <= 3) || j == 5 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void iinvertedRightTriangle(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = i; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void mmirroredInvertedRightTriangle(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = i; j <= num; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void numberRightTriangle(int num) {
        int no = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
        }
        
    }

    public static void alphabetRightTriangle(int num) {
        char ch = 'A';
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
    }

    public static void alternetnoRightTriangle(int num) {

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                if(j % 2 == 0){
                    System.out.print("0 ");

                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        
    }

    public static void pyramid12(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = i; j <= num; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j < i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }

    public static void pyramid21(int num) {
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for(int j = i; j <= num; j++){
                System.out.print("* ");
            }
            for(int j = i; j < num; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }



    public static void main(String[] args) {
        // System.out.println("Hello World");
        squar(5);
        separate();

        rhombus(5);
        separate();

        mirroredRhombus(5);
        separate();

        rightTriangle(5);
        separate();

        mirroredRightTriangle(5);
        separate();

        invertedRightTriangle(5);
        separate();

        mirroredInvertedRightTriangle(5);
        separate();

        pyramid(5);
        separate();

        invertedPyramid(5);
        separate();

        diamond(5);
        separate();

        halpDiamond(5);
        separate();

        invertedHalpDiamond(5);
        separate();

        rightArrow(5);
        separate();

        leftArrow(5);
        separate();

        hPattern(5);
        separate();

        iPattern(5);
        separate();

        kPattern(5);
        separate();

        mPattern(5);
        separate();

        iinvertedRightTriangle(5);
        separate();

        mmirroredInvertedRightTriangle(5);
        separate();

        numberRightTriangle(5);
        separate();

        alphabetRightTriangle(5);
        separate();

        alternetnoRightTriangle(5);
        separate();

        pyramid12(5);
        separate();

        pyramid21(5);
        separate();
    }
}
