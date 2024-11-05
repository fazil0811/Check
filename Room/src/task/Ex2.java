package task;
public class Ex2 {
	public static void main(String[] args) {
		String name="fazil";
		for(int i=0;i<name.length();i++) {
			if(i%2==0) {
				System.out.println(name.charAt(i));
			}
		}
		
		String[] names={"kamatchi","meenatchi","gomathi","udhaya"};
		for(int i=0;i<names.length;i+=2) {
				System.out.println(names[i]);
			}
		}
}
