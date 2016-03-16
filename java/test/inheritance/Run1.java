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
 class Run1
 {
    public static void main(String args[])
    {
        new A();
        new B();
        new B(5);
    }
}

    
