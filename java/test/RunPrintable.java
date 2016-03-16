abstract class Printable
{
    abstract void print();
    
}
class A extends Printable
{
     void print()
    {
        System.out.println("A is printale");
    }
}
class B extends A
{
    public void print()
    {
        System.out.println("B is printable");
    }
}
class RunPrintable
{
    public static void main(String args[])
    {
        Printable p;
        p=new A();
        p.print();
        p=new B();
        p.print();
    }
}