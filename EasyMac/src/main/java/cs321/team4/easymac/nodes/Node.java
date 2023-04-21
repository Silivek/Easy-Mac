/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 * A class for producing nodes.
 *
 * @author Ben Spurlock
 */
public class Node {

    /**
     * The previous node in the timeline.
     */
    Node prevNode;
    /**
     * The next node in the timeline.
     */
    Node nextNode;
    /**
     * The delay between nodes in milliseconds.
     */
    int delayDuration;
    /**
     * Indicates if the key is being pressed or released.
     */
    boolean pressRelease;
    /**
     * The button being pressed or released.
     */
    int button;

    /**
     * Constructs a Node object with previous and next node as null and delay
     * duration at 50 default.
     *
     */
    public Node() {
        prevNode = null;
        nextNode = null;
        delayDuration = 50;
    }

    /**
     * Constructs a Node object specifying the timing until the next node is
     * called.
     *
     * @param delayDuration how long until the next node is called in
     * milliseconds.
     */
    public Node(int delayDuration) {
        prevNode = null;
        nextNode = null;
        this.delayDuration = delayDuration;
    }

    /**
     * Constructs a Node object specifying the previous node, the next node, and
     * the time delay until the next node is called.
     *
     * @param prev the previous node in the list.
     * @param next the next node in the list.
     * @param delayDuration how long until the next node is called in
     * milliseconds.
     */
    public Node(Node prev, Node next, int delayDuration) {
        prevNode = prev;
        nextNode = next;
        this.delayDuration = delayDuration;
    }

    /**
     * Gets the previous node.
     *
     * @return the previous node in the list.
     */
    public Node getPrevNode() {
        return prevNode;
    }

    /**
     * Gets the next node.
     *
     * @return the next node in the list.
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * Gets the delay duration.
     *
     * @return the time in milliseconds until the next node is called.
     */
    public int getDelayDuration() {
        return delayDuration;
    }

    /**
     * Indicates if a button is being pressed or released.
     *
     * @return true or false if a button is being pressed (true) or released
     * (false).
     */
    public boolean getPressRelease() {
        return pressRelease;
    }

    /**
     * Provides the value for the button that was pressed.
     *
     * @return the pressed button.
     */
    public int getButton() {
        return button;
    }

    /**
     * Sets the previous node in the list.
     *
     * @param prevNode the previous node in the list.
     */
    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    /**
     * Sets the next node in the list.
     *
     * @param nextNode the next node in the list.
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * Sets the delay for the node.
     *
     * @param delayDuration the time in milliseconds until the next node is
     * called.
     */
    public void setDelayDuration(int delayDuration) {
        this.delayDuration = delayDuration;
    }

    /**
     * Abstract method to run the contents of a node.
     */
    public void runNode() {
    }
    
    @Override
    public String toString()
    {
        
        if (this.getButton() == 1024 || this.getButton() == 2048)
        {
            MouseInputNode mouseNode = (MouseInputNode)this;
            System.out.println(mouseNode.x);
            String finalList = String.valueOf(this.getButton()) + " " + String.valueOf(this.delayDuration) + " " + String.valueOf(getPressRelease()) + " " + String.valueOf(mouseNode.getXCoordinate()) + " " + String.valueOf(mouseNode.getYCoordinate());
            return finalList;
        }
        else
        {
            String finalList = String.valueOf(this.getButton()) + " " + String.valueOf(this.delayDuration) + " " + String.valueOf(getPressRelease());
            return finalList;
        }
    }
;
}
