package testers;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class Cart_Test {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String>list=new LinkedList<String>();
	LinkedList<Integer>ll=new LinkedList<Integer>();
	int c,b;
	b=0;
	String a[]={"shoes","t-shirts","pants","watches"};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(i+" for "+a[i]);
	}
	System.out.println("4 for exit");
	System.out.println("Enter your choice");
	while(b!=4){
	b=sc.nextInt();
	if(b!=4)
	list.add(a[b]);
	}
//	do{
//	System.out.println("1-shoes");
//	System.out.println("2-t-shirts");
//	System.out.println("3-pants");
//	System.out.println("4-watches");
//	System.out.println("To exit enter e");
//	System.out.println("Enter your choices");
//	b=sc.nextInt();
//	list.add(a[b]);
//	}while(b<=4);
	int j=1;
	if(b==4)
	{
		Object[] f=list.toArray();
		for(Object e:f)
			System.out.println(j+++" : "+e+" ");
		System.out.println("\n\t*******  PLEASE COME AGAIN  *******");
		
	}
	

	}

}
