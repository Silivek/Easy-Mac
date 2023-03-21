/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 *
 * @author benspurlock
 */
public class Node {
    //TODO Node Class
    Node prevNode;
    Node nextNode;
    int delayDuration; //Delay in milliseconds
    
    //Empty Constructor
    public Node() {};
    
    //Constructor with delayDuration
    public Node(int delayDuration) {};
    
    //Constructor with prev only
    public Node(Node prev) {
        prevNode = prev;
    }
    //Constructor with prev and delay
    public Node(Node prev, int delayDuration){
        prevNode = prev;
        this.delayDuration = delayDuration;
    }
    
    //Main Constructor
    public Node(Node prev, Node next, int delayDuration) {
        prevNode = prev;
        nextNode = next;
        this.delayDuration = delayDuration;
    }
    
    //Getters
    public Node getPrevNode() {
        return prevNode;
    }
    
    public Node getNextNode() {
        return nextNode;
    }
    
    public int getDelayDuration() {
        return delayDuration;
    }
    
    //Setters
    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
    
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    public void setDelayDuration(int delayDuration) {
        this.delayDuration = delayDuration;
    }
    
    //Essentially a function prototype of runNode, which performs the node's action
    public void runNode() {};
}
