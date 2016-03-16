//bubblesort.java
//demonstrates selectionsort
//improved swap i.e. from O(N2) to O(N). 
 
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
 public void selectionSort()
 {
 int out,in,min;
 for(out=0;out<nElems-1;out++)//outer loop
 {
 min=out;                      //minimum
 for(in=out+1;in<nElems;in++) //inner loop
 if(a[in]<a[min])             //if min greater
    min=in;                    //we have a new min
	swap(out,min);             //swap them
	}//end of outer for
 }//end of selection sort
// ----------------------------
 private void swap(int one,int two)
 {
 double temp=a[one];
 a[one]=a[two];
 a[two]=temp;
 }
// ------------------------------------------
 }//end class ArrayBub
 
 class BubbleSortAppinSelectionSort
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
 arr.selectionSort();
 arr.display();
 }
 }
 