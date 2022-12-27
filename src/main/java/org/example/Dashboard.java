package org.example;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    private ImageIcon icon;

    private JLabel background;

    private JLabel title;

    private JButton Indoor;
    private JButton Outdoor;


    private JButton Aboutus;
    private JButton blog;
    private JButton pages;
    private JButton contact;
    private JButton shortCode;



    private JLabel iconic;

    private JLabel discount;

    ///product demo
    private JButton ball;
    private JButton cricket;
    private JButton jercy;
    private JButton chess;
    private JButton board;

    private JButton ludo;






    public Dashboard() throws HeadlessException {
        setTitle("Dashboard");
        setBounds(0, 0, 1000, 600);



        //Background Section
        icon=new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/background.jpg");
        background=new JLabel("",icon,JLabel.CENTER);
        background.setBounds(0,0,1000,600);
        add(background);


        //title section
        title=new JLabel("PlaySports");
        title.setFont(new Font(Font.MONOSPACED, Font.BOLD, 32));
        title.setSize(300, 40);
        title.setLocation(450, 30);
        title.setForeground(Color.WHITE);
        background.add(title);


        //indoor btn
        Indoor=new JButton("Indoor Games");
        Indoor.setBackground(Color.GREEN);
        Indoor.setSize(180,50);
        Indoor.setLocation(400,100);
        Indoor.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        background.add(Indoor);

        //outdoor btn
        Outdoor=new JButton("Outdoor Games");
        Outdoor.setBackground(Color.GREEN);
        Outdoor.setSize(180,50);
        Outdoor.setLocation(600,100);
        Outdoor.setFont(new Font(Font.MONOSPACED,Font.BOLD,18));
        background.add(Outdoor);

        //icon
        iconic=new JLabel();
        iconic.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/ball.png"));
        iconic.setSize(new Dimension(150,150));
        iconic.setLocation(20,30);
        background.add(iconic);

        //man iconic
        iconic=new JLabel();
        iconic.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/man.png"));
        iconic.setSize(new Dimension(50,50));
        iconic.setLocation(20,200);
        background.add(iconic);


        //About Buttom
        Aboutus=new JButton("About Us");
        Aboutus.setSize(100,30);
        Aboutus.setLocation(70,210);
        Aboutus.setBackground(Color.GREEN);
        background.add(Aboutus);


        //Blog Section
        blog=new JButton("Blog");
        blog.setSize(150,30);
        blog.setLocation(50,260);
        blog.setBackground(Color.GREEN);
        background.add(blog);


        //page iconic
        iconic=new JLabel();
        iconic.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/page.png"));
        iconic.setSize(new Dimension(50,50));
        iconic.setLocation(20,300);
        background.add(iconic);

        //Page section
        pages=new JButton("Pages");
        pages.setSize(100,30);
        pages.setLocation(70,310);
        pages.setBackground(Color.GREEN);
        background.add(pages);

        //Short Code
        shortCode=new JButton("Short Codes");
        shortCode.setSize(150,30);
        shortCode.setLocation(50,370);
        shortCode.setBackground(Color.GREEN);
        background.add(shortCode);




        //contact iconic
        iconic=new JLabel();
        iconic.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/contact.png"));
        iconic.setSize(new Dimension(50,50));
        iconic.setLocation(20,420);
        background.add(iconic);

        // Contact
        contact=new JButton("Contact");
        contact.setSize(100,30);
        contact.setLocation(75,430);
        contact.setBackground(Color.GREEN);
        background.add(contact);

         //ball product
        ball=new JButton();
        ball.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/football.png"));
        ball.setSize(new Dimension(100,100));
        ball.setLocation(400,200);
        background.add(ball);


        cricket=new JButton();
        cricket.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/bat.png"));
        cricket.setSize(new Dimension(100,100));
        cricket.setLocation(530,200);
        background.add(cricket);
//
        jercy=new JButton();
        jercy.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/football.png"));
        jercy.setSize(new Dimension(100,100));
        jercy.setLocation(650,200);
        background.add(jercy);


        chess=new JButton();
        chess.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/chess.png"));
        chess.setSize(new Dimension(100,100));
        chess.setLocation(400,320);
        background.add(chess);

        board=new JButton();
        board.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/board.png"));
        board.setSize(new Dimension(100,100));
        board.setLocation(530,320);
        background.add(board);

        ludo=new JButton();
        ludo.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/ludo.png"));
        ludo.setSize(new Dimension(100,100));
        ludo.setLocation(650,320);
        background.add(ludo);
        performAction();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setVisible(true);
    }
    private void performAction(){
        Aboutus.addActionListener((event)->{
            System.out.println("About us");
        });
        blog.addActionListener((event)->{
            System.out.println("About us");
        });
        Outdoor.addActionListener((event)->{
            System.out.println("About us");
        });
        Indoor.addActionListener((event)->{
            System.out.println("About us");
        });
        pages.addActionListener((event)->{
            System.out.println("pages");
        });
        cricket.addActionListener((event)->{
            System.out.println("Cricket");
        });
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
