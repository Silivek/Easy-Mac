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
    Node actualNext;
    
    /**
     * 
     * @param prev Reference to the previous node.
     * @param next Reference to the next node.
     * @param delayDuration How long until the next node is called in milliseconds.
     * @param loopDestination While looping, this is the nextNode.
     */
    LoopNode(Node prev, Node next, int delayDuration, Node loopDestination)
    {
        super(prev, next, delayDuration);
        this.actualNext = this.nextNode;
        this.nextNode = loopDestination;
    }
    LoopNode(Node prev, int delayDuration, Node loopDestination)
    {
        super(prev, null, delayDuration);
        this.actualNext = this.nextNode;
        this.nextNode = loopDestination;
    }
    
    
    public int getRepeatCount()
    {
        return repeatCount;
    }
    public void setRepeatCount(int repeatCount)
    {
        this.repeatCount = repeatCount;
    }
    
    public void runNode()
    {
        if(repeatCount > 0) 
        {
            repeatCount--;
            if(repeatCount == 0)
                this.nextNode = actualNext;
        }
    }
}
