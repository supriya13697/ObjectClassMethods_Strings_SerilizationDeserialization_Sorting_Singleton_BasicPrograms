package BasicStuff;

class Test2{
    int age;
    String name;
    
    public Test2( String name) {
    	this.age = age;
    	this.name = name;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test2 other = (Test2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class EqulalssAndHashCodee {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Test2 t2 = new Test2("Supriya");// memory
        Test2 t3 = new Test2("Supriya");//memory
        
        
        //Compares the memory allocation of objects
        System.out.println(t2.equals(t3));
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
        
	}

}
