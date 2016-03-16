class IfTest{
public static void main(String args[]) throws ArrayIndexOutOfBoundsException {
int i,count1,count,count2;
int[] weight={10,23,43,46,56,67,8,7,5,4,3,3};
int[] height={23,34,45,56,676,54};
count1=0;count2=0;count=0;
for(i=0;i<=15;i++)
{
if(weight[i]<30 && height[i]>40){
count1=count1+1;
}
count=count +1; //total person
}
count2=count-count1;
System.out.println("number of person with......");
System.out.println("weight <30 and height >40+" +count1);
System.out.println("others=" +count2);
}}