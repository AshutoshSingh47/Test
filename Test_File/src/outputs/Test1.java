package outputs;
import java.util.Arrays;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		
		System.out.print("Enter string : ");
		str=sc.next();
//		char str2[]=str.toCharArray();
//		int sum=0;
//		for(int i=0;i<str2.length;i++)
//		{
//			if(str2[i]/1>=48 && str2[i]/1<=57) {
//				sum+=str2[i]-'0';
//				
//				System.out.print(str2[i]);
//			}
//		}
//		
//		System.out.println("\n"+sum);
		char t;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)>str.charAt(j)) {
					t=str.charAt(i);
					
				}
			}
		}
		
		
	}

}
