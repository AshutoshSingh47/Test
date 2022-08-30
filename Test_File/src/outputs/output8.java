package outputs;
import java.util.Arrays;
import java.util.Scanner;
public class output8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j=0,size=0;
		int a[]= {2,3,2,2,2,3,2,3,5,6,1};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[j]) {
				j++;
				a[j]=a[i];
			}
		}
		for(int i=0;i<=j;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
