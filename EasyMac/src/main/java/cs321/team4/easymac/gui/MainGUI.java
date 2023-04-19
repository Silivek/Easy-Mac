/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cs321.team4.easymac.gui;

import cs321.team4.easymac.FileGenerator;
import cs321.team4.easymac.FileReader;
import cs321.team4.easymac.nodes.Node;
import java.awt.event.MouseEvent;
import cs321.team4.easymac.nodes.KeyInputNode;
import cs321.team4.easymac.nodes.InputNode;
import cs321.team4.easymac.Main;
import static cs321.team4.easymac.Main.createNewMacro;
import cs321.team4.easymac.Timeline;
import cs321.team4.easymac.interfaces.IActionCanceller;
import javax.swing.JButton;
import cs321.team4.easymac.nodes.MouseInputNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import utilities.KeyListener;

/**
 *
 * @author wkilp
 */
public class MainGUI extends javax.swing.JFrame implements IActionCanceller {

    java.io.File currentFile;

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    Timeline testingTimeline;
    Node currentNode;
    String keyPress;
    KeyListener listener = new KeyListener();
    Scanner userSelection = new Scanner(System.in);
    boolean stopMacro = false;
    
    /**
     * refreshes the GUI to show the current data held in currentNode
     */
    private void refreshCurrentNode() {
       if (currentNode instanceof MouseInputNode) {
           MouseInputNode mouseNode = (MouseInputNode) currentNode;
           KeyorMouseComboBox.setSelectedIndex(1);
           xCoordinate.setText(String.valueOf(mouseNode.getXCoordinate()));
           yCoordinate.setText(String.valueOf(mouseNode.getYCoordinate()));
       } else {
           KeyorMouseComboBox.setSelectedIndex(0);
           xCoordinate.setText("n/a");
           yCoordinate.setText("n/a");
       }
       if (currentNode.getPressRelease()) {
           PressOrRelease.setSelectedIndex(1);
       } else {
           PressOrRelease.setSelectedIndex(0);
       }
       char asciiValue = (char)currentNode.getButton();
       KeyEntry.setText(""+asciiValue);
       DelayDisplay.setText(String.valueOf(currentNode.getDelayDuration()));
    }
    public MainGUI(Timeline timeline) {
        initComponents();
        testingTimeline = timeline;
        currentNode = testingTimeline.getStartNode();
        leftArrow.setVisible(false);
        
        if (currentNode.getNextNode() == null) {
            rightArrow.setVisible(false);
        }
                
        refreshCurrentNode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileName = new javax.swing.JTextPane();
        fileLabel = new javax.swing.JLabel();
        newButton = new javax.swing.JButton();
        SaveAsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTextDisplay = new javax.swing.JTextArea();
        recordButton = new javax.swing.JButton();
        playBackButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        leftArrow = new javax.swing.JButton();
        rightArrow = new javax.swing.JButton();
        PressOrRelease = new javax.swing.JComboBox<>();
        DelayDisplay = new javax.swing.JTextField();
        KeyEntry = new javax.swing.JTextField();
        keyEntryLabel = new javax.swing.JLabel();
        KeyorMouseLabel = new javax.swing.JLabel();
        delayLabel = new javax.swing.JLabel();
        pressOrReleaseLabel = new javax.swing.JLabel();
        KeyorMouseComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        stopMacroButton = new javax.swing.JButton();
        applyChangesButton = new javax.swing.JButton();
        xCoordinate = new javax.swing.JTextField();
        xLabel = new javax.swing.JLabel();
        yCoordinate = new javax.swing.JTextField();
        yLabel = new javax.swing.JLabel();
        startMacroButton = new javax.swing.JButton();
        addNodeButton = new javax.swing.JButton();
        removeNodeButton = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 75, 154));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(54, 75, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        openButton.setText("Open...");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });
        jPanel1.add(openButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        fileName.setEditable(false);
        fileName.setBackground(new java.awt.Color(80, 80, 80));
        jScrollPane1.setViewportView(fileName);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 170, -1));

        fileLabel.setBackground(new java.awt.Color(232, 208, 51));
        fileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLabel.setLabelFor(fileName);
        fileLabel.setText("Current File");
        fileLabel.setOpaque(true);
        jPanel1.add(fileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 70, 20));

        newButton.setText("New...");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        SaveAsButton.setText("Save As...");
        SaveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SaveAsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        mainTextDisplay.setColumns(20);
        mainTextDisplay.setRows(5);
        jScrollPane2.setViewportView(mainTextDisplay);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 340, 80));

        recordButton.setText("Record");
        recordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(recordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        playBackButton.setText("Playback");
        playBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(playBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        jPanel1.add(stopButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jTabbedPane1.addTab("File", jPanel1);

        jPanel3.setBackground(new java.awt.Color(54, 75, 154));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftArrow.setBackground(new java.awt.Color(232, 208, 51));
        leftArrow.setIcon(new javax.swing.ImageIcon("resources/leftArrow.png"));
        leftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftArrowActionPerformed(evt);
            }
        });
        jPanel3.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 120, 120));

        rightArrow.setBackground(new java.awt.Color(232, 208, 51));
        rightArrow.setIcon(new javax.swing.ImageIcon("resources/rightArrow.png"));
        rightArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightArrowActionPerformed(evt);
            }
        });
        jPanel3.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 120, 120));

        PressOrRelease.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Press", "Release" }));
        PressOrRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressOrReleaseActionPerformed(evt);
            }
        });
        jPanel3.add(PressOrRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 90, -1));

        DelayDisplay.setText("Delay");
        jPanel3.add(DelayDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 90, -1));

        KeyEntry.setText("Button");
        KeyEntry.setToolTipText("");
        jPanel3.add(KeyEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 90, -1));

        keyEntryLabel.setBackground(new java.awt.Color(232, 208, 51));
        keyEntryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keyEntryLabel.setText("Key");
        keyEntryLabel.setOpaque(true);
        jPanel3.add(keyEntryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, 20));

        KeyorMouseLabel.setBackground(new java.awt.Color(232, 208, 51));
        KeyorMouseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KeyorMouseLabel.setText("Type");
        KeyorMouseLabel.setOpaque(true);
        jPanel3.add(KeyorMouseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, 20));

        delayLabel.setBackground(new java.awt.Color(232, 208, 51));
        delayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delayLabel.setText("Delay");
        delayLabel.setOpaque(true);
        jPanel3.add(delayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 20));

        pressOrReleaseLabel.setBackground(new java.awt.Color(232, 208, 51));
        pressOrReleaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pressOrReleaseLabel.setText("Press/Release");
        pressOrReleaseLabel.setOpaque(true);
        jPanel3.add(pressOrReleaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 20));

        KeyorMouseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keyboard", "Mouse" }));
        KeyorMouseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyorMouseComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(KeyorMouseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("resources/easymacButton.png"));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 50, -1, -1));

        stopMacroButton.setBackground(new java.awt.Color(153, 0, 0));
        stopMacroButton.setForeground(new java.awt.Color(242, 242, 242));
        stopMacroButton.setText("Stop Macro");
        stopMacroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopMacroActionPerformed(evt);
            }
        });
        jPanel3.add(stopMacroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        applyChangesButton.setText("Apply Changes");
        applyChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyChangesButtonActionPerformed(evt);
            }
        });
        jPanel3.add(applyChangesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 120, -1));

        xCoordinate.setText("X");
        jPanel3.add(xCoordinate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 90, -1));

        xLabel.setBackground(new java.awt.Color(232, 208, 51));
        xLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xLabel.setText("X");
        xLabel.setOpaque(true);
        jPanel3.add(xLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 80, 20));

        yCoordinate.setText("Y");
        jPanel3.add(yCoordinate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 90, -1));

        yLabel.setBackground(new java.awt.Color(232, 208, 51));
        yLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yLabel.setText("Y");
        yLabel.setOpaque(true);
        jPanel3.add(yLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 80, 20));

        startMacroButton.setBackground(new java.awt.Color(0, 153, 51));
        startMacroButton.setForeground(new java.awt.Color(242, 242, 242));
        startMacroButton.setText("Start Macro");
        startMacroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMacroActionPerformed(evt);
            }
        });
        jPanel3.add(startMacroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        addNodeButton.setText("Add Node");
        addNodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNodeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addNodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 120, -1));

        removeNodeButton.setBackground(new java.awt.Color(255, 0, 0));
        removeNodeButton.setText("Remove Node");
        removeNodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNodeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(removeNodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, -1));

        jTabbedPane1.addTab("Edit", null, jPanel3, "");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PressOrReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressOrReleaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PressOrReleaseActionPerformed

    private void KeyorMouseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyorMouseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeyorMouseComboBoxActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        // open a filechooser dialog menu.
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        if (fileChooser.showOpenDialog(MainGUI.this) == javax.swing.JFileChooser.APPROVE_OPTION) {
            // load from selected file
            currentFile = fileChooser.getSelectedFile();
            fileName.setText(currentFile.getName());
        }
        try {
            testingTimeline = FileReader.ReadTimeline(currentFile.getAbsolutePath());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        mainTextDisplay.setText("Press Record to begin recording your macro. Press stop when you are finished.");
        testingTimeline = new Timeline();
        testingTimeline.addNode(new KeyInputNode(null, 0));
        currentNode = testingTimeline.getStartNode();
        refreshCurrentNode();
    }//GEN-LAST:event_newButtonActionPerformed

    private void SaveAs(java.awt.event.ActionEvent evt) {
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
            if (fileChooser.showSaveDialog(MainGUI.this) == javax.swing.JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                fileName.setText(currentFile.getName());
                //save to selected file
                FileGenerator.fileGeneration(testingTimeline, currentFile.getAbsolutePath());
            }    
    }      
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    // TODO add your handling code here:
        if (currentFile != null) {
            //save timeline to preexisting file if it exists
            FileGenerator.fileGeneration(testingTimeline, currentFile.getAbsolutePath());
        } else {
            //else default to save as... functionality
            SaveAs(evt);
            }
    }//GEN-LAST:event_saveButtonActionPerformed

    
    private void leftArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftArrowActionPerformed
        if (currentNode.getPrevNode() != null) {
            currentNode = currentNode.getPrevNode();
            // send model info to viewer
            refreshCurrentNode();
        }
        updateLeftArrow(leftArrow);
        updateRightArrow(rightArrow);
    }//GEN-LAST:event_leftArrowActionPerformed

    private void rightArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightArrowActionPerformed
        if (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            // send model info to viewer
            refreshCurrentNode();
        }
        updateRightArrow(rightArrow);
        updateLeftArrow(leftArrow);
    }//GEN-LAST:event_rightArrowActionPerformed

    private void playBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBackButtonActionPerformed
        testingTimeline.runTimeline(this);
    }//GEN-LAST:event_playBackButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        GlobalScreen.removeNativeKeyListener(listener);
        try {
            GlobalScreen.unregisterNativeHook();
        } catch (NativeHookException ex) {
            ex.printStackTrace();
        }
        testingTimeline = listener.getCreatedTimeline();
        currentNode = testingTimeline.getStartNode();
        mainTextDisplay.setText("Recording completed. ");
        refreshCurrentNode();
        updateLeftArrow(leftArrow);
        updateRightArrow(rightArrow);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtonActionPerformed
        mainTextDisplay.setText("Recording in process...");
        try{
            GlobalScreen.registerNativeHook();
        }catch (NativeHookException e){
            e.printStackTrace();
        }
        
        GlobalScreen.addNativeKeyListener(listener);
    }//GEN-LAST:event_recordButtonActionPerformed

    private void addNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNodeButtonActionPerformed
        // TODO add your handling code here:
        //Check if currentNode is endnode
        Node newNode = new Node();
        testingTimeline.setCurrentNode(currentNode); //Sync current nodes (!!)
        
        if (testingTimeline.getCurrentNode() == testingTimeline.getEndNode()) {
            //If so then use addNode 
            testingTimeline.addNode(newNode);
        } else {
            //else use insertBeforeNode
            testingTimeline.insertBeforeNode(currentNode, newNode, 0);
        }
        
        updateRightArrow(rightArrow);
        updateLeftArrow(leftArrow);
        
    }//GEN-LAST:event_addNodeButtonActionPerformed

    private void applyChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyChangesButtonActionPerformed
        Node newNode;
        int delayDuration = Integer.parseInt(DelayDisplay.getText());
        boolean pressRelease = PressOrRelease.getSelectedIndex() == 1;
        if (KeyorMouseComboBox.getSelectedIndex() == 1) {
            int button;
            if (KeyEntry.getText().toLowerCase().equals("left"))
                button = MouseEvent.BUTTON1_DOWN_MASK;
            else if (KeyEntry.getText().toLowerCase().equals("right"))
                button = MouseEvent.BUTTON2_DOWN_MASK;
            else if (KeyEntry.getText().toLowerCase().equals("middle"))
                button = MouseEvent.BUTTON3_DOWN_MASK;
            else {
                KeyEntry.setText("Invalid Entry");
                return;
            }
            int x = Integer.parseInt(xCoordinate.getText()),
                y = Integer.parseInt(yCoordinate.getText());
            newNode = new MouseInputNode(null, delayDuration, pressRelease, button, x, y);
        }
        else {
            int button = (int)KeyEntry.getText().toUpperCase().charAt(0);
            newNode = new KeyInputNode(null, delayDuration, pressRelease, button);
        }
        testingTimeline.setCurrentNode(currentNode);
        testingTimeline.insertBeforeNode(currentNode, newNode, delayDuration);
        if (currentNode.getNextNode() == null)
            testingTimeline.removeEndNode();
        else
            testingTimeline.removeCurrentNode();
        currentNode = newNode;
        refreshCurrentNode();
    }//GEN-LAST:event_applyChangesButtonActionPerformed

    private void removeNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNodeButtonActionPerformed
        // TODO add your handling code here:
        //Remove current node
        if (currentNode != null) {
            //if (currentNode == testingTimeline.getStartNode())
                //testingTimeline.setStartNode();
            testingTimeline.setCurrentNode(currentNode); //Sync current nodes
            
            if (currentNode.getPrevNode() == null) {
                currentNode = currentNode.getNextNode(); //Set new current node (for GUI only)
            } else {
                currentNode = currentNode.getPrevNode(); //Set new current node (for GUI only)
            }
            
            if (testingTimeline.getCurrentNode() != testingTimeline.getEndNode()) {
                testingTimeline.removeCurrentNode();
            } else {
                testingTimeline.removeEndNode();
            }
            /*
            *  Note, because of this implementation, currentNode in the timeline
            *  and currentNode in the gui will not always return the same node.
            *  This shouldn't be an issue, but it will be necessary to call
            *  testingTimeline.setCurrentNode(currentNode) whenever you want use
            *  the timeline's currentNode, like in the case of removeCurrentNode().
            */
        }
        updateRightArrow(rightArrow);
        updateLeftArrow(leftArrow);

        if (currentNode.getNextNode() == null) {
                rightArrow.setVisible(false);
        }
    }//GEN-LAST:event_removeNodeButtonActionPerformed

    private void startMacroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMacroActionPerformed
        stopMacro = false;
        Thread t = new Thread()
        {
            @Override
            public void run()
            {
                testingTimeline.runTimeline(MainGUI.this);
            }
        };
        t.start();
    }//GEN-LAST:event_startMacroActionPerformed

    private void stopMacroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopMacroActionPerformed
        cancelAction();
    }//GEN-LAST:event_stopMacroActionPerformed

    private void SaveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsButtonActionPerformed
        SaveAs(evt);
    }//GEN-LAST:event_SaveAsButtonActionPerformed
    @Override
    public synchronized void cancelAction() {
        stopMacro = true;
    }
    @Override
    public synchronized boolean actionCancelled() {
        return stopMacro;
    }
    // this may not be necessary since it is a global variable in this file
    public Timeline getTimeline() {
        return testingTimeline;
    }

    /**
     * When there are no longer any next nodes, the button to access the next
     * node disappears.
     *
     * @param rightArrow which is the button to access the next node.
     */
    public void updateRightArrow(JButton rightArrow) {
        if (currentNode == testingTimeline.getEndNode()) {
            rightArrow.setVisible(false);
        } else {
            rightArrow.setVisible(true);
        }
    }

    /**
     * When there are no longer any more previous nodes, the button to access
     * the previous node disappears.
     *
     * @param leftArrow the button to access the previous node.
     */
    public void updateLeftArrow(JButton leftArrow) {
        if (currentNode == testingTimeline.getStartNode()) {
            leftArrow.setVisible(false);
        } else {
            leftArrow.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DelayDisplay;
    private javax.swing.JTextField KeyEntry;
    private javax.swing.JComboBox<String> KeyorMouseComboBox;
    private javax.swing.JLabel KeyorMouseLabel;
    private javax.swing.JComboBox<String> PressOrRelease;
    private javax.swing.JButton SaveAsButton;
    private javax.swing.JButton addNodeButton;
    private javax.swing.JButton applyChangesButton;
    private javax.swing.JLabel delayLabel;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JTextPane fileName;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel keyEntryLabel;
    private javax.swing.JButton leftArrow;
    private javax.swing.JTextArea mainTextDisplay;
    private javax.swing.JButton newButton;
    private javax.swing.JButton openButton;
    private javax.swing.JButton playBackButton;
    private javax.swing.JLabel pressOrReleaseLabel;
    private javax.swing.JButton recordButton;
    private javax.swing.JButton removeNodeButton;
    private javax.swing.JButton rightArrow;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton startMacroButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton stopMacroButton;
    private javax.swing.JTextField xCoordinate;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField yCoordinate;
    private javax.swing.JLabel yLabel;
    // End of variables declaration//GEN-END:variables
}
