package exercice8;

import java.awt.event.ActionEvent;
import java.util.*;
import connec.ConnectionP;
import pro.*;
/**
 * 
 * @author Adji Fatou Elisabeth
 *
 */
public class EvenementConnectio {
	int choix,idP,prProduit,qProduit;
	String refProduit ,nProduit;
	/**
	 * Cette classe <b>EvenementConnectio</b> creer Pour cree Les Ecoutes des methodes.
	 * @param e
	 */
	public void actionPerfomed(ActionEvent e){
		
		Scanner sc=new Scanner(System.in);
		Produit p=new Produit(idP, refProduit, nProduit, qProduit, prProduit);
		OperaPro oper=new OperaPro();
		System.out.print("Entrez votre login : "); String login=sc.next();
		System.out.print("Entrez votre mot de passe : "); int motPasse=sc.nextInt();
		System.out.println(login+", "+motPasse);
		if(ConnectionP.authentification(login, motPasse)){
			do{
				System.out.println("Bienvenue sur la plateforme de la gestion de votre stock");
				System.out.println("0.Afficher  produits");
				System.out.println("1.Modifier  produits");
				System.out.println("2.Ajouter produits");
				System.out.println("3.Supprimer produits");
				System.out.println("4.recherche de  produits par nom ");
				choix=sc.nextInt();
			}while(choix!=0 && choix!=1 && choix!=2 && choix!=3 && choix!=4);
			switch (choix) {
			case 0:
				oper.afficherProduit(p);
				break;
			case 1:
				oper.modifierProduit(p);
				break;
			case 2:
				
				System.out.print("Veuillez entrez la reference du produit: ");	 refProduit=sc.next();
				System.out.print("Veuiller Entrez le nom du Produit : ");		 nProduit=sc.next();
				System.out.print("Veuiller entrez la quantite du produit: ");	 qProduit=sc.nextInt();
				System.out.print("Veuiller entrez  le prix du produit: ");		 prProduit=sc.nextInt();
				Produit p1=new Produit(idP, refProduit, nProduit, qProduit, prProduit);
				oper.ajouterProduit(p);
				break;
			case 3:
				System.out.print("Veuillez entrez le Nom du produit: ");
				String nom=sc.next();
				oper.supprimeProduit(nom);
				break;
			case 4:
				System.out.println("Veuillez entrez le Nom du produit : ");
				String nom1=sc.next();
				oper.rechercheParNom(nom1);
				break;
			
			default:
				break;
			}
			
		}
		else;
			System.err.println("Vous n'être pas autoriser "+login);
		
			
	}
	
	

}
