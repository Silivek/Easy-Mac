/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;
import cs321.team4.easymac.nodes.Node;

/**
 *
 * @author benspurlock
 */
public class Timeline {
    //TODO data structure for Timeline
    //TODO add node insertion/removal for timeline class
   Node startNode, endNode, currentNode = null; //endNode currently unused

   int delayTimer; //Timer for playback (May be unused?)
   
   void updateCurrentNode() {
       if (currentNode != null)
            currentNode = currentNode.getNextNode();
   }
   
   public void addNode(int delay) {
       
       //Add the first node in the list (Auxilliary start node?)
       if (startNode == null) {
           startNode = new Node(null, null, delay);
           currentNode = startNode;
       }
       
       //Create new node
       Node newNode;
       newNode = new Node(currentNode, null, delay);
       
       //Connect previous node to new node
       currentNode.setNextNode(newNode);
               
       //Set current node to new node
       updateCurrentNode();
   }
   
   //TODO update comments
}
