package pp.auxiliares;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class tableModelEditar extends AbstractTableModel {
	private List<String> lista = new ArrayList<>();
	private String[] colunas = { "Perguntas" };

	public void addLinha(String str) {
		lista.add(str);
		fireTableDataChanged();
	}
	public void limparTabela(){
		lista.clear();
	}
	public String pegarLinha(int linhaSelecionada) {
		return lista.get(linhaSelecionada);
	}

	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return colunas[col];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public Object getValueAt(int linha, int col) {
		// TODO Auto-generated method stub
		switch (col) {
		case 0:
			return lista.get(linha);

		default:
			break;
		}
		return null;
	}

}
