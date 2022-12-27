package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class NewLogin extends JFrame {
    private JLabel background;
    private ImageIcon icon;
    private JLabel title;

    private JLabel header1;

    private JLabel header2;

    private JLabel Email;
    private JTextField textEmail;
    private JPasswordField textPass;
    private JLabel pass;
    private JButton register;
    private JButton registers;
    private JButton next;
    private JButton cancel;

    private JLabel again;
    private JLabel iconic;
    private static final String  CHECK = "Check";
    public NewLogin() throws IOException {
        setTitle("Login");
        setBounds(0, 0, 1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);

        icon=new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/background.jpg");
        background=new JLabel("",icon,JLabel.CENTER);
        background.setBounds(0,0,1000,600);
        add(background);


        header1 = new JLabel("WELCOME TO ");
        header1.setFont(new Font("Arial", Font.PLAIN, 28));
        header1.setSize(300, 30);
        header1.setLocation(100, 30);
        header1.setForeground(Color.WHITE);
        background.add(header1);

        header2 = new JLabel("PlaySports.com");
        header2.setFont(new Font("Arial", Font.BOLD, 28));
        header2.setSize(300, 30);
        header2.setLocation(150, 70);
        header2.setForeground(Color.WHITE);
        background.add(header2);

        title = new JLabel("Log-In");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setSize(300, 30);
        title.setLocation(250, 170);
        title.setForeground(Color.WHITE);
        background.add(title);

        Email=new JLabel("Email: ");
        Email.setFont(new Font("Arial", Font.BOLD, 24));
        Email.setSize(200,30);
        Email.setLocation(100,220);
        Email.setForeground(Color.WHITE);
        background.add(Email);


        textEmail=new JTextField();
        textEmail.setFont(new Font("Arial", Font.PLAIN, 18));
        textEmail.setSize(250,30);
        textEmail.setLocation(250,220);
        background.add(textEmail);

        pass=new JLabel("Password: ");
        pass.setFont(new Font("Arial", Font.BOLD, 24));
        pass.setSize(200,30);
        pass.setLocation(100,270);
        pass.setForeground(Color.WHITE);
        background.add(pass);


        textPass=new JPasswordField();
        textPass.setSize(250,30);
        textPass.setLocation(250,270);
        background.add(textPass);

        register=new JButton("FORGOT PASSWORD?");
        register.setSize(200,20);
        register.setLocation(300,310);
        register.setBackground(Color.GREEN);
        background.add(register);

        next=new JButton("NEXT");
        next.setSize(100,50);
        next.setLocation(250,340);
        next.setBackground(Color.GREEN);
        background.add(next);

        next.addActionListener(this::ActionPerformed);


        cancel=new JButton("CANCEL");
        cancel.setSize(100,50);
        cancel.setLocation(370,340);
        cancel.setBackground(Color.GREEN);

        background.add(cancel);

        again=new JLabel("Don’t have an Account? Then Click");
        again.setSize(350,20);
        again.setFont(new Font(Font.MONOSPACED,Font.BOLD,16));
        again.setLocation(100,410);
        again.setForeground(Color.WHITE);
        background.add(again);

        registers=new JButton("REGISTER");
        registers.setSize(100,20);
        //registers.setFont(new Font(Font.MONOSPACED,Font.BOLD,16));
        registers.setLocation(440,410);
        registers.setBackground(Color.GREEN);
        background.add(registers);

        iconic=new JLabel();
        iconic.setIcon(new ImageIcon("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/Messi.png"));
        iconic.setSize(new Dimension(250,300));
        iconic.setLocation(570,140);
        background.add(iconic);

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    private void ActionPerformed(ActionEvent event) {
        var path = Paths.get("/home/rupkotha/Downloads/PlaySports-r/src/main/resources/dbfiles/data.txt");
        try (Stream<String> lines = Files.lines(path)) {
            String name = lines.filter(this::checkLine)
                    .map(line -> line.split(",")[1])
                    .findFirst()
                    .orElseThrow();

            new Dashboard();

        }
        catch (IOException xIo) {
            JOptionPane.showMessageDialog(null,
                    xIo,
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (NoSuchElementException xNoSuchElement) {
            JOptionPane.showMessageDialog(null,
                    "Incorrect username or password",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private boolean checkLine(String line) {
        String[] fields = line.split(",");
        String eMail = textEmail.getText();
        char[] letters = textPass.getPassword();
        String password = new String(letters);
        return eMail.equals(fields[0])  &&  password.equals(fields[1]);
    }

    public static void main(String[] args) throws IOException {
        new NewLogin();
    }
}
