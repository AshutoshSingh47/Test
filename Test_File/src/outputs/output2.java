package outputs;
import java.util.Arrays;
import java.util.Scanner;
public class output2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc,count=0,ca=0,cj=0,res=0;String s;char ch;
		tc=sc.nextInt();
		while(tc!=0)
		{
			tc--;
			s=sc.next();
			char s2[]=new char[s.length()];
			int a[]=new int[s.length()];
			Arrays.fill(a, 0);
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='a') 
					ca++;
				else 
					cj++;
				s2[i]=s.charAt(i);
			}
			for(int i=0;i<s.length();i++)
			{
				if(s2[i]==s2[i+1]) {}
				//else if(s2[i]=='j'&&s2[i+1]=='j') {}
				else {
					a[i]++;}
			}
			for(char c:s2)
				System.out.print(c);
			System.out.println();
				for(int c:a)
					System.out.print(c);
//			if(ca==cj-1||cj==ca-1||ca==cj) {
//				System.out.print("valid");
//			System.out.println("a : "+ca+"j : "+cj);}
//			else {
//				System.out.println("-1");
//			System.out.println("a : "+ca+" j : "+cj);
//			break;}
//				for(int i=0;i<s.length();i++)
//					if(i%2==0)
//					{
//						if(ca!=0) {
//						s2[i]='a';
//						ca--;}
//					}
//					else
//					{
//						if(cj!=0) {
//						s2[i]='j';
//						cj--;}
//					}
//			
//				for(int i=0;i<s.length();i++)
//				{
//					if(s2[i]=='a'&&s2[i+1]=='a')
//					{
//						count++;
//					}
//					else if(s2[i]=='j'&&s2[i+1]=='j')
//					{
//						count++;
//					}
//				}
//			for(char c:s2)
//				System.out.print(c);
			//System.out.print(ca+" "+cj);
		}
	}

}
