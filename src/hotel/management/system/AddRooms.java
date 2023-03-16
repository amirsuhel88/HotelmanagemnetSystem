
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener{
   
   JTextField tfroomnumber,tfprice;
   JButton addroom,cancel;
   JComboBox cbavailable,cbbedtype,cbclean;
   
   AddRooms(){
       setLayout(null);
       setBounds(100,100,860,380);
       
       JLabel lblroomnumber = new JLabel("Room Number");
       lblroomnumber.setBounds(60,30,120,30);
       lblroomnumber.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblroomnumber);
       
       tfroomnumber = new JTextField();
       tfroomnumber.setBounds(200, 30, 150, 30);
       add(tfroomnumber);
       
       
       
       
       JLabel lblavailable = new JLabel("Available");
       lblavailable.setBounds(60,80,120,30);
       lblavailable.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblavailable);
       
       String stravailable[] = {"Empty", "Full"};
       cbavailable = new JComboBox(stravailable);
       cbavailable.setBounds(200, 80, 150, 30);
       cbavailable.setBackground(Color.white);
       cbavailable.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(cbavailable);
       
       JLabel lblcleaningstatus = new JLabel("Cleaning Status");
       lblcleaningstatus.setBounds(60,130,120,30);
       lblcleaningstatus.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblcleaningstatus);
       
       String strclean[] = {"Cleaned", "Dirty"};
       cbclean = new JComboBox(strclean);
       cbclean.setBounds(200, 130, 150, 30);
       cbclean.setBackground(Color.white);
       cbclean.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(cbclean);
       
       JLabel lblprice = new JLabel("Price");
       lblprice.setBounds(60,180,120,30);
       lblprice.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblprice);
       
       tfprice = new JTextField();
     //  tfprice = new JTextField();
       tfprice.setBounds(200, 180, 150, 30);
       add(tfprice);
       
       JLabel lblbedtype = new JLabel("Bed Type");
       lblbedtype.setBounds(60,230,120,30);
       lblbedtype.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblbedtype);
       
       String strbedtype[] = {"Single", "Double"};
       cbbedtype = new JComboBox(strbedtype);
       cbbedtype.setBounds(200, 230, 150, 30);
       cbbedtype.setBackground(Color.white);
       cbbedtype.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(cbbedtype);
       
       addroom = new JButton("Add Room");
       addroom.setBounds(60,280,150,30);
       addroom.setBackground(Color.black);
       addroom.setForeground(Color.white);
       addroom.addActionListener(this);
       add(addroom);
       
       cancel = new JButton("Cancel");
       cancel.setBounds(230,280,150,30);
       cancel.setBackground(Color.black);
       cancel.setForeground(Color.white);
       cancel.addActionListener(this);
       add(cancel);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
       Image i2 = i1.getImage().getScaledInstance(600, 450,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(380, 30, 450, 230);
       add(image);
       
       getContentPane().setBackground(Color.white);
       setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== addroom){
           String roomnumber = tfroomnumber.getText();
           String availability = (String) cbavailable.getSelectedItem();
           String  status = (String) cbclean.getSelectedItem();
           String price = tfprice.getText();
           String type = (String) cbbedtype.getSelectedItem();
           
           try{
               Conn conn = new Conn();
               String str = "insert into room values('"+roomnumber+"','"+availability+"','"+status+"','"+price+"','"+type+"')";
               conn.s.executeUpdate(str);
               JOptionPane.showMessageDialog(null, "New Rooom added successfully");
               setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
       }else {
           setVisible(false);
       }
   }
    
   public static void main(String[] args) {
       new AddRooms();
   }
}
