/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package color.window;

import javax.swing.JPanel;

/**
 *
 * @author tiegancozzie
 */
public class MyPanel extends JPanel {
   
    private static MyPanel inst;
    
    public static MyPanel getInstance(){
        if(inst==null)
            inst=new MyPanel();
        return inst;  
    }
}
