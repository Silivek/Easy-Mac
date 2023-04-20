/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cs321.team4.easymac;

import java.util.Scanner;
import cs321.team4.easymac.nodes.KeyInputNode;
import cs321.team4.easymac.nodes.MouseInputNode;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import cs321.team4.easymac.gui.MainGUI;

/**
 * A class to run the EasyMac program in the command line.
 *
 * @author Melissa
 */
public class Main {

    /**
     * Provides the opening menu for the command line
     */
    public static void introMenu() {
        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*             Welcome to EasyMac            *");
        System.out.println("*                                           *");
        System.out.println("*    Please make your selection from the    *");
        System.out.println("*                  menu below               *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
    }

    /**
     * Provides the menu for navigating macro options
     */
    public static void optionMenu() {
        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*            1. Create a new macro          *");
        // System.out.println("*            2. Load a saved macro          *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
    }

    /**
     * Adds elements to the timeline based on user selection and input
     *
     * @param selection the option chosen by the user for their next action
     * @param userCreatedTimeline the timeline that the user is building
     * @param userSelection reads in the user's selections
     */
    public static void createNewMacro(int selection, Timeline userCreatedTimeline, Scanner userSelection) {
        if (selection == 1) {
            String keyPress = "";
            System.out.println("Enter -1 to stop entering values. Press -2 at any time to run your macro. Currently accepted inputs are Left, Right, and any non-special character (although some do work). Left and Right designate Mouse Clicks");

            while (!keyPress.equals("-1")) {
                System.out.print("Enter an input: ");
                keyPress = userSelection.next();
                if (keyPress.equals("-2")) {
                    //userCreatedTimeline.runTimeline();
                } else if (keyPress.equals("left") || keyPress.equals("Left")) {
                    MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON1_DOWN_MASK); // left click node
                    userCreatedTimeline.addNode(nodeToAdd);

                } else if (keyPress.equals("right") || keyPress.equals("Right")) {
                    MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON2_DOWN_MASK); // right click node
                    userCreatedTimeline.addNode(nodeToAdd);
                } else if (!keyPress.equals("-1")) //key node, all VK values are ASCII capital letters KeyEvent.VK_$
                {
                    keyPress = keyPress.toUpperCase();
                    char vkValueChar = keyPress.toCharArray()[0];
                    int vkValueInt = vkValueChar;
                    KeyInputNode nodeToAdd = new KeyInputNode(null, vkValueInt);
                    userCreatedTimeline.addNode(nodeToAdd);
                }
            }
        }
    }

    // @param args
    /**
     * Runs the program execution.
     *
     * @param args
     */
    public static void main(String args[]) {

        new MainGUI().setVisible(true);
//        introMenu();
//        optionMenu();

        // When we get to creating the macro in the gui, this will need to go in that portion
        // create a scanner object
//        Scanner userSelection = new Scanner(System.in);
////        // prompt user
//        System.out.println("Please make your selection and press enter: ");
////        // store user input
//        Timeline userCreatedTimeline = new Timeline();
//        int selection = userSelection.nextInt();
////        createNewMacro(selection, userCreatedTimeline, userSelection);
//        if (selection == 1) {
//            String keyPress = "";
//            System.out.println("Enter -1 to stop entering values. Press -2 at any time to run your macro. Currently accepted inputs are Left, Right, and any non-special character (although some do work). Left and Right designate Mouse Clicks");
//
//            while (!keyPress.equals("-1")) {
//                System.out.print("Enter an input: ");
//                keyPress = userSelection.next();
//                if (keyPress.equals("-2")) {
//                    userCreatedTimeline.runTimeline();
//                } else if (keyPress.equals("left") || keyPress.equals("Left")) {
//                    MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON1_DOWN_MASK); // left click node
//                    userCreatedTimeline.addNode(nodeToAdd);
//
//                } else if (keyPress.equals("right") || keyPress.equals("Right")) {
//                    MouseInputNode nodeToAdd = new MouseInputNode(null, MouseEvent.BUTTON2_DOWN_MASK); // right click node
//                    userCreatedTimeline.addNode(nodeToAdd);
//                } else if (!keyPress.equals("-1"))//key node, all VK values are ASCII capital letters KeyEvent.VK_$
//                {
//                    keyPress = keyPress.toUpperCase();
//                    char vkValueChar = keyPress.toCharArray()[0];
//                    int vkValueInt = vkValueChar;
//                    KeyInputNode nodeToAdd = new KeyInputNode(null, vkValueInt);
//                    userCreatedTimeline.addNode(nodeToAdd);
//                }
//            }
//            
        /*System.out.println("Would you like to save your macro? Press 1 for yes or 2 for no");
            keyPress = userSelection.next();
            if(keyPress.equals("1")){
                System.out.println("Please enter the name of your macro");
                keyPress = userSelection.next();
                String name = keyPress;
                
                FileGenerator.fileGeneration(userCreatedTimeline, name);
            }*/
//        }
//        new MainGUI(userCreatedTimeline).setVisible(true);
    }

}
