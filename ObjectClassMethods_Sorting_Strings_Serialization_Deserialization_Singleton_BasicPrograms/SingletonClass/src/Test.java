
public class Test {
	
	private static Test t = null;
	
	private Test() {
		
	}
	
	public static Test getTest() {
		if(t == null) {
			t = new Test();
		}
		return t;
		
	}
	
}
