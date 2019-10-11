package connec;

/**
 * 
 * @author Adji Fatou Elisabeth
 * 
 * <blockquote> Cette interface a �t� Creer pour definir les methodes qui seront uitlis�s dans la  classe Connection.
 * Elle facilte en quelque sorte la redefinition des methodes .Elle est compos� de 3 methodes qui ser automatiquement redefinies lorsque une classe vas implement� cette interfaces. </blockquote>
 *
 */
public interface InConec {
	public void ajouterUser(Personnel pers);
	public void supprimeUser(String nomP);
	public void deconnecter();

}
