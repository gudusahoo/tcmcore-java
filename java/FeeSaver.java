import java.util.*;
import java.io.*;
class PropSaver
{
public static void main(String args[])
{
Properties p=new Properties();
p.setProperty("1001","9 to 12,w/e,spring");
p.put("1002","12 to 3,w/e,hibernate");
p.put("1003","8 to 12,w/d,core");
p.put("1004","10 to 12,w/d,serverlet");
System.out.println("folowing properties will be loaded to batches.properties");
Set set=p.entrySet();
Iterator itr-set.iterator();
while(itr.hasNext())
{
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+"\t"+m.getValue());
}
System.out.println("savings...");
try{
p.store(new FileOutputStream("batches.properties"),Batch id=Batch details);
System.out.println("Sucessfully saved");
}
catch(Exception e){
System.out.println(e);
}
}
}
