/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs321.team4.easymac;

import java.nio.file.Path;
import java.nio.file.Files;

/**
 *
 * @author Melissa
 */
public class Main {

    /**
     * Generic description here again
     *
     */
    //TODO try to set up Main class

    Timeline item;
    String name;

    /**
     * Takes inputs of the nodes of a timeline and saves the contents to a data
     * structure?
     *
     * @param name
     */
    // TODO write the recordTimeline method
    void recordTimeline(Timeline name) {
        // save nodes and timings to an array?
    }

    ;
    
    /** saveTimline takes a Timeline object and String name
     * Stores the Timeline Object to the file 
     * Uses String name to name the file
     * @param name 
     */
    // TODO writed the saveTimeline method
    void saveTimeline(Timeline item, String name) {
        
        // Locate Home Directory for saving the file
        String userHomeDir = System.getProperty("user.home");
        
        // Path of where we would like to store the file
        Path pathDir = Path.of("${userHomeDir}/EasyMacSavedFiles");
        
        // Determine if directory exists/ if not make path with file
        Boolean exists = Files.exists(pathDir);
        if (!exists) {
            // Example from class- not actual path for anything
            Path newDirectory = Files.createDirectories(pathDir.getParent().resolve("EasyMacSavedFiles/${name}.txt"));
            newDirectory = Path.createFile(pathDir.getParent().resolve(${name}.txt");
        }else if{
            // Directory does exist but file does not
            // create file on the path
        }else{
            // both exist, set path to where the file is
        }
            //Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir"));

            //Path pathFile = Path.of("c:/${userHomeDir}/EasyMacSavedFiles/${name}.txt");

            Boolean exists = Files.exists(pathDir);
            if (!exists) {
                Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir"));
                Path newFiles = Files.createFile(newDirectory.resolve("${name}.txt"), attrs);
                //Path tryAgain = Path.get(System.getProperty("user.home"), "EasyMacSavedFiles");

            }
            //send contents of timeline to a file
        };
        /**
         * loadTimeline searches the files for a saved timeline and returns its
         * contents
         *
         * @param name
         * @return
         */

        // TODO create loadTimeline method
        Timeline loadTimeline
        (Timeline name
        
            ){
        // search for name of timeline/name of file
        // find timeline file and return contents
         return name;
        };
        /**
         * editTimeline method adds or removes events from the timeline? Will
         * need to discuss how this is different from Timeline that is already
         * there
         *
         * @param name
         */

        //TODO created editTimeline method
        void editTimeline
        (Timeline name
        
        ){
        // add timeline event
        // remove timeline event
    };
    }
