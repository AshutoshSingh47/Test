package outputs;

public class output16 {

	public static int findnth(int n) {
		
		
        if(n==0){
            return 0;
        }
        else if(n==1||n==2){
            return 1;
        }
        
        else if(n==3)
        {
            return 2;
        }
        
        else if(n==4){
            return 3;
        }
        else if(n%5==0){
           return 11;
        }
        
        return (findnth(n-1)+findnth(n-2))%1000000007;
	}
	public static void main(String[] args) {
		System.out.print(findnth(88));
		
		
	}

}
