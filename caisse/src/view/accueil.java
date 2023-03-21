package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.main;
import model.model;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class accueil {

	public JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accueil window = new accueil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public accueil() throws SQLException {
		try {
			initialize();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.setVisible(true);
	}
	

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 1080, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caisse de vente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(289, 22, 166, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(354, 850, 67, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TOTAL TTC");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(354, 900, 117, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel total = new JLabel("---");
		total.setFont(new Font("Tahoma", Font.PLAIN, 22));
		total.setBounds(533, 850, 67, 22);
		frame.getContentPane().add(total);
		
		JLabel total_ttc = new JLabel("---");
		total_ttc.setFont(new Font("Tahoma", Font.PLAIN, 22));
		total_ttc.setBounds(533, 900, 67, 22);
		frame.getContentPane().add(total_ttc);
		
		JLabel lblNewLabel_2 = new JLabel("€");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(608, 850, 26, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("€");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(608, 900, 26, 22);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton button_parametre = new JButton("Paramètres");
		button_parametre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parametres vca = new parametres();
			}
		});
		button_parametre.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_parametre.setBounds(752, 85, 172, 46);
		frame.getContentPane().add(button_parametre);
		
		JLabel verif = new JLabel("Texte confirmation // ERREUR");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 19));
		verif.setBounds(713, 248, 265, 186);
		frame.getContentPane().add(verif);
		
		JButton button_ajoutlistmanuel = new JButton("Ajout Manuel");
		button_ajoutlistmanuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajout_manuel vca = new ajout_manuel();
			}
		});
		button_ajoutlistmanuel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_ajoutlistmanuel.setBounds(758, 550, 166, 46);
		frame.getContentPane().add(button_ajoutlistmanuel);
		
		JButton button_supprimerlist = new JButton("Supprimer");
		button_supprimerlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/// CODE POUR SUPPRIMER DIRECTEMENT SUR PAGE ACCUEIL // -> ICI
				
			}
		});
		button_supprimerlist.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_supprimerlist.setBounds(758, 630, 166, 46);
		frame.getContentPane().add(button_supprimerlist);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TOTAL A PAYER");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1.setBounds(354, 950, 166, 22);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("€");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2_1_1.setBounds(608, 950, 26, 22);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel total_ttc_1 = new JLabel("---");
		total_ttc_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		total_ttc_1.setBounds(533, 950, 65, 22);
		frame.getContentPane().add(total_ttc_1);
		
		JButton btnAjout = new JButton("Ajout");
		btnAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.setVisible(true);
				ajout_produit vca = new ajout_produit();
			}
		});
		btnAjout.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAjout.setBounds(758, 469, 166, 46);
		frame.getContentPane().add(btnAjout);
		
		JButton button_paiement = new JButton("Paiement");
		button_paiement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paiement window = new paiement();
			}
		});
		button_paiement.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_paiement.setBounds(758, 790, 166, 46);
		frame.getContentPane().add(button_paiement);
		
		JButton button_deduction = new JButton("Déduction");
		button_deduction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deduction vca = new deduction();
			}
		});
		button_deduction.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_deduction.setBounds(758, 710, 166, 46);
		frame.getContentPane().add(button_deduction);
		
		JButton button_ca = new JButton("Chiffre d'affaire");
		button_ca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca vca = new ca();
			}
		});
		button_ca.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_ca.setBounds(752, 177, 172, 46);
		frame.getContentPane().add(button_ca);
		
		// DONNEES TESTS
		main.getM().ajoutticket("produit1", 1,11);
		main.getM().ajoutticket("produit2", 1,22);
		
		
		// en tete tableau
		String[] columns = new String[] {
	            "Nom","Quantite","Prix"
	        };
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("Nom");
		tableModel.addColumn("Quantite");
		tableModel.addColumn("Prix");
		
		JTable table = new JTable(tableModel);
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Arial", Font.PLAIN, 15));
		table.setBounds(64, 108, 587, 667);
		frame.getContentPane().add(table);
		//table.setBackground(new Color(230, 218, 198));
		table.setRowHeight(25);
		table.setRowMargin(10);
		
		tableModel.addRow(new Object[] {"produit","1","prix"});
		
		//données pour JTable dans un tableau 2D
		tableModel.getDataVector().removeAllElements();
		for (int i=0;i!=main.getM().getTicket().size();i++) {
			String nom = main.getM().getTicket().get(i).getNom();
			float prix = main.getM().getTicket().get(i).getPrix();
			int quantite = main.getM().getTicket().get(i).getQuantite();
			System.out.println("nom : "+nom+" quantite : "+quantite+" prix : "+prix);
			Object[] data = {nom,quantite,prix};
			tableModel.addRow(data);
		}
		
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				if(tableModel.getRowCount()!=main.getM().getTicket().size()) {
					// DELETE ROWS OF TABLE
					tableModel.getDataVector().removeAllElements();
					// ADD ROWS INT TABLE
					for (int i=0;i!=main.getM().getTicket().size();i++) {
						String nom = main.getM().getTicket().get(i).getNom();
						float prix = main.getM().getTicket().get(i).getPrix();
						int quantite = main.getM().getTicket().get(i).getQuantite();
						Object[] data = {nom,quantite,prix};
						tableModel.addRow(data);
					}
				}
			};
			
		};
		timer.schedule(task, 100,100);
		

		
	}
}
