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

public class modif_tva {

	private JFrame frame;
	private JTextField tva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modif_tva window = new modif_tva();
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
	public modif_tva() {
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
		
		JLabel lblModificationDeLa = new JLabel("Modification de la TVA");
		lblModificationDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificationDeLa.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblModificationDeLa.setBounds(246, 44, 205, 23);
		frame.getContentPane().add(lblModificationDeLa);
		
		JLabel verif = new JLabel("infos");
		verif.setFont(new Font("Tahoma", Font.PLAIN, 15));
		verif.setBounds(72, 100, 583, 23);
		frame.getContentPane().add(verif);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnValider.setBounds(350, 342, 157, 46);
		frame.getContentPane().add(btnValider);
		
		JLabel lblTvaActuelle = new JLabel("TVA actuelle :");
		lblTvaActuelle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTvaActuelle.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTvaActuelle.setBounds(139, 139, 177, 36);
		frame.getContentPane().add(lblTvaActuelle);
		
		JLabel tva_actuelle = new JLabel("--");
		tva_actuelle.setHorizontalAlignment(SwingConstants.CENTER);
		tva_actuelle.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tva_actuelle.setBounds(371, 139, 66, 36);
		frame.getContentPane().add(tva_actuelle);
		
		tva = new JTextField();
		tva.setColumns(10);
		tva.setBounds(324, 225, 216, 36);
		frame.getContentPane().add(tva);
		
		JLabel tva_actuelle_1 = new JLabel("%");
		tva_actuelle_1.setHorizontalAlignment(SwingConstants.CENTER);
		tva_actuelle_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tva_actuelle_1.setBounds(440, 139, 29, 36);
		frame.getContentPane().add(tva_actuelle_1);
	}
}
