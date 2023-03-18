package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.main;
import view.accueil;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ajout_manuel {

	private JFrame frame;
	private JTextField prix;
	private JTextField nom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajout_manuel window = new ajout_manuel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public ajout_manuel() {
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
		
		JLabel lblNewLabel = new JLabel("Ajout de produit manuel");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(289, 40, 216, 30);
		frame.getContentPane().add(lblNewLabel);
		
		prix = new JTextField();
		prix.setBounds(289, 255, 216, 36);
		frame.getContentPane().add(prix);
		prix.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prix :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(144, 251, 70, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nom :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(144, 164, 70, 36);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(289, 164, 216, 36);
		frame.getContentPane().add(nom);
		
		JLabel verif = new JLabel("");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 19));
		verif.setBounds(67, 95, 562, 30);
		frame.getContentPane().add(verif);
		
		JButton button_retour = new JButton("Précédent");
		button_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		button_retour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_retour.setBounds(38, 335, 166, 46);
		frame.getContentPane().add(button_retour);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Float.parseFloat( prix.getText());
					float prixfloat = Float.parseFloat( prix.getText() ); 
					main.getM().ajoutticket(nom.getText(), prixfloat);
					verif.setText("Le produit "+nom.getText()+" a bien été ajouté au ticket au prix de "+prix.getText());
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(325, 335, 157, 46);
		frame.getContentPane().add(btnValider);
	}
}
