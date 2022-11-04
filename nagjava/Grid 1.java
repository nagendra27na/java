    import java.awt.*;
import java.applet.*;
public class Grid extends Applet
{
  public void paint(Graphics g)
  {
int row,column,x,y=20;
//for(row=1;row<5;row++)
{
 x=20;
//for every column
for(column=1;column<5; column++)
{
  g.drawRect(x,y,40,40);
  x= x + 20;
    y=y+20;
  }
}
}
