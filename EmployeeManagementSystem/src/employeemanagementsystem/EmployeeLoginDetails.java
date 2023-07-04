
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

public class EmployeeLoginDetails extends JFrame implements ActionListener {
    
    JTable EmployeeLoginTable; //table 
    JScrollPane ScrollPanel;
    JButton  TablePrintButton,back;
    
    EmployeeLoginDetails(){
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
         //heading
        JLabel heading = new JLabel("Employee Login Details ");
        add(heading);
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 37));
        heading.setForeground(Color.BLACK);
        
        EmployeeLoginTable = new JTable();
        try {
            ConnectingDatabase c = new ConnectingDatabase(); 
            ResultSet LoginData = c.s.executeQuery("select * from EmployeeLoginInfo"); 
            
            EmployeeLoginTable.setModel(DbUtils.resultSetToTableModel(LoginData));
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        //ScrollPanel
        ScrollPanel = new JScrollPane(EmployeeLoginTable);
        ScrollPanel.setBounds(90, 125, 800, 600);
        add(ScrollPanel);
       
        
        //Print
        TablePrintButton = new JButton(" Print ");
        TablePrintButton.setBounds(300, 90, 150, 25);
        add(TablePrintButton);
        TablePrintButton.setFont(new Font("serif", Font.BOLD, 15));
        TablePrintButton.setBackground(Color.BLACK);
        TablePrintButton.setForeground(Color.WHITE);
        TablePrintButton.addActionListener(this);                  // action 
        
        
        //back button
        back = new JButton(" Back ");
        back.setBounds(500, 90, 150, 25);
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
    
        if (ae.getSource() == TablePrintButton) {
            
            try {
                EmployeeLoginTable.print();
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new LoginDetails();
        }
    }
    
    
    
    public static void main(String[] args){
        new EmployeeLoginDetails();
    }
    
    
}
