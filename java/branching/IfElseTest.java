class IfElseTest{
public static void main(String args[]){

int numbers[]={12,23,34,45,46,56,76,87,54};
int even=0,odd=0;
for(int i=0;i<numbers.length;i++){
if((numbers[i] % 2)==0)
{
even +=1;
}
else{
odd +=1;
}

}


System.out.println("Even numbers: \t"  +even+ "odd numbers" +odd);
}
}
