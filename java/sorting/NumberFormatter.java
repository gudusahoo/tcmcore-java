class MyMergeSort{
private int[] array;
private int[] tempMergArr;
private int length;

public static void main(String args[])
{
int[] inputArr={10,23,12,34,46,34,76,32,45,12};
MyMergeSort mms=new MyMergeSort();
mms.sort(inputArr);
for(int i:inputArr)
 {
  System.out.print(i);
  System.out.print("");
 }
}
public void sort(int inputArr[]){
this.length=inputArr.length;
this.array=array;
this.tempMergArr=new int[length];
doMergeSort(0,length-1);
}

private void doMergesort(int lowerIndex,int higherIndex)
{
if(lowerIndex<higherIndex)
 {
  int middle=lowerIndex+(higherIndex-lowerIndex)/2;
  doMergeSort(lowerIndex,middle);
 //the seconddhalf
  doMergeSort(middle+1,higherIndex);
//now merge
mergeParts(lowerIndex,middle,higherIndex);
  }
}
private void mergeParts(int lowerIndex,int middle,int higherIndex)
{
for(int i=lowerIndex;i<=higherIndex;i++){
tempMergArr[i]=array[i];
}//end of for loop
int i=lowerIndex;
int j=middle+1;
int k=lowerIndex;
while(i<=middle && j<=higherIndex){
if(tempMergArr[i]<=tempMerg[j]){
array[k]=tempMergArr[i];
i++;
}
else{
array[k]=tempMergArr[j];
j++;
}
k++;
}
while(i<=middle){
array[k]=tempMergeArr[i];
k++;
i++;
}
}
}

