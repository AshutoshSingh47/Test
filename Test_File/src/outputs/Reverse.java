package outputs;
import java.util.Scanner;
public class Reverse {
	
//	public static char reverse()
//	{
//		
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str;
		System.out.println("Enter String : ");
		str=sc.nextLine();
	
		char str2[]=str.toCharArray();
		for(int i=str2.length-1;i>=0;i--)
		{
			if(str2[i]==' ') {
				
			}
			System.out.print(str2[i]);
		}

	}

}
