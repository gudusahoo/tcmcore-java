class A
{
    public void display()
    {
        System.out.println("in A");
    }
    public static void invoke(A x)
    {
        
        x.display();
    }
   
}

class B extends A
{
    public void display()
    {
        System.out.println("in B");
    }
}
class BindingTest
{
    public static void main(String args[])
    {
        A x=new A();
        B y=new B();
        A.invoke(x);
        B.invoke(y);
    }
}