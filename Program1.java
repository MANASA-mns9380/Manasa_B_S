package classs;
public class calculator {
		public static void main(String[] args) {
	        double num1 = 11;
	        double num2 = 5;
	        
	        double addResult = num1 + num2;
	        double subResult = num1 - num2;
	        double mulResult = num1 * num2;
	        double divResult = num1 / num2;

	        System.out.println("Addition: " + addResult);
	        System.out.println("Subtraction: " + subResult);
	        System.out.println("Multiplication: " + mulResult);
	        if(num2 != 0) {
	            System.out.println("Division: " + divResult);
	        } else {
	            System.out.println("Cannot divide by zero");
	        }
	    }
	}




    

