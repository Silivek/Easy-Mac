/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * A class to create a file path for storing a user's macro
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
            FileOutputStream fout = new FileOutputStream(filePath);
            try (ObjectOutputStream oOut = new ObjectOutputStream(fout)) //creates the object printer
            {
                Object billy = tLine.startNode;
                oOut.writeObject(billy);  //write the timeline to the file
                tLine.currentNode = tLine.startNode;
                for(int i = 1; i <6; i++)
                {
                    oOut.writeObject(billy);
                    billy = tLine.currentNode.getNextNode();
                    System.out.println(i);
                }
                oOut.close();
                fout.close();
            } //write the timeline to the file
        } catch (IOException ex) {
            ex.printStackTrace();  
        }
    }
}
