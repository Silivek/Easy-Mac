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
   Node currentNode;
   int delayTimer; //Timer for playback
   
   void update_current_node() {
       currentNode = currentNode.getNextNode();
   }
   
   //TODO update comments
}
