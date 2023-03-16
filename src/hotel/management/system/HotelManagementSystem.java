package hotel.management.system;
//import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class HotelManagementSystem extends JFrame implements ActionListener {

   HotelManagementSystem(){
      //setSize(1366,565);
     // setLocation(100,100);
     setBounds(100,100,1366,565);
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
      JLabel image = new JLabel(i1);
      image.setBounds(0,0,1366,565);    //x,y,l,b
      add(image);
      
      JLabel text = new JLabel("Hotel Management System");
      text.setBounds(20,20,700,60);
      text.setForeground(Color.white);
     // text.setFont(new Font("serif",font.PLAIN,70)); 
      text.setFont(new Font("serif",Font.PLAIN,50));
      image.add(text);
      
      JLabel offer = new JLabel("30% OFF");
      offer.setBounds(620,25,600,60);
      offer.setForeground(Color.red);
      offer.setFont(new Font("serif",Font.ITALIC,30));
      image.add(offer);
      
      JButton next = new JButton("Next");
      next.setBounds(1100,450,150,50);
      next.setBackground(Color.yellow);
      next.setForeground(Color.black);
      next.setFont(new Font("serif",Font.BOLD,20));
      next.addActionListener(this);
      image.add(next);
      
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       while(true){
           offer.setVisible(false);
           try{
               Thread.sleep(500);
           }catch(Exception e){
               e.printStackTrace();
               
           }
           offer.setVisible(true);
           try {
               Thread.sleep(500);
           }catch(Exception e){
               e.printStackTrace();
           }
       }    
   }
   public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new Login();
   }
   
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
