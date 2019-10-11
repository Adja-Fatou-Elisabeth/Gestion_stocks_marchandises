package interProduit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pro.OperaPro;

public class Recherche extends JFrame  implements ActionListener{
	JPanel panel=new JPanel();
	JLabel recherche=new JLabel("Nom du Produit");
	JTextField rechercheT=new JTextField(20);
	JButton r=new JButton("Recherche");
	
	List lis=new List();
	List list=new List();

	public Recherche() {
		panel.setLayout(new FlowLayout());
		panel.add(recherche);
		panel.add(rechercheT);
		panel.add(r);
		this.add(panel,BorderLayout.NORTH);
		JPanel pane=new JPanel();
		pane.setLayout(new GridLayout());
		
		pane.add(lis);
		r.addActionListener(this);
		this.add(pane,BorderLayout.CENTER);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Recherche();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==r) {
			String chaine=rechercheT.getText();
			rechercheT.setText("");
			OperaPro oper=new OperaPro();
			oper.rechercheParNom(chaine);
			lis.add(oper.rechercheParNom(chaine));
			
			
		}
	}
}
