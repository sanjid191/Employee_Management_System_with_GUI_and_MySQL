
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
import javax.swing.JComboBox;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SANJID
 */


public class SearchEmployee extends JFrame {
    

    SearchEmployee(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
 
        //fream
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);
    }
    

    public static void main(String args[]) {
        new SearchEmployee();
        
    }
}
