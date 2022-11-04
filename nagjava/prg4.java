 import java.util.Scanner;
class MyException extends Exception
{
void display()
{
System.out.println(" out of bound Exception");
    }
}
class prg4
{
  public static void main(String args[]) throws Exception
  {
     Scanner sc=new Scanner(System.in);
int num=0;
try 
{
System.out.println("enter number:");
num=sc.nextInt();
if(num<10)
throw new MyException();
System.out.println("num="+num);
}
catch(MyException e)
{
  e.display();
   }
}
}
