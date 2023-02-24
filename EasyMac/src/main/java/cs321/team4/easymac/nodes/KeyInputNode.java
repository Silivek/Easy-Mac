/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 *
 * @author wkilp
 */
public class KeyInputNode extends InputNode {
    int button; //type of key press. to be used with Robot.
    void getInput(int duration, int delay, int button){
        // TODO add definition to getInput
        this.button = button;
    }
}
