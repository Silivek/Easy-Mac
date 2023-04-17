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
 * A class for creating an input node for mouse inputs.
 *
 * @author wkilp
 */
// TODO determine if MouseInputNode requires more methods
public class MouseInputNode extends InputNode {

    int x;
    int y; //coordinates for mouse clicks

    /**
     * Constructs a MouseInputNode object specifying the previous node and the
     * next node.
     *
     * @param prev indicates the previous node in the list.
     * @param button the identifier for the type of mouse press.
     */
    public MouseInputNode(Node prev, int button) {
        super(prev, button);
    }

    /**
     * Constructs a MouseInputNode object specifying the previous node, the
     * delay time until the next node is called, the mouse clicks, and if the
     * action is to click or release.
     *
     * @param prev the previous node in the list.
     * @param delayDuration how long until the next node is called in
     * milliseconds.
     * @param button the identifier for the type of mouse press.
     * @param pressRelease true indicates to press our button, false to release
     * it.
     * @param x the x value of the mouse action location
     * @param y the y value of the mouse action location
     */
    public MouseInputNode(Node prev, int delayDuration, boolean pressRelease, int button, int x, int y) {
        super(prev, delayDuration, pressRelease, button);
        this.x = x;
        this.y = y;
    }

    /**
     * Runs the node's contents.
     */
    @Override
    public void runNode() { //runs node contents
        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            if(pressRelease){
                robot.mouseMove(x,y);
                robot.mousePress(button);
            }
            else {
                robot.mouseRelease(button);
            }
        } catch (AWTException ex) {
            System.out.println("Robot Error in MouseInputNode.");
            Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Sets the values within the node.
     *
     * @param delayDuration indicates how long until the next node is called in
     * milliseconds.
     * @param button indicates the key being pressed
     * @param pressRelease True indicates to press the key, false to release it.
     * @param x the x value of the mouse action location
     * @param y the y value of the mouse action location
     */
    public void setInput(int delayDuration, int button, boolean pressRelease, int x, int y) {
        this.delayDuration = delayDuration;
        this.button = button;
        this.pressRelease = pressRelease;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Provides the value for the x coordinate.
     * @return x value.
     */
    public int getXCoordinate(){
        return x;
    }
    
    /** 
     * Provides the value for the y coordinate.
     * @return y value.
     */
    public int getYCoordinate(){
        return y;
    }
}
