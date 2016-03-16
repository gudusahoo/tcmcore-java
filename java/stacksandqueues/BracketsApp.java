//brackets.java stacks used to check matching brackets
class Stackx
{
private int maxSize;
private char[] stackArray;
private int top;


public Stackx(int s)
{
maxSize=s;
stackArray=new char[maxSize];
top=-1;
}

public void push(char j) //put item on top of the stack
{
stackArray[++top]=j;
}

public char peek()
{
return stackArray[top];
}

public char pop()
{
return stackArray[top--];
}

public boolean isEmpty() //true if stack is empty
{
return(top==-1);
}

} //end of class Stackx

class BracketChecker
{
private String input;

public BracketChecker(String in)
{input=in;}
 
public void check()
{
int stackSize=input.length(); //get max stack size
Stackx theStack=new Stackx(stackSize); //make stack
for(int j=0;j<input.length();j++) //get chars in turn
{
char ch =input.charAt(j);     //get char
switch(ch)
{
case'{':                 //opening symbols
case'[':
case'(':
theStack.push(ch);         //push them
break;                

case'}':
case']':
case')':

if(!theStack.isEmpty())  //if stack not empty,
{
char chx=theStack.pop(); //pop and check
if((ch=='}' && chx!='{')
   (ch==']' && chx!='[')
   (ch==')' && chx!='(')) 
System.out.println("Error:"+ch+"at"+j);
}
else
System.out.println("Error:"+ch+ "at"+j);
break;
default;
break;
}
}
if(!theStack.isEmpty())
System.out.println("Error: missing delimeter");
}
}


class BracketsApp
{
public static void main(String args[]) throws IOException
{
String input;
while(true)
{
System.out.print("Enter String containing delimeters:");
System.out.flush();
input=getString();
if(input.equals(""))
break;
BracketChecker theChecker =new BracketChecker(input);
theChecker.check();
}

}

public static String getString() throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s=br.readLine();
return s;
}
}

