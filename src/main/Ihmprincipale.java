package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ihmprincipale extends JFrame implements ActionListener {

	private JButton bouton;
	private JButton bouton2;
	private String PdfName;
	//...
	
	Ihmprincipale(){
		  buildContentPane();
	}
 
	private void buildContentPane(){
		
		JFrame fenetre = new JFrame();
		fenetre.setTitle("AF Esiea");
	    fenetre.setSize(400, 600);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
	     
	    
		JPanel panel = new JPanel();
		fenetre.setContentPane(panel);
		
		panel.setLayout(new FlowLayout());
		
		PdfName= "PDF1";
		bouton = new JButton(PdfName);
		bouton.addActionListener(this);
		panel.add(bouton);
 
		bouton2 = new JButton("PDF2");
		bouton2.addActionListener(this);
		panel.add(bouton2);
		
		fenetre.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();

		if(source == bouton){
			
			System.out.println("Vous avez cliqué ici.");
			 JFrame search = new JFrame();
			 search.setSize(300, 300);
			 search.setTitle(PdfName);
			 JPanel form = new JPanel();
			 search.setContentPane(form);
			 JLabel fig=new JLabel("Figure:");
			 form.add(fig);
			 JTextField champfig = new JTextField(10);
			 form.add(champfig);
			 JLabel itm=new JLabel("Item:");
			 form.add(itm);
			 JTextField item = new JTextField(5);
			 form.add(item);
			 JLabel pn=new JLabel("P/N:");
			 form.add(pn);
			 JLabel pno=new JLabel("P/N optionnal:");
			 form.add(pno);
			 search.setVisible(true);
			 
		} else if(source == bouton2){
			System.out.println("Vous avez cliqué là.");	
		}
		
	}
		
}
