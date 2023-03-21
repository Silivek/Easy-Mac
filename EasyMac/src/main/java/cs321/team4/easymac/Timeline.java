/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;
import cs321.team4.easymac.nodes.KeyInputNode;
import cs321.team4.easymac.nodes.MouseInputNode;
import cs321.team4.easymac.nodes.Node;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benspurlock
 */
public class Timeline {
    //TODO Test timeline
    //TODO Ensure addNode() and insertNode() can store key info
    //TODO print node contents to console
    //TODO Undo/redo functionality?
    
   final int MAX_SIZE = 100;
   int num_of_nodes = 0;
   Node startNode, endNode, currentNode; //startNode and endNode are for structuring, currentNode is for running the Timeline

   int delayTimer; //Timer for playback (May be unused?)
   
   void updateCurrentNode() {
       if (currentNode != null)
            currentNode = currentNode.getNextNode();
   }
   // TODO fix addNode to be passed a node instead of parameters
   //Adds a node to the end of the timeline
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
       }
       else{
           endNode.setNextNode(newNode);
           newNode.setPrevNode(endNode);
           endNode = newNode;
           num_of_nodes++;
       }
   }
   
   //Removes the last node in the timeline
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
   
   //Insert a node before the specified node (?)
   // TODO fix functionality to pass a node and use currently displayed node (unimplemented)
   public void insertBeforeNode(Node currentNode, int delay) {
       //Prevent user from exceeding node limit
       if (num_of_nodes > MAX_SIZE) {
           System.out.println("Cannot exceed node limit.");
           return;
       }
       
       //Create new node
       Node newNode;
       newNode = new Node(currentNode, null, delay);
       num_of_nodes++;
       
       //Connect prev node to new node
       if (currentNode.getPrevNode() == null) {
            currentNode.getPrevNode().setNextNode(newNode);
       } else { //Set new starting node if necessary
           this.startNode = newNode;
       }
       
       //Connect new node to node it was inserted before
       newNode.setNextNode(currentNode);
   }
   
   //Print timeline to console
   public void printTimeline() {
       int i = 0;
       currentNode = this.startNode;
       
        do {
        System.out.println(i + ".  " + "Delay: " + currentNode.getDelayDuration());

        currentNode = currentNode.getNextNode();
        i++;
       } while (currentNode != this.endNode);
   }
   
   
   //Runs the delay time using another object of robot
   public void runNodeDelay() {
       
       try { // try/catch in case Robot is in wrong environment
            Robot robot = new Robot();
            robot.delay(currentNode.getDelayDuration());
        } catch (AWTException ex) {
            System.out.println("Robot Error in Timeline.");
            Logger.getLogger(Timeline.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   //Runs the timeline
   public void runTimeline(){
        if(startNode == null){return;}
        currentNode = startNode;
        do{
            currentNode.runNode();
            runNodeDelay();
            currentNode = currentNode.getNextNode();
        }while(currentNode != endNode);
   }
   //TODO update comments
}
