package eee;
public class Practice {
	public static void main(String[] args) {
	String name="udhaya and fazil are friends";
	String name1="onesoft";
	String name2="ONESOFT";
	String[] s=name1.split("e");
	char[] z=name1.toCharArray();
	int i=name1.length()-1;
	char a=name1.charAt(name1.length()-2);
	boolean value=name.contains("and");
	System.out.println("contains or not"+value);
	System.out.println(name.contains("fazil"));
	System.out.println(name.length());
	System.out.println(name.startsWith("u"));
	System.out.println(name.endsWith("s"));
	System.out.println(name1.equals(name2));
	System.out.println(name1.equalsIgnoreCase(name2));
	System.out.println(name1.indexOf("n"));
	System.out.println(name1.charAt(0));
	System.out.println(i);
	System.out.println(s[0]+s[1]);
	System.out.println(z[z.length-1]);
	System.out.println(z[0]);
	
	}
	
	

}
