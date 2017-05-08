package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pp.auxiliares.tableModelRespostaAnterior;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TabelaRespostaAnterior extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField txtProcurar;
	public JTable table;
	public JButton btnProcurar;
	public tableModelRespostaAnterior modelRespostaAnterior = new tableModelRespostaAnterior();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TabelaRespostaAnterior dialog = new TabelaRespostaAnterior();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TabelaRespostaAnterior() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblProcurar = new JLabel("Procurar: ");
			GridBagConstraints gbc_lblProcurar = new GridBagConstraints();
			gbc_lblProcurar.insets = new Insets(0, 0, 5, 5);
			gbc_lblProcurar.anchor = GridBagConstraints.EAST;
			gbc_lblProcurar.gridx = 0;
			gbc_lblProcurar.gridy = 0;
			contentPanel.add(lblProcurar, gbc_lblProcurar);
		}
		{
			txtProcurar = new JTextField();

			GridBagConstraints gbc_txtProcurar = new GridBagConstraints();
			gbc_txtProcurar.insets = new Insets(0, 0, 5, 5);
			gbc_txtProcurar.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtProcurar.gridx = 1;
			gbc_txtProcurar.gridy = 0;
			contentPanel.add(txtProcurar, gbc_txtProcurar);
			txtProcurar.setColumns(10);
		}
		{
			btnProcurar = new JButton("Procurar");

			GridBagConstraints gbc_btnProcurar = new GridBagConstraints();
			gbc_btnProcurar.insets = new Insets(0, 0, 5, 0);
			gbc_btnProcurar.gridx = 2;
			gbc_btnProcurar.gridy = 0;
			contentPanel.add(btnProcurar, gbc_btnProcurar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 3;
			gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				table = new JTable();

				scrollPane.setViewportView(table);
				table.setModel(modelRespostaAnterior);
			}
		}
	}
	public void iniciaTabela(List<String> listaCombobox){
		for (String string : listaCombobox) {
			int um = string.lastIndexOf("Ä");
			String pergunta;
			String resposta;
			pergunta = string.substring(0, string.indexOf("Ä"));
			resposta = string.substring(um+1);
			modelRespostaAnterior.addLinha(pergunta, resposta);
		}
	}
	public String pegarLinhaClicada(){
		int i = table.getSelectedRow();
		return modelRespostaAnterior.pegarLinha(i);
	}

}
