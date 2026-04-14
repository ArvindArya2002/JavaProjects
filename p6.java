abstract class AA
{
    int a=5;
    AA()
    {
        System.out.println("Hello A "+a);
    }
    void fun()
    {
        System.out.println("Hii");
    }
}
class BB extends AA
{
    @Override
    void fun()
    {
        System.out.println("Hello");
    }
}
public class p6 
{
 public static void main(String[] args) 
 {
    AA ob=new BB();
    ob.fun();
 }   
}
