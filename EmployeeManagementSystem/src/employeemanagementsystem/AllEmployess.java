
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

public class AllEmployess extends JFrame implements ActionListener {
    
    JScrollPane ScrollPanel;
    Choice employeeID;
    JButton EmployeeSearchButton, TablePrintButton, UpdateButton, backButton;
    
    JTable EmployeeDetailTable; //table 
    

    public AllEmployess() {
        getContentPane().setBackground(Color.gray);
        setLayout(null);

        
        //heading
        JLabel heading = new JLabel("Employee Database");
        add(heading);
        heading.setBounds(550, 10, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 37));
        heading.setForeground(Color.BLACK);
        

        EmployeeDetailTable = new JTable();
        try {
            ConnectingDatabase c = new ConnectingDatabase(); 
            ResultSet AllEmployeeData = c.s.executeQuery("select * from EmployeeDetails");
            
            EmployeeDetailTable.setModel(DbUtils.resultSetToTableModel(AllEmployeeData));
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        //Searce 
        JLabel EmployeeSearch = new JLabel("Search by Name:");
        EmployeeSearch.setBounds(20, 75, 150, 35);
        EmployeeSearch.setFont(new Font("serif", Font.BOLD, 20));
        add(EmployeeSearch);
        
        
        employeeID = new Choice();
        employeeID.setBounds(175, 83, 150, 60);
        add(employeeID);
        
        try {
            ConnectingDatabase c = new ConnectingDatabase(); 
            ResultSet AllEmployeeData = c.s.executeQuery("select * from EmployeeDetails");
            while(AllEmployeeData.next()){
                employeeID.add(AllEmployeeData.getString("Name")); //find by id employeeID  Name
                employeeID.add(AllEmployeeData.getString("employeeID")); //find by id employeeID  Name
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        
        //ScrollPanel
        ScrollPanel = new JScrollPane(EmployeeDetailTable);
        ScrollPanel.setBounds(10, 125, 1370, 600);
        add(ScrollPanel);
        
        
        //search
        EmployeeSearchButton = new JButton(" Search ");
        EmployeeSearchButton.setBounds(360, 80, 150, 25);
        add(EmployeeSearchButton);
        EmployeeSearchButton.setFont(new Font("serif", Font.BOLD, 15));
        EmployeeSearchButton.setBackground(Color.BLACK);
        EmployeeSearchButton.setForeground(Color.WHITE);
        EmployeeSearchButton.addActionListener(this);                  // action 
        
        
        //Print
        TablePrintButton = new JButton(" Print ");
        TablePrintButton.setBounds(530, 80, 150, 25);
        add(TablePrintButton);
        TablePrintButton.setFont(new Font("serif", Font.BOLD, 15));
        TablePrintButton.setBackground(Color.BLACK);
        TablePrintButton.setForeground(Color.WHITE);
        TablePrintButton.addActionListener(this);                  // action 
        
        
        //Update
        UpdateButton = new JButton(" Update ");
        UpdateButton.setBounds(700, 80, 150, 25);
        add(UpdateButton);
        UpdateButton.setFont(new Font("serif", Font.BOLD, 15));
        UpdateButton.setBackground(Color.BLACK);
        UpdateButton.setForeground(Color.WHITE);
        UpdateButton.addActionListener(this);                  // action 
        
        
        //Back
        backButton = new JButton(" Back ");
        backButton.setBounds(870, 80, 150, 25);
        add(backButton);
        backButton.setFont(new Font("serif", Font.BOLD, 15));
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);                  // action 
        

        //fream
        setSize(1400, 600);
        setLocation(70, 60);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent ae) {
        
        if(ae.getSource() == EmployeeSearchButton){
            //setVisible(false);
            String EmployeeSearchQuary = " select * from EmployeeDetails where Name = '"+ employeeID.getSelectedItem()+"'";
            
            try {
                ConnectingDatabase c = new ConnectingDatabase(); 
                ResultSet EmployeeData = c.s.executeQuery(EmployeeSearchQuary);
                EmployeeDetailTable.setModel(DbUtils.resultSetToTableModel(EmployeeData));
                        
        
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else if (ae.getSource() == TablePrintButton) {
            
            try {
                EmployeeDetailTable.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        else if (ae.getSource() == UpdateButton) {
            setVisible(false);
            new UpdateEmpInfo(employeeID.getSelectedItem());
        }
        else if (ae.getSource() == backButton) {
            setVisible(false);
            new AdminPanel();
        }
    }

    
    public static void main(String[] args){
        new AllEmployess();
    }
}
