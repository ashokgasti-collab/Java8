package practice;

public class P2{
	 
int calc(){ 
        
	try {
		int i=2/2;
		return 10;
 
	}
	catch (Exception e) {
		return 20;
}
 finally {
	// return 30;
	
 }
 
}
    
    
public static void main(String[] args) {
        
 P2 obj = new P2();
       
 System.out.println(obj.calc());
}

}


