package outputs;

public class output9 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int max=arr[0];
		long a=	Long.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
		}
		System.out.print(max+" "+a);

	}

}
