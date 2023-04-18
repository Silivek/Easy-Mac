/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import cs321.team4.easymac.gui.MainGUI;
import cs321.team4.easymac.nodes.KeyInputNode;
import cs321.team4.easymac.nodes.MouseInputNode;
import cs321.team4.easymac.nodes.Node;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;
import cs321.team4.easymac.interfaces.IActionCanceller;

/**
 * A class that creates the stores the node elements in a timeline.
 *
 * @author benspurlock
 */
public class Timeline implements Serializable{
    //TODO Test timeline
    //TODO Ensure addNode() and insertNode() can store key info
    //TODO print node contents to console
    //TODO Undo/redo functionality?

    final int MAX_SIZE = 100;
    int num_of_nodes = 0;
    Node startNode, endNode, currentNode; //startNode and endNode are for structuring, currentNode is for running the Timeline

    int delayTimer; //Timer for playback (May be unused?)

    /**
     * Constructs a Timeline object to store nodes.
     */
    public Timeline() {
        startNode = null;
        endNode = null;
        currentNode = null;
    }

    // TODO fix addNode to be passed a node instead of parameters
    //Adds a node to the end of the timeline

    /**
     * Adds a node to the end of the timeline.
     *
     * @param newNode the node to be added.
     */
    public void addNode(Node newNode) {
        //Return an error if the node limit is reached
        if (num_of_nodes >= MAX_SIZE) {
            System.out.println("Cannot exceed node limit.");
            return;
        }

        //Add the first node in the list
        if (startNode == null) {
            newNode.setPrevNode(null);
            newNode.setNextNode(null);
            startNode = newNode;
            endNode = startNode;
            num_of_nodes++;
        } else {
            endNode.setNextNode(newNode);
            newNode.setPrevNode(endNode);
            endNode = newNode;
            num_of_nodes++;
        }
    }

    /**
     * Removes the last node in the timeline.
     */
    public void removeEndNode() {

        Node prevNode;
        prevNode = endNode.getPrevNode();

        //Disconnect prev node from end node
        prevNode.setNextNode(null);

        //Unassign endNode (?)
        endNode = null;

        num_of_nodes--;

        //Update new endNode
        endNode = prevNode;
    }
    
    /**
     * Removes a node from the timeline and connects the surrounding nodes
     *
     * @param node node to remove
     */
    public void removeNode(Node node) {
        
        //Get surrounding nodes
        Node prevNode, nextNode;
        prevNode = node.getPrevNode();
        nextNode = node.getNextNode();
        
        //Connect previous node to next node
        prevNode.setNextNode(nextNode);
        
        //Connect next node to previous node
        nextNode.setPrevNode(prevNode);
        
        num_of_nodes--;
    }
    
    /**
     * Removes the current node from the timeline and connects the surrounding nodes
     * (Mainly for convenience)
     */
    public void removeCurrentNode() {
        
        //Get surrounding nodes
        Node prevNode, nextNode;
        prevNode = currentNode.getPrevNode();
        nextNode = currentNode.getNextNode();
        
        //Connect previous node to next node
        if (prevNode != null) {
            prevNode.setNextNode(nextNode);
        }
        
        //Connect next node to previous node
        if (nextNode != null) {
            nextNode.setPrevNode(prevNode);
        }
        
        num_of_nodes--;
    }

    
    // TODO fix functionality to pass a node and use currently displayed node (unimplemented)
    /**
     * Inserting a new node before the designated node
     *
     * @param currentNode the current node location.
     * @param delay ????
     * @param newNode is the node that will be inserted
     */
     public void insertBeforeNode(Node currentNode, Node newNode, int delay) {
        //Prevent user from exceeding node limit
        if (num_of_nodes > MAX_SIZE) {
            System.out.println("Cannot exceed node limit.");
            return;
        }

        //Create new node
        num_of_nodes++;

        //Set delay of new node
        newNode.setDelayDuration(delay);
        
        //Connect new node to node it was inserted after...
        newNode.setPrevNode(currentNode.getPrevNode());
        //...and before
        newNode.setNextNode(currentNode);

        //Connect prev node to new node
        if (currentNode.getPrevNode() != null) {
            currentNode.getPrevNode().setNextNode(newNode);           
        } else { //Set new starting node if necessary
            this.startNode = newNode;
        }
        
        //Connect the current node to the new node
        currentNode.setPrevNode(newNode);

    }

    /**
     * Prints the timeline to the console.
     */
    public void printTimeline() {
        int i = 0;
        currentNode = this.startNode;

        do {
            System.out.println(i + ".  " + "Delay: " + currentNode.getDelayDuration());

            currentNode = currentNode.getNextNode();
            i++;
        } while (currentNode != this.endNode);
    }

  
    /**
     * Runs the delay time using another object of robot.
     * @param cur
     */
    public void runNodeDelay(Node cur) {

        try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            robot.delay(cur.getDelayDuration());
        } catch (AWTException ex) {
            System.out.println("Robot Error in Timeline.");
            Logger.getLogger(Timeline.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Runs the timeline.
     * @param actionRunner passed to allow cancellation during thread execution
     */
    public void runTimeline(IActionCanceller actionRunner) {
        if (startNode == null) {
            return;
        }
        Node cur = startNode;
        while (true) {
            if (actionRunner.actionCancelled())
                break;
            cur.runNode();
            runNodeDelay(cur);
            // TODO use runNodeDelay(); once pressRelease is implemented
            if (cur != endNode) {
                cur = cur.getNextNode();
            } else {
                actionRunner.cancelAction();
                return;
            }
        }
    }
    
    /**
     * Finds and returns the starting node
     * @return the node that starts the timeline
     */
    public Node getStartNode(){
        return startNode;
    }
    
    /**
     * Finds and returns the last node
     * @return the node that ends the timeline
     */
    public Node getEndNode(){
        return endNode;
    }
    
    /**
     * Provides access to the timeline's current node
     * @return the current node
     */
    public Node getCurrentNode() {
        return currentNode;
    }
    
    /**
     * Sets the timeline's current node
     * @param node to be set
     */
    public void setCurrentNode(Node node) {
        currentNode = node;
    }
    
    /**
     * Set timeline's current node to the previous node
     * @return the previous node
     */
    Node prevNode() {
        currentNode = currentNode.getPrevNode();
        return currentNode;
    }
    
    
    /**
     * Set timeline's current node to the next node
     * @return the next node
     */
    Node nextNode() {
        currentNode = currentNode.getNextNode();
        return currentNode;
    }
    //TODO update comments
}
