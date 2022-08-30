package outputs;
import java.util.Arrays;
public class output10 {

	public static void main(String[] args) {
		int a[]= {4, 2, 2, 2, 3, 4, 4, 4, 3, 2};
		int n=a.length;
		int k=3;
		//Arrays.sort(a);
		int max=a[0];
		for(int i=0;i<n;i++)
        {
			max=Math.max(max,a[i]);
        }
		
		System.out.print(max);
        int index=-1;
        int b[]=new int[max+1];
        System.out.print(b.length+"\n");
        
        
//        for(int i=0;i<n;i++)
//        {
//            b[a[i]]++;
//        }
//        
//        for(int e:b) {
//        System.out.print(e+" ");}
        
        for(int i=0;i<n;i++)
        {
         	b[a[i]]++;
            if(b[a[i]]==k)
            {
                index=i;
                break;
            }
        }
        if(index!=-1) {
        System.out.print("\n"+a[index]);}
        else {
        	System.out.print(index);}

	}

}
