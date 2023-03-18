package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class ca {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ca window = new ca();
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
	public ca() {
		initialize();
		frame.setVisible(true);
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
		
		JLabel lblParamtres = new JLabel("Chiffre d'affaire");
		lblParamtres.setHorizontalAlignment(SwingConstants.CENTER);
		lblParamtres.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblParamtres.setBounds(433, 46, 216, 30);
		frame.getContentPane().add(lblParamtres);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(346, 113, 398, 36);
		frame.getContentPane().add(comboBox);
		
		JLabel lblDateDeTransaction = new JLabel("Date de la transaction :");
		lblDateDeTransaction.setHorizontalAlignment(SwingConstants.LEFT);
		lblDateDeTransaction.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDateDeTransaction.setBounds(239, 214, 197, 36);
		frame.getContentPane().add(lblDateDeTransaction);
		
		JLabel lblChiffreDuJour = new JLabel("Chiffre du jour :");
		lblChiffreDuJour.setHorizontalAlignment(SwingConstants.LEFT);
		lblChiffreDuJour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblChiffreDuJour.setBounds(239, 273, 177, 36);
		frame.getContentPane().add(lblChiffreDuJour);
		
		JLabel date = new JLabel("--");
		date.setHorizontalAlignment(SwingConstants.CENTER);
		date.setFont(new Font("Tahoma", Font.PLAIN, 19));
		date.setBounds(472, 214, 177, 36);
		frame.getContentPane().add(date);
		
		JLabel ca = new JLabel("--");
		ca.setHorizontalAlignment(SwingConstants.CENTER);
		ca.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ca.setBounds(472, 273, 177, 36);
		frame.getContentPane().add(ca);
		
		JButton rechercher = new JButton("Rechercher");
		rechercher.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rechercher.setBounds(782, 113, 141, 36);
		frame.getContentPane().add(rechercher);
		
		JButton ticketsjour = new JButton("Voir les tickets du jour");
		ticketsjour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ticketsjour vca = new ticketsjour();
				
			}
		});
		ticketsjour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		ticketsjour.setBounds(659, 273, 243, 36);
		frame.getContentPane().add(ticketsjour);
	}
}
