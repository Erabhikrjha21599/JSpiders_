package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.If_Else_Laddar_Statement_;

public class PrintCharIsVowelOrConsonant {
   public static void main(String[] args) {
       char c1 = 'a'; //c2 = 'e', c3 = 'i', c4 = 'o', c5 = 'u', c6 = 'b', c7 = 'c', c8 = 'd';
     // int i1 = 9, i2 = 8;

      if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
         System.out.println("vowel");

      } else if (c1 == 'b' || c1 == 'c' || c1 == 'd') {
         System.out.println("consonant");

      } else if (c1 >= '0' || c1 <= '9') {
         System.out.println("invalid");

      }

   }

}
