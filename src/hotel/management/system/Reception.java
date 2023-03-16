
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
public class Reception extends JFrame {
    JButton newCustomerRoom,rooms,depertment,employees,customerInfo,mangerInfo,checkout,updateStatus,updateRoomStatus,pickupService,searchRoom,logout;
    Reception(){
        setLayout(null);
        setBounds(100,100,825,550);
        
        newCustomerRoom = new JButton("New Customer Room");
        newCustomerRoom.setBounds(60, 30, 200, 30);
        newCustomerRoom.setBackground(Color.black);
        newCustomerRoom.setFont(new Font("Tahoma", Font.PLAIN,17));
        newCustomerRoom.setForeground(Color.white);
        add(newCustomerRoom);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(60, 70, 200, 30);
        rooms.setBackground(Color.black);
        rooms.setFont(new Font("Tahoma", Font.PLAIN,17));
        rooms.setForeground(Color.white);
        add(rooms);
        
        depertment = new JButton("Depertment");
        depertment.setBounds(60, 110, 200, 30);
        depertment.setBackground(Color.black);
        depertment.setFont(new Font("Tahoma", Font.PLAIN,17));
        depertment.setForeground(Color.white);
        add(depertment);
        
        employees = new JButton("Employees");
        employees.setBounds(60, 150, 200, 30);
        employees.setBackground(Color.black);
        employees.setFont(new Font("Tahoma", Font.PLAIN,17));
        employees.setForeground(Color.white);
        add(employees);
        
        customerInfo = new JButton("Customer Info");
        customerInfo.setBounds(60, 190, 200, 30);
        customerInfo.setBackground(Color.black);
        customerInfo.setFont(new Font("Tahoma", Font.PLAIN,17));
        customerInfo.setForeground(Color.white);
        add(customerInfo);
        
        mangerInfo = new JButton("Manger Info");
        mangerInfo.setBounds(60, 230, 200, 30);
        mangerInfo.setBackground(Color.black);
        mangerInfo.setFont(new Font("Tahoma", Font.PLAIN,17));
        mangerInfo.setForeground(Color.white);
        add(mangerInfo);
        
        checkout = new JButton("Checkout");
        checkout.setBounds(60, 270, 200, 30);
        checkout.setBackground(Color.black);
        checkout.setFont(new Font("Tahoma", Font.PLAIN,17));
        checkout.setForeground(Color.white);
        add(checkout);
        
        updateStatus = new JButton("Update Status");
        updateStatus.setBounds(60, 310, 200, 30);
        updateStatus.setBackground(Color.black);
        updateStatus.setFont(new Font("Tahoma", Font.PLAIN,17));
        updateStatus.setForeground(Color.white);
        add(updateStatus);
        
        updateRoomStatus = new JButton("Update Room Status");
        updateRoomStatus.setBounds(60, 350, 200, 30);
        updateRoomStatus.setBackground(Color.black);
        updateRoomStatus.setFont(new Font("Tahoma", Font.PLAIN,17));
        updateRoomStatus.setForeground(Color.white);
        add(updateRoomStatus);
        
        pickupService = new JButton("Pickup Service");
        pickupService.setBounds(60, 390, 200, 30);
        pickupService.setBackground(Color.black);
        pickupService.setFont(new Font("Tahoma", Font.PLAIN,17));
        pickupService.setForeground(Color.white);
        add(pickupService);
        
        searchRoom = new JButton("Search Room");
        searchRoom.setBounds(60, 430, 200, 30);
        searchRoom.setBackground(Color.black);
        searchRoom.setFont(new Font("Tahoma", Font.PLAIN,17));
        searchRoom.setForeground(Color.white);
        add(searchRoom);
        
        logout = new JButton("Logout");
        logout.setBounds(60, 470, 200, 30);
        logout.setBackground(Color.black);
        logout.setFont(new Font("Tahoma", Font.PLAIN,17));
        logout.setForeground(Color.white);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
       // Image i2 = i1.getImage().getScaledInstance(300, 680,Image.SCALE_DEFAULT);
        //ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(280, 30, 500, 470);
        add(image);
  
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Reception();
    }
}
