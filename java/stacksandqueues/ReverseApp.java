import java.io.*;
class Stackx{
private int maxSize;
private char[] stackArray;
private  int top;

public Stackx(int max)
{
maxSize=max;
stackArray=new char[maxSize];
top=-1;
}

public void push(char j) //put array into the stack
{
stackArray[++top]=j;
}

public char pop()
{
return stackArray[top--];
}

public char peek() //peek at top of the stack
{
return stackArray[top];
}

public boolean isEmpty() //true if stack is empty
{
return(top== -1);
}
} //end class Stackx

class Reverser
{
private String input;
private String output;

public Reverser(String in)
{input=in;}

public String doRev()
{
int stackSize=input.length();
Stackx theStack=new Stackx(stackSize);

for(int j=0;j<input.length();j++)
{
char ch=input.charAt(j); //get a char from input
theStack.push(ch);
}
output="";
while(!theStack.isEmpty())
{
char ch=theStack.pop();//pop a char
output=output+ch;  //apppend to output
}
return output;
} //end of doRev()
} //end of class Reverser

class ReverserApp
{
public static void main(String args[]) throws IOException
{
String input,output;
while(true)
{
System.out.println("Enter a String:");
System.out.flush();
input=getString(); //get a String from keyboard
if(input.equals(""))
break;
Reverser theReverser=new Reverser(input);
output=theReverser.doRev();
System.out.println("Reversed:" +output);
} //end of while loop
} //end of main()

public static String getString() throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s=br.readLine();
return s;
}
}
