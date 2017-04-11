package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.naming.ldap.Rdn;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.SwingComponentWrapper;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Configuracao extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextArea textAreaPergunta;
	private JComboBox comboBoxRespostas = new JComboBox();
	private List<String> listaRespostasConfig = new ArrayList<>();
	private Map<String, List<String>> mapaRespostaConfig = new HashMap<>();
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;
	private JTextField txt9;
	private JLabel lblRespostas;
	private JRadioButton rdbtn1;
	private JRadioButton rdbtn4;
	private JRadioButton rdbtn7;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn5;
	private JRadioButton rdbtn8;
	private JRadioButton rdbtn3;
	private JRadioButton rdbtn6;
	private JRadioButton rdbtn9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {

			Configuracao dialog = new Configuracao();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configuracao() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 464, 346);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 21, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblRespostaAnterior = new JLabel("Resposta Anterior:");
			GridBagConstraints gbc_lblRespostaAnterior = new GridBagConstraints();
			gbc_lblRespostaAnterior.anchor = GridBagConstraints.EAST;
			gbc_lblRespostaAnterior.insets = new Insets(0, 0, 5, 5);
			gbc_lblRespostaAnterior.gridx = 0;
			gbc_lblRespostaAnterior.gridy = 0;
			contentPanel.add(lblRespostaAnterior, gbc_lblRespostaAnterior);
		}
		{
			// JComboBox comboBoxRespostas = new JComboBox();
			GridBagConstraints gbc_comboBoxRespostas = new GridBagConstraints();
			gbc_comboBoxRespostas.insets = new Insets(0, 0, 5, 0);
			gbc_comboBoxRespostas.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxRespostas.gridx = 1;
			gbc_comboBoxRespostas.gridy = 0;
			contentPanel.add(comboBoxRespostas, gbc_comboBoxRespostas);
		}
		{
			JLabel lblPergunta = new JLabel("Pergunta:");
			GridBagConstraints gbc_lblPergunta = new GridBagConstraints();
			gbc_lblPergunta.insets = new Insets(0, 0, 5, 5);
			gbc_lblPergunta.anchor = GridBagConstraints.EAST;
			gbc_lblPergunta.gridx = 0;
			gbc_lblPergunta.gridy = 1;
			contentPanel.add(lblPergunta, gbc_lblPergunta);
		}
		{
			JScrollPane scrollPanePergunta = new JScrollPane();
			GridBagConstraints gbc_scrollPanePergunta = new GridBagConstraints();
			gbc_scrollPanePergunta.gridheight = 3;
			gbc_scrollPanePergunta.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPanePergunta.fill = GridBagConstraints.BOTH;
			gbc_scrollPanePergunta.gridx = 1;
			gbc_scrollPanePergunta.gridy = 1;
			contentPanel.add(scrollPanePergunta, gbc_scrollPanePergunta);
			{
				textAreaPergunta = new JTextArea();
				scrollPanePergunta.setViewportView(textAreaPergunta);
			}
		}
		{
			lblRespostas = new JLabel("Respostas:");
			GridBagConstraints gbc_lblRespostas = new GridBagConstraints();
			gbc_lblRespostas.anchor = GridBagConstraints.EAST;
			gbc_lblRespostas.insets = new Insets(0, 0, 5, 5);
			gbc_lblRespostas.gridx = 0;
			gbc_lblRespostas.gridy = 4;
			contentPanel.add(lblRespostas, gbc_lblRespostas);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridwidth = 2;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 5;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
			gbl_panel.rowHeights = new int[] { 0, 0, 18, 0 };
			gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
			gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panel.setLayout(gbl_panel);
			{
				rdbtn1 = new JRadioButton("");
				rdbtn1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn1.isSelected()) {
							txt1.setEnabled(false);
							txt1.setText("Add Resposta");
						} else {
							txt1.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn1 = new GridBagConstraints();
				gbc_rdbtn1.insets = new Insets(0, 0, 5, 5);
				gbc_rdbtn1.gridx = 0;
				gbc_rdbtn1.gridy = 0;
				panel.add(rdbtn1, gbc_rdbtn1);
			}
			{
				txt1 = new JTextField();
				txt1.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						txt1.setText(null);
					}

				});
				GridBagConstraints gbc_txt1 = new GridBagConstraints();
				gbc_txt1.insets = new Insets(0, 0, 5, 5);
				gbc_txt1.fill = GridBagConstraints.BOTH;
				gbc_txt1.gridx = 1;
				gbc_txt1.gridy = 0;
				panel.add(txt1, gbc_txt1);
				txt1.setColumns(10);
			}
			{
				rdbtn2 = new JRadioButton("");
				rdbtn2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn2.isSelected()) {
							txt2.setEnabled(false);
							txt2.setText("Add Resposta");
						} else {
							txt2.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn2 = new GridBagConstraints();
				gbc_rdbtn2.insets = new Insets(0, 0, 5, 5);
				gbc_rdbtn2.gridx = 2;
				gbc_rdbtn2.gridy = 0;
				panel.add(rdbtn2, gbc_rdbtn2);
			}
			{
				txt2 = new JTextField();
				txt2.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt2.setText(null);
					}
				});
				GridBagConstraints gbc_txt2 = new GridBagConstraints();
				gbc_txt2.insets = new Insets(0, 0, 5, 5);
				gbc_txt2.fill = GridBagConstraints.BOTH;
				gbc_txt2.gridx = 3;
				gbc_txt2.gridy = 0;
				panel.add(txt2, gbc_txt2);
				txt2.setColumns(10);
			}
			{
				rdbtn3 = new JRadioButton("");
				rdbtn3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn3.isSelected()) {
							txt3.setEnabled(false);
							txt3.setText("Add Resposta");
						} else {
							txt3.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn3 = new GridBagConstraints();
				gbc_rdbtn3.insets = new Insets(0, 0, 5, 5);
				gbc_rdbtn3.gridx = 4;
				gbc_rdbtn3.gridy = 0;
				panel.add(rdbtn3, gbc_rdbtn3);
			}
			{
				txt3 = new JTextField();
				txt3.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt3.setText(null);
					}
				});
				GridBagConstraints gbc_txt3 = new GridBagConstraints();
				gbc_txt3.insets = new Insets(0, 0, 5, 0);
				gbc_txt3.fill = GridBagConstraints.BOTH;
				gbc_txt3.gridx = 5;
				gbc_txt3.gridy = 0;
				panel.add(txt3, gbc_txt3);
				txt3.setColumns(10);
			}
			{
				rdbtn4 = new JRadioButton("");
				rdbtn4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn4.isSelected()) {
							txt4.setEnabled(false);
							txt4.setText("Add Resposta");
						} else {
							txt4.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn4 = new GridBagConstraints();
				gbc_rdbtn4.insets = new Insets(0, 0, 5, 5);
				gbc_rdbtn4.gridx = 0;
				gbc_rdbtn4.gridy = 1;
				panel.add(rdbtn4, gbc_rdbtn4);
			}
			{
				txt4 = new JTextField();
				txt4.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt4.setText(null);
					}
				});
				GridBagConstraints gbc_txt4 = new GridBagConstraints();
				gbc_txt4.insets = new Insets(0, 0, 5, 5);
				gbc_txt4.fill = GridBagConstraints.BOTH;
				gbc_txt4.gridx = 1;
				gbc_txt4.gridy = 1;
				panel.add(txt4, gbc_txt4);
				txt4.setColumns(10);
			}
			{
				rdbtn5 = new JRadioButton("");
				rdbtn5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn5.isSelected()) {
							txt5.setEnabled(false);
							txt5.setText("Add Resposta");
						} else {
							txt5.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn5 = new GridBagConstraints();
				gbc_rdbtn5.insets = new Insets(0, 0, 5, 5);
				gbc_rdbtn5.gridx = 2;
				gbc_rdbtn5.gridy = 1;
				panel.add(rdbtn5, gbc_rdbtn5);
			}
			{
				txt5 = new JTextField();
				txt5.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt5.setText(null);
					}
				});
				GridBagConstraints gbc_txt5 = new GridBagConstraints();
				gbc_txt5.insets = new Insets(0, 0, 5, 5);
				gbc_txt5.fill = GridBagConstraints.BOTH;
				gbc_txt5.gridx = 3;
				gbc_txt5.gridy = 1;
				panel.add(txt5, gbc_txt5);
				txt5.setColumns(10);
			}
			{
				rdbtn6 = new JRadioButton("");
				rdbtn6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn6.isSelected()) {
							txt6.setEnabled(false);
							txt6.setText("Add Resposta");
						} else {
							txt6.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn6 = new GridBagConstraints();
				gbc_rdbtn6.insets = new Insets(0, 0, 5, 5);
				gbc_rdbtn6.gridx = 4;
				gbc_rdbtn6.gridy = 1;
				panel.add(rdbtn6, gbc_rdbtn6);
			}
			{
				txt6 = new JTextField();
				txt6.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt6.setText(null);
					}
				});
				GridBagConstraints gbc_txt6 = new GridBagConstraints();
				gbc_txt6.insets = new Insets(0, 0, 5, 0);
				gbc_txt6.fill = GridBagConstraints.BOTH;
				gbc_txt6.gridx = 5;
				gbc_txt6.gridy = 1;
				panel.add(txt6, gbc_txt6);
				txt6.setColumns(10);
			}
			{
				rdbtn7 = new JRadioButton("");
				rdbtn7.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn7.isSelected()) {
							txt7.setEnabled(false);
							txt7.setText("Add Resposta");
						} else {
							txt7.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn7 = new GridBagConstraints();
				gbc_rdbtn7.insets = new Insets(0, 0, 0, 5);
				gbc_rdbtn7.gridx = 0;
				gbc_rdbtn7.gridy = 2;
				panel.add(rdbtn7, gbc_rdbtn7);
			}
			{
				txt7 = new JTextField();
				txt7.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt7.setText(null);
					}
				});
				GridBagConstraints gbc_txt7 = new GridBagConstraints();
				gbc_txt7.insets = new Insets(0, 0, 0, 5);
				gbc_txt7.fill = GridBagConstraints.BOTH;
				gbc_txt7.gridx = 1;
				gbc_txt7.gridy = 2;
				panel.add(txt7, gbc_txt7);
				txt7.setColumns(10);
			}
			{
				rdbtn8 = new JRadioButton("");
				rdbtn8.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (rdbtn8.isSelected()) {
							txt8.setEnabled(false);
							txt8.setText("Add Resposta");
						} else {
							txt8.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn8 = new GridBagConstraints();
				gbc_rdbtn8.insets = new Insets(0, 0, 0, 5);
				gbc_rdbtn8.gridx = 2;
				gbc_rdbtn8.gridy = 2;
				panel.add(rdbtn8, gbc_rdbtn8);
			}
			{
				txt8 = new JTextField();
				txt8.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt8.setText(null);
					}
				});
				GridBagConstraints gbc_txt8 = new GridBagConstraints();
				gbc_txt8.insets = new Insets(0, 0, 0, 5);
				gbc_txt8.fill = GridBagConstraints.BOTH;
				gbc_txt8.gridx = 3;
				gbc_txt8.gridy = 2;
				panel.add(txt8, gbc_txt8);
				txt8.setColumns(10);
			}
			{
				rdbtn9 = new JRadioButton("");
				rdbtn9.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						if (rdbtn9.isSelected()) {
							txt9.setEnabled(false);
							txt9.setText("Add Resposta");
						} else {
							txt9.setEnabled(true);
						}
					}
				});
				GridBagConstraints gbc_rdbtn9 = new GridBagConstraints();
				gbc_rdbtn9.insets = new Insets(0, 0, 0, 5);
				gbc_rdbtn9.gridx = 4;
				gbc_rdbtn9.gridy = 2;
				panel.add(rdbtn9, gbc_rdbtn9);
			}
			{
				txt9 = new JTextField();
				txt9.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						txt9.setText(null);
					}
				});
				GridBagConstraints gbc_txt9 = new GridBagConstraints();
				gbc_txt9.fill = GridBagConstraints.BOTH;
				gbc_txt9.gridx = 5;
				gbc_txt9.gridy = 2;
				panel.add(txt9, gbc_txt9);
				txt9.setColumns(10);
			}
			ButtonGroup btgRespostas = new ButtonGroup();

		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton addButton = new JButton("Adicionar");
				addButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lerPerguntas(listaRespostasConfig, mapaRespostaConfig);
						limparCampos();
					}
				});
				addButton.setActionCommand("OK");
				buttonPane.add(addButton);
				getRootPane().setDefaultButton(addButton);
			}
			{
				JButton voltarButton = new JButton("Voltar");
				voltarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				voltarButton.setActionCommand("Cancel");
				buttonPane.add(voltarButton);
			}
		}
		/*
		 * Deixar os radio buton selecionados
		 */
		limparCampos();

	}

	public void lerPerguntas(List<String> lista, Map<String, List<String>> mapa) {

		if (!txt1.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt1.getText());
			lista.add(txt1.getText());
		}
		if (!txt2.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt2.getText());
			lista.add(txt2.getText());
		}
		if (!txt3.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt3.getText());
			lista.add(txt3.getText());
		}
		if (!txt4.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt4.getText());
			lista.add(txt4.getText());
		}
		if (!txt5.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt5.getText());
			lista.add(txt5.getText());
		}
		if (!txt6.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt6.getText());
			lista.add(txt6.getText());
		}
		if (!txt7.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt7.getText());
			lista.add(txt7.getText());
		}
		if (!txt8.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt8.getText());
			lista.add(txt8.getText());
		}
		if (!txt9.getText().equals(String.valueOf("Add Resposta"))) {
			comboBoxRespostas.addItem(txt9.getText());
			lista.add(txt9.getText());
		}

		mapa.put(textAreaPergunta.getText(), lista);
	}

	public void limparCampos() {
		textAreaPergunta.setText(null);

		rdbtn1.setSelected(true);
		rdbtn2.setSelected(true);
		rdbtn3.setSelected(true);
		rdbtn4.setSelected(true);
		rdbtn5.setSelected(true);
		rdbtn6.setSelected(true);
		rdbtn7.setSelected(true);
		rdbtn8.setSelected(true);
		rdbtn9.setSelected(true);

		txt1.setEnabled(false);
		txt2.setEnabled(false);
		txt3.setEnabled(false);
		txt4.setEnabled(false);
		txt5.setEnabled(false);
		txt6.setEnabled(false);
		txt7.setEnabled(false);
		txt8.setEnabled(false);
		txt9.setEnabled(false);

		txt1.setText("Add Resposta");
		txt2.setText("Add Resposta");
		txt3.setText("Add Resposta");
		txt4.setText("Add Resposta");
		txt5.setText("Add Resposta");
		txt6.setText("Add Resposta");
		txt7.setText("Add Resposta");
		txt8.setText("Add Resposta");
		txt9.setText("Add Resposta");
	}
}
