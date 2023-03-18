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

public class modif_produit {

	private JFrame frame;
	private JTextField nouveau_nom;
	private JTextField nouveau_prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modif_produit window = new modif_produit();
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
	public modif_produit() {
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
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(378, 342, 157, 46);
		frame.getContentPane().add(btnValider);
		
		JLabel lblModificationDeProduit = new JLabel("Modification de produit");
		lblModificationDeProduit.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificationDeProduit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblModificationDeProduit.setBounds(251, 11, 205, 23);
		frame.getContentPane().add(lblModificationDeProduit);
		
		JLabel verif = new JLabel("infos");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		verif.setBounds(83, 99, 583, 23);
		frame.getContentPane().add(verif);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNom.setBounds(153, 133, 63, 36);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrix = new JLabel("Prix :");
		lblPrix.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrix.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPrix.setBounds(153, 180, 50, 36);
		frame.getContentPane().add(lblPrix);
		
		JLabel nom_produit = new JLabel("--");
		nom_produit.setHorizontalAlignment(SwingConstants.CENTER);
		nom_produit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		nom_produit.setBounds(320, 133, 177, 36);
		frame.getContentPane().add(nom_produit);
		
		JLabel prix_produit = new JLabel("--");
		prix_produit.setHorizontalAlignment(SwingConstants.CENTER);
		prix_produit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		prix_produit.setBounds(378, 180, 63, 36);
		frame.getContentPane().add(prix_produit);
		
		JLabel lbl€ = new JLabel("€");
		lbl€.setHorizontalAlignment(SwingConstants.CENTER);
		lbl€.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbl€.setBounds(438, 180, 29, 36);
		frame.getContentPane().add(lbl€);
		
		nouveau_nom = new JTextField();
		nouveau_nom.setColumns(10);
		nouveau_nom.setBounds(350, 228, 216, 36);
		frame.getContentPane().add(nouveau_nom);
		
		nouveau_prix = new JTextField();
		nouveau_prix.setColumns(10);
		nouveau_prix.setBounds(350, 282, 216, 36);
		frame.getContentPane().add(nouveau_prix);
		
		JLabel lblNouveauNom = new JLabel("Nouveau nom :");
		lblNouveauNom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNouveauNom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNouveauNom.setBounds(153, 224, 166, 36);
		frame.getContentPane().add(lblNouveauNom);
		
		JLabel lblNouveauPrix = new JLabel("Nouveau prix :");
		lblNouveauPrix.setHorizontalAlignment(SwingConstants.LEFT);
		lblNouveauPrix.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNouveauPrix.setBounds(153, 278, 166, 36);
		frame.getContentPane().add(lblNouveauPrix);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 55, 434, 36);
		frame.getContentPane().add(comboBox);
	}

}
