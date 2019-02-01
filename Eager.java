
public class Eager {
	

		private static Eager ob = new Eager();
		public String str;
		private Eager() {
		
			str = "Hello World";

	 }
	    public static Eager getInstance() {
	    return ob;
	    }
	}
	class temp {
	    public static void main(String args[]){
		Eager a = Eager.getInstance();
		Eager b = Eager.getInstance();
		System.out.println("Object1: " + a.str);
		b.str = "Shivam Agarwal";
		System.out.println("After Changes:");
		System.out.println("Object1: " + a.str);
		System.out.println("Object2: " + b.str);
	}
	}
		

