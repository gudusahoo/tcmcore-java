//bubblesort.java
//demonstrates bubble sort
 
  class ArrayBub
 {
 private double[] a;
 private int nElems;
 
 //------------------------------------------
 public ArrayBub(int max)
 {
 a=new double[max];
 nElems=0;
 }
 //---------------------------------------------
 public void insert(double value)
 {
 a[nElems] =value;
 nElems++;
 }
 //----------------------------------------------
 public void display()
 {
 for(int j=0;j<nElems;j++)
 System.out.println(a[j]+"");
 System.out.println("");
 }
 //---------------------------
 public void bubbleSort()
 {
 int out,in;
 for(out=nElems-1;out>1;out--) //outer loop
 for(in=0;in<out;in++) //inner loop
 if(a[in]>a[in+1]) //if loop
 swap(in,in+1);
 }
// ----------------------------
 private void swap(int one,int two)
 {
 double temp=a[one];
 a[one]=a[two];
 a[two]=temp;
 }
// ------------------------------------------
 }//end class ArrayBub
 
 class BubbleSortApp
 {
 public static void main(String args[])
 {
 int MaxSize=100; //array size
 ArrayBub arr; //refernce to array
 arr=new ArrayBub(MaxSize);
 arr.insert(77); //insert 5 items
 arr.insert(90);
 arr.insert(89);
 arr.insert(44);
 arr.insert(22);
 arr.display();
 arr.bubbleSort();
 arr.display();
 }
 }
 