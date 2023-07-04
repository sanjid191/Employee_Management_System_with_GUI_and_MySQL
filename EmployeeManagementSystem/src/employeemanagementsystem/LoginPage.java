

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
import java.sql.Connection;

/**
 *
 * @author SANJID
 */

public class LoginPage extends JFrame implements ActionListener{
    String LoginTime;
    JTextField textFieldUserName, textFieldpassword;
    JButton Login, back;
    
    LoginPage(){
        
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        
        //heading
        JLabel heading = new JLabel("Login Page For Admin");
        add(heading);
        heading.setBounds(300, 100, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 45));
        heading.setForeground(Color.BLACK);
        
        
        //username
        JLabel UserName = new JLabel("User Name:");
        UserName.setBounds(300, 210, 200, 30 );
        add(UserName);
        UserName.setFont(new Font("serif", Font.BOLD, 30));
          
        textFieldUserName = new JTextField();
        textFieldUserName.setBounds(480, 213, 250,30);
        add(textFieldUserName);
        
        
        //password 
        JLabel Passwors = new JLabel("Password:");
        Passwors.setBounds(300, 270, 200, 30 );
        add(Passwors);
        Passwors.setFont(new Font("serif", Font.BOLD, 30));
        
        textFieldpassword = new JTextField();
        textFieldpassword.setBounds(480, 273, 250,30);
        add(textFieldpassword);
       
        
        //login button
        Login = new JButton("Login");
        Login.setBounds(530, 350, 200, 50);
        add(Login);
        Login.setFont(new Font("serif", Font.BOLD, 25));
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);                  // action 
        

        //back button
        back = new JButton(" Back ");
        back.setBounds(300, 350, 200, 50);
        add(back);
        back.setFont(new Font("serif", Font.BOLD, 25));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);                  // action 
        
        
        //fream 
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed (ActionEvent ae) {
        
        if(ae.getSource() == Login){
            try{
            
            String userName = textFieldUserName.getText();
            String password = textFieldpassword.getText();
            
            ConnectingDatabase c = new ConnectingDatabase() ; 

            String SQLQuary = "select * from login where username ='"+userName+"' and password = '"+password+"'";
 
            ResultSet Rs = c.s.executeQuery(SQLQuary);
            if (Rs.next()) {
                setVisible(false);
                new AdminPanel();
                Date date = new Date();
                String sql = "insert into AdminLoginInfo (userName,Login_Time_Date) values ('" + userName + "','" + date + "')";
                c.s.executeUpdate(sql);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalide username  password");
                setVisible(false);
            }
            
            
        } catch(Exception e){
            e.printStackTrace();
        }
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new SelectionPage();
        }
    }
    
    
    
    public static void main (String[] args){
        new LoginPage();
    }
}
