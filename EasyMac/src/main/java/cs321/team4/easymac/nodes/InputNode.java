/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 *
 * @author Brian
 */
public class InputNode extends Node{
    boolean pressRelease; //true for press, false for release
    int button; //Keystroke or button press
    
    public InputNode(boolean pressRelease, int button, int delayDuration){
        super();
        this.pressRelease = pressRelease;
        this.button = button;
    }
    
    void getInput(){
    }
}
