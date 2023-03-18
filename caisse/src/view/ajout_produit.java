package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.main;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class ajout_produit {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajout_produit window = new ajout_produit();
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
	public ajout_produit() {
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
		
		JLabel lblNewLabel = new JLabel("Ajout de produit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(243, 11, 216, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel verif = new JLabel("---Verification---");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 19));
		verif.setBounds(283, 52, 134, 30);
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
		
		List list = new List();
		list.setBounds(73, 91, 413, 210);
		frame.getContentPane().add(list);
		
		JLabel label = new JLabel("Quantité :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(530, 167, 121, 30);
		frame.getContentPane().add(label);
		
		JComboBox quantite = new JComboBox();
		quantite.setMaximumRowCount(20);
		quantite.setBounds(530, 222, 121, 30);
		frame.getContentPane().add(quantite);
		for (int i=0;i!=20;i++) {
			quantite.addItem(i);
		}
		
		for (int i=0;i!=main.getM().getListProduits().size();i++) {
			list.add("Nom : "+main.getM().getListProduits().get(i).getNom()+" Prix : "+main.getM().getListProduits().get(i).getPrix()+" id : "+main.getM().getListProduits().get(i).getId());
			
		}
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(283, 335, 157, 46);
		frame.getContentPane().add(btnValider);
		
		
	}
}
