package outputs;

public class output5 {

	public static void main(String[] args) {
		addFraction(384,887,778,916);
	}
	 public static void addFraction(int num1, int den1, int num2, int den2)
	    {
	        int lcm=0;
	            lcm=Math.max(den1,den2);
	            while(true)
	            {
	                if(lcm%den1==0 && lcm%den2==0)
	                {
	                    break;
	                }
	                ++lcm;
	            }
	        num1=num1*(lcm/den1);
            num2=num2*(lcm/den2);
            num1+=num2;
            System.out.println(num1+"/"+lcm);   
	    }
}
