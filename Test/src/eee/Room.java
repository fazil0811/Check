package eee;
public class Room {
	public static void main(String[] args) {
		String name="OXyGeN";
		//int total=0;
		String val=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=val.charAt(i)) {
				//total=total+i;
				System.out.println(name.charAt(i));
			}
			//System.out.println(total);
			
			
		}
	}

}
