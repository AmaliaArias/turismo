package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Promotor;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Principal frame = new frm_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtusuario = new JTextField();
		txtusuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtusuario.setBounds(77, 105, 86, 20);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);

		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(88, 69, 101, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(238, 62, 99, 28);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("INGRESAR ");
		btnNewButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				frm_icon icono = new frm_icon();
				icono.setVisible(true);
				

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(77, 186, 107, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(227, 186, 127, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("LOGIN ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(194, 11, 62, 20);
		contentPane.add(lblNewLabel_2);

		txtpass = new JPasswordField();
		txtpass.setEchoChar('*');
		txtpass.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpass.setBounds(238, 106, 99, 20);
		contentPane.add(txtpass);
	}
}
