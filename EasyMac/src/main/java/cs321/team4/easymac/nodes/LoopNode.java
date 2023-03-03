/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 *
 * @author Brian
 */
public class LoopNode extends Node{
    int repeatCount;
    Node loopDestination;
    Node actualNext;
    
    LoopNode(Node other)
    {
        super();
        this.nextNode = loopDestination;
    }
    
    void activate()
    {
        if(repeatCount > 0) 
        {
            repeatCount--;
            if(repeatCount == 0)
                this.nextNode = actualNext;
        }
        
    }
}
