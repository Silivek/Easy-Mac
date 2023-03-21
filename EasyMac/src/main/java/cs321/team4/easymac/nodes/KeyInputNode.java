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

// TODO determine if KeyInputNode requires more methods

public class KeyInputNode extends InputNode {
    public KeyInputNode(Node prev, int button){
        super(prev, button);
    }
    public KeyInputNode(Node prev, int delayDuration, boolean pressRelease, int button){
        super(prev, delayDuration, pressRelease, button);
    }
    @Override
    public void runNode(){ //runs node contents
        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            robot.keyPress(button);
            robot.delay(delayDuration);
            robot.keyRelease(button);
        } catch (AWTException ex) {
            System.out.println("Robot Error in KeyInputNode.");
            Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setInput(int delayDuration,int button, boolean pressRelease){
        this.delayDuration = delayDuration;
        this.button = button;
        this.pressRelease = pressRelease;
    }
}
