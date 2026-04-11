class A
{
    int a=5;
    void func()
    {
        System.out.println("This is Super class..");
    }
}
class B extends A
{
    int a=10;
    void func()
    {
        System.out.println("This is Sub class..");
    }
}
public class p5 
{
 public static void main(String[] args) 
 {
    // Calling Sub class method from the Refrence of Super class is known as Non-Primitive Upcasting.. this is possible only in Method Overiding...
    A ob=new B();
    ob.func();
    B ob1=(B)ob; //Non-Primitive downcasting...
    System.out.println(ob1.a);
 }   
}
