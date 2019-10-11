package exercice8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import connec.ConnectionP;
import connec.Personnel;;
public class ApplS extends JFrame implements ActionListener{
	static int idP;
		ConnectionP con=new ConnectionP();
		JPanel p=new JPanel();
		JPanel ps=new JPanel();
		
		JLabel nom=new JLabel("Nom");
		JLabel prenom=new JLabel("Prenom");
		JLabel login=new JLabel("Login");
		JLabel motP=new JLabel("Mot de Passe");
		JLabel fonction=new JLabel("Fonction");


		JTextField nomT=new JTextField();
		JTextField prenomT=new JTextField();
		JTextField loginT=new JTextField();
		JPasswordField motPT=new JPasswordField();
		JTextField fonctionT=new JTextField();


		JButton enregistre=new JButton("Enregistre");
		JButton annuler=new JButton("Annuler");



		public ApplS(){
			p.setLayout(new GridLayout(5,2,10,10));
			p.setBackground(Color.cyan);
			
			p.add(nom);
			p.add(nomT);
			
			p.add(prenom);
			p.add(prenomT);
			
			p.add(login);
			p.add(loginT);
			
			p.add(motP);
			p.add(motPT);
			
			p.add(fonction);
			p.add(fonctionT);
			
						
			
			ps.add(enregistre);
			ps.add(annuler);
			
			
			annuler.addActionListener(this);
			enregistre.addActionListener(this);
			this.add(p,BorderLayout.CENTER);
			this.add(ps,BorderLayout.AFTER_LAST_LINE);
			ps.setBackground(Color.PINK);
			this.setSize(1000,500);
			this.setVisible(true);
			
		}
		
		
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== enregistre) {
			String rNom=nomT.getText();
			String rprenom=prenomT.getText();
			String rlogin=loginT.getText();
			String rmoPT=String.valueOf(motPT.getPassword());
			String rfonctionT=fonctionT.getText();
			Personnel pers=new Personnel(idP, rNom, rprenom, rlogin, rmoPT, rfonctionT);
			con.ajouterUser(pers);
		}
		if (e.getSource()==annuler) {
			System.exit(0);
		}
		

	}
	public static void main(String[] args) {
		ApplS a=new ApplS();
	}

}
