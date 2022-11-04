class addsub
{
  int a,b,sum,sub;
void add()
 {
  sum=a+b;
   System.out.println("sum"+sum);
}
 void subtract()
{
   sub=a-b;
   System.out.println("Sub="+sub);
    }
}
class muldiv extends addsub 
{
  int mult,div;
  void multiplication()
 {
   mult=a*b;
   System.out.println("Multiplication="+mult);
}
void division()
{
div=a/b;
 System.out.println("Division="+div);
}
public static void main(String args[])
{
muldiv md=new muldiv();
md.a=10;
md.b=2;
md.add();
md.subtract();
md.multiplication();
md.division();
  }
}