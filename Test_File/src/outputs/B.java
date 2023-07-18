package outputs;


public class B extends A {
	public B() {
//		System.out.print("Constructor B");
	}
	
	public String display2() {
		return "YES";
	}
	public static void main(String[]args) {
		B b=new B();
		A obj=b.A();
		A obj2=obj.A();
		obj2.display(b);
	}
}
