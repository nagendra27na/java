class prg5
{
 static int a,b,sum;
  static float x,y,sum1;
  void add(int a,int b)
  {
    sum=a+b;
     System.out.println("Sum="+sum);
}
 void add(float x,float y)
 {
 
  sum1=x+y;
System.out.println("Sum="+sum1);
}

public static void main(String[] args)
{
   prg5 p5=new prg5();
   p5.add(a,b);
   p5.add(x,y);
 }
}