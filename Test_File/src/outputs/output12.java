package outputs;

class A{
	private A() {
		
	}
	int num=34;
	public static A a=null;
	public static A getInstance() {
		if(a==null) {
			a=new A();
		}
		return a;
	}
}

public class output12 {
	
	public static void main(String[]args) {
		A obj= A.getInstance();
		A obj2=A.getInstance();
		System.out.println(obj.hashCode()+" "+obj2.hashCode());
	}
}
