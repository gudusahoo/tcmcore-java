import java .util.*;
class Traversor extends Thread{
Iterator itr;
public Traversor(Iterator itr){
this.itr=itr;
}
public void run()
{
System.out.println("New Thread is started ,traversing list elements");
while(itr.hasNext()){

System.out.println(itr.next());
}
try{
Thread.sleep(2000);
}
catch(Exception e){}
System.out.println("new Thread is completed");
}

}
class ItrTest{
public static void main(String args[]){
System.out.println("main thrad is started,creating a list...");
ArrayList list=new ArrayList();
list.add("two");
list.add("three");
list.add(1,"one");
Iterator itr=list.iterator();
System.out.println("list created,iterator obtained");
Traversor th=new Traversor(itr);
th.start();
System.out.println("new Thread created,suspending main thread....");
try{
Thread.sleep(1000);
}
catch(Exception ex){}
System.out.println("main thread resumed,modifying list.......");
list.add("four");
list.add("five");
System.out.println("list modified,main thread completed..");
}
}

