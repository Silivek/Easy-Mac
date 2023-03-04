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
    Node() {};
    
    //Main Constructor
    Node(Node prev, Node next, int delay) {
        prevNode = prev;
        nextNode = next;
        delayDuration = delay;
    }
    
    //Getters
    public Node getPrevNode() {
        return prevNode;
    }
    
    public Node getNextNode() {
        return nextNode;
    }
    
    public Node getDelayDuration() {
        return delayDuration;
    }
    
    //TODO add setters for node class
}
