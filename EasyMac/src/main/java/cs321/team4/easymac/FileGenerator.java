/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import cs321.team4.easymac.nodes.MouseInputNode;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
                fOut.write(tLine.startNode.toString());
                tLine.currentNode = tLine.startNode.getNextNode();
                for (int i = 1; i < tLine.numOfNodes; i++) {
                    fOut.write(tLine.currentNode.toString());
                    tLine.currentNode = tLine.currentNode.getNextNode();
                }
                fOut.close();
            } //write the timeline to the file
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
