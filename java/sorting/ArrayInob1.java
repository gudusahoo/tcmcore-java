//objectSort.java
//demonstrates sorting objects(uses insertion sort)

class Person
{
private String lastName;
private String firstName;
private int age;

//----------------

public Person(String last,String fast,int a)
{
lastName=last;
firstName=fast;
age=a;
}
//------------------

public void displayPerson()
{
System.out.println("Last Name:" +lastName);
System.out.println("FirstName:" +firstName);
System.out.println("age:" +age);
}
//--------------------
public String getLast()
{return lastName;}

}
/////////////////////////////////////////////

class 
{
private Person[] a; // ref to array a
private int nElems; // number of data items

//-------------------------------------------------------------

public ArrayInOb1(int max) // constructor
{
a = new Person[max]; // create the array
nElems = 0; // no items yet
}
//------------------------------
public void insert(String last,String fast,int a) //put person into the array
{
a[nElems] = new Person(last, fast, age); 
nElems++;  //increment in size
}
//--------------------------------

public void display()
{
for(int j=0;j<nElems;j++)   //for each elements
a[j].displayPerson();
System.out.println("");
}
//--------------------------------
public void insertionSort()
{
int in,out;
for(out=1;out<nElems;out++) //out is dividing line
{
Person temp=a[out];   ///remove marked person
in=out;              //start shifting at out
while(in>0 && a[in-1].getLast().compareTo(temp.getLast())>0)
{
a[in]=a[in-1];
--in;
}
a[in]=temp;
}
}

}