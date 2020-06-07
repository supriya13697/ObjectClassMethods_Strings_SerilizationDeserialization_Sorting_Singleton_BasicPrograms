package BasicStuff;

class Test{
	    int age;
	    String name;
	    
	    public Test(int age, String name) {
	    	this.age = age;
	    	this.name = name;
	    }
}

public class GetClass { 
	public static void main(String args[]) {
		Test t = new Test(10,"supriya");
		Class a = t.getClass();
		System.out.println(a.getClass());
		//System.out.println(t.getClass());
	}
}

