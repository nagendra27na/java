import java.util.Date;
class Employee
{
String name;
Date appdate;
public Employee(String nm,Date apdt)
{
name =nm;
appdate = apdt;
}
 public void display()
{
System.out.println("employee name:" +name +"\t appointment date:\t" + appdate.getDate() +"/"+appdate.getMonth() +"/" +appdate.getYear());
   }
}
public class  EmpDate1
{
public static void main(String as [])
{
Employee emp[] =new Employee[10];
emp[0] = new Employee("neeraja k", new Date(1999,05,22));
emp[1] = new Employee("kuldeep m", new Date(2000,01,12));
emp[2] = new Employee("roja d", new Date(2009,04,25));
emp[3] = new Employee("rana k", new Date(2005,02,19));
emp[4] = new Employee("jyothi", new Date(2010,01,01));
emp[5] = new Employee("srikanth", new Date(1999,01,01));
emp[6] = new Employee("rajesh", new Date(2020,05,19));
emp[7] = new Employee("asha", new Date(2022,04,22));
emp[8] = new Employee("ammu", new Date(2000,01,25));
emp[9] = new Employee("gourav", new Date(2002,9,9));
System.out.println("List of employees");
for(int i = 0;i < emp.length; i++)

    emp[i].display();

for(int i= 0; i< emp.length;i++){

for(int j= i +1; j<emp.length;j++){

if(emp[i].appdate.after(emp[j].appdate)){

Employee t = emp[i];
emp[i] = emp[j];
emp[j] = t;
  }
   }
}
System.out.println("\nList of employees Seniority wise");
for(int i= 0; i<emp.length;i++)
emp[i].display();
 }
}
