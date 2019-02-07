/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.examples.com600.mcride.swingcient.gui;

import org.solent.examples.com600.mcride.swingcient.ModelController;
import org.solent.examples.com600.mcride.swingcient.ModelControllerDummyImpl;

/**
 *
 * @author cgallen
 */
public class AppMainJFrame extends javax.swing.JFrame {
    
    /**
     * Model controller allows data to be injected into the component
     */
    private ModelController modelController =null;

    
        /**
     * Creates new form AppMainJFrame
     */
    public AppMainJFrame() {
        // giving dummy data to display
        this.modelController = new ModelControllerDummyImpl();
        initComponents();        
    }
    
    /**
     * Creates new form AppMainJFrame
     */
    public AppMainJFrame(ModelController modelController) {
        this.modelController = modelController;
        initComponents();        
    }


    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // CUSTOM CODE injects modelController into panel
        controlsJPanel1 = new org.solent.examples.com600.mcride.swingcient.gui.ControlsJPanel(modelController);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(controlsJPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.solent.examples.com600.mcride.swingcient.gui.ControlsJPanel controlsJPanel1;
    // End of variables declaration//GEN-END:variables
}
