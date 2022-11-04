public class negative
{
public static void main(String args[])
{
try
{
 int[] array = new int [-10];
}
catch (negative obj)
{
obj.printStackTrace();
}

System.out.println("exception caught and continuing exception....");
}
}