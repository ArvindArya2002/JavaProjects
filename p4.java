class demo
{
    int a=5;
    static int b=7;
    static void fun()
    {
        System.out.println(b);
    }
    static 
    {
        System.out.println("Hello JAAT Sahab");
        System.out.println("It executes Automatically when the class load in memory");
    }
    {
        System.out.println("Anonymous block");
        System.out.println("It executes before constructor when the object is created..");
    }
    demo()
    {
        System.out.print("Hello Arvind");
    }
    demo(int x)
    {
        this();
        System.out.println(" Arya");
        System.out.println(x);
    }
}
public class p4 {
    public static void main(String[] args) 
    {
     demo.fun();
     demo.b=10;
     demo.fun();  
     demo ob=new demo(5); 
     System.out.println(ob.a);
    }
}
