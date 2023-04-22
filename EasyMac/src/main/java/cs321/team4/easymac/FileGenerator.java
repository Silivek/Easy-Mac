/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import java.io.IOException;
import java.io.FileWriter;

/**
 * A class to create a file path for storing a user's macro.
 *
 * @author Logan Price
 */
public class FileGenerator {

    /**
     * Constructs a FileGenerator object that generates a path to a file.
     *
     * @param tLine the timeline to be saved.
     * @param filePath the name of the file.
     */
    public static void fileGeneration(Timeline tLine, String filePath) {
        try {
            //FileOutputStream fout = new FileOutputStream(filePath + ".ezm"); //create the file to print the object to
            try (FileWriter fOut = new FileWriter(filePath)) //creates the object printer
            {
                fOut.write(tLine.startNode.toString() + "\n");
                tLine.currentNode = tLine.startNode.getNextNode();
                for (int i = 1; i < tLine.numOfNodes - 1; i++) {
                    fOut.write(tLine.currentNode.toString() + "\n");
                    tLine.currentNode = tLine.currentNode.getNextNode();
                }
                fOut.write(tLine.currentNode.toString());
                fOut.close();
            } //write the timeline to the file
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
