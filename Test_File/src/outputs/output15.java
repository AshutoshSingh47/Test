package outputs;

abstract class Parent{
	
	 final static void Print(int a)
	{
		System.out.print("Parent");
	}
	 
	 void Print(int a,int b)
	 {
		 
	 }
	 
	 
}
class subclass1 extends Parent{
	
	
	 static void Print() {
		System.out.print("subclass1");
	}
	 
}

class subclass2 extends Parent{
	
	 static void Print() {
		System.out.print("subclass2");
	}
}

public class output15 extends subclass1  {


	public static void main(String[] args) {
		
		Parent sub=new subclass1();
//		sub=new subclass1();
		sub.Print(1);
		System.out.print("");
	}

}
