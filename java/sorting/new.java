//selctionsort.java 
//demonstrates selection sort
class ArraySel
{
private double[] a;  //ref to array
private int nElems;  //number
//---------------------------
public ArraySel(int max)
{
a=new double[max];  //create the array
nElems=0;
}
//---------------------------
public void insert(double value)
{
a[nElems]=value;
nElems++;
}
//-------------------------------
public void display()
{
for(int j=0;j<nElems;j++) //for each elements
System.out.println(a[j]+""); //display it
System.out.println("");
}