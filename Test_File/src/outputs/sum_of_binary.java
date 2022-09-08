package outputs;
import java.util.Scanner;

public class sum_of_binary {
	
	 public static String add(String num1, String num2) {
		 
	       
	        int num1Binary = Integer.parseInt(num1, 2);
	 
	        int num2Binary = Integer.parseInt(num2, 2);
	 
	        int sumOfNumbers = num1Binary + num2Binary;
	 	       
	        return Integer.toBinaryString(sumOfNumbers);
	    }
	 
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            
	            System.out.print("Enter first binary number : ");
	            String number1 = scanner.next();	        
	            System.out.print("Enter second binary number : ");
	            String number2 = scanner.next();
	 
	            System.out.println("Sum of numbers :" + add(number1,number2));
	        }
}
}
