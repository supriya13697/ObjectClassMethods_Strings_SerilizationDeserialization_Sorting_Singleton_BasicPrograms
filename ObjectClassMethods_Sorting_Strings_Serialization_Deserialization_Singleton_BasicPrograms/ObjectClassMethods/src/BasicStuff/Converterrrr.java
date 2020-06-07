package BasicStuff;

class Test1{
    int age;
    String name;
    
    public Test1(int age, String name) {
    	this.age = age;
    	this.name = name;
    }

	@Override
	public String toString() {
		return "Test1 [age=" + age + ", name=" + name + "]";
	}
}
public class Converterrrr {
    public static void main(String args[]) {
    	Test1 t1 = new Test1(20,"Priya");
    	System.out.println(t1);
    }
}
