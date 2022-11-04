import java.awt.*;
 public class MenuDemo
{
 MenuDemo()
{
  Frame fr = new Frame("Menu Demo");
   MenuBar mb = new MenuBar();
  Menu fileMenu = new Menu("File");
  Menu editMenu = new Menu("Edit");
    Menu ViewMenu = new Menu("view");
    mb.add(fileMenu);
    mb.add(editMenu); 
    mb.add(viewMenu);
   MenuItem a1 = new MenuItem("New");
   MenuItem a2 = new MenuItem("open");
    MenuItem a3 = new MenuItem("save");
    MenuItem b1 = new MenuItem("copy");
   MenuItem b2= new MenuItem("find");
    MenuItem c1 = new MenuItem("show");
   fileMenu.add(a1);
   fileMenu.add(a2);
  fileMenu.add(a3);
  editMenu.add(b1);
  editMenu.add(b1);
   editMenu.add(b2);
   viewMenu.add(c1);
  fr.setMenuBar(mb);
  fr.setSize(300,300);
  fr.setLayout(null);
   fr.setVisible(true);  
}
public static void main(String args[])
{
new MenuDemo();
}
}



  
    

    


    

    

    


    

    

    
