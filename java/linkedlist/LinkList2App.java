class Link
{

public iData;
public dData;
public Link next;
}

public Link(int id,double dd)
{
iData=id;
dData=dd;
}
 
public void displayLink()
{
System.out.print("{"+iData+","+dData+"}");
}
}
//end of class Link


class LinkList
{
private Link first; //ref to the linklist
}

public LinkList()
{
first=null;
}
public void insertFirst(int id,double dd)
{
Link newLink=new Link(id,dd);
newLink.next=first; //it points to old first link
first=newLink; //now points to this
}

public link find(int key)
{
Link current=first;
while(current.idata!=key)
{
if(current.next==null)
return null;
else
current=current.next;
}
return current;
}

public Link
