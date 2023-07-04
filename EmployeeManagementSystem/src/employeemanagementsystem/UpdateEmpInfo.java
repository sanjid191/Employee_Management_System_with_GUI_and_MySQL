
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JComboBox;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author SANJID
 */

public class UpdateEmpInfo extends JFrame implements ActionListener {
    
    
    JTextField textFieldEmployeeName, textFieldEmployeeAge,textFieldDepartmente,textFieldPosition,textFieldEducataation;
    JTextField textFieldEmployeeFathersName,textFieldEmployeeSalary,textFieldEmployeeAdress,textFieldEmployeephoneNumber,textFieldEmployeeEmail;
    JLabel EmployeeID,IDofEmployee ;
   
   
    JButton SaveButton,BackButton;
    String employeeID;
    
   
    
    
    UpdateEmpInfo(String employeeID){
        this.employeeID = employeeID;
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        
        //heading
        JLabel heading = new JLabel("Updating Employee Detail");
        add(heading);
        heading.setBounds(330, 20, 900, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        
        
        //EmployeeName
        JLabel EmployeeName = new JLabel("Name:");
        EmployeeName.setBounds(50, 100, 200, 20 );
        add(EmployeeName);
        EmployeeName.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel EmpName = new JLabel();
        EmpName.setBounds(170, 103, 250,20);
        add(EmpName);
        
    
        
        //EmployeeAge
        JLabel EmployeeAge = new JLabel("Age:");
        EmployeeAge.setBounds(50, 130, 200, 20 );
        add(EmployeeAge);
        EmployeeAge.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeeAge = new JTextField();
        textFieldEmployeeAge.setBounds(170, 133, 250,20);
        add(textFieldEmployeeAge);
        
        
        
        //Department
        JLabel Department = new JLabel("Department:");
        Department.setBounds(50, 160, 200, 20 );
        add(Department);
        Department.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldDepartmente = new JTextField();
        textFieldDepartmente.setBounds(170, 163, 250,20);
        add(textFieldDepartmente);
        
        
        //Position / post
        JLabel Position = new JLabel("Position:");
        Position.setBounds(50, 190, 200, 20 );
        add(Position);
        Position.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldPosition = new JTextField();
        textFieldPosition.setBounds(170, 193, 250,20);
        add(textFieldPosition);
        
        
        //date of birth
        JLabel dateofBirth = new JLabel("Dath of Birth:");
        dateofBirth.setBounds(50, 220, 200, 20 );
        add(dateofBirth);
        dateofBirth.setFont(new Font("serif", Font.BOLD, 20));
          
        JLabel dateofbirth = new JLabel();
        dateofbirth.setBounds(170, 223, 250,20);
        add(dateofbirth);
       
       
        //Gender
        JLabel Gender = new JLabel("Gender:");
        Gender.setBounds(50, 250, 200, 20 );
        add(Gender);
        Gender.setFont(new Font("serif", Font.BOLD, 20));

        
        
        JLabel Gender1 = new JLabel();
        Gender1.setBounds(170, 253, 250,20);
        add(Gender1);
        

        //-----------        Right part   --------------------------------------------------
        
        
        //Employee Father Name
        JLabel EmployeeFathersName = new JLabel("Father's Name:");
        EmployeeFathersName.setBounds(500, 100, 200, 20 );
        add(EmployeeFathersName);
        EmployeeFathersName.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeeFathersName = new JTextField();
        textFieldEmployeeFathersName.setBounds(650, 103, 250,20);
        add(textFieldEmployeeFathersName);
        
        
        //Employee Salary
        JLabel EmployeeSalary = new JLabel("Salary:");
        EmployeeSalary.setBounds(500, 130, 200, 20 );
        add(EmployeeSalary);
        EmployeeSalary.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeeSalary = new JTextField();
        textFieldEmployeeSalary.setBounds(650, 133, 250,20);
        add(textFieldEmployeeSalary);
        

        //Employee Adress
        JLabel EmployeeAdress = new JLabel("Adress:");
        EmployeeAdress.setBounds(500, 160, 200, 20 );
        add(EmployeeAdress);
        EmployeeAdress.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeeAdress = new JTextField();
        textFieldEmployeeAdress.setBounds(650, 163, 250,20);
        add(textFieldEmployeeAdress);
        
        
        //Employee phoneNumber
        JLabel EmployeephoneNumber = new JLabel("Phone Number:");
        EmployeephoneNumber.setBounds(500, 190, 200, 20 );
        add(EmployeephoneNumber);
        EmployeephoneNumber.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeephoneNumber = new JTextField();
        textFieldEmployeephoneNumber.setBounds(650, 193, 250,20);
        add(textFieldEmployeephoneNumber);
        
        
        //Employee Email
        JLabel EmployeephoneEmail = new JLabel("Email:");
        EmployeephoneEmail.setBounds(500, 220, 200, 20 );
        add(EmployeephoneEmail);
        EmployeephoneEmail.setFont(new Font("serif", Font.BOLD, 20));
          
        textFieldEmployeeEmail = new JTextField();
        textFieldEmployeeEmail.setBounds(650, 223, 250,20);
        add(textFieldEmployeeEmail);
        
        
        //Employee Educatation
        JLabel EmployeeEducatation = new JLabel("Educatation:");
        EmployeeEducatation.setBounds(500, 250, 200, 20 );
        add(EmployeeEducatation);
        EmployeeEducatation.setFont(new Font("serif", Font.BOLD, 20));
          
        
        JLabel FieldEducataation = new JLabel();
        FieldEducataation.setBounds(650, 253, 250,20);
        add(FieldEducataation);
        

        //Employee ID
        EmployeeID = new JLabel("Employee ID: ");
        EmployeeID.setBounds(50, 300, 200, 20 );
        add(EmployeeID);
        EmployeeID.setFont(new Font("serif", Font.BOLD, 20));
        
        IDofEmployee = new JLabel();
        IDofEmployee.setBounds(170, 300, 200, 20 );
        add(IDofEmployee);
        IDofEmployee.setFont(new Font("serif", Font.BOLD, 20));
        
        
        try {
            
            ConnectingDatabase c = new ConnectingDatabase();
            String SQLUuary = " select * from employeedetails where employeeID = '"+employeeID+"'";
            ResultSet Employeedata = c.s.executeQuery(SQLUuary);
            
            while(Employeedata.next()){
                EmpName.setText(Employeedata.getString("Name"));
                textFieldEmployeeAge.setText(Employeedata.getString("Age"));
                textFieldDepartmente.setText(Employeedata.getString("Department"));
                textFieldPosition.setText(Employeedata.getString("Position"));
                dateofbirth.setText(Employeedata.getString("DateOfBirth"));
                Gender1.setText(Employeedata.getString("Gender"));
                textFieldEmployeeFathersName.setText(Employeedata.getString("FatherName"));
                textFieldEmployeeSalary.setText(Employeedata.getString("Selary"));
                textFieldEmployeeAdress.setText(Employeedata.getString("Address"));
                //textFieldEmployeeAdress.setText(Employeedata.getString("Namr"));
                textFieldEmployeephoneNumber.setText(Employeedata.getString("PhoneNumber"));
                textFieldEmployeeEmail.setText(Employeedata.getString("Email"));
                FieldEducataation.setText(Employeedata.getString("Educatation"));
                IDofEmployee.setText(Employeedata.getString("EmployeeID"));
                
                
                
                
            }
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        

        //Save Button
        SaveButton = new JButton(" Update ");
        SaveButton.setBounds(500, 450, 150, 30);
        add(SaveButton);
        SaveButton.setFont(new Font("serif", Font.BOLD, 20));
        SaveButton.setBackground(Color.BLACK);
        SaveButton.setForeground(Color.WHITE);
        SaveButton.addActionListener(this);                  // action 
        
        
        //Back Button
        BackButton = new JButton(" BACK ");
        BackButton.setBounds(330, 450, 150, 30);
        add(BackButton);
        BackButton.setFont(new Font("serif", Font.BOLD, 20));
        BackButton.setBackground(Color.BLACK);
        BackButton.setForeground(Color.WHITE);
        BackButton.addActionListener(this);                  // action 
        

        //fream
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);
        
    }
    

    @Override
    public void actionPerformed (ActionEvent ae) {
        if(ae.getSource() == SaveButton){
            
            String Age = textFieldEmployeeAge.getText();
            String Department = textFieldDepartmente.getText();
            String Position = textFieldPosition.getText();
            
            String FatherName = textFieldEmployeeFathersName.getText() ;
            String Selery = textFieldEmployeeSalary.getText();
            String Adress = textFieldEmployeeAdress.getText();
            String PhoneNumber = textFieldEmployeephoneNumber.getText() ;
            String Email = textFieldEmployeeEmail.getText() ;
            //String Educatation = textFieldEducataation.getText();
           
            
          
            
            try {
                ConnectingDatabase connection = new ConnectingDatabase();
                String SQLQuaryDetailEntry = " Update EmployeeDetails set Age = '"+Age+"' , FatherName ='"+FatherName+"' , Department = '"+Department+"' , Position = '"+Position+"' , Selary ='"+Selery+"' , Address = '"+Adress+"' , PhoneNumber = '"+PhoneNumber+"' , Email = '"+Email+"' where employeeID = '"+employeeID+"'";
                connection.s.executeUpdate(SQLQuaryDetailEntry);
                JOptionPane.showMessageDialog(null, "Employee Details Update succussfully");
                setVisible(false);
                new AdminPanel(); 
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
            new AdminPanel();
        }
    }
    
    
    public static void main(String args[]) {
        new UpdateEmpInfo("");
        
    }
}
