import java.util.*;
class firstyear
{
String cn,ct;
int stdcount;
int stdmarks[]=new int[50];
String stdname[]=new String[50];
Scanner sc= new Scanner(System.in);
firstyear()
{
getinfo();
}
void getinfo()
{
System.out.println("enter class name");
cn=sc.next();
System.out.println("enter class teacher name");
ct=sc.next();
System.out.println("enter total no of students in the class");
stdcount=sc.nextInt();
System.out.println("enter name of all the students in the class");
for(int i=0;i<stdcount;i++)
stdname[i]=sc.next();
System.out.println("enter marks of all the students in the class");
for(int i=0;i<stdcount;i++)
stdmarks[i]=sc.nextInt();
}
void beststudent()
{
int best=0,k=-1;
for(int i=0;i<stdcount;i++)
{
if(stdmarks[i]>best)
{
best=stdmarks[i];
      k=i;
 }
}
System.out.println("the student is name="+stdname[k]+"marks="+stdmarks[k]);
 }
}
class student2
{
 public static void main(String args[])
{
firstyear fy=new firstyear();
 fy.beststudent();
  }
}

