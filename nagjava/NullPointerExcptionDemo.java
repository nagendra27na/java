public class NullPointerExcptionDemo
{
 public static  void main(String[] args)
{
String city =null;
try{
     if(city.equals("banglore"))
        System.out.println("equal");
        else
System.out.println("not equal");
}
catch(NullPointerExcption e)
{

System.out.println(" Null PointerExcption caught");
} 
finally
{
System.out.println(" this is finally block after catching Null PointerExcption");
}
}
 