/**
 * LeapYearOrNot
 */
public class LeapYearOrNot {
        public static void main(String[] args) {
            int year=2000;
            if(( year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
                    System.out.println("Yes it is a leap year.");
            }else{
                    System.out.println("No it is not a leap year.");
            }
  }
    
}