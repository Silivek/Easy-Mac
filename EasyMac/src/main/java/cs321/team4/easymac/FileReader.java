/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import cs321.team4.easymac.nodes.Node;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * A class that reads saved macro files.
 *
 * @author Logan Price
 */
public class FileReader {

    /**
     * Reads the macro from the file.
     *
     * @param filePath where the saved macro is located.
     * @throws ClassNotFoundException if file is not found.
     */
    public static Timeline ReadTimeline(String filePath) throws ClassNotFoundException {

        System.out.println("File Should Have been read");
        try {
            FileInputStream fIn = new FileInputStream(filePath); //designates the location to read from
            Timeline orange = new Timeline();
            try (ObjectInputStream oIn = new ObjectInputStream(fIn)) //creates the object reader
            {
                for (int i = 0; i < 3; i++) //Runs as long as there are objects in the file
                {
                    Object tLine = (ObjectInputStream) oIn.readObject();  //set an object equal to a line
                    orange.addNode((Node) tLine);
                    orange.currentNode.runNode();
                    System.out.println(tLine); //print the object
                    System.out.println("File Should Have been read");
                }
                oIn.close();
                fIn.close();
                return orange;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
