/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package color.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author tiegancozzie
 */
public class MyFrame extends JFrame implements ActionListener{
    public MyFrame(String x){
        super(x);
        
        setLocation(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        
        MyPanel buttonPanel=new MyPanel();
        MyButton blueButton=new MyButton("Blue");
        MyButton redButton=new MyButton("Red");
        MyButton yellowButton=new MyButton("Yellow");
        MyButton orangeButton=new MyButton("Orange");
        MyButton pinkButton=new MyButton("Pink");
        
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
        
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(orangeButton);
        buttonPanel.add(pinkButton);
        
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        orangeButton.addActionListener(this);
        pinkButton.addActionListener(this);
        
        buttonPanel.setBackground(Color.DARK_GRAY);
        
        getContentPane().add(buttonPanel, BorderLayout.WEST);
        
        MyPanel colorPanel=new MyPanel().getInstance();
        colorPanel.setBackground(Color.BLACK);
        getContentPane().add(colorPanel,BorderLayout.CENTER);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Blue")){
            System.out.println("Blue Button Pressed");
            MyPanel.getInstance().setBackground(Color.BLUE);
        }else if(e.getActionCommand().equals("Red")){
            System.out.println("Red Button Pressed");
            MyPanel.getInstance().setBackground(Color.RED);
        }else if(e.getActionCommand().equals("Yellow")){
            System.out.println("Yellow Button Pressed");
            MyPanel.getInstance().setBackground(Color.YELLOW);
        }else if(e.getActionCommand().equals("Orange")){
            System.out.println("Orange Button Pressed");
            MyPanel.getInstance().setBackground(Color.ORANGE);
        }else if(e.getActionCommand().equals("Pink")){
            System.out.println("Pink Button Pressed");
            MyPanel.getInstance().setBackground(Color.PINK);
        }
    }
}
