public class SquareFinder
{
public static void main(String arr[])
{
 try{
   int num=Integer.parseInt(arr[0]);
   if(num<1||num>100)
   throw(new OutOfRangeException("valid range is 1 to 100"));
   int s=num*num;
   System.out.println("Square is :"+s);
    }
catch(Exception e)
{System.out.println(e);}
}
}
