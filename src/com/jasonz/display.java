package com.jasonz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class display {

    private static JFrame frame;

    private static JPanel start;

    public static JPanel main;

    private static String username = "test";
    private static char[] passkey = new char[] {'J','a','s','o','n','1','2','3'};

    private static boolean info = false;

    private static JButton enter;
    private static JTextField userName;
    private static JPasswordField password;

    private static JButton one,two,three,four = new JButton();

    private static JFrame addFrame;
    private static JLabel name,wChild,title;
    private static JTextField tName;
    private static JComboBox child;

    private static JPanel bOne = new JPanel();
    private static JPanel bTwo = new JPanel();
    private static JPanel bThree = new JPanel();
    private static JPanel bFour = new JPanel();


    public display(){
        //sets frame parameters
        mainPanel();
        frameParam();
        startPanel();

        frame.setContentPane(start);
        frame.setVisible(true);

    }

    private static void frameParam(){//MAINFRAME PARAMETERS
        frame = new JFrame("Kidminder Version 1.0 BETA");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void mainPanel(){//MAIN PAGE OF KIDMINDER
        main = new JPanel();
        JButton one = new JButton();
        JButton two = new JButton();
        JButton three = new JButton();
        JButton four = new JButton();

        one.setSize(100,100);
        two.setSize(100,100);
        three.setSize(100,100);
        four.setSize(100,100);

        one.setLocation(150,150);
        two.setLocation(550,150);
        three.setLocation(150,450);
        four.setLocation(550,450);

        if(one.getText() == ""){
            one.setText("UNUSED");
        }
        if(two.getText() == ""){
            two.setText("UNUSED");
        }
        if(three.getText() == ""){
            three.setText("UNUSED");
        }
        if(four.getText() == ""){
            four.setText("UNUSED");
        }

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bOnePanel();

            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        main.add(one);
        main.add(two);
        main.add(three);
        main.add(four);
        main.setSize(800,700);
        main.setLayout(null);
        main.setBackground(Color.gray);
        main.setVisible(true);

    }

    private static void bOnePanel(){
        frame.setSize(700,475);

        JButton back = new JButton("<--Back");
        back.setSize(80,30);
        back.setLocation(250,300);
        back.setVisible(true);back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setSize(800,700);
                frame.setContentPane(main);
            }
        });


        frame.setContentPane(bOne);
        bOne.setLayout(null);
        bOne.setSize(700,475);
        bOne.setBackground(Color.black);


        bOne.add(back);
        bOne.setVisible(true);
    }

    private static void bTwoPanel(){

    }

    private static void bThreePanel(){

    }

    private static void bFourPanel(){

    }


//    private static void frameAdd(){//ADD NEW CHILD WINDOW
//
//        String[] cNums = {"1st Child", "2nd Child", "3rd Child", "4th Child"};
//        addFrame = new JFrame();
//        name = new JLabel("Name:");
//        wChild = new JLabel("Which Child:");
//        tName = new JTextField();
//        child = new JComboBox(cNums);
//
//
//        name.setLocation(50,150);
//        name.setSize(50,30);
//        name.setVisible(true);
//
//        tName.setLocation(100,150);
//        tName.setSize(150,30);
//        tName.setVisible(true);
//
//        child.setSelectedIndex(0);
//        child.setLocation(100,225);
//        child.setSize(150,30);
//        child.setVisible(true);
//
//        child.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String sel = (String) child.getSelectedItem();
//
//                switch(sel){
//                    case "1st Child":
//                        main.add(one);
//                        break;
//                    case "2nd Child":
//                        break;
//                    case "3rd Child":
//                        break;
//                    case "4th Child":
//                        break;
//
//                }
//            }
//        });
//
//        wChild.setSize(80,30);
//        wChild.setLocation(15,225);
//        wChild.setVisible(true);
//
//        title = new JLabel("New Child Info");
//        Font font = title.getFont();
//        title.setSize(250,50);
//        title.setLocation(50,25);
//        title.setFont(new Font(font.getName(),Font.ITALIC,35));
//        title.setForeground(Color.blue);
//        title.setVisible(true);
//
//        addFrame.add(tName);
//        addFrame.add(name);
//        addFrame.add(wChild);
//        addFrame.add(child);
//        addFrame.add(title);
//        addFrame.setSize(350, 350);
//        addFrame.setLocationRelativeTo(null);
//        addFrame.setLayout(null);
//        addFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        addFrame.setResizable(false);
//        addFrame.setVisible(true);
//
//
//
//    }
//
//    //private static void
//
//
//    private static int buttonLoc(int num){
//        int b = 150 + 500 * (num - 1);
//        return b;
//    }

    private static void startPanel(){//START SCREEN OF KIDMINDER
        //initialize start screen objects
        userName = new JTextField();
        password = new JPasswordField();
        JLabel nameUser = new JLabel();
        JLabel pass = new JLabel();
        enter = new JButton("Let's Go");
        JLabel title = new JLabel("KidMinder");
        Font font = title.getFont();

        title.setSize(300,150);
        title.setLocation(200,50);
        title.setFont(new Font(font.getName(),Font.ITALIC,60));

        enter.setSize(100,30);
        enter.setLocation(300,420);


        pass.setText("Password:");
        nameUser.setText("Username:");

        pass.setSize(75,30);
        pass.setLocation(150,350);

        nameUser.setSize(75,30);
        nameUser.setLocation(150,300);

        userName.setSize(200,30);
        userName.setLocation(250,300);

        password.setSize(200,30);
        password.setLocation(250,350);


        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gUsername = userName.getText();
                char[] gPassword = password.getPassword();

                if (gUsername.equalsIgnoreCase(username) && Arrays.equals(gPassword,passkey)) {
                    frame.setSize(800,700);
                    frame.setContentPane(main);
                }
            }
        });
        frame.setSize(700,475);
        start  = new JPanel();
        start.setLayout(null);
        start.setSize(700,475);
        start.add(userName);
        start.add(password);
        start.add(pass);
        start.add(nameUser);
        start.setBackground(Color.lightGray);
        start.add(enter);
        start.add(title);
    }
}
