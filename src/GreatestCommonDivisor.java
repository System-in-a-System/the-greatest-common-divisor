
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		

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
