package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.naming.ldap.Rdn;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;

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
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 18, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				txt1 = new JTextField();
				GridBagConstraints gbc_txt1 = new GridBagConstraints();
				gbc_txt1.insets = new Insets(0, 0, 5, 5);
				gbc_txt1.fill = GridBagConstraints.BOTH;
				gbc_txt1.gridx = 0;
				gbc_txt1.gridy = 0;
				panel.add(txt1, gbc_txt1);
				txt1.setColumns(10);
			}
			{
				txt2 = new JTextField();
				GridBagConstraints gbc_txt2 = new GridBagConstraints();
				gbc_txt2.insets = new Insets(0, 0, 5, 5);
				gbc_txt2.fill = GridBagConstraints.BOTH;
				gbc_txt2.gridx = 1;
				gbc_txt2.gridy = 0;
				panel.add(txt2, gbc_txt2);
				txt2.setColumns(10);
			}
			{
				txt3 = new JTextField();
				GridBagConstraints gbc_txt3 = new GridBagConstraints();
				gbc_txt3.insets = new Insets(0, 0, 5, 0);
				gbc_txt3.fill = GridBagConstraints.BOTH;
				gbc_txt3.gridx = 2;
				gbc_txt3.gridy = 0;
				panel.add(txt3, gbc_txt3);
				txt3.setColumns(10);
			}
			{
				txt4 = new JTextField();
				GridBagConstraints gbc_txt4 = new GridBagConstraints();
				gbc_txt4.insets = new Insets(0, 0, 5, 5);
				gbc_txt4.fill = GridBagConstraints.BOTH;
				gbc_txt4.gridx = 0;
				gbc_txt4.gridy = 1;
				panel.add(txt4, gbc_txt4);
				txt4.setColumns(10);
			}
			{
				txt5 = new JTextField();
				GridBagConstraints gbc_txt5 = new GridBagConstraints();
				gbc_txt5.insets = new Insets(0, 0, 5, 5);
				gbc_txt5.fill = GridBagConstraints.BOTH;
				gbc_txt5.gridx = 1;
				gbc_txt5.gridy = 1;
				panel.add(txt5, gbc_txt5);
				txt5.setColumns(10);
			}
			{
				txt6 = new JTextField();
				GridBagConstraints gbc_txt6 = new GridBagConstraints();
				gbc_txt6.insets = new Insets(0, 0, 5, 0);
				gbc_txt6.fill = GridBagConstraints.BOTH;
				gbc_txt6.gridx = 2;
				gbc_txt6.gridy = 1;
				panel.add(txt6, gbc_txt6);
				txt6.setColumns(10);
			}
			{
				txt7 = new JTextField();
				GridBagConstraints gbc_txt7 = new GridBagConstraints();
				gbc_txt7.insets = new Insets(0, 0, 0, 5);
				gbc_txt7.fill = GridBagConstraints.BOTH;
				gbc_txt7.gridx = 0;
				gbc_txt7.gridy = 2;
				panel.add(txt7, gbc_txt7);
				txt7.setColumns(10);
			}
			{
				txt8 = new JTextField();
				GridBagConstraints gbc_txt8 = new GridBagConstraints();
				gbc_txt8.insets = new Insets(0, 0, 0, 5);
				gbc_txt8.fill = GridBagConstraints.BOTH;
				gbc_txt8.gridx = 1;
				gbc_txt8.gridy = 2;
				panel.add(txt8, gbc_txt8);
				txt8.setColumns(10);
			}
			{
				txt9 = new JTextField();
				GridBagConstraints gbc_txt9 = new GridBagConstraints();
				gbc_txt9.fill = GridBagConstraints.BOTH;
				gbc_txt9.gridx = 2;
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
	}

	

}
