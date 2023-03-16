
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AddDriver extends JFrame implements ActionListener {
    JTextField tfname, tfage,tfcompany,tfmodel, tflocation;
       JComboBox cbavailable, cbgender;
       JButton adddriver,cancel;
    AddDriver(){
       setLayout(null);
       setBounds(100,100,860,500); 
        
       JLabel lblname = new JLabel("Name");
       lblname.setBounds(60,30,120,30);
       lblname.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblname);
       
       tfname = new JTextField();
       tfname.setBounds(200, 30, 150, 30);
       add(tfname);
        
       JLabel lblage = new JLabel("Age");
       lblage.setBounds(60,80,120,30);
       lblage.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblage);
       
       tfage = new JTextField();
       tfage.setBounds(200, 80, 150, 30);
       add(tfage);
       
       
       JLabel lblgender = new JLabel("Gender");
       lblgender.setBounds(60,130,120,30);
       lblgender.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblgender);
       
       String strgender[] = {"Male", "Female"};
       cbgender = new JComboBox(strgender);
       cbgender.setBounds(200, 130, 150, 30);
       cbgender.setFont(new Font("Tahoma", Font.PLAIN,17));
       cbgender.setBackground(Color.white);
       add(cbgender);
       
       JLabel lblcompany = new JLabel("Car Company");
       lblcompany.setBounds(60,180,120,30);
       lblcompany.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblcompany);
       
       tfcompany = new JTextField();
       tfcompany.setBounds(200, 180, 150, 30);
       add(tfcompany);
       
       JLabel lblmodel = new JLabel("Model");
       lblmodel.setBounds(60,230,120,30);
       lblmodel.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblmodel);
       
       tfmodel = new JTextField();
       tfmodel.setBounds(200, 230, 150, 30);
       add(tfmodel);
       
       JLabel lblavailable = new JLabel("Available");
       lblavailable.setBounds(60,280,120,30);
       lblavailable.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lblavailable);
       
       String stravailable[] = {"Available", "Not Available"};
       cbavailable = new JComboBox(stravailable);
       cbavailable.setFont(new Font("Tahoma", Font.PLAIN,17));
       cbavailable.setBackground(Color.white);
       cbavailable.setBounds(200, 280, 150 , 30);
       add(cbavailable);
       
       JLabel lbllocation = new JLabel("Location");
       lbllocation.setBounds(60,330,120,30);
       lbllocation.setFont(new Font("Tahoma",Font.PLAIN,17));
       add(lbllocation);
       
       tflocation = new JTextField();
       tflocation.setBounds(200, 330, 150, 30);
       add(tflocation);
       
       adddriver = new JButton("Add");
       adddriver.setBounds(60,380,120,30);
       adddriver.setBackground(Color.BLACK);
       adddriver.setForeground(Color.white);
       adddriver.setFont(new Font("Tahoma",Font.BOLD,17));
       adddriver.addActionListener(this);
       add(adddriver);
       
       cancel = new JButton("Cancel");
       cancel.setBounds(200,380,120,30);
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.white);
       cancel.setFont(new Font("Tahoma",Font.BOLD,17));
       cancel.addActionListener(this);
       add(cancel);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
       Image i2 = i1.getImage().getScaledInstance(600, 450,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(380, 30, 450, 328);
       add(image);
       
       getContentPane().setBackground(Color.white);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==adddriver){
           String name = tfname.getText();
           String age = tfage.getText();
           String gender = (String) cbgender.getSelectedItem();
           String company = tfcompany.getText();
           String model = tfmodel.getText();
           String available = (String) cbavailable.getSelectedItem();
           String location = tflocation.getText();
           
           try{
               Conn conn = new Conn();
               String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+model+"','"+available+"','"+location+"')";
               conn.s.executeUpdate(str);
               JOptionPane.showMessageDialog(null, "New Driver added successfully");
               setVisible(false);
           }catch(Exception e){
               e.printStackTrace();
           }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddDriver();
        
    }
}
