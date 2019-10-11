package interProduit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pro.OperaPro;
import pro.Produit;

public class AjouterProduit extends JFrame implements ActionListener{
	
	static int idP;
	JPanel panel=new JPanel();
	
	
	JLabel reference=new JLabel("References");
	JLabel nom=new JLabel("Nom  du Produit");
	JLabel prix=new JLabel("Prix du Produit");
	JLabel quantite=new JLabel("Quantite du Produit");
	
	
	JTextField refernceT=new JTextField(50);
	JTextField nomT=new JTextField(50);
	JTextField prixT=new JTextField(50);
	JTextField quantiteT=new JTextField(50);
	
	JButton ajoute=new JButton("Ajouter");
	JButton annuler=new JButton("Annuler");
	
	public AjouterProduit() {
		panel.add(reference);
		panel.add(refernceT);

		panel.add(nom);
		panel.add(nomT);

		panel.add(prix);
		panel.add(prixT);

		panel.add(quantite);	
		panel.add(quantiteT);
		panel.add(ajoute);
		panel.add(annuler);
		panel.setBackground(Color.GRAY);
		
		ajoute.addActionListener(this);
		annuler.addActionListener(this);
		
		this.add(panel,BorderLayout.CENTER);
		this.setLayout(new GridLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setTitle("Ajouts");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new AjouterProduit();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==ajoute) {
			String rReferenceT=refernceT.getText();
			String rnomT=nomT.getText();
			int rprixT=prixT.getColumns();
			int rquantite=quantiteT.getColumns();
			refernceT.setText("");
			nomT.setText("");
			prixT.setText("");
			quantiteT.setText("");
			Produit p=new Produit(idP, rReferenceT, rnomT,rprixT,rquantite );
			OperaPro oper=new OperaPro();
			oper.ajouterProduit(p);
		}
		if (e.getSource()==annuler) {
			System.exit(0);
		}
	}
	
	
	

}
