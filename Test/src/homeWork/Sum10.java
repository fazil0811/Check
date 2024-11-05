package homeWork;
public class Sum10 {
	public static void main(String[] args) {
		String[] names= {"java","python","c++","sql"};
		String temp=" ";
		for(String x:names) {
			System.out.print(x.concat(temp));
		}
	}
}