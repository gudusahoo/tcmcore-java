class Link{
public int iData;
public double dData;
public Link next;
public Link(int id,doule dd)
{
iData=id;
dData=dd;
}
public void displayLink()
{
System.out.println("{"+iData+","+dData+"}");
}
}