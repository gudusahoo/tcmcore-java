import java.util.*;
class TestCollection1{
public static void main(String args[]){
ArrayList<String>al=new ArrayList<String>();
al.add("Ravi");
al.add("Ajay");
al.add("Kapil");
Iterator itr=al.iterator();//getting iterator from arraylist to traverse elements
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
