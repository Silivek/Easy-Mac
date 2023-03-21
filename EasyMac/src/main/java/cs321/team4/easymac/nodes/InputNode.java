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
    
    public InputNode(Node prev, int delayDuration, boolean pressRelease, int button){
        super(prev, null, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }
    
    public InputNode(Node prev, Node next, int delayDuration, boolean pressRelease, int button){
        super(prev, next, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }
    
    public boolean getHeldState()
    {
        return pressRelease;
    }
    public void setHeldState(boolean heldState)
    {
        this.pressRelease = pressRelease;
    }
    public int getButton()
    {
        return button;
    }
    public void setButton(int button)
    {
        this.button = button;
    }
}
