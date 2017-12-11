/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_airfrance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Asus-Pc
 */
public class Projet_AirFrance {

    private static JFrame frame = new JFrame();
    private static JPanel panel = new mainWindow();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frame.setSize(500, 250);
        frame.add(panel);
        frame.setVisible(true);
    }
}
