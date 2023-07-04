
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

/**
 *
 * @author SANJID
 */

public class SelectionPage extends JFrame implements ActionListener {

    JButton adminLogin,empoloyeeLogin,back;
    
    public SelectionPage() {
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        
        //heading
        JLabel heading = new JLabel("LOGIN");
        add(heading);
        heading.setBounds(250, 70, 1200, 150);
        heading.setFont(new Font("serif", Font.BOLD, 150));
        heading.setForeground(Color.BLACK);
        
        
        //selection Button
                // for admin
        adminLogin = new JButton("As Admin");
        adminLogin.setBounds(400, 250, 200, 50);
        add(adminLogin);
        adminLogin.setFont(new Font("serif", Font.BOLD, 20));
        adminLogin.setBackground(Color.BLACK);
        adminLogin.setForeground(Color.WHITE);
        adminLogin.addActionListener(this);                         //adding action
        
        //for employee
        empoloyeeLogin = new JButton("As Employee");
        empoloyeeLogin.setBounds(400, 350, 200, 50);
        add(empoloyeeLogin);
        empoloyeeLogin.setFont(new Font("serif", Font.BOLD, 20));
        empoloyeeLogin.setBackground(Color.BLACK);
        empoloyeeLogin.setForeground(Color.WHITE);
        empoloyeeLogin.addActionListener(this);                     //adding action
        
        
        //back button
        back = new JButton(" Back");
        back.setBounds(400, 450, 200, 50);
        add(back);
        back.setFont(new Font("serif", Font.BOLD, 20));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);                   // action
        
        
        //fream 
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent ae) {
  
        
        if(ae.getSource() == adminLogin){
            setVisible(false);
            new LoginPage();
        }
        else if (ae.getSource() == empoloyeeLogin) {
            setVisible(false);
            new LoginPageForEmp();
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new WelcomePage();
        }
    }

    
    public static void main(String[] args) {
        new SelectionPage();
    }
    
}
