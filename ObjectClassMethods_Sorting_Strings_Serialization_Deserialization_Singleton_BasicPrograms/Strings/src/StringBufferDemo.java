
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s2 = new StringBuffer();
		
        StringBuffer s = new StringBuffer("Hello");
        
        s.append(" String Buffer");
        System.out.println(s);
        
        s.insert(5,"Java");
        System.out.println(s);
        
        s.replace(0,2,"Java");  
        System.out.println(s);
        
        s.delete(1, 9);
        System.out.println(s);
        
        s.reverse();
        System.out.println(s);
        
        System.out.println(s.capacity());
        
	}

}
