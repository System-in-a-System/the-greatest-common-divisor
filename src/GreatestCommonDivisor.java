import java.util.Scanner;


public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
				
		try {
			// Prompt the user to enter two numbers of type integers
			System.out.print("Enter the first number: ");
			int firstNumber = input.nextInt();
				
			System.out.print("Enter the second number: ");
			int secondNumber = input.nextInt();
				
				
			// Close the Scanner
			input.close();
				
				
			// Calculate the greatest common divisor and display the results
			System.out.println("The greatest common divisor for " + 
								firstNumber + " and " + secondNumber + 
								" is " + greatestCommonDivisor(firstNumber, secondNumber));
					
				
			// Catch possible input mismatch exceptions
			} catch (Exception ex) {
				System.out.println("Input should be of type integer");
			}

	}
	
	
	
	
	// Recursive method to calculate the greatest common divisor for two integers
	
		
	public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
			
		// The base case that terminates the recursion
		if (firstNumber % secondNumber == 0)
			return secondNumber;
			
		// The recursion "body"
		int remainder = firstNumber % secondNumber;
		return greatestCommonDivisor(secondNumber, remainder); // Any number that is a divisor for firstNumber and secondNumber 
															   // must also be a divisor for a remainder of firstNumber/secondNumber.
			
		 													   //Therefore, greatestCommonDivisor(firstNumber, SecondNumber) 
															   //is the same as greatestCommonDivisor(secondNumber, remainder).
	}

}
