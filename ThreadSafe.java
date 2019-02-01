
	class ThreadSafe extends Thread {

	    private static ThreadSafe ob;
	    public String str;
	    private ThreadSafe(){
		str = "Hello World";
	}
	    
	    synchronized public static ThreadSafe getInstance(){
	        if(ob == null){
	            ob = new ThreadSafe();
	        }
	        return ob;
	    }
	}
	class temp3 {
	    public static void main(String args[]){
		ThreadSafe a = ThreadSafe.getInstance();
		ThreadSafe b = ThreadSafe.getInstance();
		
		System.out.println("Object1: " + a.str);
		b.str = "Shivam Agarwal";
		System.out.println("After Changes:");
		System.out.println("Object1: " + a.str);
		System.out.println("Object2: " + b.str);
	}
	}

