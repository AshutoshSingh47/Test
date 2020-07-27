
package arrays;
import java.util.Scanner;
public class Arrays_Transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("Enter row of 2D array");
int row=sc.nextInt();
System.out.println("Enter column of 2D array");
int col=sc.nextInt();
int a[][]=new int[row][col];
int b[][]=new int[row][col];
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		a[i][j]=sc.nextInt();
	}	
}
System.out.println("\n"+"original array:"+"\n");
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
  System.out.println("\n"+"new array:"+"\n");
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		b[j][i]=a[i][j];
	}
}
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}


	}

}
