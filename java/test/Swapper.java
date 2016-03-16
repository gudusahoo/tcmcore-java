class Swapper
{
    int a,b;
    Swapper(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
 public Swapper display()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        return this;
    }
    public Swapper swap()
    {
        int c=a;
        a=b;
        b=c;
        return this;
    }
    public static void main(String args[])
        
    {
       /* Swapper s=new Swapper(4,5);//conventional approach
        s.display();
        s.swap();
        s.display();*/
       /* Swapper s=new Swapper(4,5);//by storing it in a variable you can do it
        s.display().swap().display();*/
        new Swapper(4,5).display().swap().display();
    }
}