package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class parametres {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parametres window = new parametres();
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
	public parametres() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 922, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_retour = new JButton("Précédent");
		button_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		button_retour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_retour.setBounds(57, 531, 166, 46);
		frame.getContentPane().add(button_retour);
		
		JLabel lblParamtres = new JLabel("Paramètres");
		lblParamtres.setHorizontalAlignment(SwingConstants.CENTER);
		lblParamtres.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblParamtres.setBounds(433, 46, 216, 30);
		frame.getContentPane().add(lblParamtres);
		
		JButton btnAjoutDeProduit = new JButton("Ajout de produits");
		btnAjoutDeProduit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajout_produit_list vca = new ajout_produit_list();
			}
		});
		btnAjoutDeProduit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAjoutDeProduit.setBounds(99, 154, 264, 46);
		frame.getContentPane().add(btnAjoutDeProduit);
		
		JButton btnModificationProduits = new JButton("Modification de Produits");
		btnModificationProduits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modif_produit vca = new modif_produit();
			}
		});
		btnModificationProduits.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnModificationProduits.setBounds(99, 235, 264, 46);
		frame.getContentPane().add(btnModificationProduits);
		
		JButton btnSuppresionDeProduits = new JButton("Suppression de Produits");
		btnSuppresionDeProduits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				suppression_produit vca = new suppression_produit();
			}
		});
		btnSuppresionDeProduits.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSuppresionDeProduits.setBounds(99, 319, 264, 46);
		frame.getContentPane().add(btnSuppresionDeProduits);
		
		JButton btnModificationTva = new JButton("Modification TVA");
		btnModificationTva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modif_tva vca = new modif_tva();
			}
		});
		btnModificationTva.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnModificationTva.setBounds(460, 299, 290, 46);
		frame.getContentPane().add(btnModificationTva);
		
		JButton btnAjoutDeTransactions = new JButton("Ajout de Transaction\r\n régularisation");
		btnAjoutDeTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajout_transaction vca = new ajout_transaction();
			}
		});
		btnAjoutDeTransactions.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAjoutDeTransactions.setBounds(460, 191, 333, 46);
		frame.getContentPane().add(btnAjoutDeTransactions);
	}

}
