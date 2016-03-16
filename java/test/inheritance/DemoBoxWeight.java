class Box
{
    double width;
    double depth;
    double height;
  Box (Box ob)
  {
      width=ob.width;
      height=ob.height;
      depth=ob.depth;
  }
    //constructor used when all dimension are specified
    Box(double w,double d,double h)
    {
        width=w;
        height=h;
        depth=d;
    }
    //constructor when no dimension specified
    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    //constructor when cube is created
    Box(double len)
    {
        height=depth=width=len;
    }
    //to compute and return volume
    double volume()
    {
        return width*height*depth;
    }
}

class BoxWeight extends Box
{
    double weight;
    
    BoxWeight(double w,double h,double m,double d)
    {
        super(h,w,d);
        weight=m;
    }
}
class DemoBoxWeight
{
    public static void main(String args[])
    {
        BoxWeight mybox1=new BoxWeight(10,22,33,34.34);
        BoxWeight mybox2=new BoxWeight(2,3,4,0.5);
        double vol;
        vol=mybox1.volume();
        System.out.println("volume of my box is1:\t"+vol);
        System.out.println("weight of my box is1:\t"+mybox1.weight);
        System.out.println();
        
        vol=mybox2.volume();
        System.out.println("volume of my box2 is:\t"+vol);
        System.out.println("weight of my box2 is:\t"+mybox2.weight);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        