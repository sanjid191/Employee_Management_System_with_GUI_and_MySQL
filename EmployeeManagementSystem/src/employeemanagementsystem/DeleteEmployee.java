
package employeemanagementsystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author SANJID
 */


public class DeleteEmployee extends JFrame implements ActionListener{
    
    JTextField textFieldEmployeeID;
    Choice EmpID;
    JButton Delete, back;
    
    DeleteEmployee(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
    
        //heading
        JLabel heading = new JLabel("Employee Detail Remove Panel");
        add(heading);
        heading.setBounds(250, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        
        
        //Employee ID
        JLabel EmployeeID = new JLabel("Enter ID:");
        EmployeeID.setBounds(50, 100, 100, 20 );
        add(EmployeeID);
        EmployeeID.setFont(new Font("serif", Font.BOLD, 20));
        
        
        EmpID = new Choice();
        EmpID.setBounds(200, 103, 200, 20 );
        add(EmpID);
        
        /*textFieldEmployeeID = new JTextField();
        textFieldEmployeeID.setBounds(200, 103, 200, 20 );
        add(textFieldEmployeeID);*/
        
        
        try {
            
            ConnectingDatabase c = new ConnectingDatabase();
            String SQLUuary = " select * from employeedetails ";
            ResultSet Employeedata = c.s.executeQuery(SQLUuary);
            
            while (Employeedata.next()) {
                EmpID.add(Employeedata.getString("EmployeeID")); // add Name
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        //Employee Name
        JLabel EmployeeName = new JLabel("Age:");
        EmployeeName.setBounds(50, 130, 100, 20 );
        add(EmployeeName);
        EmployeeName.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Name = new JLabel();
        Name.setBounds(180, 130, 300, 20 );
        add(Name);
        Name.setFont(new Font("serif", Font.BOLD, 20));
        
        
        //Employee Department
        JLabel EmployeeDept = new JLabel("Department:");
        EmployeeDept.setBounds(50, 160, 120, 20 );
        add(EmployeeDept);
        EmployeeDept.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Dept = new JLabel();
        Dept.setBounds(180, 160, 300, 20 );
        add(Dept);
        Dept.setFont(new Font("serif", Font.BOLD, 20));
        
        //Employee Phone
        JLabel EmployeePhone = new JLabel("Phone:");
        EmployeePhone.setBounds(50, 190, 100, 20 );
        add(EmployeePhone);
        EmployeePhone.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Phone = new JLabel();
        Phone.setBounds(180, 190, 300, 20 );
        add(Phone);
        Phone.setFont(new Font("serif", Font.BOLD, 20));
        
        
        //Employee Email
        JLabel EmployeeEmail = new JLabel("Email:");
        EmployeeEmail.setBounds(50, 220, 100, 20 );
        add(EmployeeEmail);
        EmployeeEmail.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Email = new JLabel();
        Email.setBounds(180, 220, 300, 20 );
        add(Email);
        Email.setFont(new Font("serif", Font.BOLD, 20));
        
        
        //Employee ID
        /*JLabel EmployeeID = new JLabel("Enter ID:");
        EmployeeID.setBounds(50, 100, 100, 20 );
        add(EmployeeID);
        EmployeeID.setFont(new Font("serif", Font.BOLD, 20));
        */
        
        try {
            
            ConnectingDatabase c = new ConnectingDatabase();
            String SQLUuary = " select * from employeedetails where employeeID = '"+EmpID.getSelectedItem()+"'";
            ResultSet Employeedata = c.s.executeQuery(SQLUuary);
            
            while (Employeedata.next()) {
                Name.setText(Employeedata.getString("Name"));
                //Name.setText(Employeedata.getString("Name"));
                Dept.setText(Employeedata.getString("Department"));
                Phone.setText(Employeedata.getString("PhoneNumber"));
                Email.setText(Employeedata.getString("Email"));
                        
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        EmpID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent io) {
                try {
    
                    ConnectingDatabase c = new ConnectingDatabase();
                    String SQLUuary = " select * from employeedetails where employeeID = '"+EmpID.getSelectedItem()+"'";
                    ResultSet Employeedata = c.s.executeQuery(SQLUuary);

                    while (Employeedata.next()) {
                        Name.setText(Employeedata.getString("Name"));
                        //Name.setText(Employeedata.getString("Name"));
                        Dept.setText(Employeedata.getString("Department"));
                        Phone.setText(Employeedata.getString("PhoneNumber"));
                        Email.setText(Employeedata.getString("Email"));

                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
    
       
        
        //Delete button
        Delete = new JButton("Delete");
        Delete.setBounds(530, 450, 200, 30);
        add(Delete);
        Delete.setFont(new Font("serif", Font.BOLD, 25));
        Delete.setBackground(Color.BLACK);
        Delete.setForeground(Color.WHITE);
        Delete.addActionListener(this);                  // action 
        

        //back button
        back = new JButton(" Back ");
        back.setBounds(300, 450, 200, 30);
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
        if(ae.getSource() == Delete){
            
            try {
                ConnectingDatabase c = new ConnectingDatabase();
                String SQLUuary = " delete from employeedetails where employeeID = '"+EmpID.getSelectedItem()+"'";
                
                int rowsAffected = c.s.executeUpdate(SQLUuary);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Employee Info Deleted Successfully");
                    setVisible(false);
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Employee Info Not Found");
                }
                
                /*
                c.s.executeQuery(SQLUuary);
                JOptionPane.showMessageDialog(null, "Employee Info Deleted succussfully");
                */
                
                setVisible(false);
                new AdminPanel();
                
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new AdminPanel();
        }
    
    
    
    }
    
    
    
    
    public static void main(String args[]) {
        new DeleteEmployee();
        
    }
}
