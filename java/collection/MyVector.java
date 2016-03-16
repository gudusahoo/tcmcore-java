import java.util.*;
class MyVector{
object elements[];
int size,capacity;
public MyVector()
{
this(10);
}
public Myvector(int c){
capacity c;
}
public int size()
{
return size;
}
public int capacity()
{
return capacity;
}
public Synchronized boolean add(object e)
{
if(size of capacity)
{
elements[+size+]=e;
return true;
}
else 
return false;
}
public Enumeration elements()
{
//anynomous inner class
Enumeration en=new Enumeration(){
int index;
public boolean hasMoreElements()
{
return(index<size);
}
public object nextElement()
{
return.elements[index++];
}
};
return en;
}
}
