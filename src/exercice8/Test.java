package exercice8;

import java.awt.event.ActionEvent;
import java.util.*;
import connec.*;
import pro.*;

/**
 * 
 * @author Adji Fatou Elisabeth
 *
 */
public class Test {

	/**
	 * Cette Classe Est la classe utiliser pour faire le test .
	 * @param args
	 */
	public static void main(String[] args) {
		int choix1;
		Scanner sc=new Scanner(System.in);
		ConnectionP conP=new ConnectionP();
		do{
			System.out.println("******************************************************************");
			System.out.println("****** Bienvenue Sur mon application gestion de stock\t**********");
			System.out.println("******\t\t 0.Se connecter \t\t\t**********");
			System.out.println("*******\t\t 1.S'enregistrer \t\t\t**********");
			System.out.println("*******\t\t 2.Supprimer Un utilisateur\t\t**********");
			System.out.println("*******\t\t 3.Se Deconnecte\t\t\t**********");
			System.out.println("******************************************************************");
			choix1=sc.nextInt();
		}while(choix1!=0 && choix1!=1 && choix1!=2 && choix1!=3);
		if(choix1==0){
			EvenementConnectio e=new EvenementConnectio();
			ActionEvent Ae=new ActionEvent(args, 17, "adja");
			e.actionPerfomed(Ae);
		}
		if(choix1==1){
			int idP = 0;
			System.out.print("Veuiller entrer votre nom :");String nomPer=sc.next();
			System.out.print("Veuiller entrer votre prenom :");String prenomPer=sc.next();
			System.out.print("Veuiller entre votre login : ");String loginPer=sc.next();
			System.out.print("Veuiller votre mot de passe: ");String motPassePer=sc.next();
			System.out.print("Veuiller entre votre fonction: ");String fonctionPer=sc.next();
			Personnel pers=new Personnel(idP,nomPer, prenomPer , loginPer, motPassePer,fonctionPer);
			conP.ajouterUser(pers);
			System.out.println("Vous Etres Bien Enregistrer Mme/Mr "+nomPer);
		}
		if(choix1==2){
			System.out.println("Veuiller entrer le nom"); String nom=sc.next();
			conP.supprimeUser(nom);
		}
		if (choix1==3) {
			conP.deconnecter();
		}
		
		

	}
	

}
