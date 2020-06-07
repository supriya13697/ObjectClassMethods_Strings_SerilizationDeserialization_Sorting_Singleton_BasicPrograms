
public class StringBuiderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder s = new StringBuilder("Hello");
        
        s.append(" String Builder");
        System.out.println(s);
        
        s.insert(5,"Java");
        System.out.println(s);
        
        s.replace(0,4,"Java");  
        System.out.println(s);
        
        s.delete(1, 9);
        System.out.println(s);
        
        s.reverse();
        System.out.println(s);
        
        System.out.println(s.capacity());
	}

}
