package Employee.Management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {

        /*--------set the background color of Frame---------*/
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        /*--------Set the Heading of Project title-----------*/
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.darkGray);
        add(heading);

        /*-----------set the image in the Frame ----------------*/
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        /*------------create continue button--------------------*/
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 420, 200, 40);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);

        /*-----this is the first step where we are creating the Frame -------*/
        setSize(1170, 640);
        setLocation(60, 30);
        setVisible(true);

        /*---------set the default closer -------------------*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*----this while loop is representing the blinking effection of Heading----------- */
/*
//       while(true) {
//            heading.setVisible(false);
//            try {
//                Thread.sleep(800);
//            } catch (Exception e){
//
//            }
//
//            heading.setVisible(true);
//            try {
//                Thread.sleep(500);
//            } catch (Exception e){
//
//            }
//        }
*/


    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();
    }
}