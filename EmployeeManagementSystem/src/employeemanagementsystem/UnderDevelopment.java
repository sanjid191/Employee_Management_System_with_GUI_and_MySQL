
package employeemanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

/**
 *
 * @author SANJID
 */

public class UnderDevelopment extends JFrame implements ActionListener {
    
    JButton back;
    
    UnderDevelopment(){
    
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel(" !!!!! Under Development !!!!! ");
        add(heading);
        heading.setBounds(290, 50, 1200, 40);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        heading.setForeground(Color.RED);
        
        JLabel Messa1 = new JLabel(" This feature is under Development. ");
        add(Messa1);
        Messa1.setBounds(330, 140, 1200, 30);
        Messa1.setFont(new Font("serif", Font.BOLD, 20));
        Messa1.setForeground(Color.BLACK);
        
        JLabel Messa2 = new JLabel(" We are working on it to add this feature as soon as possible. ");
        add(Messa2);
        Messa2.setBounds(220, 175, 1200, 30);
        Messa2.setFont(new Font("serif", Font.BOLD, 20));
        Messa2.setForeground(Color.BLACK);
        
        JLabel Messa3 = new JLabel(" Stay with us to get the best experience. ");
        add(Messa3);
        Messa3.setBounds(320, 210, 1200, 30);
        Messa3.setFont(new Font("serif", Font.BOLD, 20));
        Messa3.setForeground(Color.BLACK);
        
        JLabel Messa4 = new JLabel(" Thank you. ");
        add(Messa4);
        Messa4.setBounds(400, 250, 1200, 40);
        Messa4.setFont(new Font("serif", Font.BOLD, 30));
        Messa4.setForeground(Color.BLACK);
        
        //back button
        back = new JButton(" Back");
        back.setBounds(400, 350, 150, 30);
        add(back);
        back.setFont(new Font("serif", Font.BOLD, 20));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);                   // action
        
        //fream
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);

    }

    @Override
    public void actionPerformed (ActionEvent ae) {
        
        if(ae.getSource() == back){
            setVisible(false);
            
        }
    }

    public static void main(String args[]) {
        new UnderDevelopment();
    }
}
