class A
{
    public A()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    int b;
    public B(int x)
    {
        b=x;
        System.out.println("in B");
    }
  B()
    {
       System.out.println("in B default");
    }
}
class C extends B
{
    public C()
    {
        super(10);
        System.out.println("in C");
    }
 
    public static void main(String args[])
    {
        new A();
        new B(5);
        new C();
    }
}

    
