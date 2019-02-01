
public class Lazy {
	

	    private static Lazy ob;
	    public String str;
	    private Lazy(){
		str = "Hello World";
	}
	    
	    public static Lazy getInstance(){
	        if(ob == null){
	            ob = new Lazy();
	        }
	        return ob;
	    }
	}
	class temp2 {
	    public static void main(String args[]){
		Lazy a = Lazy.getInstance();
		Lazy b = Lazy.getInstance();
		System.out.println("Object1: " + a.str);
		b.str = "Shivam Agarwal";
		System.out.println("After Changes:");
		System.out.println("Object1: " + a.str);
		System.out.println("Object2: " + b.str);
	}
	}

