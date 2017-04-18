package pp.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.peer.TextAreaPeer;
import java.awt.event.ActionEvent;

public class TelaNova extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;
	private JTextField txt9;

	private LinkedHashMap<String, List<String>> mapaConfig = new LinkedHashMap<>();
	private List<String> listaConfig = new ArrayList<>();
	private List<String> listaPergAnteriro = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNova frame = new TelaNova();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaNova() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);

		JPanel panelPrincipal = new JPanel();
		tabbedPane.addTab("New tab", null, panelPrincipal, null);
		tabbedPane.setTitleAt(0, "Home");

		JPanel panelConfiguracao = new JPanel();
		tabbedPane.addTab("New tab", null, panelConfiguracao, null);
		GridBagLayout gbl_panelConfiguracao = new GridBagLayout();
		gbl_panelConfiguracao.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelConfiguracao.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelConfiguracao.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelConfiguracao.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelConfiguracao.setLayout(gbl_panelConfiguracao);

		JLabel lblRespostaAnterior = new JLabel("Resposta Anterior:");
		GridBagConstraints gbc_lblRespostaAnterior = new GridBagConstraints();
		gbc_lblRespostaAnterior.insets = new Insets(0, 0, 5, 5);
		gbc_lblRespostaAnterior.anchor = GridBagConstraints.EAST;
		gbc_lblRespostaAnterior.gridx = 0;
		gbc_lblRespostaAnterior.gridy = 0;
		panelConfiguracao.add(lblRespostaAnterior, gbc_lblRespostaAnterior);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		panelConfiguracao.add(comboBox, gbc_comboBox);

		JLabel lblPergunta = new JLabel("Pergunta:");
		GridBagConstraints gbc_lblPergunta = new GridBagConstraints();
		gbc_lblPergunta.anchor = GridBagConstraints.EAST;
		gbc_lblPergunta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPergunta.gridx = 0;
		gbc_lblPergunta.gridy = 1;
		panelConfiguracao.add(lblPergunta, gbc_lblPergunta);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panelConfiguracao.add(scrollPane, gbc_scrollPane);

		JTextArea textAreaPergunta = new JTextArea();
		scrollPane.setViewportView(textAreaPergunta);

		JLabel lblRespostas = new JLabel("Respostas: ");
		GridBagConstraints gbc_lblRespostas = new GridBagConstraints();
		gbc_lblRespostas.anchor = GridBagConstraints.EAST;
		gbc_lblRespostas.insets = new Insets(0, 0, 5, 5);
		gbc_lblRespostas.gridx = 0;
		gbc_lblRespostas.gridy = 2;
		panelConfiguracao.add(lblRespostas, gbc_lblRespostas);

		txt1 = new JTextField();
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.insets = new Insets(0, 0, 5, 5);
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.gridx = 1;
		gbc_txt1.gridy = 2;
		panelConfiguracao.add(txt1, gbc_txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.insets = new Insets(0, 0, 5, 5);
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.gridx = 2;
		gbc_txt2.gridy = 2;
		panelConfiguracao.add(txt2, gbc_txt2);
		txt2.setColumns(10);

		txt3 = new JTextField();
		GridBagConstraints gbc_txt3 = new GridBagConstraints();
		gbc_txt3.insets = new Insets(0, 0, 5, 0);
		gbc_txt3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt3.gridx = 3;
		gbc_txt3.gridy = 2;
		panelConfiguracao.add(txt3, gbc_txt3);
		txt3.setColumns(10);

		txt4 = new JTextField();
		GridBagConstraints gbc_txt4 = new GridBagConstraints();
		gbc_txt4.insets = new Insets(0, 0, 5, 5);
		gbc_txt4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt4.gridx = 1;
		gbc_txt4.gridy = 3;
		panelConfiguracao.add(txt4, gbc_txt4);
		txt4.setColumns(10);

		txt5 = new JTextField();
		GridBagConstraints gbc_txt5 = new GridBagConstraints();
		gbc_txt5.insets = new Insets(0, 0, 5, 5);
		gbc_txt5.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt5.gridx = 2;
		gbc_txt5.gridy = 3;
		panelConfiguracao.add(txt5, gbc_txt5);
		txt5.setColumns(10);

		txt6 = new JTextField();
		GridBagConstraints gbc_txt6 = new GridBagConstraints();
		gbc_txt6.insets = new Insets(0, 0, 5, 0);
		gbc_txt6.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt6.gridx = 3;
		gbc_txt6.gridy = 3;
		panelConfiguracao.add(txt6, gbc_txt6);
		txt6.setColumns(10);

		txt7 = new JTextField();
		GridBagConstraints gbc_txt7 = new GridBagConstraints();
		gbc_txt7.insets = new Insets(0, 0, 5, 5);
		gbc_txt7.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt7.gridx = 1;
		gbc_txt7.gridy = 4;
		panelConfiguracao.add(txt7, gbc_txt7);
		txt7.setColumns(10);

		txt8 = new JTextField();
		GridBagConstraints gbc_txt8 = new GridBagConstraints();
		gbc_txt8.insets = new Insets(0, 0, 5, 5);
		gbc_txt8.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt8.gridx = 2;
		gbc_txt8.gridy = 4;
		panelConfiguracao.add(txt8, gbc_txt8);
		txt8.setColumns(10);

		txt9 = new JTextField();
		GridBagConstraints gbc_txt9 = new GridBagConstraints();
		gbc_txt9.insets = new Insets(0, 0, 5, 0);
		gbc_txt9.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt9.gridx = 3;
		gbc_txt9.gridy = 4;
		panelConfiguracao.add(txt9, gbc_txt9);
		txt9.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");

		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.anchor = GridBagConstraints.EAST;
		gbc_btnSalvar.gridx = 3;
		gbc_btnSalvar.gridy = 5;
		panelConfiguracao.add(btnSalvar, gbc_btnSalvar);
		tabbedPane.setTitleAt(1, "Configuração");

		JPanel panelStart = new JPanel();
		tabbedPane.addTab("New tab", null, panelStart, null);
		GridBagLayout gbl_panelStart = new GridBagLayout();
		gbl_panelStart.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelStart.rowHeights = new int[] { 62, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelStart.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelStart.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panelStart.setLayout(gbl_panelStart);

		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panelStart.add(label, gbc_label);

		JRadioButton radio1 = new JRadioButton("");
		GridBagConstraints gbc_radio1 = new GridBagConstraints();
		gbc_radio1.gridwidth = 2;
		gbc_radio1.anchor = GridBagConstraints.WEST;
		gbc_radio1.insets = new Insets(0, 0, 5, 5);
		gbc_radio1.gridx = 0;
		gbc_radio1.gridy = 1;
		panelStart.add(radio1, gbc_radio1);

		JRadioButton radio2 = new JRadioButton("");
		GridBagConstraints gbc_radio2 = new GridBagConstraints();
		gbc_radio2.gridwidth = 2;
		gbc_radio2.anchor = GridBagConstraints.WEST;
		gbc_radio2.insets = new Insets(0, 0, 5, 5);
		gbc_radio2.gridx = 0;
		gbc_radio2.gridy = 2;
		panelStart.add(radio2, gbc_radio2);

		JRadioButton radio3 = new JRadioButton("");
		GridBagConstraints gbc_radio3 = new GridBagConstraints();
		gbc_radio3.gridwidth = 2;
		gbc_radio3.anchor = GridBagConstraints.WEST;
		gbc_radio3.insets = new Insets(0, 0, 5, 5);
		gbc_radio3.gridx = 0;
		gbc_radio3.gridy = 3;
		panelStart.add(radio3, gbc_radio3);

		JRadioButton radio4 = new JRadioButton("");
		GridBagConstraints gbc_radio4 = new GridBagConstraints();
		gbc_radio4.gridwidth = 2;
		gbc_radio4.anchor = GridBagConstraints.WEST;
		gbc_radio4.insets = new Insets(0, 0, 5, 5);
		gbc_radio4.gridx = 0;
		gbc_radio4.gridy = 4;
		panelStart.add(radio4, gbc_radio4);

		JRadioButton radio5 = new JRadioButton("");
		GridBagConstraints gbc_radio5 = new GridBagConstraints();
		gbc_radio5.gridwidth = 2;
		gbc_radio5.anchor = GridBagConstraints.WEST;
		gbc_radio5.insets = new Insets(0, 0, 5, 5);
		gbc_radio5.gridx = 0;
		gbc_radio5.gridy = 5;
		panelStart.add(radio5, gbc_radio5);

		JRadioButton radio6 = new JRadioButton("");
		GridBagConstraints gbc_radio6 = new GridBagConstraints();
		gbc_radio6.gridwidth = 2;
		gbc_radio6.anchor = GridBagConstraints.WEST;
		gbc_radio6.insets = new Insets(0, 0, 5, 5);
		gbc_radio6.gridx = 0;
		gbc_radio6.gridy = 6;
		panelStart.add(radio6, gbc_radio6);

		JRadioButton radio7 = new JRadioButton("");
		GridBagConstraints gbc_radio7 = new GridBagConstraints();
		gbc_radio7.gridwidth = 2;
		gbc_radio7.anchor = GridBagConstraints.WEST;
		gbc_radio7.insets = new Insets(0, 0, 5, 5);
		gbc_radio7.gridx = 0;
		gbc_radio7.gridy = 7;
		panelStart.add(radio7, gbc_radio7);

		JRadioButton radio8 = new JRadioButton("");
		GridBagConstraints gbc_radio8 = new GridBagConstraints();
		gbc_radio8.gridwidth = 2;
		gbc_radio8.anchor = GridBagConstraints.WEST;
		gbc_radio8.insets = new Insets(0, 0, 5, 5);
		gbc_radio8.gridx = 0;
		gbc_radio8.gridy = 8;
		panelStart.add(radio8, gbc_radio8);

		JRadioButton radio9 = new JRadioButton("");
		GridBagConstraints gbc_radio9 = new GridBagConstraints();
		gbc_radio9.gridwidth = 2;
		gbc_radio9.anchor = GridBagConstraints.WEST;
		gbc_radio9.insets = new Insets(0, 0, 5, 5);
		gbc_radio9.gridx = 0;
		gbc_radio9.gridy = 9;
		panelStart.add(radio9, gbc_radio9);
		tabbedPane.setTitleAt(2, "Começar");

		JButton btnComear = new JButton("Come\u00E7ar");

		GridBagConstraints gbc_btnComear = new GridBagConstraints();
		gbc_btnComear.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnComear.insets = new Insets(0, 0, 0, 5);
		gbc_btnComear.gridx = 0;
		gbc_btnComear.gridy = 10;
		panelStart.add(btnComear, gbc_btnComear);

		JButton btnProximaPergunta = new JButton("Proxima Pergunta");

		GridBagConstraints gbc_btnProximaPergunta = new GridBagConstraints();
		gbc_btnProximaPergunta.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnProximaPergunta.gridx = 1;
		gbc_btnProximaPergunta.gridy = 10;
		panelStart.add(btnProximaPergunta, gbc_btnProximaPergunta);
		/*
		 * btCONFIGURAÇÃO
		 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		 * 
		 */

		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArmazenarDados(textAreaPergunta, comboBox);
				limparDados(textAreaPergunta);
			}
		});

		/*
		 * btSTART
		 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		 * 
		 */
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);
		group.add(radio5);
		group.add(radio6);
		group.add(radio7);
		group.add(radio8);
		group.add(radio9);
		
		radio1.setVisible(false);
		radio2.setVisible(false);
		radio3.setVisible(false);
		radio4.setVisible(false);
		radio5.setVisible(false);
		radio6.setVisible(false);
		radio7.setVisible(false);
		radio8.setVisible(false);
		radio9.setVisible(false);

		label.setFont(new Font("Arial", Font.BOLD, 12));

		btnProximaPergunta.setEnabled(false);

		btnComear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarDados(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9);
				btnProximaPergunta.setEnabled(true);
				btnComear.setEnabled(false);
			}
		});

		btnProximaPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
	}

	/*
	 * mCONFIGURAÇÃO
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 */
	public void ArmazenarDados(JTextArea txtA, JComboBox cb) {
		listaConfig.clear();
		if (!txt1.getText().equals("")) {
			listaConfig.add(txt1.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt2.getText().equals("")) {
			listaConfig.add(txt2.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt3.getText().equals("")) {
			listaConfig.add(txt3.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt4.getText().equals("")) {
			listaConfig.add(txt4.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt5.getText().equals("")) {
			listaConfig.add(txt5.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt6.getText().equals("")) {
			listaConfig.add(txt6.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt7.getText().equals("")) {
			listaConfig.add(txt7.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt8.getText().equals("")) {
			listaConfig.add(txt8.getText());
		}else{
			listaConfig.add("+_+");
		}
		if (!txt9.getText().equals("")) {
			listaConfig.add(txt9.getText());
		}else{
			listaConfig.add("+_+");
		}

		mapaConfig.put(txtA.getText(), listaConfig);

		listaPergAnteriro.add(String.valueOf(cb.getSelectedItem()));

		for (String string : listaConfig) {
			if(!string.equals("+_+"))
			cb.addItem(string);
		}
	}

	public void limparDados(JTextArea txtA) {

		txt1.setText(null);
		txt2.setText(null);
		txt3.setText(null);
		txt4.setText(null);
		txt5.setText(null);
		txt6.setText(null);
		txt7.setText(null);
		txt8.setText(null);
		txt9.setText(null);

		txtA.setText(null);
	}

	/*
	 * mSTART
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 */
	public void mostrarDados(JLabel label, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3,
			JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8,
			JRadioButton radio9) {
		int i = 0;
		for (Entry<String, List<String>> entry : mapaConfig.entrySet()) {
			label.setText(entry.getKey());

			if (!entry.getValue().get(0).equals("+_+")) {
				radio1.setVisible(true);
				radio1.setText(entry.getValue().get(0));
			}
			if (!entry.getValue().get(1).equals("+_+")) {
				radio2.setVisible(true);
				radio2.setText(entry.getValue().get(1));
			}
			if (!entry.getValue().get(2).equals("+_+")) {
				radio3.setVisible(true);
				radio3.setText(entry.getValue().get(2));
			}
			if (!entry.getValue().get(3).equals("+_+")) {
				radio4.setVisible(true);
				radio4.setText(entry.getValue().get(3));
			}
			if (!entry.getValue().get(4).equals("+_+")) {
				radio5.setVisible(true);
				radio5.setText(entry.getValue().get(4));
			}
			if (!entry.getValue().get(5).equals("+_+")) {
				radio6.setVisible(true);
				radio6.setText(entry.getValue().get(5));
			}
			if (!entry.getValue().get(6).equals("+_+")) {
				radio7.setVisible(true);
				radio7.setText(entry.getValue().get(6));
			}
			if (!entry.getValue().get(7).equals("+_+")) {
				radio8.setVisible(true);
				radio8.setText(entry.getValue().get(7));
			}
			if (!entry.getValue().get(8).equals("+_+")) {
				radio9.setVisible(true);
				radio9.setText(entry.getValue().get(8));
			}

			break;
		}
	}
}
