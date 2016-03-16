import java.io.*;
import java.util.*;
class FeeFinder
{
public static void main(String args[])
{
System.out.println("loading fees");
Properties p=new Properties();

try{
 p.load(new FileInputStream("Fee.properties"));
 System.out.println("loaded");
 System.out.println("Course/tFee");
 Set set=p.entrySet();
 Iterator itr=set.iterator();
   while(itr.hasNext())
   {Map.Entry m=(Map.Entry)itr.next();
    System.out.println(m.getValue()+"\t"+m.getKey());
  }
}
catch (Exception e)
{System.out.println(e);}

}
}
