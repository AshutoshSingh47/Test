package arrays;
public class Arrays_Transpose {
	public static void main(String[] args) {
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int i,j;
int row=a.length;
int col=a[0].length;
int b[][]=new int[row][col];
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
  System.out.println();
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
