package outputs;

import java.util.ArrayList;

public class output19 {
	static ArrayList<Integer> increasing_subsequence(int[]a)
	{
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(a.length==1) {
			list.add(a[0]);
			return list;
		}
		int j=0,max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				list.add(a[i]);
				max=a[i];
				j++;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int arr[]= {4,3,5,1,6};
		System.out.print(increasing_subsequence(arr));
		
		
	}

}
