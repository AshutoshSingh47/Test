package outputs;

public class output4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="malayalam";
		int count=0;
		boolean check=false;
//		String a2;
//		a2=S;
//		System.out.print(a2);
//		 int length=S.length();
//		    char ch[]=new char[length];
//		    for(int i=length;i>0;i--)
//		    {
//		        if()
//		    }
		int l1=0;int l2=S.length()-1;
	    while(l2>l1)
	    {
	        if(S.charAt(l1++)!=S.charAt(l2--))
	        {
	        	count++;
	        	//return;
	        }
	    }
	    if(count==0)
	    	System.out.println("Palindrome");
	    else
	    	System.out.println(" NOt Palindrome"+count);
	}

}
