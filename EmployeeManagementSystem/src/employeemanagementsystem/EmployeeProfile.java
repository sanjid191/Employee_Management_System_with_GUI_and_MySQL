
package employeemanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author SANJID
 */


public class EmployeeProfile extends JFrame implements ActionListener{
    
    //JTextField textFieldEmployeeID;
    //JLabel EmployeeID,IDofEmployee ;
    Choice EmpID;
    JButton  back;
    
    EmployeeProfile(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
    
        //heading
        JLabel heading = new JLabel("Employee Profile");
        add(heading);
        heading.setBounds(400, 20, 1200, 40);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
        
        
        //Employee ID
        JLabel EmployeeID = new JLabel("Enter ID:");
        EmployeeID.setBounds(50, 100, 100, 20 );
        add(EmployeeID);
        EmployeeID.setFont(new Font("serif", Font.BOLD, 20));
        
        
        EmpID = new Choice();
        EmpID.setBounds(200, 103, 200, 20 );
        add(EmpID);
        
      
        try {
            
            ConnectingDatabase c = new ConnectingDatabase();
            String SQLUuary = " select * from employeedetails ";
            ResultSet Employeedata = c.s.executeQuery(SQLUuary);
            
            while (Employeedata.next()) {
                EmpID.add(Employeedata.getString("EmployeeID")); // add Name EmployeeID
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        //EmployeeName
        JLabel EmployeeName = new JLabel("Name:");
        EmployeeName.setBounds(50, 150, 200, 20 );
        add(EmployeeName);
        EmployeeName.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeeName = new JLabel();
        FieldEmployeeName.setBounds(170, 153, 250,20);
        add(FieldEmployeeName);
        FieldEmployeeName.setFont(new Font("serif", Font.BOLD, 20));
        FieldEmployeeName.setForeground(Color.YELLOW);
    
        
        //EmployeeAge
        JLabel EmployeeAge = new JLabel("Age:");
        EmployeeAge.setBounds(50, 180, 200, 20 );
        add(EmployeeAge);
        EmployeeAge.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeeAge = new JLabel();
        FieldEmployeeAge.setBounds(170, 183, 250,20);
        add(FieldEmployeeAge);
        FieldEmployeeAge.setFont(new Font("serif", Font.BOLD, 20));
        
        
        //Department
        JLabel Department = new JLabel("Department:");
        Department.setBounds(50, 210, 200, 20 );
        add(Department);
        Department.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldDepartmente = new JLabel();
        FieldDepartmente.setBounds(170, 213, 250,20);
        add(FieldDepartmente);
        FieldDepartmente.setFont(new Font("serif", Font.BOLD, 20));
        
        //Position / post
        JLabel Position = new JLabel("Position:");
        Position.setBounds(50, 240, 200, 20 );
        add(Position);
        Position.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldPosition = new JLabel();
        FieldPosition.setBounds(170, 243, 250,20);
        add(FieldPosition);
        FieldPosition.setFont(new Font("serif", Font.BOLD, 20));
        
        //date of birth
        JLabel dateofBirth = new JLabel("Dath of Birth:");
        dateofBirth.setBounds(50, 270, 200, 20 );
        add(dateofBirth);
        dateofBirth.setFont(new Font("serif", Font.BOLD, 20));
          
        
        JLabel dateofbirth = new JLabel();
        dateofbirth.setBounds(170, 273, 250,20);
        add(dateofbirth);
        dateofbirth.setFont(new Font("serif", Font.BOLD, 20));
       
        //Gender
        JLabel Gender = new JLabel("Gender:");
        Gender.setBounds(50, 300, 200, 20 );
        add(Gender);
        Gender.setFont(new Font("serif", Font.BOLD, 20));

        
        JLabel Gender1 = new JLabel();
        Gender1.setBounds(170, 303, 250,20);
        add(Gender1);
        Gender1.setFont(new Font("serif", Font.BOLD, 20));

        //-----------        Right part   --------------------------------------------------
        
        
        //Employee Father Name
        JLabel EmployeeFathersName = new JLabel("Father's Name:");
        EmployeeFathersName.setBounds(500, 150, 200, 20 );
        add(EmployeeFathersName);
        EmployeeFathersName.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeeFathersName = new JLabel();
        FieldEmployeeFathersName.setBounds(650, 153, 250,20);
        add(FieldEmployeeFathersName);
        FieldEmployeeFathersName.setFont(new Font("serif", Font.BOLD, 20));
        
        //Employee Salary
        JLabel EmployeeSalary = new JLabel("Salary:");
        EmployeeSalary.setBounds(500, 180, 200, 20 );
        add(EmployeeSalary);
        EmployeeSalary.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeeSalary = new JLabel();
        FieldEmployeeSalary.setBounds(650, 183, 250,20);
        add(FieldEmployeeSalary);
        FieldEmployeeSalary.setFont(new Font("serif", Font.BOLD, 20));

        //Employee Adress
        JLabel EmployeeAdress = new JLabel("Adress:");
        EmployeeAdress.setBounds(500, 210, 200, 20 );
        add(EmployeeAdress);
        EmployeeAdress.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeeAdress = new JLabel();
        FieldEmployeeAdress.setBounds(650, 213, 250,20);
        add(FieldEmployeeAdress);
        FieldEmployeeAdress.setFont(new Font("serif", Font.BOLD, 20));
        
        //Employee phoneNumber
        JLabel EmployeephoneNumber = new JLabel("Phone Number:");
        EmployeephoneNumber.setBounds(500, 240, 200, 20 );
        add(EmployeephoneNumber);
        EmployeephoneNumber.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeephoneNumber = new JLabel();
        FieldEmployeephoneNumber.setBounds(650, 243, 250,20);
        add(FieldEmployeephoneNumber);
        FieldEmployeephoneNumber.setFont(new Font("serif", Font.BOLD, 20));
        
        //Employee Email
        JLabel EmployeephoneEmail = new JLabel("Email:");
        EmployeephoneEmail.setBounds(500, 270, 200, 20 );
        add(EmployeephoneEmail);
        EmployeephoneEmail.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEmployeeEmail = new JLabel();
        FieldEmployeeEmail.setBounds(650, 273, 250,20);
        add(FieldEmployeeEmail);
        FieldEmployeeEmail.setFont(new Font("serif", Font.BOLD, 20));
        
        //Employee Educatation
        JLabel EmployeeEducatation = new JLabel("Educatation:");
        EmployeeEducatation.setBounds(500, 300, 200, 20 );
        add(EmployeeEducatation);
        EmployeeEducatation.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel FieldEducataation = new JLabel();
        FieldEducataation.setBounds(650, 303, 250,20);
        add(FieldEducataation);
        FieldEducataation.setFont(new Font("serif", Font.BOLD, 20));

        
        
        //Employee ID
        JLabel EmployeeeID = new JLabel("Employee ID: ");
        EmployeeeID.setBounds(50, 353, 200, 20 );
        add(EmployeeeID);
        EmployeeeID.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel IDofEmployee = new JLabel();
        IDofEmployee.setBounds(170, 353, 200, 20 );
        add(IDofEmployee);
        IDofEmployee.setFont(new Font("serif", Font.BOLD, 20));
        IDofEmployee.setForeground(Color.YELLOW);
        
        
        
        
        try {
            
            ConnectingDatabase c = new ConnectingDatabase();
            String SQLUuary = " select * from employeedetails where employeeID = '"+EmpID.getSelectedItem()+"'";
            ResultSet Employeedata = c.s.executeQuery(SQLUuary);
            
            while (Employeedata.next()) {
                FieldEmployeeName.setText(Employeedata.getString("Name"));
                FieldEmployeeAge.setText(Employeedata.getString("Age"));
                FieldDepartmente.setText(Employeedata.getString("Department"));
                FieldPosition.setText(Employeedata.getString("Position"));
                dateofbirth.setText(Employeedata.getString("DateOfBirth"));
                Gender1.setText(Employeedata.getString("Gender"));
                FieldEmployeeFathersName.setText(Employeedata.getString("FatherName"));
                FieldEmployeeSalary.setText(Employeedata.getString("Selary"));
                FieldEmployeeAdress.setText(Employeedata.getString("Address"));
                FieldEmployeephoneNumber.setText(Employeedata.getString("PhoneNumber"));
                FieldEmployeeEmail.setText(Employeedata.getString("Email"));
                FieldEducataation.setText(Employeedata.getString("Educatation"));
                IDofEmployee.setText(Employeedata.getString("EmployeeID"));
                
                
                
                        
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        //Have to comment out from here to 
        
        EmpID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent io) {
                try {
    
                    ConnectingDatabase c = new ConnectingDatabase();
                    String SQLUuary = " select * from employeedetails where employeeID = '"+EmpID.getSelectedItem()+"'";
                    ResultSet Employeedata = c.s.executeQuery(SQLUuary);

                    while (Employeedata.next()) {
                        FieldEmployeeName.setText(Employeedata.getString("Name"));
                        FieldEmployeeAge.setText(Employeedata.getString("Age"));
                        FieldDepartmente.setText(Employeedata.getString("Department"));
                        FieldPosition.setText(Employeedata.getString("Position"));
                        dateofbirth.setText(Employeedata.getString("DateOfBirth"));
                        Gender1.setText(Employeedata.getString("Gender"));
                        FieldEmployeeFathersName.setText(Employeedata.getString("FatherName"));
                        FieldEmployeeSalary.setText(Employeedata.getString("Selary"));
                        FieldEmployeeAdress.setText(Employeedata.getString("Address"));
                        FieldEmployeephoneNumber.setText(Employeedata.getString("PhoneNumber"));
                        FieldEmployeeEmail.setText(Employeedata.getString("Email"));
                        FieldEducataation.setText(Employeedata.getString("Educatation"));
                        IDofEmployee.setText(Employeedata.getString("EmployeeID"));
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
    
        
        // cooment out here
       
        
        

        //back button
        back = new JButton(" Back ");
        back.setBounds(400, 400, 200, 30);
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
       
       if (ae.getSource() == back) {
            setVisible(false);
            new EmployeePanel();
        }
    
    
    
    }
    
    
    
    
    public static void main(String args[]) {
        new EmployeeProfile();
        
    }
}
