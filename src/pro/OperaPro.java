package pro;

import java.sql.*;
import java.util.*;


public class OperaPro implements MethodPro {
	Connection con;

	/**
	 * La methode: @ConnectionBase() permet la connection a la base de donnee.
	 * <br/> Elle sera appele dans toute les autres methodes qui auront besoins d'elle
	 * @return con;
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

	
	
	
	public List<Produit> produitsParMC(String mc) {
		List<Produit> produits=new ArrayList<Produit>();
		try {
			PreparedStatement ps=con.prepareStatement("select from Produits where nomProduit like ?");
			 ps.setString(1, mc);
			 ResultSet rs=ps.executeQuery();
			 while (rs.next()) {
				Produit p=new Produit();
				p.setIdP(rs.getInt("idProduit"));
				p.setRefProduit(rs.getString("referenceProduit"));
				p.setnProduit(rs.getString("nomProduit"));
				p.setqProduit(rs.getInt("quantiteProduit"));
				p.setPrProduit(rs.getInt("prixProduit"));
				produits.add(p);
			}
			 ps.close();
			 con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return produits;
	}
	
	
	
	
	
	
	

	/**
	 *@methode ajouterProduit(Produit p): elle prend en parametre un <I> Produit </I> , Elle permet t'ajouter un  ou des nouveaux produits dans la base de donnee
	 *@param p
	 *@return :Elle ne return rien.
	 */
	public void ajouterProduit(Produit p) {
		ConnectionBase();
		try {
			PreparedStatement ps=con.prepareStatement("insert into Produits (idProduit,referenceProduit,nomProduit,quantiteProduit,prixProduit)" + "values(?,?,?,?,?)");
			ps.setInt(1, p.getIdP());
			ps.setString(2, p.getRefProduit());
			ps.setString(3, p.getnProduit());
			ps.setInt(4, p.getqProduit());
			ps.setInt(5, p.getPrProduit());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erreur Insert "+e);
		}

	}

	/**
	 *@methode afficherProduit(Produit p): elle prend en parametre un <I> Produit </I> , Elle permet t'afficher Les produits.
	 *Elle ne retourne rien.
	 *@param p
	 *@return 
	 */
	public void afficherProduit(Produit p) {
		ConnectionBase();
		try {
			PreparedStatement ps=con.prepareStatement("Select *from Produits ");
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rmsd=rs.getMetaData();
			for(int i = 1; i <= rmsd.getColumnCount(); i++)
				System.out.print(" *** \t" +rmsd.getColumnName(i) + "  ");
			    System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");
			while(rs.next()){
				for(int i = 1; i <= rmsd.getColumnCount(); i++)
					System.out.print("\t" + rs.getObject(i).toString() +"\t\t");
				    System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



	/**
	 *@methode supprimeProduit(String nomProduit) : prend en parametre un <I> String </I> qui est le nom du produit a supprime.
	 *Elle retourne rien
	 *@param nomProduit
	 *@return Rien(void)
	 * 
	 */

	public void supprimeProduit(String nomProduit) {
		ConnectionBase();
		try {
			PreparedStatement ps=con.prepareStatement("delete from Produits where nomProduit like ?");
			ps.setString(1, nomProduit);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}



	
	/**
	 * @methode rechercheParNom(String nomProduit): prend en parametre un <I>String</I> qui est le nom du produit que l'on veuille afficher.
	 * Elle retourne un Produit.
	 * @return Produit p.
	 */
	public String rechercheParNom(String nProduit) {
		Produit p=new Produit();
		ConnectionBase();
		try {
			PreparedStatement ps=con.prepareStatement("select *from Produits where nomProduit =" +"nomProduit");
			ResultSet rs=ps.executeQuery();
			rs.first();
			while(rs.next()){
				if(nProduit.equals(rs.getString("nomProduit"))){
					p=new Produit(
							rs.getInt("idProduit"),
							rs.getString("referenceProduit"),
							nProduit,
							rs.getInt("quantiteProduit"),
							rs.getInt("prixProduit")
							);
					System.out.println(p);
				}
//				if(nProduit!=rs.getString("nomProduit")){
//					System.err.println("Erro Nom");
//				}
//
//			}
//			if(rs.next()==false){
//				System.out.println("Nom produit no found");
			}
		}catch (SQLException e) {
			System.out.println("Catch");
			e.printStackTrace();
		}
		return p.toString();
	}

	

	/**
	 * @methode modifierProduit(Produit p):Permet de modifier un Produit.
	 * @param p
	 */
	public void modifierProduit(Produit p) {
		ConnectionBase();
		try {
			PreparedStatement ps=con.prepareStatement("update Produits set idProduit="+"p.getIdP()"+",referenceProduit="+"p.getRefProduit()"+",nomProduit="+"p.getnProduit()"+",quantiteProduit="+"p.getqProduit()"+",prixProduit="+"p.getPrProduit()");
			ResultSet rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
