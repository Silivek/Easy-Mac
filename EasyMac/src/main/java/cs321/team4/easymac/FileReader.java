/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import cs321.team4.easymac.nodes.KeyInputNode;
import cs321.team4.easymac.nodes.MouseInputNode;
import cs321.team4.easymac.nodes.Node;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.File;
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
     * @return Timeline to be loaded.
     */
    public static Timeline ReadTimeline(String filePath) throws ClassNotFoundException {

        try {
            File file = new File(filePath);
            Scanner read = new Scanner(file);
            Timeline tLine = new Timeline();
            while (read.hasNextLine())
            {
                int button = read.nextInt();
                
                if(button == 1024 || button == 2048)
                {
                    int delay = read.nextInt();
                    boolean press = read.nextBoolean();
                    int x = read.nextInt();
                    int y = read.nextInt();
                    MouseInputNode mouse = new MouseInputNode(null, delay, press, button, x, y);
                    tLine.addNode(mouse);
                }
                else
                {
                    
                    int delay = read.nextInt();
                    boolean press = read.nextBoolean();
                    KeyInputNode newNode = new KeyInputNode(null, delay, press, button);
                    tLine.addNode(newNode);
                }
            }
            return tLine;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
