

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

public class LoginPageForEmp extends JFrame implements ActionListener{
    
    JTextField textFieldUserName, textFieldpassword;
    JButton Login, back; 
    
    LoginPageForEmp(){
        
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        
        //heading
        JLabel heading = new JLabel("Login Page For Employee");
        add(heading);
        heading.setBounds(280, 100, 1200, 60);
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
            
                String UsersID = textFieldUserName.getText();
                String password = textFieldpassword.getText();

                ConnectingDatabase cd = new ConnectingDatabase() ; 

                String SQLQuary2 = "select * from employeedetails where EmployeeID ='"+UsersID+"' and EmployeeID = '"+password+"'";

                ResultSet Rse = cd.s.executeQuery(SQLQuary2);
                
                if (Rse.next()) {
                    setVisible(false);
                    new EmployeePanel();
                    Date date = new Date();
                    String sql = "insert into EmployeeLoginInfo (UsersID, Login_Time_Date) values ('" + UsersID + "','" + date + "')";
                    cd.s.executeUpdate(sql);
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
        new LoginPageForEmp();
    }
}
