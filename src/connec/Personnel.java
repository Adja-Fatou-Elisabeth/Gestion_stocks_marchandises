package connec;
/**
 * 
 * @author Adji Fatou Elisabeth
 * 
 * <blockquote> La Classe <b>Personnel</b> a été creer pour definir la composition dun Objet de type Personne .
 * Elle est aussi composé des getters et setters de chaques atributs definies ici </blockquote>
 *
 */
public class Personnel {
	String nomP,prenomP,login,fonctionP,motPasse ;
	int idP;
	/**
	 * 
	 * @param idP
	 * @param nomP
	 * @param prenomP
	 * @param login
	 * @param motPasse
	 * @param fonctionP
	 */
	public Personnel(int idP,String nomP, String prenomP, String login, String motPasse, String fonctionP) {
		super();
		this.idP = idP;
		this.nomP = nomP;
		this.prenomP = prenomP;
		this.login = login;
		this.motPasse = motPasse;
		this.fonctionP = fonctionP;
		
	}
	public Personnel(){
		
	}
	/**
	 * 
	 * @param login
	 * @param motPasse
	 */
	public Personnel(String login,String motPasse){
		this.login=login;
		this.motPasse=motPasse;
	}
	/**
	 * @return the idP
	 */
	public int getIdP() {
		return idP;
	}
	/**
	 * @param idP the idP to set
	 */
	public void setIdP(int idP) {
		this.idP = idP;
	}
	/**
	 * @return the nomP
	 */
	public String getNomP() {
		return nomP;
	}
	/**
	 * @param nomP the nomP to set
	 */
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	/**
	 * @return the prenomP
	 */
	public String getPrenomP() {
		return prenomP;
	}
	/**
	 * @param prenomP the prenomP to set
	 */
	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}
	/**
	 * @retourne the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * Parameter login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @retourne the fonctionP
	 */
	public String getFonctionP() {
		return fonctionP;
	}
	/**
	 * @parametre fonctionP la  fonctionP to set
	 */
	public void setFonctionP(String fonctionP) {
		this.fonctionP = fonctionP;
	}
	/**
	 * @retourne le motPasse
	 */
	public String getMotPasse() {
		return motPasse;
	}
	/**
	 * @param motPasse the motPasse to set
	 */
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	
}
