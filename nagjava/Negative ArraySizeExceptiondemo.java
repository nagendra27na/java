public class Negative ArraySizeExceptiondemo
{
public static void main(String args[])
{
    try
  {
int[]array=new int[-10];
}
 catch(Negative ArraySizeException obj)
{
 obj.printstack trace ();
}
System.out.println("Exception caught and continuing exception");
}
}