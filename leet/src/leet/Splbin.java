package leet;

public class Splbin {
	public static void main(String[] args) {
		double number = 23.65; 
		int integerPart = (int) number; 
		double fractionalPart = number - integerPart; 

		String binaryInteger = Integer.toBinaryString(integerPart);

		String binaryFraction = "";
		int count = 0; 

		while (fractionalPart > 0 && count < 10) {
			fractionalPart *= 2;
			int bit = (int) fractionalPart; 
			binaryFraction += bit; 
			fractionalPart -= bit; 
			count++;
		}

		String binaryRepresentation = binaryInteger + (binaryFraction.isEmpty() ? "" : "." + binaryFraction);


		System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);
	}

}