package outputs;

public class output3 {

	public static void main(String[] args) {
		int N = 4;
		int[] arr = {3, 23, 30, 45};
		int pro=1,r,count=0,res;
		for(int i=0;i<N;i++)
		{
		    pro=pro*arr[i];
		}
		System.out.println(pro);
		while(pro!=0)
		{
		    r=pro%10;
		    if(r!=0){
		    System.out.println(r);
		    break;}
		    else{
		        count++;}
		    pro=pro/10;
		}
		System.out.println(count);
	}

}
