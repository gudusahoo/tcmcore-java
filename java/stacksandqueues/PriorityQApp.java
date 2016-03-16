class PriorityQ
{
//array in sortred order,from max at 0 to min at size-1
private int maxSize;
private double[] queArray;
private int nItems;
  
public PriorityQ(int s)
{
maxSize=s;
queArray=new double[maxSize];
nItems=0;
}
public void insert(double item) //insert item
{
int j;
if(nItems==0)          //if no items
queArray[nItems++]=item; //insert at 0
else
{
for(j=nItems-1;j>=0;j--) //start at end,
  {
  if(item>queArray[j]) //if new item larger
  queArray[j+1]=queArray[j]; //shift upward
else
 break;
} //end of for loop
queArray[j+1]=item;
nItems++;
} //end of else loop(nItems>0)
}//end of insert()
 
public double remove()
{
return queArray[--nItems];
}

public double peekMin() //peek at minimum item
{return queArray[nItems-1];}

public boolean isEmpty() //true if que is empty
{return(nItems==0);}
public boolean isFull() //true if queue is full
{return(nItems==maxSize);}
}// end ofclass PriorityQ

public class PriorityQApp
{
public static void main(String[] args) throws IOException
{
PriorityQ thePQ=new PriorityQ(5);
thePQ.insert(10);
thePQ.insert(20);
thePQ.insert(30);
thePQ.insert(40);
thePQ.insert(50);
while(!thePQ.isEmpty())
{
double item=thePQ.remove();
System.out.print(item+ ""); //10,20,30,40,50
} ///end of while loop
System.out.println("");
}
//end of main()
}
//end of class
