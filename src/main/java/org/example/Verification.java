package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;


public class Verification extends JFrame{
    private JLabel background;
    private ImageIcon icon;
    private JLabel title;
    private JLabel header1;
    private JLabel header2;
    private JLabel iconic;

    private JTextField otp;

    private JButton get_otp;

    private static final String OTP="153870";



    private JButton verify;
    private JButton resend;
    private JLabel footer;

    public Verification() throws IOException {
        setTitle("Verification");
        setBounds(0, 0, 1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Background Design Section
        icon=new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/background.jpg");
        background=new JLabel("",icon,JLabel.CENTER);
        background.setBounds(0,0,1000,600);
        add(background);

        //Header Section
        header1 = new JLabel("For Varification we’re sending you an OTP!");
        header1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        header1.setSize(500, 30);
        header1.setLocation(450, 100);
        header1.setForeground(Color.WHITE);
        background.add(header1);
        //Second Header section
        header1 = new JLabel("To get the OTP Press");
        header1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        header1.setSize(240, 30);
        header1.setLocation(450, 130);
        header1.setForeground(Color.WHITE);
        background.add(header1);

        //get opt btn
        get_otp=new JButton("GET OTP");
        get_otp.setBackground(Color.GREEN);
        get_otp.setSize(100,30);
        get_otp.setLocation(690,130);
        background.add(get_otp);
        //header 2
        header2=new JLabel("Now fill the OTP in the Box...");
        header2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        header2.setSize(350, 30);
        header2.setLocation(450, 200);
        header2.setForeground(Color.WHITE);
        background.add(header2);

        //opt section
        title=new JLabel("OTP: ");
        title.setFont(new Font(Font.MONOSPACED, Font.BOLD, 28));
        title.setSize(200,50);
        title.setLocation(450,230);
        title.setForeground(Color.WHITE);
        background.add(title);


        //Otp text feild

        otp=new JTextField();
        otp.setSize(200,30);
        otp.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        otp.setLocation(530,240);
        background.add(otp);


        //verify button setup
        verify=new JButton("Verify");
        verify.setSize(100,50);
        verify.setBackground(Color.GREEN);
        verify.setLocation(630,280);
        background.add(verify);


        //footer secttion
        footer=new JLabel("If you’re facing problems then Press");
        footer.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        footer.setSize(400, 30);
        footer.setLocation(450, 340);
        footer.setForeground(Color.WHITE);
        background.add(footer);

        //resend btn
        resend=new JButton("RESEND OTP");
        resend.setBackground(Color.GREEN);
        resend.setSize(130,30);
        resend.setLocation(850,340);
        background.add(resend);

        iconic=new JLabel();
        iconic.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/img_1.png"));
        iconic.setSize(new Dimension(300,250));
        iconic.setLocation(0,0);
        background.add(iconic);



        setLayout(null);
        setResizable(false);
        setVisible(true);




    }

    public static void main(String args[]) {
        try {
            new Verification();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
