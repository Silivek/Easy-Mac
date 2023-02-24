/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 *
 * @author wkilp
 */
public class MouseInputNode extends InputNode {
    int button; //type of mouse click. to be used with Robot.
    int x; int y; //coordinates for mouse clicks
    void getInput(int duration, int delay, int button, int x, int y){
        // TODO add definition to getInput
        this.button = button;
        this.x = x;
        this.y = y;
    }
}
