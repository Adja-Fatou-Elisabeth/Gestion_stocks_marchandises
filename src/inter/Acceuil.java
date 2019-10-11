package inter;
import interProduit.*;
import interclient.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Acceuil extends JFrame implements ActionListener  {
	
	JPanel panel=new JPanel();
	JPanel panelC=new JPanel();
	JPanel panelS=new JPanel();
	JPanel panelE=new JPanel();
	JPanel panelO=new JPanel();
	
	
	JMenuBar bar=new JMenuBar();
	
	JMenu acceuil=new JMenu("Acceuil");
	JMenu produit=new JMenu("Produits");
	JMenu utilisateur=new JMenu("Utilisateurs");
	JMenu aide=new JMenu("Aide");
	JMenu outil=new JMenu("Outils");
	
	
	JMenuItem affiche=new JMenuItem("Afficher Les Produits");
	JMenuItem modifier=new JMenuItem("Modifier Un Produit");
	JMenuItem ajouter=new JMenuItem("Ajouter un Produit");
	JMenuItem supprimer=new JMenuItem("Supprimer un produit");
	JMenuItem recherche=new  JMenuItem("Rechercher un produit");
	JMenuItem listeUtilisateur=new JMenuItem("Listes Des utilisateurs");
	JMenuItem enregistreUtilisateur=new JMenuItem("Enregistrer Un utilisateur");
	JMenuItem supprimerUtilisateur=new JMenuItem("Supprimer un utilisateur");
	
	
	JButton deconnecte=new JButton("Se Deconnecter");
	
	
	public Acceuil() {
		panel.add(bar);
		
		
		bar.add(acceuil);
		bar.add(produit);
		bar.add(utilisateur);
		bar.add(aide);
		bar.add(outil);
		
		produit.add(affiche);
		produit.add(modifier);
		produit.add(ajouter);
		produit.add(supprimer);
		produit.add(recherche);
		
		
		
		utilisateur.add(listeUtilisateur);
		utilisateur.add(enregistreUtilisateur);
		utilisateur.add(supprimerUtilisateur);
		
		
		affiche.addActionListener(this);
		modifier.addActionListener(this);
		ajouter.addActionListener(this);
		supprimer.addActionListener(this);
		recherche.addActionListener(this);
		
		listeUtilisateur.addActionListener(this);
		enregistreUtilisateur.addActionListener(this);
		supprimerUtilisateur.addActionListener(this);
		

		this.add(panel);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Acceuil m=new Acceuil();
		
		
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
		if (e.getSource()==listeUtilisateur) {
		
		}
		if (e.getSource()==supprimerUtilisateur) {
			new SupprimerClient();
		}
		if (e.getSource()==enregistreUtilisateur) {
			new Enregistre();
		}
	}

}
