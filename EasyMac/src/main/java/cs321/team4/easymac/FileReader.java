/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * A class that reads saved macro files.
 *
 * @author Logan Price
 */
public class FileReader {

    // TODO set up the File Reader classes
    /**
     * Reads the macro from the file.
     *
     * @param filePath location where the data is saved.
     * @throws ClassNotFoundException.
     */
    public static void ReadTimeline(String filePath) throws ClassNotFoundException {
        try {
            FileInputStream fIn = new FileInputStream(filePath + ".ezm"); //designates the location to read from
            try (ObjectInputStream oIn = new ObjectInputStream(fIn)) //creates the object reader
            {
                while (oIn.available() != 0) //Runs as long as there are objects in the file
                {
                    Object tLine = (ObjectInputStream) oIn.readObject();  //set an object equal to a line
                    System.out.println(tLine); //print the object
                }
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
        }
    }
}
