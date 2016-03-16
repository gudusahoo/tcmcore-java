abstract class Figure
{
    double dim1;
    double dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
   abstract double area();
    
}
class Rectangle extends Figure
{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("inside area of Rectangle");
        return dim1*dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("inside area of triangle");
        return dim1*dim2 / 2;
    }
}
class FindArea
{
    public static void main(String args[])
    {
       // Figure f=new Figure(10,10);
        Rectangle r=new Rectangle(10,8);
        Triangle t=new Triangle(14,24);
        Figure figref;
        
        figref=r;
        System.out.println("Area is " +figref.area());
        figref=t;
        System.out.println("Area is " +figref.area());
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        