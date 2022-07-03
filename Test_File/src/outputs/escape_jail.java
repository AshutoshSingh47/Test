package outputs;
import java.util.Arrays;
import java.util.Scanner;
public class escape_jail {

	public static int jumps(int a,int b,int c,int d[])
	{
		int jump=0,jumps=0;
		for(int i=0;i<c;i++)
		{
			int reach=a;
			jump=1;
			while(reach<d[i])
			{
				jump++;
				reach=reach+(reach-b);
			}
			jumps+=jump;
//			if(d[i]<=a)
//			{
//				jump++;
//			}
//			else
//			{
//				while(a<d[i])
//				{
//					jump++;
//					a=a-b;
//					a=a+a;
//				}
//				jump++;
//			}
		}
		return jumps;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int d[]=new int[c];
		for(int i=0;i<c;i++) {
		d[i]=sc.nextInt();}
		System.out.println(jumps(a,b,c,d));
		
		
	}

}
