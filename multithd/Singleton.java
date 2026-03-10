package multithd;

public class Singleton {

	public static Singleton instance;
	private Singleton() {
	
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton method() {
		
		if(instance==null) {
			synchronized(Singleton.class) {
				if(instance==null)
					instance=new Singleton();
			}
		}
		
		return instance;
		
	}

}
