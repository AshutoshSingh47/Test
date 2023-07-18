package outputs;

public class Magic_Toy_Shop {

	public static void main(String[] args) {
		int n=5,m=14;
		int price[]= {3,4,6,2,4};
		int magical_price[]= {1,2,5,1,3};
		
		
		 int result = -1,trident=0,sum=0,sum2=0;
	        for(int i=0;i<magical_price.length;i++)
	        {
	            sum+=magical_price[i];
	        }
	        
	        if(sum>m){
	            System.out.print(result);
	        }
	        else{
	        	sum=0;
	        	for(int i=0;i<n;i++)
	        	{
	        		sum+=magical_price[i];
	        		sum2=sum;
	        		System.out.println("Initial Sum : "+sum);
	        		trident++;
	        		for(int j=i+1;j<n;j++)
	        		{
//	        			System.out.print(price[j]+" ");
	        			sum2=sum2+price[j];
	        			System.out.println("Sum :"+sum2);
	        			if(sum2>m) {
	        				break;
	        			}
	        			
	        		}
//	        		System.out.print("TRIDENT "+trident+" "+i);
//	        		if(i==n-2 && sum2<m)
//	        		{
//	        			System.out.println(trident);
//	        			break;
//	        		}
	        	}
	        	System.out.println(trident);
	        }
	}

}
