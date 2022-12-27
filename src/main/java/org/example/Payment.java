package org.example;

import javax.swing.*;
import java.awt.*;

public class Payment  extends JFrame {
    private JLabel bg;
    private ImageIcon icon;
    private ButtonGroup row;
    private JRadioButton cash;
    private JRadioButton online;
    private JButton confirm;
    private ButtonGroup methods;
    private JRadioButton bikash,nagad,rocket;
    private JLabel select;
    public Payment() throws HeadlessException {
        setTitle("Payment");
        setBounds(0, 0, 1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        icon=new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/bg.png");
        bg=new JLabel("",icon,JLabel.CENTER);
        bg.setBounds(0,0,1000,600);
        add(bg);

        JLabel header2 = new JLabel("PlaySports Payment Getway");
        header2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        header2.setSize(300, 30);
        header2.setLocation(20, 30);
        header2.setForeground(Color.BLUE);
        bg.add(header2);

        row=new ButtonGroup();
        row.add(cash);
        row.add(online);

        cash=new JRadioButton("Cash On Delivery");
        cash.setSize(250,50);
        cash.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        cash.setLocation(500,20);
        cash.setBackground(Color.magenta);
        bg.add(cash);

        online=new JRadioButton("Online Payment");
        online.setSize(250,50);
        online.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        online.setLocation(500,100);
        online.setBackground(Color.magenta);
        bg.add(online);

        paymentMethod();
        confirm.addActionListener((event)->{
            setWarningMsg("Your Order has been\n" +
                    "Placed successfully!");
        });

        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void setWarningMsg(String text){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane optionPane = new JOptionPane(text,JOptionPane.WARNING_MESSAGE);
        JDialog dialog = optionPane.createDialog("Confirmed");
        dialog.setBackground(Color.magenta);

        dialog.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    public void paymentMethod()
    {
        methods=new ButtonGroup();
        methods.add(bikash);
        methods.add(nagad);
        methods.add(rocket);

        select=new JLabel("Please Select Your Payment Method: ");
        select.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        select.setSize(400,20);
        select.setLocation(400,200);
        bg.add(select);

        bikash=new JRadioButton("Bkash");
        bikash.setSize(100,50);
        bikash.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        bikash.setLocation(500,250);
        bikash.setBackground(Color.magenta);
        bg.add(bikash);

        nagad=new JRadioButton("Nagad");
        nagad.setSize(90,50);
        nagad.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        nagad.setLocation(610,250);
        nagad.setBackground(Color.magenta);
        bg.add(nagad);

        rocket=new JRadioButton("Rocket");
        rocket.setSize(100,50);
        rocket.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        rocket.setLocation(710,250);
        rocket.setBackground(Color.magenta);
        bg.add(rocket);

        confirm=new JButton("Confirm Order");
        confirm.setSize(250,50);
        confirm.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        confirm.setLocation(500,320);
        confirm.setBackground(Color.magenta);
        bg.add(confirm);
    }

    public static void main(String[] args) {
        new Payment();
    }
}
