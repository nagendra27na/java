class prg7
{
int i;
static int j;
static void funcation1()
{
 prg7.j=100;
System.out.println("j="+prg7.j);
prg7 p=new prg7();
p.i=10;
System.out.println("i="+p.i);
}
public static void main(String args[])
{
funcation1();
prg7 p1=new prg7();
p1.i=20;
prg7.j=200;
System.out.println("i="+p1.i+"\nj="+prg7.j);
  }
}