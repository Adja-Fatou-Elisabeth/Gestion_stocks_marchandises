package pro;

import java.util.*;

public interface MethodPro {
	public void ajouterProduit(Produit p);
	public void afficherProduit(Produit p);
	public String rechercheParNom(String nomProduit);
	public void modifierProduit(Produit p);
	public void supprimeProduit(String nomProduit);
}
