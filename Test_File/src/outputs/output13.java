package outputs;

public class output13 {
	public static int genPrime(int num) {
int min=0;
        
        if(num==1) {
			return 2;
		}
		else if(isPrime(num)){return num;}
		int prime=num;
		int result=0,i=1;
		boolean found=false;
		
		while(!found) {
		    
			if(isPrime(prime-i)){
			    prime=prime-i;
			    break;}
			    
			else if(isPrime(prime+i)){
			    prime=prime+i;
			    break;}
			    
			  i++;
		}
		return prime;
	}
	
	public static boolean isPrime(int num) {
		
		if(num<=1)return false;
		if(num<=3)return true;
		
		if(num%2==0 || num%3==0)return false;
		
		for(int i=5;i*i<=num;i=i+6) {
			
			if(num%i==0 || num%(i+2)==0) {
				return false;}
		}
		return true;
}
	public static void main(String[] args) {
		
		int arr[]= {2,6,10};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]=genPrime(arr[i]);
		}
		
		for(int e:arr) 
		{
			System.out.print(e+" ");
		}
	}

}
