package oopsHomeWork;
	
	import java.util.List;
	import java.util.stream.Collectors;
	public class Ex8 {

	    public static void main(String[] args) {
	        String input = "Hello, World! @2024 #Special$Characters%";

	        // Convert the string to a stream of characters and filter for special characters
	        List<Character> specialCharacters = input.chars()  // Convert to IntStream
	            .mapToObj(c -> (char) c)  // Convert each int to a Character
	            .filter(c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c))  // Filter special characters
	            .distinct()  // Optionally, if you want unique special characters
	            .collect(Collectors.toList());  // Collect the result into a List

	        System.out.println("Special Characters: " + specialCharacters);
	        specialCharacters.forEach(x->System.out.println(x));
	        
	    }
}
