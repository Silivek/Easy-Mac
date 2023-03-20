/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cs321.team4.easymac;

import java.util.Scanner;

/**
 * @author Melissa
 */

public class Main {

    //TODO write saveTimeline function
    void saveTimeline(String name, Timeline recordedTimeline) {
        // write timeline Object to file
        // use name for name of file
    }

    ;
    
    //TODO write loadTimeline function
    Timeline loadTimeline(String name) {
        // find file on file path
        // return timeline object
        return Timeline;
    }

    ;
    
    //TODO write editTimeline function
    Timeline editTimeline(Timeline recordedTimeline) {
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
        int selection = userSelection.nextInt();

        if (selection == 1) {
            // I'm aware this isn't practical, but just wanted something to get testing
            System.out.println("Enter your desired key strokes, press 3 when finished");
            Scanner input = new Scanner(System.in);
            int userInput = userSelection.nextInt();            // will inputs be read into node?
            while (userInput != 3) {
                // int userInput = userSelection.nextInt(); 

                // take user input, create node
                Node userCreatedNode = getInput(userInput);
                // add node to timeline
                // delete node
                //create a new scanner item
                Scanner input = new Scanner(System.in);
                int userInput = userSelection.nextInt();
            }
        }
    }
}
