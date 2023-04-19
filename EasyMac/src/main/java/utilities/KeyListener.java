/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import cs321.team4.easymac.Timeline;
import cs321.team4.easymac.nodes.KeyInputNode;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import java.awt.event.MouseEvent;
import cs321.team4.easymac.nodes.MouseInputNode;

/**
 *
 * @author Melissa
 */
public class KeyListener implements NativeKeyListener{
    /*public static void main(String[] args){
        try{
            GlobalScreen.registerNativeHook();
        }catch (NativeHookException e){
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new KeyListener());       
    }*/

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Timeline userCreatedTimeline = new Timeline();
    public Timeline getCreatedTimeline(){
        return userCreatedTimeline;
    }
    
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        String value = NativeKeyEvent.getKeyText(e.getKeyCode());
        if (value.equals("left") || value.equals("Left")) {
                MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON1_DOWN_MASK); // left click node
                userCreatedTimeline.addNode(nodeToAdd);
            } else if (value.equals("right") || value.equals("Right")) {
                MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON2_DOWN_MASK); // right click node
                userCreatedTimeline.addNode(nodeToAdd);
            } else{
                value = value.toUpperCase();
                //char ch = e.getKeyChar();
                //System.out.println("Key char from getKeyChar: " + ch);
                //int length = value.length();
                
               // System.out.println("Length of the string value in KeyListener: " + length);
              // When converting toCharArray ENTER becomes E
                char vkValueChar = value.toCharArray()[0];
               // System.out.println("Value in char array in KeyListener" + vkValueChar);
                int vkValueInt = vkValueChar;
               // System.out.println("Integer value from KeyListener: " + vkValueInt);
                KeyInputNode nodeToAdd = new KeyInputNode(null, 500, true, vkValueInt);
                userCreatedTimeline.addNode(nodeToAdd);
            }
        //char vkValueChar = keyCode.toCharArray()[0];
//        int vkValueInt = vkValueChar;
//        KeyInputNode nodeToAdd = new KeyInputNode(null, keyCode);
//        userCreatedTimeline.addNode(nodeToAdd);  
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        String value = NativeKeyEvent.getKeyText(e.getKeyCode());
        System.out.println(value);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
