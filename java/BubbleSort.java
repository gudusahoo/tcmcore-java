import java.util.Scanner;
class BubbleSort{
public static void main(String args[]){
int n,c,d,swap;
Scanner in=new Scanner(System.in);
System.out.println("enter numbers to sort--------------");
 n=in.nextInt();

int arr[]=new int[n];
System.out.println("enter"+n+"integers");

for(c=0;c<n;c++)
arr[c]=in.nextInt();
System.out.println(c);

for(c=0;c<(n-1);c++){
for(d=0;d<(n-c-1);d++){
if(arr[d]>arr[d+1])
{
swap=arr[d];
arr[d]=arr[d+1];
arr[d+1]=swap;
}
}
}
System.out.println("sorted list of numbers");
for(c=0;c<n;c++)
System.out.println(arr[c]);


}
}


