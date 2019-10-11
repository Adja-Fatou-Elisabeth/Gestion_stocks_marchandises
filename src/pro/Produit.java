package pro;
/**
 * 
 * @author Adji Fatou Elisabeth
 *
 */
public class Produit {
	String refProduit,nProduit;
	int idP,qProduit,prProduit;
	/**
	 * 
	 * @param idP
	 * @param refProduit
	 * @param nProduit
	 * @param qProduit
	 * @param prProduit
	 */
	public Produit(int idP,String refProduit,String nProduit,int qProduit,int prProduit){
		this.idP=idP;
		this.refProduit=refProduit;
		this.nProduit=nProduit;
		this.qProduit=qProduit;
		this.prProduit=prProduit;
	}
	
	public Produit() {
		
	}

	/**
	 * @return the refProduit
	 */
	public String getRefProduit() {
		return refProduit;
	}
	/**
	 * @param refProduit the refProduit to set
	 */
	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}
	/**
	 * @return the nProduit
	 */
	public String getnProduit() {
		return nProduit;
	}
	/**
	 * @param nProduit the nProduit to set
	 */
	public void setnProduit(String nProduit) {
		this.nProduit = nProduit;
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
	 * @return the qProduit
	 */
	public int getqProduit() {
		return qProduit;
	}
	/**
	 * @param qProduit the qProduit to set
	 */
	public void setqProduit(int qProduit) {
		this.qProduit = qProduit;
	}
	/**
	 * @return the prProduit
	 */
	public int getPrProduit() {
		return prProduit;
	}
	/**
	 * @param prProduit the prProduit to set
	 */
	public void setPrProduit(int prProduit) {
		this.prProduit = prProduit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Id \t\t References \t\t Nom \t\t Quantites \t\t Prix \n "
				+ idP+"\t\t"+refProduit+"\t\t"+nProduit+"\t\t"+qProduit+"\t\t\t"+prProduit;
	}
	
	

}
