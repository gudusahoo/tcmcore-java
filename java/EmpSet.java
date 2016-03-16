import java.util.*;
class EmpSet
{
public static void main(String args[])
{
TreeSet set=new TreeSet();
set.add(new Emp("AMAN","TRAINEE",12000));
set.add(new Emp("RAMAN","TRAINER",30000));
set.add("it must not be added");//it will result in runtime error
System.out.println("contents are in ascending order of name");
Iterator itr=set.iterator();
while(itr.hasNext())
{
Emp e=itr.next();
e.display();
}
}
}
