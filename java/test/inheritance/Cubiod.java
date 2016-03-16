class Common
{
    int length,breadth;
    Common(int l,int b)
    {
        length=l;
        breadth=b;
    }
    
    public void display()
    {
        System.out.println("length="+length);
        System.out.println("breadth="+breadth);
    }
}
    class Rectangle extends Common
    {
        Rectangle(int l,int b)
        {
            super(l,b);
        }
        
        int area()
        {
            return length*breadth;
        }
        
        int perimeter()
        {
            return 2*(length+breadth);
        }
    }
    
    class Cubiod extends Common
    {
        int height;
        Cubiod(int l,int b,int h)
        {
            super(l,b);
            height=3;
        }
        
       public void display()
        {
            super.display();
            System.out.println("height="+height);
        }
        int volume()
        {
            return length*breadth*height;
        }
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            