package interclient;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import connec.ConnectionP;

public class SupprimerClient extends JFrame implements ActionListener {
	JPanel panel=new JPanel();
	JPanel panelC=new JPanel();
	
	JTextField rechercT=new JTextField(30);
	
	JButton rechercB=new JButton("Supprimer");
	
	List li=new List();
	
	public SupprimerClient() {
		panel.add(rechercT);
		panel.add(rechercB);
		
		panelC.add(li);
		
		rechercB.addActionListener(this);
		
		this.add(panel,BorderLayout.NORTH);
		this.add(panelC, BorderLayout.CENTER);
		this.setTitle("Suppression");
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SupprimerClient();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==rechercB) {
			String rrcherT=rechercT.getText();
			rechercT.setText("");
			int res=JOptionPane.showConfirmDialog(null,"Voulez vous supprimer le Personnel\t"+rrcherT);
			if (res==0) {
				ConnectionP n=new ConnectionP();
				n.supprimeUser(rrcherT);
				System.out.println("bien");
				li.add("Votre utilisateur a ete bien supprime "+rrcherT);
			}
		}
	}
}
