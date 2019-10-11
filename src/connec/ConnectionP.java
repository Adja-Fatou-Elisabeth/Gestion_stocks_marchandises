package connec;

import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.Scanner;

public class ConnectionP implements InConec {
	Connection con;
		
	/**
	 * @methode ConnectionBase(): Connection a la base de donnee
	 * @return Connection
	 */
	public Connection ConnectionBase(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
	
	/**
	 * 
	 */
//	public void logUser(String login, int motPasse) {
//		ConnectionBase();
//		try{
//			PreparedStatement ps=con.prepareStatement("select * from utilisateur where (loginUser = "+"loginUser and motPasseUser ="+"motPasseUser)");
//			ResultSet rs = null;
//			if(login.equals(rs.getString("loginUser"))){
//				rs=ps.executeQuery();
//					System.out.println("Connection avec Succes");
//				}
//				else{
//					System.out.println("Echec connection");
//				}
//
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//	}

	/**
	 * @methode ajouterUser(Personnel pers): permet d'ajouter un Personnel prend 
	 * @param pers un objet de type Personnel
	 * @return Rien(void)
	 */
	public void ajouterUser(Personnel pers) {
		ConnectionBase();
		try{
			PreparedStatement ps=con.prepareStatement("insert into utilisateur (idUser,nomUser,prenomUser,loginUser,motPasseUser,fonctionUser) " + "values(?,?,?,?,?,?)");
			ps.setInt(1, pers.getIdP());
			ps.setString(2, pers.getNomP());
			ps.setString(3, pers.getPrenomP());
			ps.setString(4, pers.getLogin());
			ps.setString(5, pers.getMotPasse());
			ps.setString(6, pers.getFonctionP());
			
			if(pers.getNomP().contains("NomUser")){
				System.out.println("Exite");
				ps.executeUpdate();
			}
			if (pers.getNomP().equals("nomUser")) {
				System.out.println("Vous être deja enregistrer");
				ps.executeUpdate();
			}
			else {
				ps.executeUpdate();
			}
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Vous avez faire une erreur"+e.getMessage());
		}
		
	}
	
	/**
	 * @methode supprimeUser(String nomUser): Permet de supprimer tous les utilisateur dont le nom  sera donne 
	 * <em> @param nomUser :En parametre un objet de la classe Personnel de type String</em>
	 * @return Rien(void)
	 */
	public void supprimeUser(String nomUser) {
		ConnectionBase();
		try{
			PreparedStatement ps=con.prepareStatement("delete from utilisateur where nomUser like ?");
			ps.setString(1,nomUser);
			if(nomUser.isEmpty()==true){
				ps.executeQuery();
				System.out.println("le nom d'utilisateur "+nomUser+" n'est pas dans la table");
			}
			if(nomUser.isEmpty()==false){
				ps.executeUpdate();
				System.out.println("l'utilisateur "+nomUser+" a été supprimer \n Merci!");
			}
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 *@deconnecter(): Permet d'arrete tous et de sortir
	 *@return Rien(void)
	 */
	public void deconnecter() {
		ConnectionBase();
		try {
			PreparedStatement ps=con.prepareStatement("Rollback");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	
	/**
	 * @methode authentification(String loginUser , int motPasseUser): Permet de faire la connection d'un utilisateur Pour lui permet l'acces a la gestion des stocks
	 * @param loginUser : Son identifiant
	 * @param motPasseUser : Son mot de passe
	 * @return boolean
	 */
	public static boolean authentification(String loginUser , int motPasseUser){
		Boolean b = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
			PreparedStatement ps=con.prepareStatement("Select *from utilisateur");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				if(loginUser.equals(rs.getString("loginUser"))==true && (motPasseUser==rs.getInt("motPasseUser"))==true){
					System.out.println("Bienvenue "+loginUser);
					b=true;
				}
				else;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Echec de pilote "+e);
		}
		return b;
		
	}
}
	
	
	

