
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author SANJID
 */

public class ApplicationForm  extends JFrame implements ActionListener {
    
    JButton Send, back;
    JTextArea textAreaApplication;
    JTextField textFieldEmployeeName;
    
    ApplicationForm(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel(" Application Form ");
        add(heading);
        heading.setBounds(300, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        
        
        
        //Applicant Name
        JLabel EmployeeName = new JLabel("Name:");
        EmployeeName.setBounds(60, 130, 200, 20 );
        add(EmployeeName);
        EmployeeName.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeeName = new JTextField();
        textFieldEmployeeName.setBounds(170, 133, 250,20);
        add(textFieldEmployeeName);
        
        
        //Application 
        JLabel Application = new JLabel(" Write Application Bellow :");
        Application.setBounds(60, 180, 400, 20 );
        add(Application);
        Application.setFont(new Font("serif", Font.BOLD, 20));
          
        textAreaApplication = new JTextArea();
        textAreaApplication.setBounds(60, 220, 850,200);
        add(textAreaApplication);
        
        
        
        //Send Button
        Send = new JButton(" Send ");
        Send.setBounds(550, 450, 150, 30);
        add(Send);
        Send.setFont(new Font("serif", Font.BOLD, 25));
        Send.setBackground(Color.RED);
        Send.setForeground(Color.WHITE);
        Send.addActionListener(this);                  // action
        
        
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
        
        if(ae.getSource() == Send){
            String EmpName = textFieldEmployeeName.getText();
            String Appli = textAreaApplication.getText();
            
             try {
                ConnectingDatabase connection = new ConnectingDatabase();
                String SQLQuaryDetailEntry = " insert into Applications values ('"+EmpName+"','"+Appli+"')";
                connection.s.executeUpdate(SQLQuaryDetailEntry);
                JOptionPane.showMessageDialog(null, "Application succussfully Send");
                setVisible(false);
                new EmployeePanel(); 
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new EmployeePanel();
        }
        
    
    
    }
    
    
    
    
    
    public static void main(String args[]) {
        new ApplicationForm();
        
    }
    
}
