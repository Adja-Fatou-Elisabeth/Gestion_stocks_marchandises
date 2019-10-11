package interclient;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Confirmation extends JFrame implements ActionListener{
	public Confirmation() {
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width*5/2,Toolkit.getDefaultToolkit().getScreenSize().height*5/2);
		this.setTitle("Confirmation");
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		int res=JOptionPane.showConfirmDialog(null,"Voulez vous supprimer le Personnel\t");
		String c=JOptionPane.showInputDialog("");
		int b=JOptionPane.ERROR_MESSAGE;
		if (c!=null) {
			System.out.println("Bien");
			int rest=JOptionPane.showConfirmDialog(null,"Voulez vous supprimer le Personnel\t");
		}
		JOptionPane.showInputDialog("Bon");

	}

}
