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
 *
 * @author wkilp
 */
public class KeyInputNode extends InputNode {
    public KeyInputNode(int button, int holdDuration, int delayDuration){
        this.button = button;
        this.holdDuration = holdDuration;
        this.delayDuration = delayDuration;
    }
    @Override
    public void getInput(){
        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            robot.keyPress(button);
            robot.delay(holdDuration);
            robot.keyRelease(button);
            robot.delay(delayDuration);
        } catch (AWTException ex) {
            System.out.println("Robot Error in KeyInputNode.");
            Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setInput(int button, int holdDuration, int delayDuration){
        this.button = button;
        this.holdDuration = holdDuration;
        this.delayDuration = delayDuration;
    }
}
