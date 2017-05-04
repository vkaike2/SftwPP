package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pp.auxiliares.tableModelEditar;

import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TabelaEditar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTable table;
	public JTextField txtPesquisar;
	public tableModelEditar modelEditar = new tableModelEditar();
	public JButton btnBuscar = new JButton("Buscar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TabelaEditar dialog = new TabelaEditar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TabelaEditar() {
		setBounds(100, 100, 470, 359);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPesquisar = new JLabel("Pesquisar:");
			GridBagConstraints gbc_lblPesquisar = new GridBagConstraints();
			gbc_lblPesquisar.anchor = GridBagConstraints.EAST;
			gbc_lblPesquisar.insets = new Insets(0, 0, 5, 5);
			gbc_lblPesquisar.gridx = 0;
			gbc_lblPesquisar.gridy = 0;
			contentPanel.add(lblPesquisar, gbc_lblPesquisar);
		}
		{
			txtPesquisar = new JTextField();
			txtPesquisar.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent arg0) {
				}
			});
			GridBagConstraints gbc_txtPesquisar = new GridBagConstraints();
			gbc_txtPesquisar.insets = new Insets(0, 0, 5, 5);
			gbc_txtPesquisar.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPesquisar.gridx = 1;
			gbc_txtPesquisar.gridy = 0;
			contentPanel.add(txtPesquisar, gbc_txtPesquisar);
			txtPesquisar.setColumns(10);
		}
		{
			
			
			GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
			gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
			gbc_btnBuscar.gridx = 2;
			gbc_btnBuscar.gridy = 0;
			contentPanel.add(btnBuscar, gbc_btnBuscar);
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
				

				table.setModel(modelEditar);
				scrollPane.setViewportView(table);
			}
		}
	}

	public void iniciarTabela(LinkedHashMap<String, List<String>> mapa) {
		List<String> PreencheTabela = new ArrayList<>();
		int cont = 0;
		for (Entry<String, List<String>> entry : mapa.entrySet()) {

			for (int i = 0; i < entry.getValue().size(); i++) {
				if (entry.getValue().get(i).equals("+_+")) {
					cont++;
				}
			}
			if (cont < 9) {
				PreencheTabela.add(entry.getKey());

			}
			cont =0;
		}

		for (String str : PreencheTabela) {
			modelEditar.addLinha(str);
		}
	}

	public String retornaLinhaClicada() {
		int i = table.getSelectedRow();

		return modelEditar.pegarLinha(i);

	}

}
