package interProduit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Modifier;

import javax.swing.*;

import pro.OperaPro;
import pro.Produit;
import pro.ProduitModel;

public class ModifierP extends JFrame implements ActionListener {
	Produit pModel=new Produit();
	ProduitModel prM;
	JPanel panel=new JPanel();
	JPanel panelN=new JPanel();
	JPanel panelC=new JPanel();
	
	JTextField rechT=new JTextField(20);
	
	JScrollPane jsp=new JScrollPane();
	
	JLabel rechercher=new JLabel("Nom du Produit");
	
	JTable table=new JTable();
	
	JButton recherche=new JButton("Rechercher");
	
	
	public ModifierP() {
		this.setLayout(new BorderLayout());
		panel.add(rechercher);
		panel.add(rechT);
		panel.add(recherche);
		panel.add(table);
		panelC.add(jsp);
		panelC.setLayout(new GridLayout());
		this.add(panelC,BorderLayout.CENTER);
		table=new JTable(prM);
		recherche.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		this.add(panel,BorderLayout.NORTH);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setTitle("Modification");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ModifierP();
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==recherche) {
			String mocle=rechT.getText();
			OperaPro operation=new OperaPro();
			List<Produit> ok=operation.produitsParMC(mocle);
			prM.setData(ok);
			
			
			
		}
	}
	
}
