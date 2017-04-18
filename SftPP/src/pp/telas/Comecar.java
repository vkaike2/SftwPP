package pp.telas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.Thread.State;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;

public class Comecar<V, K> extends JDialog{

	private final JPanel contentPanel = new JPanel();
	private Configuracao config = new Configuracao();
	private JTextArea textAreaComecarPerguntas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Comecar dialog = new Comecar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Comecar() {
		setBounds(100, 100, 450, 438);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0};
		gbl_contentPanel.rowHeights = new int[]{61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JScrollPane scrollPaneComecarPerguntas = new JScrollPane();
			GridBagConstraints gbc_scrollPaneComecarPerguntas = new GridBagConstraints();
			gbc_scrollPaneComecarPerguntas.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPaneComecarPerguntas.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneComecarPerguntas.gridx = 0;
			gbc_scrollPaneComecarPerguntas.gridy = 0;
			contentPanel.add(scrollPaneComecarPerguntas, gbc_scrollPaneComecarPerguntas);
			{
				textAreaComecarPerguntas = new JTextArea();
				scrollPaneComecarPerguntas.setViewportView(textAreaComecarPerguntas);
			}
		}
		{
			JRadioButton radioCom1 = new JRadioButton("");
			GridBagConstraints gbc_radioCom1 = new GridBagConstraints();
			gbc_radioCom1.anchor = GridBagConstraints.WEST;
			gbc_radioCom1.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom1.gridx = 0;
			gbc_radioCom1.gridy = 1;
			contentPanel.add(radioCom1, gbc_radioCom1);
		}
		{
			JRadioButton radioCom2 = new JRadioButton("");
			GridBagConstraints gbc_radioCom2 = new GridBagConstraints();
			gbc_radioCom2.anchor = GridBagConstraints.WEST;
			gbc_radioCom2.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom2.gridx = 0;
			gbc_radioCom2.gridy = 2;
			contentPanel.add(radioCom2, gbc_radioCom2);
		}
		{
			JRadioButton radioCom3 = new JRadioButton("");
			GridBagConstraints gbc_radioCom3 = new GridBagConstraints();
			gbc_radioCom3.anchor = GridBagConstraints.WEST;
			gbc_radioCom3.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom3.gridx = 0;
			gbc_radioCom3.gridy = 3;
			contentPanel.add(radioCom3, gbc_radioCom3);
		}
		{
			JRadioButton radioCom4 = new JRadioButton("");
			GridBagConstraints gbc_radioCom4 = new GridBagConstraints();
			gbc_radioCom4.anchor = GridBagConstraints.WEST;
			gbc_radioCom4.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom4.gridx = 0;
			gbc_radioCom4.gridy = 4;
			contentPanel.add(radioCom4, gbc_radioCom4);
		}
		{
			JRadioButton radioCom5 = new JRadioButton("");
			GridBagConstraints gbc_radioCom5 = new GridBagConstraints();
			gbc_radioCom5.anchor = GridBagConstraints.WEST;
			gbc_radioCom5.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom5.gridx = 0;
			gbc_radioCom5.gridy = 5;
			contentPanel.add(radioCom5, gbc_radioCom5);
		}
		{
			JRadioButton radioCom6 = new JRadioButton("");
			GridBagConstraints gbc_radioCom6 = new GridBagConstraints();
			gbc_radioCom6.anchor = GridBagConstraints.WEST;
			gbc_radioCom6.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom6.gridx = 0;
			gbc_radioCom6.gridy = 6;
			contentPanel.add(radioCom6, gbc_radioCom6);
		}
		{
			JRadioButton radioCom7 = new JRadioButton("");
			GridBagConstraints gbc_radioCom7 = new GridBagConstraints();
			gbc_radioCom7.anchor = GridBagConstraints.WEST;
			gbc_radioCom7.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom7.gridx = 0;
			gbc_radioCom7.gridy = 7;
			contentPanel.add(radioCom7, gbc_radioCom7);
		}
		{
			JRadioButton radioCom8 = new JRadioButton("");
			GridBagConstraints gbc_radioCom8 = new GridBagConstraints();
			gbc_radioCom8.anchor = GridBagConstraints.WEST;
			gbc_radioCom8.insets = new Insets(0, 0, 5, 0);
			gbc_radioCom8.gridx = 0;
			gbc_radioCom8.gridy = 8;
			contentPanel.add(radioCom8, gbc_radioCom8);
		}
		{
			JRadioButton radioCom9 = new JRadioButton("");
			GridBagConstraints gbc_radioCom9 = new GridBagConstraints();
			gbc_radioCom9.anchor = GridBagConstraints.WEST;
			gbc_radioCom9.gridx = 0;
			gbc_radioCom9.gridy = 9;
			contentPanel.add(radioCom9, gbc_radioCom9);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnContinuar = new JButton("Continuar");
				btnContinuar.setActionCommand("OK");
				buttonPane.add(btnContinuar);
				getRootPane().setDefaultButton(btnContinuar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		textAreaComecarPerguntas.setEditable(false);
		config.Start();
	}


}
