/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import cs321.team4.easymac.nodes.KeyInputNode;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import cs321.team4.easymac.gui.MainGUI;

/**
 *
 * @author moosi
 */
public class KeyListener implements NativeKeyListener{
    public static void main(String[] args){
        try{
            GlobalScreen.registerNativeHook();
        }catch (NativeHookException e){
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new KeyListener());       
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        int keyCode = e.getKeyCode();
//        //char vkValueChar = keyPress.toCharArray()[0];
//        //int vkValueInt = vkValueChar;
        KeyInputNode nodeToAdd = new KeyInputNode(null, keyCode);
        //getTimeline().addNode(nodeToAdd);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        String value = NativeKeyEvent.getKeyText(e.getKeyCode());
        System.out.println(value);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
