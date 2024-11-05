package leet;

	import java.util.Optional;
	import java.util.Scanner;
	public class Ex1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of elements in the array
	        System.out.println("Enter the number of elements in the array:");
	        int size = scanner.nextInt();
	        scanner.nextLine();  // Consume the newline character

	        // Initialize the array
	        String[] array = new String[size];

	        // Read array elements from the user
	        System.out.println("Enter the elements of the array (one per line):");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextLine();
	        }

	        // Use Optional to handle potential null value
	        Optional<String[]> optionalArray = Optional.ofNullable(array);

	        // Check if the array is null
	        if (optionalArray.isEmpty()) {
	            System.out.println("Given Array is null");
	        } else {
	            // Process the array
	            for (String element : optionalArray.get()) {
	                // Convert string to uppercase and find its length
	                String upperCaseElement = element.toUpperCase();
	                int length = upperCaseElement.length();

	                // Print the result
	                System.out.println("Original: " + element);
	                System.out.println("Uppercase: " + upperCaseElement);
	                System.out.println("Length: " + length);
	            }
	        }

	        scanner.close();
	    }
	}
	


