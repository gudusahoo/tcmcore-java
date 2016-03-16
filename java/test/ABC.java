class ABC
{
    int a,b;
   
     ABC()
    {
        this(2,3);
        System.out.println("in default");
    }
    
    ABC(int a)
    {
        this(a,3);
         System.out.println("one parameterized");
    }
    
     ABC(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("two parameterized");
    }
    public void display()
    {
        System.out.println("a="+this.a);
        System.out.println("b="+this.b);
    }
    
    public static void main(String args[])
    {
        ABC x=new ABC();
        x.display();
        ABC y=new ABC(10);
        y.display();
        ABC z=new ABC(20,30);
        z.display();
    }
}