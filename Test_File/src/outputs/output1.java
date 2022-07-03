package outputs;
import java.util.Scanner;
class output1{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int tc,N,M,sum=0;
	tc=sc.nextInt();
	while(tc!=0)
	{
		tc--;
		N=sc.nextInt();
		M=sc.nextInt();
		int Ai[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Ai[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			if(Ai[i]!=0)
			{
				sum=sum+(Ai[i]-(Ai[i]-1));
			}
				
		}
		System.out.println(sum);
		sum=0;
	}
}
}
