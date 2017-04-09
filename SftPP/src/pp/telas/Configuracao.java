package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.naming.ldap.Rdn;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pp.config.ConfiguracaoConfig;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Configuracao extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldResposta1;
	private JTextField textFieldResposta2;
	private JTextField textFieldResposta3;
	private JTextField textFieldResposta4;
	private JTextField textFieldResposta5;
	private JTextField textFieldResposta6;
	private JTextField textFieldResposta7;
	private JTextField textFieldResposta8;
	private JTextField textFieldResposta9;
	private JRadioButton rdbtnResposta9;
	private JRadioButton rdbtnResposta8;
	private JRadioButton rdbtnResposta7;
	private JRadioButton rdbtnResposta6;
	private JRadioButton rdbtnResposta5;
	private JRadioButton rdbtnResposta4;
	private JRadioButton rdbtnResposta3;
	private JRadioButton rdbtnResposta2;
	private JRadioButton rdbtnResposta1;
	private JTextArea textAreaPergunta;

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
		setBounds(100, 100, 464, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPerguntaAnterior = new JLabel("Pergunta Anterior:");
			GridBagConstraints gbc_lblPerguntaAnterior = new GridBagConstraints();
			gbc_lblPerguntaAnterior.anchor = GridBagConstraints.EAST;
			gbc_lblPerguntaAnterior.insets = new Insets(0, 0, 5, 5);
			gbc_lblPerguntaAnterior.gridx = 0;
			gbc_lblPerguntaAnterior.gridy = 0;
			contentPanel.add(lblPerguntaAnterior, gbc_lblPerguntaAnterior);
		}
		{
			JComboBox comboBoxPerguntaAnterior = new JComboBox();
			GridBagConstraints gbc_comboBoxPerguntaAnterior = new GridBagConstraints();
			gbc_comboBoxPerguntaAnterior.insets = new Insets(0, 0, 5, 0);
			gbc_comboBoxPerguntaAnterior.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBoxPerguntaAnterior.gridx = 1;
			gbc_comboBoxPerguntaAnterior.gridy = 0;
			contentPanel.add(comboBoxPerguntaAnterior, gbc_comboBoxPerguntaAnterior);
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
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridwidth = 2;
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 4;
			contentPanel.add(panel, gbc_panel);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				ButtonGroup btgRespostas = new ButtonGroup();
			{
				rdbtnResposta1 = new JRadioButton("");
				rdbtnResposta1.setToolTipText("");
				panel.add(rdbtnResposta1);
				btgRespostas.add(rdbtnResposta1);
			}
			{
				textFieldResposta1 = new JTextField();
				panel.add(textFieldResposta1);
				textFieldResposta1.setColumns(10);
			}
			{
				rdbtnResposta2 = new JRadioButton("");
				panel.add(rdbtnResposta2);
				btgRespostas.add(rdbtnResposta2);
			}
			{
				textFieldResposta2 = new JTextField();
				panel.add(textFieldResposta2);
				textFieldResposta2.setColumns(10);
			}
			{
				rdbtnResposta3 = new JRadioButton("");
				panel.add(rdbtnResposta3);
				btgRespostas.add(rdbtnResposta3);
				
			}
			{
				textFieldResposta3 = new JTextField();
				panel.add(textFieldResposta3);
				textFieldResposta3.setColumns(10);
			}
			{
				rdbtnResposta4 = new JRadioButton("");
				panel.add(rdbtnResposta4);
				btgRespostas.add(rdbtnResposta4);
			}
			{
				textFieldResposta4 = new JTextField();
				panel.add(textFieldResposta4);
				textFieldResposta4.setColumns(10);
				
			}
			{
				rdbtnResposta5 = new JRadioButton("");
				panel.add(rdbtnResposta5);
				btgRespostas.add(rdbtnResposta5);
			}
			{
				textFieldResposta5 = new JTextField();
				panel.add(textFieldResposta5);
				textFieldResposta5.setColumns(10);
			}
			{
				rdbtnResposta6 = new JRadioButton("");
				panel.add(rdbtnResposta6);
				btgRespostas.add(rdbtnResposta6);
			}
			{
				textFieldResposta6 = new JTextField();
				panel.add(textFieldResposta6);
				textFieldResposta6.setColumns(10);
			}
			{
				rdbtnResposta7 = new JRadioButton("");
				panel.add(rdbtnResposta7);
				btgRespostas.add(rdbtnResposta7);
			}
			{
				textFieldResposta7 = new JTextField();
				panel.add(textFieldResposta7);
				textFieldResposta7.setColumns(10);
			}
			{
				rdbtnResposta8 = new JRadioButton("");
				panel.add(rdbtnResposta8);
				btgRespostas.add(rdbtnResposta8);
			}
			{
				textFieldResposta8 = new JTextField();
				panel.add(textFieldResposta8);
				textFieldResposta8.setColumns(10);
			}
			{
				rdbtnResposta9 = new JRadioButton("");
				panel.add(rdbtnResposta9);
				btgRespostas.add(rdbtnResposta9);
			}
			{
				textFieldResposta9 = new JTextField();
				panel.add(textFieldResposta9);
				textFieldResposta9.setColumns(10);
			}
			
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton addButton = new JButton("Adicionar");
				addButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ConfiguracaoConfig cc = new ConfiguracaoConfig();
						List<String> listaRespostas = null;
						Map<String, List<String>> mapPerguntaResposta = new HashMap<>();
						cc.addTextoRespostas(rdbtnResposta1, rdbtnResposta2, rdbtnResposta3, rdbtnResposta4, rdbtnResposta5, rdbtnResposta6, rdbtnResposta7, rdbtnResposta8, rdbtnResposta9, 
								textFieldResposta1, textFieldResposta2, textFieldResposta3, textFieldResposta4, textFieldResposta5, textFieldResposta6, textFieldResposta7, textFieldResposta8, textFieldResposta9);
						
						cc.addPeruntasRespostas(listaRespostas, mapPerguntaResposta, 
								rdbtnResposta1, rdbtnResposta2, rdbtnResposta3, rdbtnResposta4, rdbtnResposta5, rdbtnResposta6, rdbtnResposta7, rdbtnResposta8, rdbtnResposta9,
								textAreaPergunta);
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
