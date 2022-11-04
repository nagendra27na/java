import java.util.*;
class Student 
{
   Scanner sc=new Scanner(System.in);
    String edi,name;
    int sub1,sub2,sub3, total;
    student()
{
     readStudentinfo();
}
 void readstudentinfo()
{
     System.out.println("Enter student details");
      System.out.println("Enter edi");
      ed=sc.next();
    System.out.println("Enter name");
     name=sc.next();
System.out.println("Enter marks of 3 subjet");
         sub1=sc.nextInt(); 
          sub2=sc.nextInt();
           sub3=sc.nextInt();
           if(sub1>=50 && sub2>=50 && sub3>=50)
            total=sub1+sub2+sub3;
           else
           total=0;
           }
      void displayinfo();
       }

       System.out.println(eid+"\t\t"+name+"\t"+total);
}
}
class Studentinfo
{
   public static void main(String args[])
{
  student s[]=new student[3];
   for(int i=0;i<3;i++)
{ 
   s[i].new Student()
   System.out.println("\t\t Student details");
    System.out.println(enrollment no\tname\ttotal");
for(int i=0;i<3;i++)
        s[i].displayinfo();

}
   }
}




