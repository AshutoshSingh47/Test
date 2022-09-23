package outputs;

public class output17
{
    private String name;
    output17()
    {
        System.out.println("Hello this is Constructor");
    }
    output17(String name)
    {
        this.name=name;
        System.out.println("Hello this is second Constructor "+name);
    }
    output17(output17 obj)
    {
        this.name=obj.name;
        System.out.println("Hello this is third constructor "+ name);
        this.name="Suresh";
        System.out.println("Hello this is third constructor "+ name);
    }
    
    protected void finalize()
    {
      System.out.println("Destructor called over here");
    }
    
    public static void main(String args[])
    {
        output17 s,s1,s2;
        
        s=new output17("Ashutosh");
        s1=new output17(s);
        new output17(s1);
        s1.finalize();
        s1=null;
//        System.gc();
        s2=s1;
        new output17(s);
//        s2=new output17(s);
        System.out.print(""+s2);
      
        
    }
}
