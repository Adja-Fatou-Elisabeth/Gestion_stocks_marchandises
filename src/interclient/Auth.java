package interclient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Auth extends JFrame implements ActionListener{
	JPanel p=new JPanel();
	
	JLabel login=new JLabel("Login");
	JLabel mp=new JLabel("Mot de Passe");


	
	JTextField loginT=new JTextField(12);
	
	
	JPasswordField mpp=new JPasswordField(12);


	JButton connecte=new JButton("Connection");


	public Auth() {
		this.setLayout(new GridLayout(3,2,10,50));
		
		
		p.add(login);
		p.add(loginT);
		
		p.add(mp);
		p.add(mpp);
		
		
		connecte.addActionListener(this);
		
		p.add(connecte);
		
		
		this.add(p,BorderLayout.NORTH);
		this.setTitle("Authentification");
		this.setVisible(true);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2,Toolkit.getDefaultToolkit().getScreenSize().height/2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==connecte) {
			String rlogin=loginT.getText();
			String rmop=String.copyValueOf(mpp.getPassword());
		}
	}
	public static void main(String[] args) {
		Auth a=new Auth();
	}

}
