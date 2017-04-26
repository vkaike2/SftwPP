package pp.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaRespostaFinal extends JFrame {

	private JPanel contentPane;
	public JLabel labelLink;
	public JLabel labelTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRespostaFinal frame = new TelaRespostaFinal();
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
	public TelaRespostaFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 97, 0};
		gbl_contentPane.rowHeights = new int[]{189, 52, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		labelTexto = new JLabel("");
		GridBagConstraints gbc_labelTexto = new GridBagConstraints();
		gbc_labelTexto.insets = new Insets(0, 0, 5, 0);
		gbc_labelTexto.gridwidth = 2;
		gbc_labelTexto.gridx = 0;
		gbc_labelTexto.gridy = 0;
		contentPane.add(labelTexto, gbc_labelTexto);
		
		JLabel lblLink = new JLabel("Para mais informa\u00E7\u00F5es acesse: ");
		GridBagConstraints gbc_lblLink = new GridBagConstraints();
		gbc_lblLink.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblLink.insets = new Insets(0, 0, 5, 5);
		gbc_lblLink.gridx = 0;
		gbc_lblLink.gridy = 1;
		contentPane.add(lblLink, gbc_lblLink);
		
		labelLink = new JLabel("New label");
		labelLink.setForeground(Color.BLUE);
		labelLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Desktop desk = java.awt.Desktop.getDesktop();
				try {
					desk.browse(new java.net.URI("http://" + labelLink.getText()));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				labelLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		GridBagConstraints gbc_labelLink = new GridBagConstraints();
		gbc_labelLink.anchor = GridBagConstraints.NORTH;
		gbc_labelLink.insets = new Insets(0, 0, 5, 0);
		gbc_labelLink.gridx = 1;
		gbc_labelLink.gridy = 1;
		contentPane.add(labelLink, gbc_labelLink);
		
		JButton btnVoltar = new JButton("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.gridx = 1;
		gbc_btnVoltar.gridy = 2;
		contentPane.add(btnVoltar, gbc_btnVoltar);
	}

}
