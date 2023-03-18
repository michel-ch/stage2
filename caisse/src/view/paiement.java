package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class paiement {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paiement window = new paiement();
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
	public paiement() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Paiement");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(228, 11, 181, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(415, 200, 166, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_cb = new JButton("Carte Bleue");
		button_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_cb.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_cb.setBounds(31, 60, 166, 46);
		frame.getContentPane().add(button_cb);
		
		JButton button_espece = new JButton("Espèce");
		button_espece.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_espece.setBounds(31, 130, 166, 46);
		frame.getContentPane().add(button_espece);
		
		JButton button_edit = new JButton("Personnalisé");
		button_edit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_edit.setBounds(31, 200, 166, 46);
		frame.getContentPane().add(button_edit);
		
		JLabel lblNewLabel_1 = new JLabel("Montant à regler :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(263, 131, 166, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel montant_regler = new JLabel("--");
		montant_regler.setFont(new Font("Tahoma", Font.PLAIN, 19));
		montant_regler.setBounds(466, 131, 69, 44);
		frame.getContentPane().add(montant_regler);
		
		JButton button_retour = new JButton("Précédent");
		button_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		button_retour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_retour.setBounds(31, 293, 166, 46);
		frame.getContentPane().add(button_retour);
		
		JButton button_valider = new JButton("Valider");
		button_valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_valider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_valider.setBounds(415, 293, 166, 46);
		frame.getContentPane().add(button_valider);
		
		JLabel lblInfos = new JLabel("infos");
		lblInfos.setBounds(260, 62, 280, 44);
		frame.getContentPane().add(lblInfos);
	}

}
