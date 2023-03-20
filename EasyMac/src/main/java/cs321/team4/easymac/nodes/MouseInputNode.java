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

// TODO determine if MouseInputNode requires more methods

public class MouseInputNode extends InputNode {
    int x; int y; //coordinates for mouse clicks
    public MouseInputNode(int delayDuration, boolean pressRelease, int button, int x, int y){
        super(delayDuration, pressRelease, button);
        this.x = x;
        this.y = y;
    }
    @Override
    public void runNode(){ //runs node contents
        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            if(pressRelease){
                robot.mouseMove(x,y);
                robot.mousePress(button);
            }
            else{
                robot.mouseRelease(button);
            }
        } catch (AWTException ex) {
            System.out.println("Robot Error in MouseInputNode.");
            Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setInput(int delayDuration,int button, boolean pressRelease, int x, int y){
        this.delayDuration = delayDuration;
        this.button = button;
        this.pressRelease = pressRelease;
        this.x = x;
        this.y = y;
    }
}
