package outputs;

public class A {
	private static A instance;
	private static int a=8;
public static void main(String[]args) {
	System.out.println("Hello"+a);
}
public A A() {
	
	if(instance == null) {
		System.out.print("Null object");
		instance = new A();
	}
	return instance;
}
public  void display() {
	System.out.print("hello"+a);
	
}

public void display(B b) {
//	String a=b.display2();
	System.out.print(b.display2());
}

}

