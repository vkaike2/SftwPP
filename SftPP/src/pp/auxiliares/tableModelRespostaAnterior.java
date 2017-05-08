package pp.auxiliares;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class tableModelRespostaAnterior extends AbstractTableModel {

	private LinkedList<String> perg = new LinkedList<>();
	private LinkedList<String> resp = new LinkedList<>();
	private String[] colunas = { "Perguntas", "respostas" };

	public void addLinha(String pergunta, String resposta){
		perg.add(pergunta);
		resp.add(resposta);
		
		fireTableDataChanged();
	}
	public void limparTabela(){
		perg.clear();
		resp.clear();
	}
	public String pegarLinha(int linhaSelecionada) {
		return resp.get(linhaSelecionada);
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas[column];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return resp.size();
	}

	@Override
	public Object getValueAt(int linha, int col) {
		// TODO Auto-generated method stub
		switch (col) {
		case 0:
			return perg.get(linha);
		case 1:
			return resp.get(linha);

		default:
			break;
		}
		return null;
	}

}
