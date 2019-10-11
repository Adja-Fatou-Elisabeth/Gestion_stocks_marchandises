package pro;
import java.util.*;

import javax.swing.table.AbstractTableModel;


public class ProduitModel extends AbstractTableModel{
	String[] nomCol=new String[]{"IdProduit","References","Nom","Quantite","Prix"};
	List<String[]> valCol=new ArrayList<String[]>();
	public int getColumnCount() {
		return nomCol.length;
	}
	
	public int getRowCount() {
		return valCol.size();
	}
	@Override
	public Object getValueAt(int rowIndex,int columnIndex) {
		return valCol.get(rowIndex)[columnIndex];
	}
	public String getColumnName(int column){
		return nomCol[column];
	}
	public void setData(List<Produit> produits){
		valCol=new ArrayList<>();
		for (Produit p:produits) {
			valCol.add(new String[]{
				""+p.getIdP(),""+p.getRefProduit(),""+p.getnProduit(),""+p. getqProduit(),""+p.getPrProduit()
			});
		}
		fireTableChanged(null);
	}

}
