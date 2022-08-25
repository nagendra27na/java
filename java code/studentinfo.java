import java.util.*;
class student
{
 Scanner sc=new Scanner(System.in);
 String eid,name;
int sub1,sub2,sub3,total;
student()
{
   readstudentinfo();
}
void readstudentinfo()
{
System.out.println("enter student details:");
System.out.println("enter eid:");
eid=sc.next();
System.out.println("enter name:");
name=sc.next();
System.out.println("enter marks of 3 subjets:");
sub1=sc.nextInt();
sub2=sc.nextInt();
sub3=sc.nextInt();
if(sub1>=50 && sub2>=50 && sub3>=50)
total=sub1+sub2+sub3;
else
total=0;
}
void displayinfo()
{
  System.out.println(eid+"\t\t"+name+"\t"+total);
}

}
class studentinfo
{
public static void main(String args[])
{ 
student s[]=new student[3];
for(int i=0;i<3;i++)
{
  s[i]=new student();
}
    System.out.println("student details:");
    System.out.println("eid\t\t name\t total");
    for(int i=0;i<3;i++)
{
   s[i].displayinfo();
}
   }
}
