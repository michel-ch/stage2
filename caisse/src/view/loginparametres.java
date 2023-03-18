package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginparametres {

	private JFrame frame;
	private JTextField motdepasse;
	private JTextField identifiant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginparametres window = new loginparametres();
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
	public loginparametres() {
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
		button_retour.setBounds(38, 335, 166, 46);
		frame.getContentPane().add(button_retour);
		
		JLabel lblNewLabel = new JLabel("Connexion aux paramètres");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(248, 41, 289, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(321, 335, 157, 46);
		frame.getContentPane().add(btnValider);
		
		motdepasse = new JTextField();
		motdepasse.setBounds(289, 255, 216, 36);
		frame.getContentPane().add(motdepasse);
		motdepasse.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(144, 251, 124, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identifiant :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(144, 164, 124, 36);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		identifiant = new JTextField();
		identifiant.setColumns(10);
		identifiant.setBounds(289, 164, 216, 36);
		frame.getContentPane().add(identifiant);
		
		JLabel verif = new JLabel("---Verification---");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 19));
		verif.setBounds(321, 92, 134, 30);
		frame.getContentPane().add(verif);
	}

}
