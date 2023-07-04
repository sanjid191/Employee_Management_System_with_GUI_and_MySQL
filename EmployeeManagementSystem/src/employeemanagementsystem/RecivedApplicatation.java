
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import java.awt.Choice;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SANJID
 */

public class RecivedApplicatation extends JFrame implements ActionListener {
    
    JTable ApplicationTable; //table 
    JScrollPane ScrollPanel;
    JButton back;
    
    RecivedApplicatation(){
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
    
        //heading
        JLabel heading = new JLabel("All Recived Application ");
        add(heading);
        heading.setBounds(350, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
        
        
        ApplicationTable = new JTable();
        try {
            ConnectingDatabase c = new ConnectingDatabase(); 
            ResultSet LoginData = c.s.executeQuery("select * from Applications");
            
            ApplicationTable.setModel(DbUtils.resultSetToTableModel(LoginData));
   
        } catch (Exception e) {
            e.printStackTrace();
        }

        //ScrollPanel
        ScrollPanel = new JScrollPane(ApplicationTable);
        ScrollPanel.setBounds(90, 125, 800, 600);
        add(ScrollPanel);
       

        //back button
        back = new JButton(" Back ");
        back.setBounds(430, 90, 150, 25);
        add(back);
        back.setFont(new Font("serif", Font.BOLD, 15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);                  // action
        

        //fream
        setSize(1000, 600);
        setLocation(200, 80);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent ae) {
    
        if (ae.getSource() == back) {
            setVisible(false);
            new AdminPanel();
        }
    }
    
    
    
    
    
    public static void main(String[] args){
        new RecivedApplicatation();
    }
}
