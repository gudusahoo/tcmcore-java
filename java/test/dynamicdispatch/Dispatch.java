class A
{
    void callme()
    {
        System.out.println("inside A");
    }
}
class B extends A
{
    void callme()
    {
      System.out.println("inside B");
    }
}
class C extends A
{
    void callme()
    {
        System.out.println("inside C");
    }
}

class Dispatch
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        C c=new C();
        A r;
        
        r=a;
        a.callme();
        r=b;
        b.callme();
        r=c;
        c.callme();
    }
}
