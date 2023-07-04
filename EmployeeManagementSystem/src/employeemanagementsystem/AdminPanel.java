
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


public class AdminPanel extends JFrame implements ActionListener{
    
    JButton add, deletee,edit , seeAll, search, SendNotice, RecivedApplicatation,back,LoginDetails;
    
    
    
    AdminPanel(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel("Admin Panel");
        add(heading);
        heading.setBounds(350, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        
        
        //add button
        add = new JButton(" ADD ");
        add.setBounds(150, 120, 250, 30);
        add(add);
        add.setFont(new Font("serif", Font.BOLD, 20));
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);                  // action
        
        
        // delete button
        deletee = new JButton(" DELETE ");
        deletee.setBounds(500, 120, 250, 30);
        add(deletee);
        deletee.setFont(new Font("serif", Font.BOLD, 20));
        deletee.setBackground(Color.BLACK);
        deletee.setForeground(Color.WHITE);
        deletee.addActionListener(this);                  // action
        
        
        // edit button
        edit = new JButton(" EDIT ");
        edit.setBounds(100, 200, 200, 30);
        add(edit);
        edit.setFont(new Font("serif", Font.BOLD, 20));
        edit.setBackground(Color.BLACK);
        edit.setForeground(Color.WHITE);
        edit.addActionListener(this);                  // action
        
        
        // seeAll button
        seeAll = new JButton(" SEE ALL ");
        seeAll.setBounds(350, 200, 200, 30);
        add(seeAll);
        seeAll.setFont(new Font("serif", Font.BOLD, 20));
        seeAll.setBackground(Color.BLACK);
        seeAll.setForeground(Color.WHITE);
        seeAll.addActionListener(this);                  // action
        
        
        // search button
        search = new JButton(" SEARCH ");
        search.setBounds(600, 200, 200, 30);
        add(search);
        search.setFont(new Font("serif", Font.BOLD, 20));
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);                  // action
        
        
        //SendNotice button
        SendNotice = new JButton(" Send Notice ");
        SendNotice.setBounds(150, 280, 250, 30);
        add(SendNotice);
        SendNotice.setFont(new Font("serif", Font.BOLD, 20));
        SendNotice.setBackground(Color.BLACK);
        SendNotice.setForeground(Color.WHITE);
        SendNotice.addActionListener(this);                  // action
        
        
        //RecivedApplicatation button
        RecivedApplicatation = new JButton(" Recived Applicatation ");
        RecivedApplicatation.setBounds(500, 280, 250, 30);
        add(RecivedApplicatation);
        RecivedApplicatation.setFont(new Font("serif", Font.BOLD, 20));
        RecivedApplicatation.setBackground(Color.BLACK);
        RecivedApplicatation.setForeground(Color.WHITE);
        RecivedApplicatation.addActionListener(this);                  // action
        
        
        // LoginDetails button
        LoginDetails = new JButton(" Login Details ");
        LoginDetails.setBounds(350, 350, 200, 30);
        add(LoginDetails);
        LoginDetails.setFont(new Font("serif", Font.BOLD, 20));
        LoginDetails.setBackground(Color.BLACK);
        LoginDetails.setForeground(Color.WHITE);
        LoginDetails.addActionListener(this);                  // action
        

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
        if(ae.getSource() == add){
            setVisible(false);
            new EmployeeAddPanel();
        }
        else if (ae.getSource() == deletee) {
            setVisible(false);
            new DeleteEmployee();
        }
        else if (ae.getSource() == edit) {
            setVisible(false);
            new AllEmployess();
        }
        else if (ae.getSource() == seeAll) {
            setVisible(false);
            new AllEmployess();
        }
        else if (ae.getSource() == search) {
            new UnderDevelopment();
        }
        else if (ae.getSource() == SendNotice) {
            new UnderDevelopment();
        }
        else if (ae.getSource() == RecivedApplicatation) {
            setVisible(false);
            new RecivedApplicatation();
        }
        else if (ae.getSource() == LoginDetails) {
            setVisible(false);
            new LoginDetails();
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new SelectionPage();
        }
    }
    
    
    public static void main(String args[]) {
        new AdminPanel();
        
    }
}
