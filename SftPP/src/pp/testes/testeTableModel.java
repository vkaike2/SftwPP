package pp.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class testeTableModel extends AbstractTableModel {

	private ArrayList<String> lista;
	private String[] colunas = { "nome" };

	public testeTableModel() {
		lista = new ArrayList<>();
	}

	public void addLinha(String str) {
		this.lista.add(str);
		fireTableDataChanged();
	}

	public String getLinha(int rowIndex) {
		return this.lista.get(rowIndex);
		
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.lista.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub

		switch (coluna) {
		case 0:
			return this.lista.get(linha);

		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return this.colunas[column];
	}

}
