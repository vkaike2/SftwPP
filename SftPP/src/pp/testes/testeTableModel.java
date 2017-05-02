package pp.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class testeTableModel extends AbstractTableModel {

	private List<String> linhas = new ArrayList<>();
	private String[] colunas = { "coluna1", "coluna2" };

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return linhas.size();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		switch (coluna) {
		case 0:
			return linhas.get(linha);
		case 1:	

		default:
			break;
		}
		return null;
	}
	// https://www.youtube.com/watch?v=wK_rDHZkLdY

}
