package outputs;

class Parent{
	
	void Print()
	{
		System.out.print("Parent");
	}
}
class subclass1 extends Parent{
	
	void Print() {
		System.out.print("subclass1");
	}
}

class subclass2 extends Parent{
	
	void Print() {
		System.out.print("subclass2");
	}
}

public class output15 extends subclass1 {

	public static void main(String[] args) {
		
		Parent sub;
		sub=new subclass1();
		sub.Print();
		System.out.print("");
	}

}
