package outputs;
import java.util.Scanner; 
public class output20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit : ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Invalid !");
		}
		else {
		int i,j,k,sp=n;
		
		//first half
		for(i=0;i<(n/2)+1;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("*");
			}
			if(i==n/2)
			{
				for(k=0;k<n;k++)
				{
					System.out.print("@");
				}
				System.out.print("*");
				
				
				
			}
			System.out.println();
		}
		
		for(i=(n/2)+1;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("*");
			}
			
			for(j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<n;k++)
			{
				System.out.print("@");
			}
			
			
			System.out.println();
			
		}
		
		for(i=0;i<n+sp;i++)
		{
			System.out.print(" ");
		}
		for(i=0;i<n+1;i++)
		{
			System.out.print("*");
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print("@");
		}
		
		System.out.println();
		
		//second half
		
		for(i=0;i<(n/2);i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("*");
			}
			
			
			for(j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<n;k++)
			{
				System.out.print("@");
			}
			
			System.out.println();
		}
		
		for(i=(n/2);i<n;i++)
		{
			
			for(j=0;j<n;j++)
			{
				System.out.print("*");
			}
			if(i==(n/2))
			{
				for(k=0;k<n;k++)
				{
					System.out.print("@");
				}
				System.out.print("*");
				
				
			}
			System.out.println();
		}	
		}
	}

}
