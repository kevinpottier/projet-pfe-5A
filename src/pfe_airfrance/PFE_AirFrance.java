/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe_airfrance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Asus-Pc
 */
public class PFE_AirFrance {

    private static JFrame frame = new JFrame();
    private static JPanel pan = new JPanel();
    private static JButton bouton = new JButton("Select File");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        
        //Parametrage de la fenetre
        fenetre.setTitle("App AirFrance");
        fenetre.setSize(400, 400);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
        
        //Ajout du bouton pour chercher un fichier
        pan.add(bouton);
        fenetre.setContentPane(pan);
        fenetre.setVisible(true);
        
        //Action lors du clique du bouton
        bouton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                //Ouverture de la recherche de fichier
                JFileChooser choix = new JFileChooser();
                choix.setMultiSelectionEnabled(true) ;
                choix.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int retour = choix.showOpenDialog(fenetre);
                //Si un fichier est selectionné
                if(retour == JFileChooser.APPROVE_OPTION){
                    JLabel jlabel;
                    //récupération du/des fichier/s selectionnés
                    File[] fs=choix.getSelectedFiles();
                    for( int i = 0; i<fs.length; ++i){
                        //Pour tout les fichiers affichage de leur chemein absolut
                        jlabel = new JLabel(fs[i].getAbsolutePath());
                        pan.add(jlabel);
                        fenetre.setContentPane(pan);
                    }
                }
            }
          });
    }
}