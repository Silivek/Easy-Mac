/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 * A class for creating an input node.
 *
 * @author Brian Boggs
 */
public class InputNode extends Node {

    /**
     * Has true if the button is pressed and false for release.
     */
    boolean pressRelease;
    /**
     * The keystroke or button being pressed.
     */
    int button;

    /**
     * Constructs an InputNode object specifying previous node, next node, the
     * delay duration, the press release, and the button.
     *
     * @param prev The previous node in the list.
     * @param next The next node in the list.
     * @param delayDuration How long until the next node is called in
     * milliseconds.
     * @param pressRelease True indicates to press the button, false to release
     * it.
     * @param button Identifier for mouse button or key.
     *
     */
    public InputNode(Node prev, Node next, int delayDuration, boolean pressRelease, int button) {
        super(prev, next, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }

    /**
     * Constructs an InputNode object specifying previous node, the delay
     * duration, the press release, and the button.
     *
     * @param prev The previous node in the list.
     * @param delayDuration How long until the next node is called in
     * milliseconds.
     * @param pressRelease True indicates to press our button, false to release
     * it.
     * @param button Identifier for mouse button or key.
     */
    public InputNode(Node prev, int delayDuration, boolean pressRelease, int button) {
        super(prev, null, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }

    /**
     * Constructs an InputNode object specifying the delay duration, the press
     * release, and the button.
     *
     * @param delayDuration How long until the next node is called in
     * milliseconds.
     * @param pressRelease True indicates to press our button, false to release
     * it.
     * @param button Identifier for mouse button or key.
     */
    public InputNode(int delayDuration, boolean pressRelease, int button) {
        super(null, null, delayDuration);
        this.pressRelease = pressRelease;
        this.button = button;
    }

    /**
     * Constructs an InputNode object specifying the previous node and the
     * button.
     *
     * @param prev Indicates the previous node in the timeline.
     * @param button Identifier for mouse button or key.
     */
    public InputNode(Node prev, int button) {
        super(prev, null, 50);
        this.button = button;
    }

    /**
     * Indicates if a button has been released.
     *
     * @return Boolean value where true indicates to press the button, false to
     * release it.
     */
    public boolean getPressRelease() {
        return pressRelease;
    }

    /**
     * Stores the Boolean value to indicate if the press or release has
     * occurred.
     *
     * @param pressRelease stores the pressRelease.
     */
    public void setPressRelease(boolean pressRelease) {
        this.pressRelease = pressRelease;
    }

    /**
     * Provides the button value.
     *
     * @return button integer value.
     */
    public int getButton() {
        return button;
    }

    /**
     * Sets the button value.
     *
     * @param button integer value which is the identifier for mouse button or
     * key.
     */
    public void setButton(int button) {
        this.button = button;
    }
}
