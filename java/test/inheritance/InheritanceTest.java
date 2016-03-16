class Rectangle1
{
    int length;
    int breadth;
    Rectangle1(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void display()
    {
        System.out.println("length=" +length);
        System.out.println("breadth="+breadth);
    }
    public void area()
    {
    System.out.print("Area of the Rectangle is \t");
    System.out.println(length*breadth);
    }
    public void perimeter()
    {
        System.out.print("perimeter of the Rectangle is \t");
        System.out.println(2*(length+breadth));
    }

}


class Cubiod1 extends Rectangle1
{
    int height;
    Cubiod1(int l,int b,int h)
    {
    super(l,b);
     height=h;
    }
    public void display()
    {
        super.display();
        System.out.println("height="+height);
    }
    public void area()
    {
        System.out.print("Area of the cubiod is \t");
        System.out.println(length*breadth*height);
    }
}
class InheritanceTest
{
    public static void main(String args[])
    {
        Rectangle1 r=new Rectangle1(10,20);
        Cubiod1 c1=new Cubiod1(10,20,30);
                          
        r.display();
        r.area(); 
        r.perimeter();
        c1.display();
        c1.area();
    }
}





















