package loops;

import java.util.Scanner;

public class fibonacci {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;int a=0,b=1,c=0;
		System.out.print("Enter limit : ");
		int limit=sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=2;i<limit;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
