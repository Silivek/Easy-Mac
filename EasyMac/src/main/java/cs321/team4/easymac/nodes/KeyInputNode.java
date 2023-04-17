/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A class for creating an input node for key strokes.
 *
 * @author wkilp
 */
// TODO determine if KeyInputNode requires more methods
public class KeyInputNode extends InputNode {

    /**
     * Constructs a KeyInputNode object specifying the previous node and the
     * button identifier.
     *
     * @param prev the previous node in the list.
     * @param button identifier for the key.
     */
    public KeyInputNode(Node prev, int button) {
        super(prev, button);
    }

    /**
     * Constructs a KeyInputNode object specifying the previous node, the delay
     * duration, if the key is pressed or released, and the button identifier.
     *
     * @param prev the previous node in the list.
     * @param delayDuration how long until the next node is called in
     * milliseconds.
     * @param pressRelease true indicates to press the key, false to release it.
     * @param button identifier for the key.
     */
    public KeyInputNode(Node prev, int delayDuration, boolean pressRelease, int button) {
        super(prev, delayDuration, pressRelease, button);
    }

    /**
     * Runs the node's contents.
     */
    @Override
    public void runNode() { //runs node contents
        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            try {
                if(pressRelease) {
                    robot.keyPress(button);  
                }
                else {
                    robot.keyRelease(button);
                }
            } catch (IllegalArgumentException ilEx) {
                System.out.println("An invalid character was used in a node.");
                Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ilEx);
            }
        } catch (AWTException ex) {
            System.out.println("Robot Error in KeyInputNode.");
            Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Sets the values within the node
     *
     * @param delayDuration indicates how long until the next node is called in
     * milliseconds.
     * @param button indicates the key being pressed.
     * @param pressRelease true indicates to press the key, false to release it.
     */
    public void setInput(int delayDuration, int button, boolean pressRelease) {
        this.delayDuration = delayDuration;
        this.button = button;
        this.pressRelease = pressRelease;
    }
}
