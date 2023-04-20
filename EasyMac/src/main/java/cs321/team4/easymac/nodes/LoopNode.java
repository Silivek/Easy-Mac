/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac.nodes;

/**
 * A class that provides looping capabilities for the macro.
 *
 * @author Brian Boggs
 */
public class LoopNode extends Node {

    /**
     * Number of times a loop repeats.
     */
    int repeatCount;
    /**
     * The next node after the loop.
     */
    Node actualNext;

    /**
     * Constructs a LoopNode object specifying the previous node, the next node,
     * the timing until the next node is called, the looping location, and the
     * number of times the loop occurs.
     *
     * @param prev the previous node in the list.
     * @param next the next node in the list.
     * @param delayDuration how long until the next node is called in
     * milliseconds.
     * @param loopDestination while looping, this is the nextNode.
     * @param repeatCount the number of times node will loop before reverting.
     * Negative number for an infinite loop.
     */
    LoopNode(Node prev, Node next, int delayDuration, Node loopDestination, int repeatCount) {
        super(prev, next, delayDuration);
        this.actualNext = this.nextNode;
        this.nextNode = loopDestination;
    }

    /**
     * Constructs a LoopNode object specifying the previous node, the timing
     * until the next node is called, the looping location, and the number of
     * times the loop occurs.
     *
     * @param prev the previous node in the list.
     * @param delayDuration how long until the next node is called in
     * milliseconds.
     * @param loopDestination while looping, this is the nextNode.
     * @param repeatCount the number of times node will loop before reverting.
     * Negative number for an infinite loop.
     */
    LoopNode(Node prev, int delayDuration, Node loopDestination, int repeatCount) {
        super(prev, null, delayDuration);
        this.actualNext = this.nextNode;
        this.nextNode = loopDestination;
    }

    /**
     * Constructs a LoopNode object specifying the previous node, the looping
     * location, and the number of times the loop occurs.
     *
     * @param prev the previous node in the list.
     * @param loopDestination while looping, this is the nextNode.
     * @param repeatCount the number of times node will loop before reverting.
     * Negative number for an infinite loop.
     */
    LoopNode(Node prev, Node loopDestination, int repeatCount) {
        super(prev, null, 50);
        this.actualNext = this.nextNode;
        this.nextNode = loopDestination;
    }

    /**
     * Gets the repeat count.
     *
     * @return the number of times the node will loop before reverting.
     */
    public int getRepeatCount() {
        return repeatCount;
    }

    /**
     * Sets the repeat count.
     *
     * @param repeatCount the number of times the node will loop before
     * reverting.
     */
    public void setRepeatCount(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    /**
     * Runs the node's contents.
     */
    @Override
    public void runNode() {
        if (repeatCount > 0) {
            repeatCount--;
            if (repeatCount == 0) {
                this.nextNode = actualNext;
            }
        }
    }
}
