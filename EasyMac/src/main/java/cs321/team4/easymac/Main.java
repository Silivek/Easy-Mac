/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cs321.team4.easymac;


import java.util.Scanner;
import cs321.team4.easymac.FileGenerator;
import cs321.team4.easymac.FileReader;
import cs321.team4.easymac.nodes.Node;
import cs321.team4.easymac.nodes.KeyInputNode;
import cs321.team4.easymac.nodes.MouseInputNode;
import java.awt.event.KeyEvent;


/**
 * @author Melissa
 */

public class Main {

    //TODO write saveTimeline function
    public void saveTimeline(String name, Timeline recordedTimeline) {
        // write timeline Object to file
        // use name for name of file
    }
    
    ;
    
    //TODO write loadTimeline function
    public Timeline loadTimeline(String name) {
        // find file on file path
        // return timeline object
        Timeline timelineToLoad = new Timeline();
        // look to see if the file is there
        // if the file is there, store it in timelineToLoad
        return timelineToLoad;
    }

    ;
    
    //TODO write editTimeline function
    public Timeline editTimeline(Timeline recordedTimeline) {
        // find and return timeline
        // use the Timeline functions to edit timeline
        // save to tile
        return recordedTimeline;
    }

    ;
     // @param args
     
 
    public static void main(String args[]) {
        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*             Welcome to EasyMac            *");
        System.out.println("*                                           *");
        System.out.println("*    Please make your selection from the    *");
        System.out.println("*                  menu below               *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");

        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*            1. Create a new macro          *");
        // System.out.println("*            2. Load a saved macro          *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");

        // create a scanner object
        Scanner userSelection = new Scanner(System.in);
        // prompt user
        System.out.println("Please make your selection and press enter: ");
        // store user input
        Timeline userCreatedTimeline = new Timeline();  
        int selection = userSelection.nextInt();
        if (selection == 1) {
            String keyPress = "";
            System.out.println("Enter -1 at any time to escape the program.");
             
            while(!keyPress.equals("-1"))
            {
                System.out.print("Enter an input: ");
                keyPress = userSelection.next();
                if(keyPress.equals("left")||keyPress.equals("Left"))
                {
                   
                   
                    
                    // TODO left click node stuff
                }
                else if(keyPress.equals("right")||keyPress.equals("Right"))
                {
                    //MouseInputNode mouseNodeToAdd = new mouseNodeToAdd();
                    //mouseNodeToAdd = mouseNodeToAdd(keyPress);
                    // TODO right click node stuff
                }
                else //key node, all VK values are ASCII capital letters KeyEvent.VK_$
                {
                    keyPress = keyPress.toUpperCase();
                    char vkValue = keyPress.toCharArray()[0];
                                              
                    KeyInputNode nodeToAdd = new KeyInputNode(null, vkValue);
                    userCreatedTimeline.insertNode(nodeToAdd, 5);
                    
                   //if userCreatedTimeline.getHead() == NULL
                   // add nodeToAdd at head;
                                       

                   
                }
            }
        }
    }
}
