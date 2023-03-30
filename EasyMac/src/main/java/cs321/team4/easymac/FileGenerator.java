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
            FileOutputStream fout = new FileOutputStream(filePath + ".ezm"); //create the file to print the object to
            try (ObjectOutputStream oOut = new ObjectOutputStream(fout)) //creates the object printer
            {
                oOut.writeObject(tLine);  //write the timeline to the file
            } //write the timeline to the file
        } catch (IOException ex) {
            System.out.println("An error occurred.");
        }
    }
}
