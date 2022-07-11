package outputs;

public class output7 {

	public static void main(String[] args) {
		int max=0,j=1,c=0,N=24;
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
            {
                j=1;
                c=0;
                while(j<i)
                {
                    if(i%j==0) {
                    c++;}
                }
                if(c==2){
                if(i>max){
                max=i;}}
            }
       
       	}
        System.out.print(max);
	}
}
