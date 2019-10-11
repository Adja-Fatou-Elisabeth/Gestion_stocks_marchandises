package connec;

/**
 * 
 * @author Adji Fatou Elisabeth
 * 
 * <blockquote> Cette interface a été Creer pour definir les methodes qui seront uitlisés dans la  classe Connection.
 * Elle facilte en quelque sorte la redefinition des methodes .Elle est composé de 3 methodes qui ser automatiquement redefinies lorsque une classe vas implementé cette interfaces. </blockquote>
 *
 */
public interface InConec {
	public void ajouterUser(Personnel pers);
	public void supprimeUser(String nomP);
	public void deconnecter();

}
