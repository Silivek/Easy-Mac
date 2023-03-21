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
    
    /**
     * 
     * @param prev The previous node in the list.
     * @param next The next node in the list.
     * @param delayDuration How long until the next node is called in milliseconds.
     * @param pressRelease True indicates to press our button, false to release it.
     * @param button Identifier for mouse button or key.
     * 
     */
    public InputNode(Node prev, Node next, int delayDuration, boolean pressRelease, int button){
        super(prev, next, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }
    public InputNode(Node prev, int delayDuration, boolean pressRelease, int button){
        super(prev, null, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }
    public InputNode(int delayDuration, boolean pressRelease, int button){
        super(null, null, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }
    public InputNode(Node prev, int button){
        super(prev, null, 50);
        this.button = button;
    }
    public boolean getPressRelease()
    {
        return pressRelease;
    }
    public void setPressRelease(boolean pressRelease)
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
