class TestStatic
{
    static
    {
        System.out.println("m1() starts");
    }
    
    
    public static void main(String args[])
    {
        System.out.println("main starts");
        
       
    }
    
    static 
    {
        System.out.println("m2() starts");
    }
}
