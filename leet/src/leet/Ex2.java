package leet;
public class Ex2 {
	public static void main(String[] args) {
		UseEx2 u=(x,y)->(x.concat(y));
		System.out.println(u.findName("hai".toUpperCase(), "hello".toUpperCase()));
		
	}

}


interface UseEx2 {
	public String findName(String text1,String text2);
}
