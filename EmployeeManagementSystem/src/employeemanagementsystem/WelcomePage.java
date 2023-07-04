 
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

/**
 *
 * @author SANJID
 */

public class WelcomePage extends JFrame implements ActionListener{
    
    JButton Login,Detail;  
    
    WelcomePage() {
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        setTitle("Employee Managment Syatem... Developed by -- SANJID AHMMED");
        
  
        //heading
        JLabel heading = new JLabel("Employee Management System");
        add(heading);
        heading.setBounds(150, 100, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 50));
        heading.setForeground(Color.BLACK);
        
        // heading 02
        JLabel welcome = new JLabel("Welcome");
        add(welcome);
        welcome.setBounds(300, 210, 1200, 80);
        welcome.setFont(new Font("serif", Font.BOLD, 100));
        welcome.setForeground(Color.BLACK);
        
        
        //button
        Login = new JButton(" Cleck hear to Login ");
        Login.setBounds(410, 350, 180, 50);
        add(Login);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);                   // action
        
        
        //Detail info button
        Detail = new JButton(" Developer Details ");
        Detail.setBounds(830, 10, 150, 20);
        add(Detail);
        Detail.setBackground(Color.BLACK);
        Detail.setForeground(Color.WHITE);
        Detail.addActionListener(this);                   // action
        
        
        //fream
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);

    }
     
    
    @Override
    public void actionPerformed (ActionEvent ae) {
        
        if(ae.getSource() == Login){
            setVisible(false);
            new SelectionPage();
        }
        else if (ae.getSource() == Detail) {
            setVisible(false);
            new DeveloperInfo();
        }
    }

    public static void main(String args[]) {
        new WelcomePage();
    }
}
