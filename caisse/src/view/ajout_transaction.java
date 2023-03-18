package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ajout_transaction {

	private JFrame frame;
	private JTextField paiement;
	private JTextField montant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajout_transaction window = new ajout_transaction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ajout_transaction() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_retour = new JButton("Précédent");
		button_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		button_retour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_retour.setBounds(46, 342, 166, 46);
		frame.getContentPane().add(button_retour);
		
		JLabel lblAjoutDeTransaction = new JLabel("Ajout de transaction");
		lblAjoutDeTransaction.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjoutDeTransaction.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblAjoutDeTransaction.setBounds(250, 26, 205, 23);
		frame.getContentPane().add(lblAjoutDeTransaction);
		
		JLabel verif = new JLabel("infos");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		verif.setBounds(58, 60, 583, 23);
		frame.getContentPane().add(verif);
		
		JLabel lblTypeDePaiement = new JLabel("Type de paiement :");
		lblTypeDePaiement.setHorizontalAlignment(SwingConstants.LEFT);
		lblTypeDePaiement.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTypeDePaiement.setBounds(103, 105, 173, 36);
		frame.getContentPane().add(lblTypeDePaiement);
		
		JLabel lblMontant = new JLabel("Montant :");
		lblMontant.setHorizontalAlignment(SwingConstants.LEFT);
		lblMontant.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMontant.setBounds(102, 179, 125, 36);
		frame.getContentPane().add(lblMontant);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDate.setBounds(102, 241, 63, 36);
		frame.getContentPane().add(lblDate);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(391, 342, 157, 46);
		frame.getContentPane().add(btnValider);
		
		paiement = new JTextField();
		paiement.setColumns(10);
		paiement.setBounds(343, 109, 216, 36);
		frame.getContentPane().add(paiement);
		
		montant = new JTextField();
		montant.setColumns(10);
		montant.setBounds(343, 183, 216, 36);
		frame.getContentPane().add(montant);
		
		JComboBox date = new JComboBox();
		date.setBounds(343, 245, 216, 36);
		frame.getContentPane().add(date);
		
		JLabel lbl€ = new JLabel("€");
		lbl€.setHorizontalAlignment(SwingConstants.LEFT);
		lbl€.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl€.setBounds(569, 183, 21, 36);
		frame.getContentPane().add(lbl€);
	}

}
