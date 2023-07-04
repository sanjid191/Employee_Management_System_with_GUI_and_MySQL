
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

/**
 *
 * @author SANJID
 */

public class EmployeePanel extends JFrame implements ActionListener {
    
    JButton Applicatation, Complain, DailyReport, NoticeBoard, Profile, back;
    
    EmployeePanel(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel("Employee Panel");
        add(heading);
        heading.setBounds(350, 50, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        
        
        //Applicatation button
        Applicatation = new JButton(" Application ");
        Applicatation.setBounds(150, 150, 230, 40);
        add(Applicatation);
        Applicatation.setFont(new Font("serif", Font.BOLD, 20));
        Applicatation.setBackground(Color.BLACK);
        Applicatation.setForeground(Color.WHITE);
        Applicatation.addActionListener(this);                  // action
        

         //Complain button
        Complain = new JButton(" Complain ");
        Complain.setBounds(500, 150, 230, 40);
        add(Complain);
        Complain.setFont(new Font("serif", Font.BOLD, 20));
        Complain.setBackground(Color.BLACK);
        Complain.setForeground(Color.WHITE);
        Complain.addActionListener(this);                  // action
        

         //DailyReport button
        DailyReport = new JButton(" Daily Report ");
        DailyReport.setBounds(150, 250, 230, 40);
        add(DailyReport);
        DailyReport.setFont(new Font("serif", Font.BOLD, 20));
        DailyReport.setBackground(Color.BLACK);
        DailyReport.setForeground(Color.WHITE);
        DailyReport.addActionListener(this);                  // action
        
        
         //NoticeBoard button
        NoticeBoard = new JButton(" Notice Board ");
        NoticeBoard.setBounds(500, 250, 230, 40);
        add(NoticeBoard);
        NoticeBoard.setFont(new Font("serif", Font.BOLD, 20));
        NoticeBoard.setBackground(Color.BLACK);
        NoticeBoard.setForeground(Color.WHITE);
        //Applicatation.addActionListener(this);                  // action
        

        //Profile button
        Profile = new JButton(" Profile ");
        Profile.setBounds(330, 350, 250, 40);
        add(Profile);
        Profile.setFont(new Font("serif", Font.BOLD, 20));
        Profile.setBackground(Color.BLACK);
        Profile.setForeground(Color.WHITE);
        Profile.addActionListener(this);                  // action
        
        
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
        
        if(ae.getSource() == Applicatation){
            setVisible(false);
            new ApplicationForm();
        }
        else if (ae.getSource() == Complain) {
            new UnderDevelopment();
        }
        else if (ae.getSource() == DailyReport) {
            
            new UnderDevelopment();
        }
        else if (ae.getSource() == NoticeBoard) {
            
        }
        else if (ae.getSource() == Profile) {
            setVisible(false);
            new EmployeeProfile();
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new SelectionPage();
        }
    }

    
    public static void main(String args[]) {
        new EmployeePanel();
        
    }
}
