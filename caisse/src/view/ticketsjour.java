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

import javax.swing.JComboBox;

public class ticketsjour {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketsjour window = new ticketsjour();
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
	public ticketsjour() {
		initialize();
		frame.setVisible(true);
	}

	public ticketsjour(String a) throws SQLException {
		if(main.getM().getListTransaction().size()!=0) {
			for (int i=0;i!=main.getM().getListTransaction().size();i++) {
				main.getM().getListTransaction().remove(i);
			}
		}
		main.getM().consulterCAJOUR(a);
		initialize();
		frame.setVisible(true);
		System.out.println("date selectionnée: "+a);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1080, 656);
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
		
		JLabel lblParamtres = new JLabel("Tickets du jour");
		lblParamtres.setHorizontalAlignment(SwingConstants.CENTER);
		lblParamtres.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblParamtres.setBounds(433, 46, 216, 30);
		frame.getContentPane().add(lblParamtres);
		
		JLabel lblDateDeTransaction = new JLabel("Date de la transaction :");
		lblDateDeTransaction.setHorizontalAlignment(SwingConstants.LEFT);
		lblDateDeTransaction.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDateDeTransaction.setBounds(57, 214, 197, 36);
		frame.getContentPane().add(lblDateDeTransaction);
		
		JLabel lblChiffreDuJour = new JLabel("Montant ticket :");
		lblChiffreDuJour.setHorizontalAlignment(SwingConstants.LEFT);
		lblChiffreDuJour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblChiffreDuJour.setBounds(57, 273, 177, 36);
		frame.getContentPane().add(lblChiffreDuJour);
		
		JLabel date = new JLabel("--");
		date.setHorizontalAlignment(SwingConstants.CENTER);
		date.setFont(new Font("Tahoma", Font.PLAIN, 19));
		date.setBounds(264, 214, 286, 36);
		frame.getContentPane().add(date);
		
		JLabel cajour = new JLabel("--");
		cajour.setHorizontalAlignment(SwingConstants.CENTER);
		cajour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cajour.setBounds(264, 273, 286, 36);
		frame.getContentPane().add(cajour);
		
		JLabel lblTypeDePaiement = new JLabel("Type de paiement :");
		lblTypeDePaiement.setHorizontalAlignment(SwingConstants.LEFT);
		lblTypeDePaiement.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTypeDePaiement.setBounds(57, 339, 177, 36);
		frame.getContentPane().add(lblTypeDePaiement);
		
		JLabel paiement = new JLabel("--");
		paiement.setHorizontalAlignment(SwingConstants.CENTER);
		paiement.setFont(new Font("Tahoma", Font.PLAIN, 19));
		paiement.setBounds(264, 339, 286, 36);
		frame.getContentPane().add(paiement);
		
		JComboBox combo = new JComboBox();
		
		System.out.println("size : "+main.getM().getListTransaction().size());
		
		for(int i=0;i!=main.getM().getListTransaction().size();i++) {
			combo.addItem(main.getM().getListTransaction().get(i).getDate());
		}
		
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajour.setText(String.valueOf(main.getM().getListTransaction().get(combo.getSelectedIndex()).getMontant()));
				paiement.setText(main.getM().getListTransaction().get(combo.getSelectedIndex()).getPaiement());
				date.setText(main.getM().getListTransaction().get(combo.getSelectedIndex()).getDate());
				
			}
		});
		combo.setBounds(346, 112, 398, 36);
		frame.getContentPane().add(combo);
		
	}
	
}
