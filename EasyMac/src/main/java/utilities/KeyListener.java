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
 * A class for implementing NativeKeyListener
 *
 * @author Melissa Burel
 */
public class KeyListener implements NativeKeyListener {

    /**
     * Timeline that is being built by the macro.
     */
    Timeline userCreatedTimeline = new Timeline();

    /**
     * Returns the created timeline.
     *
     * @return the created timeline.
     */
    public Timeline getCreatedTimeline() {
        return userCreatedTimeline;
    }

    /**
     * Takes the "native key typed" event ID. This was not utilized in this
     * project.
     *
     * @param e is the key that is pressed.
     */
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Takes key presses, converts them to their ASCII value and adds them to
     * the timeline.
     *
     * @param e is the key that is pressed.
     */
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        String value = NativeKeyEvent.getKeyText(e.getKeyCode());
        if (value.equals("left") || value.equals("Left")) {
            MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON1_DOWN_MASK); // left click node
            userCreatedTimeline.addNode(nodeToAdd);
        } else if (value.equals("right") || value.equals("Right")) {
            MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON2_DOWN_MASK); // right click node
            userCreatedTimeline.addNode(nodeToAdd);
        } else {
            value = value.toUpperCase();
            char vkValueChar = value.toCharArray()[0];
            int vkValueInt = vkValueChar;
            KeyInputNode nodeToAdd = new KeyInputNode(null, 500, true, vkValueInt);
            userCreatedTimeline.addNode(nodeToAdd);
        }
    }

    /**
     * Takes the information from the key that is released. This was not
     * utilized in this project.
     *
     * @param e the key that is released.
     */
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        String value = NativeKeyEvent.getKeyText(e.getKeyCode());
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
