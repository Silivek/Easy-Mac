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
public class MouseInputNode extends InputNode {
    int x; int y; //coordinates for mouse clicks
    public MouseInputNode(int button, int holdDuration, int delayDuration, int x, int y){
        this.button = button;
        this.holdDuration = holdDuration;
        this.delayDuration = delayDuration;
        this.x = x;
        this.y = y;
    }
    @Override
    public void getInput(){
        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            robot.mouseMove(x,y);
            robot.mousePress(button);
            robot.delay(holdDuration);
            robot.mouseRelease(button);
            robot.delay(delayDuration);
        } catch (AWTException ex) {
            System.out.println("Robot Error in MouseInputNode.");
            Logger.getLogger(MouseInputNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setInput(int button, int holdDuration, int delayDuration, int x, int y){
        this.button = button;
        this.holdDuration = holdDuration;
        this.delayDuration = delayDuration;
        this.x = x;
        this.y = y;
    }
}
