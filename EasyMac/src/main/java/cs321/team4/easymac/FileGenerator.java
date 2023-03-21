/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author Logan Price
 */
public class FileGenerator {
    public void fileGeneration(Timeline tLine) {
        try {
            FileOutputStream fout = new FileOutputStream(".Documents/Timeline.txt"); //create the file to print the object to
            try (ObjectOutputStream oOut = new ObjectOutputStream(fout)) //creates the object printer
            {
                oOut.writeObject(tLine);  //write the timeline to the file
            } //write the timeline to the file
        } catch (IOException ex) {
        System.out.println("An error occurred.");
        }
    } 
}
