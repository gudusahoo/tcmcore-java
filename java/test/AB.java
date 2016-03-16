class AB
{
    int a,b;
    public AB(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void display()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[])
    {
        AB x=new AB(5,6);
        x.display();
    }
}