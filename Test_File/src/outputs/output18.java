package outputs;
interface School
{
	abstract void Name();
	
}

interface Teacher {
	
	public void Name();
}


public class output18 implements School,Teacher {
	
	@Override
	public void Name()
	{
		System.out.println("Hola");
	}
	

	public static void main(String[] args) {
		output18 out=new output18();
		out.Name();
		
		
		
		
		
	}

}
