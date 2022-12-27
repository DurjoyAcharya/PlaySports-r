package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class Size extends JFrame {
    private JLabel bg;
    private JButton back;
    private JButton buy;
    private JLabel Fanlavel;
    private ImageIcon icon;
    private JLabel title;
    private JLabel des;

    private JRadioButton small,medium,l,xl;
    private ButtonGroup row;
    private JLabel select;
    public Size() throws HeadlessException{
        setTitle("Select Size");
        setBounds(0, 0, 1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        icon=new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/bg.png");
        bg=new JLabel("",icon,JLabel.CENTER);
        bg.setBounds(0,0,1000,600);
        add(bg);


        title=new JLabel("Product");
        title.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
        title.setSize(100,30);
        title.setForeground(Color.BLACK);
        title.setLocation(500,50);
        bg.add(title);

        des=new JLabel("Argentina 2022 FIFA WORLD CUP " +
                "Jersey");
        des.setForeground(Color.BLACK);
        des.setSize(450,20);
        des.setLocation(400,90);
        des.setFont(new Font(Font.MONOSPACED,Font.PLAIN,20));
        bg.add(des);


        des=new JLabel("Price: ");
        des.setForeground(Color.BLACK);
        des.setSize(450,20);
        des.setLocation(400,120);
        des.setFont(new Font(Font.MONOSPACED,Font.PLAIN,20));
        bg.add(des);

        des=new JLabel("1520TK;");
        des.setForeground(Color.BLACK);
        des.setSize(450,20);
        des.setLocation(480,120);
        des.setFont(new Font(Font.MONOSPACED,Font.PLAIN,20));
        bg.add(des);


        Font font=new Font(Font.MONOSPACED,Font.PLAIN,20);
        Map atr=font.getAttributes();
        atr.put(TextAttribute.STRIKETHROUGH,TextAttribute.STRIKETHROUGH_ON);
        des=new JLabel("1900TK");
        des.setForeground(Color.BLACK);
        des.setSize(450,20);
        des.setLocation(560,120);
        des.setFont(new Font(atr));
        bg.add(des);

        des=new JLabel("(20% Discount)");
        des.setForeground(Color.BLACK);
        des.setSize(450,20);
        des.setLocation(630,120);
        des.setFont(new Font(Font.MONOSPACED,Font.PLAIN,20));
        bg.add(des);

        back=new JButton("BACK");
        back.setBackground(Color.ORANGE);
        back.setSize(100,50);
        back.setLocation(450,260);
        back.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        bg.add(back);


        buy=new JButton("NEXT");
        buy.setBackground(Color.ORANGE);
        buy.setSize(100,50);
        buy.setLocation(580,260);
        buy.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        bg.add(buy);

        Fanlavel=new JLabel(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/fanjercy.jpg"));
        Fanlavel.setSize(200,200);
        Fanlavel.setLocation(140,70);
        bg.add(Fanlavel);

        //select size radio buttom setup
        select=new JLabel("select your size :");
        select.setSize(200,20);
        select.setFont(new Font(Font.MONOSPACED,Font.PLAIN,18));
        select.setLocation(450,160);
        bg.add(select);


        row=new ButtonGroup();
        row.add(small);
        row.add(medium);
        row.add(l);
        row.add(xl);


        small=new JRadioButton("S");
        small.setSize(40,20);
        small.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        small.setLocation(450,200);
        small.setBackground(Color.YELLOW);
        bg.add(small);

        medium=new JRadioButton("M");
        medium.setSize(40,20);
        medium.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        medium.setLocation(500,200);
        medium.setBackground(Color.YELLOW);
        bg.add(medium);

        l=new JRadioButton("L");
        l.setSize(40,20);
        l.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        l.setLocation(550,200);
        l.setBackground(Color.YELLOW);
        bg.add(l);

        xl=new JRadioButton("XL");
        xl.setSize(50,20);
        xl.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        xl.setLocation(600,200);
        xl.setBackground(Color.YELLOW);
        bg.add(xl);


        setVisible(true);

    }

    public static void main(String[] args) {
        new Size();
    }
}
