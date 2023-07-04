
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author SANJID
 */

public class LoginDetails extends JFrame implements ActionListener{
    
     JButton AdmLogDet,EmpLogDet, back;
    
    LoginDetails(){
        
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel("Login Details");
        add(heading);
        heading.setBounds(280, 70, 500, 100);
        heading.setFont(new Font("serif", Font.BOLD, 80));
        heading.setForeground(Color.BLACK);
        
        //Admin Login Detail button
        AdmLogDet = new JButton("Admin Login Detail");
        AdmLogDet.setBounds(350, 200, 300, 50);
        add(AdmLogDet);
        AdmLogDet.setFont(new Font("serif", Font.BOLD, 25));
        AdmLogDet.setBackground(Color.BLACK);
        AdmLogDet.setForeground(Color.WHITE);
        AdmLogDet.addActionListener(this);                  // action 
        

        //Employee Login Detailbutton
        EmpLogDet = new JButton(" Employee Login Detail ");
        EmpLogDet.setBounds(350, 270, 300, 50);
        add(EmpLogDet);
        EmpLogDet.setFont(new Font("serif", Font.BOLD, 25));
        EmpLogDet.setBackground(Color.BLACK);
        EmpLogDet.setForeground(Color.WHITE);
        EmpLogDet.addActionListener(this);                  // action 

        
        //back button
        back = new JButton(" Back ");
        back.setBounds(750, 450, 150, 30);
        add(back);
        back.setFont(new Font("serif", Font.BOLD, 25));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);                  // action 
        
        
        //fream 
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed (ActionEvent ae) {
        if(ae.getSource() == AdmLogDet){
            setVisible(false);
            new AdminLoginDetails();
        }
        else if (ae.getSource() == EmpLogDet) {
            setVisible(false);
            new EmployeeLoginDetails();
            
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new AdminPanel();
        }
    }
    
    
    public static void main (String[] args){
        new LoginDetails();
    }
}
