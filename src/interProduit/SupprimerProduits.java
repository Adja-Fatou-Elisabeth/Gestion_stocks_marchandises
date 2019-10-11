package interProduit;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import connec.ConnectionP;
import pro.OperaPro;

public class SupprimerProduits extends JFrame implements ActionListener {
	JPanel panel=new JPanel();
	JPanel panelC=new JPanel();
	JPanel panels=new JPanel();
	
	JLabel nom=new JLabel("Entrer le nom du Produit");
	
	JTextField nomT=new JTextField(20);
	
	JButton sup=new JButton("Supprimer");
	List list=new List();
	
	
		public SupprimerProduits() {
			panel.add(nom);
			panel.add(nomT);
			panelC.add(sup);
			panels.add(list);
			
			sup.addActionListener(this);
			this.add(panelC,BorderLayout.CENTER);
			this.add(panel,BorderLayout.NORTH);				
			this.setTitle("Supprimer");
			this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/3);
			this.setVisible(true);
		}
		public static void main(String[] args) {
			new SupprimerProduits();
		}
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==sup) {
				String rnomT=nomT.getText(); nomT.setText("");
				OperaPro oper=new OperaPro();
				int res=JOptionPane.showConfirmDialog(null,"Voulez vous supprimer le Personnel\t"+rnomT);
				if (res==0) {
					oper.supprimeProduit(rnomT);
					list.add("Vous avez bien supprimer\n"+oper.rechercheParNom(rnomT));
				}
			}
			
		}
}
