package interProduit;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.PaintContext;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuPro extends JFrame implements ActionListener  {
	
	JPanel panel=new JPanel();
	JPanel panelC=new JPanel();
	JPanel panelS=new JPanel();
	JPanel panelE=new JPanel();
	JPanel panelO=new JPanel();
	
	
	JMenuBar bar=new JMenuBar();
	
	JMenu acceuil=new JMenu("Acceuil");
	JMenu produit=new JMenu("Produits");
	JMenu aide=new JMenu("Aide");
	JMenu outil=new JMenu("Outils");
	
	
	JMenuItem affiche=new JMenuItem("Afficher Les Produits");
	JMenuItem modifier=new JMenuItem("Modifier Un Produit");
	JMenuItem ajouter=new JMenuItem("Ajouter un Produit");
	JMenuItem supprimer=new JMenuItem("Supprimer un produit");
	JMenuItem recherche=new  JMenuItem("Rechercher un produit");
	
	
	
	JButton deconnecte=new JButton("Se Deconnecter");
	
	
	public MenuPro() {
		panel.add(bar);
		
		
		bar.add(acceuil);
		bar.add(produit);
		bar.add(aide);
		bar.add(outil);
		
		produit.add(affiche);
		produit.add(modifier);
		produit.add(ajouter);
		produit.add(supprimer);
		produit.add(recherche);
		
		
			
		
		affiche.addActionListener(this);
		modifier.addActionListener(this);
		ajouter.addActionListener(this);
		supprimer.addActionListener(this);
		recherche.addActionListener(this);
		
		

		this.add(panel);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MenuPro m=new MenuPro();
		
		
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==affiche) {
		}
		if (e.getSource()==modifier) {
			new ModifierP(); 
		}	
		if (e.getSource()==ajouter) {
			new AjouterProduit();
		}
		if(e.getSource()==supprimer){
			new SupprimerProduits();
		}
		if (e.getSource()==recherche) {
			new Recherche();
		}
		
	}

}
