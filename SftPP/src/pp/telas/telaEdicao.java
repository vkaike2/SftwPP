package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.awt.event.ActionEvent;

public class telaEdicao extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;
	private JTextField txt9;
	private JTextArea textAreaPergunta;
	private String PerguntaPesquisada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			telaEdicao dialog = new telaEdicao();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public telaEdicao() {
		setTitle("Editar");
		setBounds(100, 100, 560, 410);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 124, 135, 56, 47, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPergunta = new JLabel("Pergunta:");
			GridBagConstraints gbc_lblPergunta = new GridBagConstraints();
			gbc_lblPergunta.insets = new Insets(0, 0, 5, 5);
			gbc_lblPergunta.anchor = GridBagConstraints.EAST;
			gbc_lblPergunta.gridx = 0;
			gbc_lblPergunta.gridy = 0;
			contentPanel.add(lblPergunta, gbc_lblPergunta);
		}
		{
			JScrollPane scrollPanePergunta = new JScrollPane();
			GridBagConstraints gbc_scrollPanePergunta = new GridBagConstraints();
			gbc_scrollPanePergunta.gridwidth = 4;
			gbc_scrollPanePergunta.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPanePergunta.fill = GridBagConstraints.BOTH;
			gbc_scrollPanePergunta.gridx = 1;
			gbc_scrollPanePergunta.gridy = 0;
			contentPanel.add(scrollPanePergunta, gbc_scrollPanePergunta);
			{
				textAreaPergunta = new JTextArea();
				scrollPanePergunta.setViewportView(textAreaPergunta);
			}
		}
		{
			JLabel lblRespostas = new JLabel("Respostas:");
			GridBagConstraints gbc_lblRespostas = new GridBagConstraints();
			gbc_lblRespostas.anchor = GridBagConstraints.EAST;
			gbc_lblRespostas.insets = new Insets(0, 0, 5, 5);
			gbc_lblRespostas.gridx = 0;
			gbc_lblRespostas.gridy = 1;
			contentPanel.add(lblRespostas, gbc_lblRespostas);
		}
		{
			txt1 = new JTextField();
			GridBagConstraints gbc_txt1 = new GridBagConstraints();
			gbc_txt1.insets = new Insets(0, 0, 5, 5);
			gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt1.gridx = 1;
			gbc_txt1.gridy = 1;
			contentPanel.add(txt1, gbc_txt1);
			txt1.setColumns(10);
		}
		{
			txt2 = new JTextField();
			GridBagConstraints gbc_txt2 = new GridBagConstraints();
			gbc_txt2.insets = new Insets(0, 0, 5, 5);
			gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt2.gridx = 2;
			gbc_txt2.gridy = 1;
			contentPanel.add(txt2, gbc_txt2);
			txt2.setColumns(10);
		}
		{
			txt3 = new JTextField();
			GridBagConstraints gbc_txt3 = new GridBagConstraints();
			gbc_txt3.gridwidth = 2;
			gbc_txt3.insets = new Insets(0, 0, 5, 0);
			gbc_txt3.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt3.gridx = 3;
			gbc_txt3.gridy = 1;
			contentPanel.add(txt3, gbc_txt3);
			txt3.setColumns(10);
		}
		{
			txt4 = new JTextField();
			GridBagConstraints gbc_txt4 = new GridBagConstraints();
			gbc_txt4.insets = new Insets(0, 0, 5, 5);
			gbc_txt4.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt4.gridx = 1;
			gbc_txt4.gridy = 2;
			contentPanel.add(txt4, gbc_txt4);
			txt4.setColumns(10);
		}
		{
			txt5 = new JTextField();
			GridBagConstraints gbc_txt5 = new GridBagConstraints();
			gbc_txt5.insets = new Insets(0, 0, 5, 5);
			gbc_txt5.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt5.gridx = 2;
			gbc_txt5.gridy = 2;
			contentPanel.add(txt5, gbc_txt5);
			txt5.setColumns(10);
		}
		{
			txt6 = new JTextField();
			GridBagConstraints gbc_txt6 = new GridBagConstraints();
			gbc_txt6.gridwidth = 2;
			gbc_txt6.insets = new Insets(0, 0, 5, 0);
			gbc_txt6.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt6.gridx = 3;
			gbc_txt6.gridy = 2;
			contentPanel.add(txt6, gbc_txt6);
			txt6.setColumns(10);
		}
		{
			txt7 = new JTextField();
			GridBagConstraints gbc_txt7 = new GridBagConstraints();
			gbc_txt7.insets = new Insets(0, 0, 5, 5);
			gbc_txt7.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt7.gridx = 1;
			gbc_txt7.gridy = 3;
			contentPanel.add(txt7, gbc_txt7);
			txt7.setColumns(10);
		}
		{
			txt8 = new JTextField();
			GridBagConstraints gbc_txt8 = new GridBagConstraints();
			gbc_txt8.insets = new Insets(0, 0, 5, 5);
			gbc_txt8.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt8.gridx = 2;
			gbc_txt8.gridy = 3;
			contentPanel.add(txt8, gbc_txt8);
			txt8.setColumns(10);
		}
		{
			txt9 = new JTextField();
			GridBagConstraints gbc_txt9 = new GridBagConstraints();
			gbc_txt9.gridwidth = 2;
			gbc_txt9.insets = new Insets(0, 0, 5, 0);
			gbc_txt9.fill = GridBagConstraints.HORIZONTAL;
			gbc_txt9.gridx = 3;
			gbc_txt9.gridy = 3;
			contentPanel.add(txt9, gbc_txt9);
			txt9.setColumns(10);
		}
		{
			JButton btnSalvar = new JButton("Salvar");
			btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
			gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
			gbc_btnSalvar.gridx = 3;
			gbc_btnSalvar.gridy = 4;
			contentPanel.add(btnSalvar, gbc_btnSalvar);
		}
		{
			JButton btnVoltar = new JButton("Voltar");
			GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
			gbc_btnVoltar.gridx = 4;
			gbc_btnVoltar.gridy = 4;
			contentPanel.add(btnVoltar, gbc_btnVoltar);
		}
	}

	public void salvaEdição(LinkedHashMap<String, List<String>> mapa) {

	}

	public void escreverPergunta(String perg, String resp1, String resp2, String resp3, String resp4, String resp5,
			String resp6, String resp7, String resp8, String resp9) {
		textAreaPergunta.setText(perg);
		PerguntaPesquisada = perg;
		if (!resp1.equals("+_+")) {
			txt1.setText(resp1);
		}
		if (!resp2.equals("+_+")) {
			txt2.setText(resp2);
		}
		if (!resp3.equals("+_+")) {
			txt3.setText(resp3);
		}
		if (!resp4.equals("+_+")) {
			txt4.setText(resp4);
		}
		if (!resp5.equals("+_+")) {
			txt5.setText(resp5);
		}
		if (!resp6.equals("+_+")) {
			txt6.setText(resp6);
		}
		if (!resp7.equals("+_+")) {
			txt7.setText(resp7);
		}
		if (!resp8.equals("+_+")) {
			txt8.setText(resp8);
		}
		if (!resp9.equals("+_+")) {
			txt9.setText(resp9);
		}

	}

}
