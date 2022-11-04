import java.awt.*;
class Drawings extends Canvas 
{
 public void paint(Graphics g)
{
  g.drawRect(50,75,100,50);
  g.fillRect(200,75,50,50);
  g.drawRoundRect(50,150,100,50,15,15);
 g.fillRoundRect(175,150,100,50,15,15);
 g.drawOval(50,275,100,50);
 g.fillOval(50,275,100,50);
g.drawArc(20,350,100,50,25,75);
g.fillArc(175,350,100,50,25,75);
}
 public static void main(String[] args)
{
Drawings m= new Drawings();
Frame f =new Frame("Shapes");
f.add(m);
f.setSize(300,450);
f.setVisible(true);
}
}