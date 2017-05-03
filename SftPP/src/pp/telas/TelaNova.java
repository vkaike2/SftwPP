package pp.telas;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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
import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.w3c.dom.NodeList;

import pp.auxiliares.SrXML;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private SrXML xml = new SrXML();

	private LinkedHashMap<String, List<String>> mapaConfig = new LinkedHashMap<>();
	// private List<String> listaConfig = new ArrayList<>();
	private List<String> listaCombobox = new ArrayList<>();
	private LinkedList<String> listaPergAnteriro = new LinkedList<>();
	private List<String> listaLinks = new ArrayList<>();
	private JPasswordField passwordField;
	private JTextField txtUsuario;
	private JTextField txtLink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNova frame = new TelaNova();
					frame.setLocationRelativeTo(null);
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
		setBounds(100, 100, 544, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);

		JPanel panelPrincipal = new JPanel();
		tabbedPane.addTab("New tab", null, panelPrincipal, null);
		GridBagLayout gbl_panelPrincipal = new GridBagLayout();
		gbl_panelPrincipal.columnWidths = new int[] { 173, 74, 76, 0 };
		gbl_panelPrincipal.rowHeights = new int[] { 134, 0, 0, 0, 40, 0 };
		gbl_panelPrincipal.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelPrincipal.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelPrincipal.setLayout(gbl_panelPrincipal);

		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 2;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		panelPrincipal.add(label_1, gbc_label_1);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		GridBagConstraints gbc_lblUsurio = new GridBagConstraints();
		gbc_lblUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsurio.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblUsurio.gridx = 0;
		gbc_lblUsurio.gridy = 1;
		panelPrincipal.add(lblUsurio, gbc_lblUsurio);

		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.gridwidth = 2;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 1;
		panelPrincipal.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenha.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblSenha.gridx = 0;
		gbc_lblSenha.gridy = 2;
		panelPrincipal.add(lblSenha, gbc_lblSenha);

		passwordField = new JPasswordField();

		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.anchor = GridBagConstraints.SOUTH;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 2;
		panelPrincipal.add(passwordField, gbc_passwordField);

		JButton btnConectar = new JButton("Conectar");

		GridBagConstraints gbc_btnConectar = new GridBagConstraints();
		gbc_btnConectar.anchor = GridBagConstraints.SOUTH;
		gbc_btnConectar.gridwidth = 2;
		gbc_btnConectar.gridx = 1;
		gbc_btnConectar.gridy = 4;
		panelPrincipal.add(btnConectar, gbc_btnConectar);
		tabbedPane.setTitleAt(0, "Home");

		JPanel panelConfiguracao = new JPanel();
		tabbedPane.addTab("New tab", null, panelConfiguracao, null);
		GridBagLayout gbl_panelConfiguracao = new GridBagLayout();
		gbl_panelConfiguracao.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelConfiguracao.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelConfiguracao.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelConfiguracao.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelConfiguracao.setLayout(gbl_panelConfiguracao);

		JButton btnBaixar = new JButton("B");

		GridBagConstraints gbc_btnBaixar = new GridBagConstraints();
		gbc_btnBaixar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBaixar.gridx = 0;
		gbc_btnBaixar.gridy = 0;
		panelConfiguracao.add(btnBaixar, gbc_btnBaixar);

		JButton btnSalvar = new JButton("S");

		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 0;
		panelConfiguracao.add(btnSalvar, gbc_btnSalvar);

		JButton btnEditar = new JButton("E");

		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.anchor = GridBagConstraints.WEST;
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 2;
		gbc_btnEditar.gridy = 0;
		panelConfiguracao.add(btnEditar, gbc_btnEditar);

		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// xml.atualizar(listaLinks, listaPergAnteriro, mapaConfig);

				TabelaEditar telaEditar = new TabelaEditar();

				telaEditar.setLocationRelativeTo(contentPane);
				telaEditar.iniciarTabela(mapaConfig);

				telaEditar.table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						if (arg0.getClickCount() > 1) {
							PreencheDados(telaEditar);

						}
					}
				});

				telaEditar.setVisible(true);

			}
		});

		JLabel lblRespostaAnterior = new JLabel("Resposta Anterior:");
		GridBagConstraints gbc_lblRespostaAnterior = new GridBagConstraints();
		gbc_lblRespostaAnterior.gridwidth = 2;
		gbc_lblRespostaAnterior.insets = new Insets(0, 0, 5, 5);
		gbc_lblRespostaAnterior.anchor = GridBagConstraints.EAST;
		gbc_lblRespostaAnterior.gridx = 0;
		gbc_lblRespostaAnterior.gridy = 1;
		panelConfiguracao.add(lblRespostaAnterior, gbc_lblRespostaAnterior);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 1;
		panelConfiguracao.add(comboBox, gbc_comboBox);

		JLabel lblPergunta = new JLabel("Pergunta:");
		GridBagConstraints gbc_lblPergunta = new GridBagConstraints();
		gbc_lblPergunta.gridwidth = 2;
		gbc_lblPergunta.anchor = GridBagConstraints.EAST;
		gbc_lblPergunta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPergunta.gridx = 0;
		gbc_lblPergunta.gridy = 2;
		panelConfiguracao.add(lblPergunta, gbc_lblPergunta);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 2;
		panelConfiguracao.add(scrollPane, gbc_scrollPane);

		JTextArea textAreaPergunta = new JTextArea();

		scrollPane.setViewportView(textAreaPergunta);

		JRadioButton radioContinuacao = new JRadioButton("Continua\u00E7\u00E3o");

		GridBagConstraints gbc_radioContinuacao = new GridBagConstraints();
		gbc_radioContinuacao.insets = new Insets(0, 0, 5, 5);
		gbc_radioContinuacao.gridx = 2;
		gbc_radioContinuacao.gridy = 3;
		panelConfiguracao.add(radioContinuacao, gbc_radioContinuacao);

		JRadioButton radioRespostaFinal = new JRadioButton("Resposta Final");
		GridBagConstraints gbc_radioRespostaFinal = new GridBagConstraints();
		gbc_radioRespostaFinal.insets = new Insets(0, 0, 5, 5);
		gbc_radioRespostaFinal.gridx = 3;
		gbc_radioRespostaFinal.gridy = 3;
		panelConfiguracao.add(radioRespostaFinal, gbc_radioRespostaFinal);

		txtLink = new JTextField();

		GridBagConstraints gbc_txtLink = new GridBagConstraints();
		gbc_txtLink.insets = new Insets(0, 0, 5, 0);
		gbc_txtLink.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLink.gridx = 4;
		gbc_txtLink.gridy = 3;
		panelConfiguracao.add(txtLink, gbc_txtLink);
		txtLink.setColumns(10);

		JLabel lblRespostas = new JLabel("Respostas: ");
		GridBagConstraints gbc_lblRespostas = new GridBagConstraints();
		gbc_lblRespostas.gridwidth = 2;
		gbc_lblRespostas.anchor = GridBagConstraints.EAST;
		gbc_lblRespostas.insets = new Insets(0, 0, 5, 5);
		gbc_lblRespostas.gridx = 0;
		gbc_lblRespostas.gridy = 4;
		panelConfiguracao.add(lblRespostas, gbc_lblRespostas);

		txt1 = new JTextField();
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.insets = new Insets(0, 0, 5, 5);
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.gridx = 2;
		gbc_txt1.gridy = 4;
		panelConfiguracao.add(txt1, gbc_txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.insets = new Insets(0, 0, 5, 5);
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.gridx = 3;
		gbc_txt2.gridy = 4;
		panelConfiguracao.add(txt2, gbc_txt2);
		txt2.setColumns(10);

		txt3 = new JTextField();
		GridBagConstraints gbc_txt3 = new GridBagConstraints();
		gbc_txt3.insets = new Insets(0, 0, 5, 0);
		gbc_txt3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt3.gridx = 4;
		gbc_txt3.gridy = 4;
		panelConfiguracao.add(txt3, gbc_txt3);
		txt3.setColumns(10);

		txt4 = new JTextField();
		GridBagConstraints gbc_txt4 = new GridBagConstraints();
		gbc_txt4.insets = new Insets(0, 0, 5, 5);
		gbc_txt4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt4.gridx = 2;
		gbc_txt4.gridy = 5;
		panelConfiguracao.add(txt4, gbc_txt4);
		txt4.setColumns(10);

		txt5 = new JTextField();
		GridBagConstraints gbc_txt5 = new GridBagConstraints();
		gbc_txt5.insets = new Insets(0, 0, 5, 5);
		gbc_txt5.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt5.gridx = 3;
		gbc_txt5.gridy = 5;
		panelConfiguracao.add(txt5, gbc_txt5);
		txt5.setColumns(10);

		txt6 = new JTextField();
		GridBagConstraints gbc_txt6 = new GridBagConstraints();
		gbc_txt6.insets = new Insets(0, 0, 5, 0);
		gbc_txt6.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt6.gridx = 4;
		gbc_txt6.gridy = 5;
		panelConfiguracao.add(txt6, gbc_txt6);
		txt6.setColumns(10);

		txt7 = new JTextField();
		GridBagConstraints gbc_txt7 = new GridBagConstraints();
		gbc_txt7.insets = new Insets(0, 0, 5, 5);
		gbc_txt7.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt7.gridx = 2;
		gbc_txt7.gridy = 6;
		panelConfiguracao.add(txt7, gbc_txt7);
		txt7.setColumns(10);

		txt8 = new JTextField();
		GridBagConstraints gbc_txt8 = new GridBagConstraints();
		gbc_txt8.insets = new Insets(0, 0, 5, 5);
		gbc_txt8.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt8.gridx = 3;
		gbc_txt8.gridy = 6;
		panelConfiguracao.add(txt8, gbc_txt8);
		txt8.setColumns(10);

		txt9 = new JTextField();
		GridBagConstraints gbc_txt9 = new GridBagConstraints();
		gbc_txt9.insets = new Insets(0, 0, 5, 0);
		gbc_txt9.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt9.gridx = 4;
		gbc_txt9.gridy = 6;
		panelConfiguracao.add(txt9, gbc_txt9);
		txt9.setColumns(10);
		tabbedPane.setTitleAt(1, "Configuração");

		JPanel panelStart = new JPanel();
		tabbedPane.addTab("New tab", null, panelStart, null);
		GridBagLayout gbl_panelStart = new GridBagLayout();
		gbl_panelStart.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panelStart.rowHeights = new int[] { 62, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelStart.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelStart.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panelStart.setLayout(gbl_panelStart);

		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 3;
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panelStart.add(label, gbc_label);

		JRadioButton radio1 = new JRadioButton("");
		GridBagConstraints gbc_radio1 = new GridBagConstraints();
		gbc_radio1.gridwidth = 3;
		gbc_radio1.anchor = GridBagConstraints.WEST;
		gbc_radio1.insets = new Insets(0, 0, 5, 0);
		gbc_radio1.gridx = 0;
		gbc_radio1.gridy = 1;
		panelStart.add(radio1, gbc_radio1);

		JRadioButton radio2 = new JRadioButton("");
		GridBagConstraints gbc_radio2 = new GridBagConstraints();
		gbc_radio2.gridwidth = 3;
		gbc_radio2.anchor = GridBagConstraints.WEST;
		gbc_radio2.insets = new Insets(0, 0, 5, 0);
		gbc_radio2.gridx = 0;
		gbc_radio2.gridy = 2;
		panelStart.add(radio2, gbc_radio2);

		JRadioButton radio3 = new JRadioButton("");
		GridBagConstraints gbc_radio3 = new GridBagConstraints();
		gbc_radio3.gridwidth = 3;
		gbc_radio3.anchor = GridBagConstraints.WEST;
		gbc_radio3.insets = new Insets(0, 0, 5, 0);
		gbc_radio3.gridx = 0;
		gbc_radio3.gridy = 3;
		panelStart.add(radio3, gbc_radio3);

		JRadioButton radio4 = new JRadioButton("");
		GridBagConstraints gbc_radio4 = new GridBagConstraints();
		gbc_radio4.gridwidth = 3;
		gbc_radio4.anchor = GridBagConstraints.WEST;
		gbc_radio4.insets = new Insets(0, 0, 5, 0);
		gbc_radio4.gridx = 0;
		gbc_radio4.gridy = 4;
		panelStart.add(radio4, gbc_radio4);

		JRadioButton radio5 = new JRadioButton("");
		GridBagConstraints gbc_radio5 = new GridBagConstraints();
		gbc_radio5.gridwidth = 3;
		gbc_radio5.anchor = GridBagConstraints.WEST;
		gbc_radio5.insets = new Insets(0, 0, 5, 0);
		gbc_radio5.gridx = 0;
		gbc_radio5.gridy = 5;
		panelStart.add(radio5, gbc_radio5);

		JRadioButton radio6 = new JRadioButton("");
		GridBagConstraints gbc_radio6 = new GridBagConstraints();
		gbc_radio6.gridwidth = 3;
		gbc_radio6.anchor = GridBagConstraints.WEST;
		gbc_radio6.insets = new Insets(0, 0, 5, 0);
		gbc_radio6.gridx = 0;
		gbc_radio6.gridy = 6;
		panelStart.add(radio6, gbc_radio6);

		JRadioButton radio7 = new JRadioButton("");
		GridBagConstraints gbc_radio7 = new GridBagConstraints();
		gbc_radio7.gridwidth = 3;
		gbc_radio7.anchor = GridBagConstraints.WEST;
		gbc_radio7.insets = new Insets(0, 0, 5, 0);
		gbc_radio7.gridx = 0;
		gbc_radio7.gridy = 7;
		panelStart.add(radio7, gbc_radio7);

		JRadioButton radio8 = new JRadioButton("");
		GridBagConstraints gbc_radio8 = new GridBagConstraints();
		gbc_radio8.gridwidth = 3;
		gbc_radio8.anchor = GridBagConstraints.WEST;
		gbc_radio8.insets = new Insets(0, 0, 5, 0);
		gbc_radio8.gridx = 0;
		gbc_radio8.gridy = 8;
		panelStart.add(radio8, gbc_radio8);

		JRadioButton radio9 = new JRadioButton("");
		GridBagConstraints gbc_radio9 = new GridBagConstraints();
		gbc_radio9.gridwidth = 3;
		gbc_radio9.anchor = GridBagConstraints.WEST;
		gbc_radio9.insets = new Insets(0, 0, 5, 0);
		gbc_radio9.gridx = 0;
		gbc_radio9.gridy = 9;
		panelStart.add(radio9, gbc_radio9);
		tabbedPane.setTitleAt(2, "Começar");

		JButton btnResetar = new JButton("Resetar");

		GridBagConstraints gbc_btnResetar = new GridBagConstraints();
		gbc_btnResetar.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnResetar.insets = new Insets(0, 0, 0, 5);
		gbc_btnResetar.gridx = 0;
		gbc_btnResetar.gridy = 10;
		panelStart.add(btnResetar, gbc_btnResetar);

		JButton btnComear = new JButton("Come\u00E7ar");

		GridBagConstraints gbc_btnComear = new GridBagConstraints();
		gbc_btnComear.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnComear.insets = new Insets(0, 0, 0, 5);
		gbc_btnComear.gridx = 1;
		gbc_btnComear.gridy = 10;
		panelStart.add(btnComear, gbc_btnComear);

		JButton btnProximaPergunta = new JButton("Proxima Pergunta");

		GridBagConstraints gbc_btnProximaPergunta = new GridBagConstraints();
		gbc_btnProximaPergunta.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnProximaPergunta.gridx = 2;
		gbc_btnProximaPergunta.gridy = 10;
		panelStart.add(btnProximaPergunta, gbc_btnProximaPergunta);
		/*
		 * btHOME
		 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		 * 
		 */

		tabbedPane.remove(panelStart);
		tabbedPane.remove(panelConfiguracao);

		ImageIcon icon = new ImageIcon(".\\Dente.png");
		label_1.setIcon(icon);

		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent k) {
				if (k.getKeyCode() == KeyEvent.VK_ENTER) {
					logar(tabbedPane, panelStart, panelConfiguracao, btnConectar);
				}
			}
		});

		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logar(tabbedPane, panelStart, panelConfiguracao, btnConectar);

			}
		});
		/*
		 * btCONFIGURAÇÃO
		 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		 * 
		 */
		// btnEditar.setEnabled(false);
		ButtonGroup groupConfig = new ButtonGroup();
		groupConfig.add(radioRespostaFinal);
		groupConfig.add(radioContinuacao);

		radioContinuacao.setSelected(true);

		AlternaRespostas(radioContinuacao, radioRespostaFinal);

		radioContinuacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AlternaRespostas(radioContinuacao, radioRespostaFinal);
			}
		});
		radioRespostaFinal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				AlternaRespostas(radioContinuacao, radioRespostaFinal);
			}
		});
		txtLink.setText("Adicione um Link");

		txtLink.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtLink.getText().equals("Adicione um Link")) {
					txtLink.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtLink.getText().equals("")) {
					txtLink.setText("Adicione um Link");
				}
			}
		});
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xml.escreve(mapaConfig, listaPergAnteriro, listaLinks);
			}
		});
		btnBaixar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xml.atualizar(listaLinks, listaPergAnteriro, mapaConfig);
				

			}
		});

		textAreaPergunta.setLineWrap(true);

		JButton btnContinuar = new JButton("Continuar");

		GridBagConstraints gbc_btnContinuar = new GridBagConstraints();
		gbc_btnContinuar.gridx = 4;
		gbc_btnContinuar.gridy = 7;
		panelConfiguracao.add(btnContinuar, gbc_btnContinuar);
		panelConfiguracao.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { comboBox,
				textAreaPergunta, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, btnContinuar }));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// xml.atualizar(listaLinks, listaPergAnteriro, mapaConfig);

				ArmazenarDados(textAreaPergunta, comboBox, mapaConfig);

				limparDados(textAreaPergunta);

			}
		});
		textAreaPergunta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent k) {
				if (k.getKeyCode() == KeyEvent.VK_TAB) {
					txt1.grabFocus();
					k.consume();
				}
			}
		});
		ImageIcon imgIc = new ImageIcon(".\\editar.png");
		imgIc.setImage(imgIc.getImage().getScaledInstance(49, 49, 100));

		/*
		 * btSTART
		 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		 * 
		 */
		// panelStart.setBackground(Color.BLACK);
		ButtonGroup groupStart = new ButtonGroup();
		groupStart.add(radio1);
		groupStart.add(radio2);
		groupStart.add(radio3);
		groupStart.add(radio4);
		groupStart.add(radio5);
		groupStart.add(radio6);
		groupStart.add(radio7);
		groupStart.add(radio8);
		groupStart.add(radio9);

		radio1.setVisible(false);
		radio2.setVisible(false);
		radio3.setVisible(false);
		radio4.setVisible(false);
		radio5.setVisible(false);
		radio6.setVisible(false);
		radio7.setVisible(false);
		radio8.setVisible(false);
		radio9.setVisible(false);

		label.setFont(new Font("Arial", Font.BOLD, 14));

		btnProximaPergunta.setEnabled(false);
		btnResetar.setEnabled(false);

		panelStart.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9 }));

		btnProximaPergunta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				proximaPergunta(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9,
						btnComear, btnResetar, btnProximaPergunta);

			}
		});

		btnComear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xml.atualizar(listaLinks, listaPergAnteriro, mapaConfig);
				// listaLinks.clear();
				// listaPergAnteriro.clear();
				// SrXML xml = new SrXML();
				// xml.le(mapaConfig, listaPergAnteriro, listaLinks);

				mostrarDados(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9);
				btnProximaPergunta.setEnabled(true);
				btnComear.setEnabled(false);
				btnResetar.setEnabled(true);

			}
		});
		btnResetar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xml.atualizar(listaLinks, listaPergAnteriro, mapaConfig);
				// listaLinks.clear();
				// listaPergAnteriro.clear();
				// SrXML xml = new SrXML();
				// xml.le(mapaConfig, listaPergAnteriro, listaLinks);

				limparRadios(radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9);
				mostrarDados(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9);
				btnProximaPergunta.setEnabled(true);
				btnComear.setEnabled(false);
			}
		});
	}

	/*
	 * mCONFIGURAÇÃO
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 */
	public void PreencheDados(TabelaEditar telaEditar) {
		telaEdicao tEdicao = new telaEdicao();
		for (Entry<String, List<String>> entry : mapaConfig.entrySet()) {
			if (entry.getKey().equals(telaEditar.retornaLinhaClicada())) {
				tEdicao.escreverPergunta(entry.getKey(), entry.getValue().get(0), entry.getValue().get(1),
						entry.getValue().get(2), entry.getValue().get(3), entry.getValue().get(4),
						entry.getValue().get(5), entry.getValue().get(6), entry.getValue().get(7),
						entry.getValue().get(8));
				tEdicao.setLocationRelativeTo(telaEditar);
				tEdicao.setVisible(true);
			}
		}

	}

	public void AlternaRespostas(JRadioButton r1, JRadioButton r2) {
		if (r1.isSelected()) {
			txtLink.setEnabled(false);

			txt1.setEnabled(true);
			txt2.setEnabled(true);
			txt3.setEnabled(true);
			txt4.setEnabled(true);
			txt5.setEnabled(true);
			txt6.setEnabled(true);
			txt7.setEnabled(true);
			txt8.setEnabled(true);
			txt9.setEnabled(true);

		} else if (r2.isSelected()) {
			txtLink.setEnabled(true);

			txt1.setEnabled(false);
			txt2.setEnabled(false);
			txt3.setEnabled(false);
			txt4.setEnabled(false);
			txt5.setEnabled(false);
			txt6.setEnabled(false);
			txt7.setEnabled(false);
			txt8.setEnabled(false);
			txt9.setEnabled(false);
		}

	}

	public void ArmazenarDados(JTextArea txtA, JComboBox cb, LinkedHashMap<String, List<String>> mapa) {
		List<String> lista = new ArrayList<>();

		if (!txt1.getText().equals("")) {
			lista.add(txt1.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt2.getText().equals("")) {
			lista.add(txt2.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt3.getText().equals("")) {
			lista.add(txt3.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt4.getText().equals("")) {
			lista.add(txt4.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt5.getText().equals("")) {
			lista.add(txt5.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt6.getText().equals("")) {
			lista.add(txt6.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt7.getText().equals("")) {
			lista.add(txt7.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt8.getText().equals("")) {
			lista.add(txt8.getText());
		} else {
			lista.add("+_+");
		}
		if (!txt9.getText().equals("")) {
			lista.add(txt9.getText());
		} else {
			lista.add("+_+");
		}

		mapa.put(txtA.getText(), lista);
		String TextoDoComboBox = String.valueOf(cb.getSelectedItem());

		listaPergAnteriro.add(TextoDoComboBox);
		listaLinks.add(TextoDoComboBox + "Ä" + txtLink.getText());

		if (!TextoDoComboBox.equals(null)) {
			// tentando remover do combobox
			Object textoObject = TextoDoComboBox;
			cb.removeItem(textoObject);

		}
		for (String string : lista) {
			if (!string.equals("+_+"))
				listaCombobox.add(string);
		}
		for (int i = 0; i < listaCombobox.size(); i++) {
			if (listaCombobox.get(i).equals(TextoDoComboBox) && !listaCombobox.get(i).equals(null)) {
				listaCombobox.remove(i);
			}
		}
		cb.removeAllItems();
		for (String string : listaCombobox) {
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
		txtLink.setText("Adicione um Link");
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

	public void proximaPergunta(JLabel label, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3,
			JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8,
			JRadioButton radio9, JButton comecar, JButton resetar, JButton proxPerg) {
		int cont = 0;

		if (radio1.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio1,
					comecar, resetar, proxPerg);
		}
		if (radio2.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio2,
					comecar, resetar, proxPerg);
		}
		if (radio3.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio3,
					comecar, resetar, proxPerg);
		}
		if (radio4.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio4,
					comecar, resetar, proxPerg);
		}
		if (radio5.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio5,
					comecar, resetar, proxPerg);
		}
		if (radio6.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio6,
					comecar, resetar, proxPerg);
		}
		if (radio7.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio7,
					comecar, resetar, proxPerg);
		}
		if (radio8.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio8,
					comecar, resetar, proxPerg);
		}
		if (radio9.isSelected()) {
			dentroDoIF(label, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, cont, radio9,
					comecar, resetar, proxPerg);
		}

	}

	public void dentroDoIF(JLabel label, JRadioButton radio1, JRadioButton radio2, JRadioButton radio3,
			JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8,
			JRadioButton radio9, int cont, JRadioButton radiao, JButton comecar, JButton resetar, JButton proxPerg) {

		for (int i = 0; i < listaPergAnteriro.size(); i++) {

			if (radiao.getText().equals(listaPergAnteriro.get(i))) {

				deixarRadiosInvisiveis(radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9);

				for (Entry<String, List<String>> entry : mapaConfig.entrySet()) {

					if (i == cont) {

						if (entry.getValue().get(0).equals("+_+") && entry.getValue().get(1).equals("+_+")
								&& entry.getValue().get(2).equals("+_+") && entry.getValue().get(3).equals("+_+")
								&& entry.getValue().get(4).equals("+_+") && entry.getValue().get(5).equals("+_+")
								&& entry.getValue().get(6).equals("+_+") && entry.getValue().get(7).equals("+_+")
								&& entry.getValue().get(8).equals("+_+")) {

							// System.out.println("abriu");
							// System.out.println("entrou 1");
							for (String string : listaLinks) {

								if (listaPergAnteriro.get(i).equals(string.substring(0, string.indexOf("Ä")))) {
									int um = string.lastIndexOf("Ä");
									if (string.substring(um + 1).equals("Adicione um Link")) {
										TelaRespostaFinal trf = new TelaRespostaFinal();
										trf.setLocationRelativeTo(contentPane);

										trf.setVisible(true);

										trf.labelTexto.setText(entry.getKey());

										trf.lblLink.setVisible(false);
										trf.labelLink.setVisible(false);

										label.setText(null);

										resetar.setEnabled(false);
										proxPerg.setEnabled(false);

										comecar.setEnabled(true);
									} else {

										TelaRespostaFinal trf = new TelaRespostaFinal();
										trf.setLocationRelativeTo(contentPane);

										trf.setVisible(true);

										trf.labelTexto.setText(entry.getKey());
										// int um = string.lastIndexOf("Ä");

										trf.labelLink.setText(string.substring(um + 1));

										label.setText(null);

										resetar.setEnabled(false);
										proxPerg.setEnabled(false);

										comecar.setEnabled(true);
									}
								}

							}

						} else {

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
						}
					}
					cont++;
				}

			}

		}

	}

	public void deixarRadiosInvisiveis(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3,
			JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8,
			JRadioButton radio9) {

		radio1.setVisible(false);
		radio2.setVisible(false);
		radio3.setVisible(false);
		radio4.setVisible(false);
		radio5.setVisible(false);
		radio6.setVisible(false);
		radio7.setVisible(false);
		radio8.setVisible(false);
		radio9.setVisible(false);
	}

	public void limparRadios(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4,
			JRadioButton radio5, JRadioButton radio6, JRadioButton radio7, JRadioButton radio8, JRadioButton radio9) {

		radio1.setText(null);
		radio2.setText(null);
		radio3.setText(null);
		radio4.setText(null);
		radio5.setText(null);
		radio6.setText(null);
		radio7.setText(null);
		radio8.setText(null);
		radio9.setText(null);
	}
	/*
	 * mHOME
	 * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
	 * 
	 */

	public void logar(JTabbedPane tabbedPane, JPanel panelStart, JPanel panelConfiguracao, JButton btnConectar) {
		String s = null;

		if (!txtUsuario.isEnabled()) {

			txtUsuario.setEnabled(true);
			passwordField.setEnabled(true);
			txtUsuario.setText(null);
			passwordField.setText(null);

			tabbedPane.remove(panelStart);
			tabbedPane.remove(panelConfiguracao);

		}

		if (txtUsuario.getText().equals("admin") && passwordField.getText().equals("admin")) {
			tabbedPane.add("Configuração", panelConfiguracao);
			tabbedPane.add("Começar", panelStart);

			s = txtUsuario.getText();
			txtUsuario.setEnabled(false);
			passwordField.setEnabled(false);
			tabbedPane.setSelectedIndex(1);

			btnConectar.setText("Desconectar");
		} else if (txtUsuario.getText().equals("user") && passwordField.getText().equals("user")) {
			tabbedPane.add("Começar", panelStart);

			s = txtUsuario.getText();

			txtUsuario.setEnabled(false);
			passwordField.setEnabled(false);
			tabbedPane.setSelectedIndex(1);

			btnConectar.setText("Desconectar");

		} else if (txtUsuario.getText().equals("") && passwordField.getText().equals("")) {

			JOptionPane.showMessageDialog(contentPane, "O usuário " + s + " deslogou com sucesso");
			btnConectar.setText("Conectar");
		} else {
			JOptionPane.showMessageDialog(contentPane, "Usuário ou senha incorretos");
		}
	}
}
