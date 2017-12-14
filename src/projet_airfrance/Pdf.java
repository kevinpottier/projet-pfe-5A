/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_airfrance;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pdf
{     
    //Attributs
    String path;
    
    //Constructors
    public Pdf(){}  
    public Pdf(String p_path){ path = p_path; }
    
    //Getter - Setter
    public String getPath(){ return path; }
    public void setPath(String p_path){ path = p_path; }
    
    //Methodes
    public void openPdf (){
        
        File f =new File(path);
        
        try { 
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}