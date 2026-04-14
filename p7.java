interface D
{
     int x=5;
     void m();
}
class B
{
   void m()
   {
    System.out.println("Class B..");
   }
}
// In case of Interface Multiple Inheritance will be allowed
class C extends B implements D
{
    public void m()
    {
        System.out.println("class C..");
    }
}
public class p7 
{
 public static void main(String[] args) 
 {
   D ob=new C();
   ob.m();
 }   
}
