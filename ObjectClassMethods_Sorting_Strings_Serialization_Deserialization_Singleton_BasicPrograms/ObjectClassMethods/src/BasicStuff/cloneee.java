package BasicStuff;

class cloneee implements Cloneable{  
	int rollno;  
	String name;  

	cloneee(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  

	public static void main(String args[]){  
		try{
			
			cloneee s1=new cloneee(37,"supriya");  
			cloneee s2=(cloneee)s1.clone();  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  

	 	}catch(CloneNotSupportedException c){}  

	}  
} 