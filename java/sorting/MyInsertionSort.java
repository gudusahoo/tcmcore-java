package Godpack;

public class MyInsertionSort{
public static void main(String a[])
{
int[] arr1={10,12,24,21,45,1,2,3,-1};
int[] arr2=doInsertionSort(arr1);
for(int i:arr2)
{
System.out.println(i);
System.out.print(", ");
}
}
public static int[] doInsertionSort(int[] input)
{
int temp;
for(int i=1;i<input.length;i++){
for(int j=1;j>0;j--){
if(input[j]<input[j-1]){
temp=input[j];
input[j]=input[j-1];
input[j-1]=temp;
}//end of if loop
}//end of inner for loop
}//end of outer for loop
return input;
}
}