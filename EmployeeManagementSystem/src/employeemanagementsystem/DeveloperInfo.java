
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

public class DeveloperInfo extends JFrame implements ActionListener {
    
    
    JButton back;
   
    DeveloperInfo(){
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel("Developer Informatation ");
        add(heading);
        heading.setBounds(350, 30, 1200, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
    
        // Adding details
        JLabel DBy = new JLabel(" Developed By, ");
        DBy.setBounds(70, 100, 500, 30 );
        add(DBy);
        DBy.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Name = new JLabel(" Name: Sanjid Ahmmed ");
        Name.setBounds(90, 130, 500, 20 );
        add(Name);
        Name.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Dep = new JLabel(" Department: Computer Science And Enginnering ");
        Dep.setBounds(90, 160, 500, 20 );
        add(Dep);
        Dep.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel ID = new JLabel(" Id: 221902368 ");
        ID.setBounds(90, 190, 400, 20 );
        add(ID);
        ID.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel Ins = new JLabel(" Green University of Bangladesh ");
        Ins.setBounds(90, 220, 500, 20 );
        add(Ins);
        Ins.setFont(new Font("serif", Font.BOLD, 20));
        
        JLabel ContuctInfo = new JLabel(" Email: sanjid.sa191@gmail.com  ||  Phone: 01867044436");
        ContuctInfo.setBounds(90, 250, 800, 30 );
        add(ContuctInfo);
        ContuctInfo.setFont(new Font("serif", Font.BOLD, 20));
        
        
        //Instructor info
        JLabel InsBy = new JLabel(" Instructed By, ");
        InsBy.setBounds(70, 300, 500, 20 );
        add(InsBy);
        InsBy.setFont(new Font("serif", Font.BOLD, 20));
        InsBy.setForeground(Color.BLACK);
        
        JLabel InsName = new JLabel(" Dr. Muhammad Aminur Rahaman ");
        InsName.setBounds(130, 330, 700, 20 );
        add(InsName);
        InsName.setFont(new Font("serif", Font.BOLD, 20));
        InsName.setForeground(Color.BLACK);
        
        JLabel InsPos = new JLabel(" (Associate Professor and Campus Director, PC, GUB) ");
        InsPos.setBounds(250, 360, 700, 20 );
        add(InsPos);
        InsPos.setFont(new Font("serif", Font.BOLD, 15));
        InsPos.setForeground(Color.BLACK);
        
        
        //back button
        back = new JButton(" Back ");
        back.setBounds(450, 500, 150, 30);
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
        
        setVisible(false);
        new WelcomePage();
        
    }
    
    public static void main(String args[]) {
        new DeveloperInfo();
        
    }
}
