package BasicStuff;

public class finalizeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		       finalizeee f = new finalizeee();
		        f.finalize();
		        // Requesting JVM to call Garbage Collector method 
		        System.gc(); 
		    } 
		  
		    // Here overriding finalize method 
		    public void finalize() 
		    { 
		        System.out.println("finalize method overriden"); 
		    } 
}
