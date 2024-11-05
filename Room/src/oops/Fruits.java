package oops;
public class Fruits {
	private String name;
	private int price;
	
	public Fruits(String n,int p) {
		name=n;
		price=p;
	}
	public String toString() {
		return name+price;
	}
}
	class Mango extends Fruits {
		private boolean isSweet;
		
		public Mango(String n,int p,boolean i) {
			super(n,p);
			isSweet=i;
		}
		public String toString() {
			return super.toString()+isSweet;
		}
	}
		class Grapes extends Fruits {
			boolean isExpensible;
			
			public Grapes(String n,int p,boolean z) {
				super(n,p);
				isExpensible=z;
			}
			public String toString() {
				return super.toString()+isExpensible;
			}
		}