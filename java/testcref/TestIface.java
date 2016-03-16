interface CallBack
{
    void callBack(int p);
}


class Client implements CallBack
{
    public void callBack(int p)
    {
        System.out.println("callback called with " +p);
    }
    void nonIfaceMeth()
    {
        System.out.println("classes that implement interfaces may have concrete methods");
    }
    
}

class TestIface
{
    public static void main(String args[])
    {
        CallBack c=new Client();
        c.callBack(42);
        c.nonIfaceMeth();
    }
}