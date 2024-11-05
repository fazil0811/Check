package eee;
public class Day5 {
	public static void main(String[] args) {
		String name="madam";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				System.out.println("vowels");
				break;
			}
				else {
					System.out.println("not");
				}
				
			}
			
		}
	}