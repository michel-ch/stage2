package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.main;
import javax.swing.JTextField;

public class ajout_produit_list {

	private JFrame frame;
	private JTextField nom;
	private JTextField prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajout_produit_list window = new ajout_produit_list();
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
	public ajout_produit_list() {
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
		
		JLabel lblAjoutDeProduit = new JLabel("Ajout de produit");
		lblAjoutDeProduit.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjoutDeProduit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblAjoutDeProduit.setBounds(245, 26, 205, 23);
		frame.getContentPane().add(lblAjoutDeProduit);
		
		JLabel verif = new JLabel("");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		verif.setBounds(64, 71, 583, 23);
		frame.getContentPane().add(verif);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNom.setBounds(172, 132, 63, 36);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrix = new JLabel("Prix :");
		lblPrix.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrix.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPrix.setBounds(172, 202, 50, 36);
		frame.getContentPane().add(lblPrix);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(321, 136, 216, 36);
		frame.getContentPane().add(nom);
		
		prix = new JTextField();
		prix.setColumns(10);
		prix.setBounds(321, 206, 216, 36);
		frame.getContentPane().add(prix);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nom.getText()!=null&&prix.getText()!=null) {
					try {
						Float.parseFloat(prix.getText());
						float f=Float.parseFloat(prix.getText()); 
						main.getM().creationProduit(nom.getText(),f);
						verif.setText("Le produit "+nom.getText()+" a bien été créé et attribué au prix de "+f+" €");
						f = 0;
					}catch (Exception e1) {
						verif.setText("Veuillez entrer un nom de produit et un prix valides.");
						nom.setText(null);
						prix.setText(null);
						e1.printStackTrace();
					}
					
				}
				else {
					verif.setText("Veuillez entrer un nom de produit et un prix.");
				}
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(351, 342, 157, 46);
		frame.getContentPane().add(btnValider);
	}

}
