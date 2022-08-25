import java.util.Scanner;
public class Scannerdemo1
{
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);    
      System.out.println("enter your name:");
       String str=sc.next();

          System.out.println("enter your age:");
           int age=sc.nextInt();
            System.out.println(" enter the amount:");
             float amount=sc.nextFloat();     
               System.out.println("Name is :"+str);
                 System.out.println("Age is:"+age);
                  System.out.println("Amount is:"+amount);
                   } 
}  
