package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class RegistrationScreen extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel firstame;

    private JLabel lastname;


    private JLabel pass;

    private JTextField tname;
    private JTextField lname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;


    private JRadioButton admin;
    private JRadioButton customer;
    private ButtonGroup rolegp;

    private JPasswordField jPasswordField;



    private ButtonGroup gengp;
    private JLabel dob;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JLabel icon;
    private JLabel res;
    private JTextArea resadd;

    private JLabel background;
    private ImageIcon iconImage;


    // constructor, to initialize the components
    // with default values.
    public RegistrationScreen() throws IOException {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


       //background section
        iconImage=new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/background.jpg");
        background=new JLabel("",iconImage,JLabel.CENTER);
        background.setBounds(0,0,1000,600);
        add(background);


       // setBackground();
//        getContentPane().setBackground(new Color(241,5,90));
        title = new JLabel("CREATE  AN  ACCOUNT");
        title.setFont(new Font(Font.MONOSPACED, Font.BOLD, 24));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        title.setForeground(Color.WHITE);


        background.add(title);

        icon=new JLabel();
        icon.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/img.png"));
        icon.setSize(new Dimension(250,300));
        icon.setLocation(520,100);
        background.add(icon);

        firstame = new JLabel("First Name:");
        firstame.setFont(new Font("Arial", Font.PLAIN, 20));
        firstame.setSize(150, 30);
        firstame.setLocation(100, 100);
        firstame.setForeground(Color.WHITE);
        background.add(firstame);

        lastname = new JLabel("Last Name:");
        lastname.setFont(new Font("Arial", Font.PLAIN, 20));
        lastname.setSize(150, 30);
        lastname.setLocation(100, 150);
        lastname.setForeground(Color.WHITE);
        background.add(lastname);




        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(240, 30);
        tname.setLocation(215, 100);
        background.add(tname);


        lname = new JTextField();
        lname.setFont(new Font("Arial", Font.PLAIN, 15));
        lname.setSize(240, 30);
        lname.setLocation(215, 150);
        background.add(lname);






        //password feild
        pass = new JLabel("Password:");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(120, 20);
        pass.setLocation(100, 200);
        background.add(pass);
        pass.setForeground(Color.WHITE);

        jPasswordField=new JPasswordField();
        jPasswordField.setSize(240, 30);
        jPasswordField.setLocation(215, 200);
        background.add(jPasswordField);


        mno = new JLabel("Mobile:");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 250);
        background.add(mno);
        mno.setForeground(Color.WHITE);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(240, 30);
        tmno.setLocation(215, 250);
        background.add(tmno);

        gender = new JLabel("Role: ");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 300);
        gender.setForeground(Color.WHITE);
        background.add(gender);

        male = new JRadioButton("Admin");
        male.setFont(new Font("Arial", Font.PLAIN, 20));
        male.setSelected(true);
        male.setSize(100, 20);

        male.setLocation(215, 300);
        background.add(male);

        female = new JRadioButton("Customer");
        female.setFont(new Font("Arial", Font.PLAIN, 20));
        female.setSelected(false);
        female.setSize(150, 20);
        female.setLocation(335, 300);
        background.add(female);

        admin = new JRadioButton("Male");
        admin.setFont(new Font("Arial", Font.PLAIN, 20));
        admin.setSelected(false);
        admin.setSize(80, 20);
        admin.setLocation(215, 340);
        background.add(admin);


        customer = new JRadioButton("Female");
        customer.setFont(new Font("Arial", Font.PLAIN, 20));
        customer.setSelected(false);
        customer.setSize(100, 20);
        customer.setLocation(315, 340);
        background.add(customer);

        rolegp=new ButtonGroup();
        rolegp.add(admin);
        rolegp.add(customer);


        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);


        dob = new JLabel("Gender: ");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 340);
        dob.setForeground(Color.WHITE);
        background.add(dob);


        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(210, 380);
        background.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 30);
        sub.setLocation(210, 410);
        sub.addActionListener(this);
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        background.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 30);
        reset.setLocation(330, 410);
        reset.setBackground(Color.GREEN);
        reset.setForeground(Color.black);
        reset.addActionListener(this);
        background.add(reset);

//        tout = new JTextArea();
//        tout.setFont(new Font("Arial", Font.PLAIN, 15));
//        tout.setSize(300, 400);
//        tout.setLocation(500, 100);
//        tout.setLineWrap(true);
//        tout.setEditable(false);
//        c.add(tout);

//        res = new JLabel("");
//        res.setFont(new Font("Arial", Font.PLAIN, 20));
//        res.setSize(500, 25);
//        res.setLocation(100, 500);
//        c.add(res);
//
//        resadd = new JTextArea();
//        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
//        resadd.setSize(200, 75);
//        resadd.setLocation(580, 175);
//        resadd.setLineWrap(true);
//        c.add(resadd);

        setVisible(true);
    }


    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + tname.getText() + "\n"
                        + "Mobile : "
                        + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";


                String data3 = "Address : " + tadd.getText();
//                tout.setText(data + data1 + data2 + data3);
//                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
//                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
  //          tout.setText(def);
            term.setSelected(false);
          resadd.setText(def);
        }
    }
}
