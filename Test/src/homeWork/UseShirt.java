package homeWork;
public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1=new Shirt();
		shirt1.price=900;
		shirt1.brand="otto";
		shirt1.isChecked=true;
		shirt1.size=40;
		
		Shirt shirt2=new Shirt();
		shirt2.price=600;
		shirt2.brand="allensolly";
		shirt2.isChecked=false;
		shirt2.size=38;
		
		Shirt shirt3=new Shirt();
		shirt3.price=800;
		shirt3.brand="zero";
		shirt3.isChecked=true;
		shirt3.size=42;
		
		Shirt shirt4=new Shirt();
		shirt4.price=1200;
		shirt4.brand="peterengland";
		shirt4.isChecked=true;
		shirt4.size=44;
		
		Shirt[] shirts= {shirt1,shirt2,shirt3,shirt4};
		Shirt small=shirts[0];
		int max=shirts[0].price;
		boolean value=false;
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].size<small.size) {
				small=shirts[i];
			}				
		}
		System.out.println(small.brand+" "+small.price+" "+small.isChecked+" "+small.size);
		
		for(int i=0;i<shirts.length;i++) {
			if(small.brand.contains("a") || small.brand.contains("e") || small.brand.contains("i")|| small.brand.contains("o")|| small.brand.contains("u")) {
				value=true;
			}
		}
		if(value==true) {
			System.out.println("vowels");
		}
		else {
			System.out.println("not");
		}
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].price>shirts[0].price) {
				max=shirts[i].price;
			}				
		}
		System.out.println(max+(10*max/100));
		
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].isChecked==true) {
				System.out.println(shirts[i].brand.charAt(0)+" "+shirts[i].brand.charAt(shirts[i].brand.length()-1));
				
			}
			else {
				System.out.println(shirts[i].brand.substring(1,shirts[i].brand.length()-1));
				
			}
		}
		for(int i=0;i<shirts.length;i++) {
			System.out.println(shirts[i].brand.charAt(i));
		}
		
	}
}
