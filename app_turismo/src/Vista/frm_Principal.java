package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Promotor;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;

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
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(201, 201, 146));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtusuario = new JTextField();
		txtusuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtusuario.setBounds(62, 116, 96, 31);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);

		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564534_customer_man_user_account_profile_icon (1).png"));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(62, 46, 127, 48);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564520_code_open_password_icon.png"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(238, 46, 166, 48);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("INGRESAR ");
		btnNewButton.setBackground(new Color(201, 201, 146));
		btnNewButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				frm_icon icono = new frm_icon();
				icono.setVisible(true);
				

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(90, 186, 127, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBackground(new Color(201, 201, 146));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showConfirmDialog(null, "Ingreso Cancelado. CHAO!!");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(227, 186, 127, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("Credenciales del Pomotor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(129, 11, 176, 20);
		contentPane.add(lblNewLabel_2);

		txtpass = new JPasswordField();
		txtpass.setEchoChar('*');
		txtpass.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpass.setBounds(238, 116, 116, 31);
		contentPane.add(txtpass);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("125754751");
		textPane.setBounds(10, 230, 71, 20);
		contentPane.add(textPane);
	}
}
