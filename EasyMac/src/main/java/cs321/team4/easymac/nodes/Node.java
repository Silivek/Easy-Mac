/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 * A class for producing nodes.
 *
 * @author benspurlock
 */
public class Node {

    //TODO Node Class
    Node prevNode;
    Node nextNode;
    int delayDuration; //Delay in milliseconds
    int button;
    boolean pressRelease; // true indicates to press our button, false to release
  
    /**
     * Constructs a Node object.
     */
    public Node() {
        prevNode = null;
        nextNode = null;
        delayDuration = 50;
    }
    
    public int getButton(){
        return button;
    }
    
    public boolean getPressRelease(){
        return pressRelease;
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
     * Sets the delay.
     *
     * @param delayDuration the time in milliseconds until the next node is
     * called.
     */
    public void setDelayDuration(int delayDuration) {
        this.delayDuration = delayDuration;
    }

    //Essentially a function prototype of runNode, which performs the node's action.
    /**
     * Abstract method to run the contents of a node.
     */
    public void runNode() {
    }
;
}
