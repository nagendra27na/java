import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class readdata
{


public static void main(String[]args)throws IOException
{
   BufferedReader br=new BufferedReader(new 
InputStreamReader(System.in));
    System.out.println("enter your name:");
String str = br.readLine();
System.out.println("enter your age:");
int age=Integer.parseInt(br.readLine());
System.out.println("Are you Male/Female Type M orF:");
char ch=(char)br.read();
System.out.println("Name is:"+str);
System.out.println("Sex is:"+ch);
System.out.println("Age is:"+age);
 }
} 