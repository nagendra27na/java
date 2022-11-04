import java.awt.*;
import java.awt.event.*;

public class button
{
   public static void main(String[] args)
   {
   Frame f=new Frame("Button Events");
   Label I= new Label("DETAILS OF PARENTS");
  I.setFont(new Font("Calibri*,Font.Bold,16));
  Label n1=new Label();
  Label d1 =new Label();
  Label a1 =new Label();
  I.setBounds(20,20,500,50);
  n1.setBounds(20,20,500,50);
  d1.setBounds(20,20,500,50); 
  a1.setBounds(20,20,500,50);
  Buttonmb =new Button("Mother");
  mb.setBounds(20,70,50,30);
  mb.addActionListener(new Action Listener(){
   public void actionPerformed(ActionEvent e) {
    n1.set Text("Name:"+"  "+"Aishwarya");
    d1.setText("DESTGNATION:"+" "+"Aishwarya");
    
