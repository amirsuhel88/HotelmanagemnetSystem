package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class AddCustomer extends JFrame {
    JTextField tfnumber,tfname,tfcountry, tfdeposit;
    JComboBox cbid,cballocatedRoomNumber;
    JRadioButton rbmale, rbfemale;
    Choice croom;
    JButton addCustomer, back;
    AddCustomer(){
        setLayout(null);
        setBounds(100,100,700,600);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(60,30,120,30);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblid);
        
        String strid[] = {"Passport","Voter ID","PAN card","ADHAAR Card", "Driving Lisence"};
        cbid = new JComboBox(strid);
        cbid.setBounds(240,30,150,30);
        cbid.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(cbid);
                
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(60,80,120,30);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(240, 80, 150, 30);
        add(tfnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60,130,120,30);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(240, 130, 150, 30);
        add(tfname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60,180,120,30);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblgender);
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(240,180,80,30);
        rbmale.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(320,180,120,30);
        rbfemale.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(rbfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(60,230,120,30);
        lblcountry.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(240, 230, 150, 30);
        add(tfcountry);
        
        JLabel lblallotedRoomNumber = new JLabel("Alloted Room Number");
        lblallotedRoomNumber.setBounds(60,280,165,30);
        lblallotedRoomNumber.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblallotedRoomNumber);
        
        croom = new Choice();
        try{
            Conn conn = new Conn();
            String query = "Select * from room";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                croom.add(rs.getString("roomnumber"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        croom.setBounds(240,280,150,30);
        add(croom);
        
        JLabel lblcheckInTime = new JLabel("Check-In Time");
        lblcheckInTime.setBounds(60,330,120,30);
        lblcheckInTime.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(lblcheckInTime);
        
        Date date = new Date();
        JLabel time = new JLabel(""+date);
        time.setBounds(240,330,250,30);
       // lblcheckInTime.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(time);
        
        
        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(60,380,120,30);
        deposit.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(deposit);
        
        tfdeposit = new JTextField();
        tfdeposit.setBounds(240, 380, 150, 30);
        add(tfdeposit);
        
        addCustomer = new JButton("Add Customer");
        addCustomer.setBounds(60, 450, 150, 30);
        addCustomer.setBackground(Color.black);
        addCustomer.setForeground(Color.white);
        addCustomer.setFont(new Font("Tahoma", Font.BOLD,16));
        add(addCustomer);
        
        back = new JButton("Back");
        back.setBounds(230,450,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma", Font.BOLD,16));
        add(back);
        
        setVisible(true);
    }
    
    public static void main(String []args){
        new AddCustomer();
    }
}
