/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author Logan Price
 */
public class FileReader {
    // TODO set up the File Reader classes
    public void ReadTimeline () throws ClassNotFoundException
    {
        try {
            FileInputStream fIn = new FileInputStream(".Documents/Timeline.txt"); //designates the location to read from
            try (ObjectInputStream oIn = new ObjectInputStream(fIn)) //creates the object reader
            {
                while (oIn.available()!= 0)    //Runs as long as there are objects in the file
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
