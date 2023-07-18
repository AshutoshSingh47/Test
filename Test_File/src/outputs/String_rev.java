package outputs;

public class String_rev {

	public static void main(String[] args) {
		String str="I.like.this.program.very.much";
		String str2="",str3="";
		for(int i=str.length()-1;i>-1;i--)
		{
			
			if(str.charAt(i) == '.' || str.charAt(i) == ' ' || i==0)
			{
				str2=str2+str.charAt(i);
				str3+=str2;
				str2="";
			}else {
			str2=str.charAt(i)+str2;
			}
			
		}
		System.out.println(str3);
		System.out.println(reverseNumber(101001010));
	}

	public static String reverseNumber(int num) {
		String str=String.valueOf(num);
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
}
