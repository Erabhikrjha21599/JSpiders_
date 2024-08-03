package ProgrammingMock;
import java.util.Scanner;
import java.util.regex.Pattern; 
public class ReverseStrWord {
	static String reverseWords(String str) 
	{ 
		Pattern pattern = Pattern.compile("\\s"); 
		String[] temp = pattern.split(str); 
		String result = ""; 

		
		for (int i = 0; i < temp.length; i++) { 
			if (i == temp.length - 1) 
				result = temp[i] + result; 
			else
				result = " " + temp[i] + result; 
		} 
		return result; 
	} 
	
	public static void main(String[] args) 
	{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any sentance: ");
		String s1 = "hello my name is Abhishek kr jha"; 
		System.out.println(reverseWords(s1)); 

		String s2 = "I love Java programming"; 
		System.out.println(reverseWords(s2)); 
	} 
} 


