package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Agencias;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class frm_Agencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtidcompania;
	private JTextField txtubicacion;
	private JTextField txtnombre;
	private JTextField txtdireccion;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtweb;
	private JTextField txtobservacion;
	private JTextField txtidagencia;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Agencias frame = new frm_Agencias();
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
	public frm_Agencias() {
		setTitle("Tabla Agencias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id Compañia");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 256, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ubicación");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 20, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 54, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(21, 83, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(21, 117, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(21, 154, 92, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Web");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(21, 185, 92, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Observación");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(21, 223, 92, 14);
		contentPane.add(lblNewLabel_7);
		
		txtidcompania = new JTextField();
		txtidcompania.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtidcompania.setBounds(132, 253, 86, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		txtubicacion = new JTextField();
		txtubicacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtubicacion.setBounds(132, 20, 86, 20);
		contentPane.add(txtubicacion);
		txtubicacion.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtnombre.setBounds(132, 51, 86, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtdireccion.setBounds(132, 80, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcorreo.setBounds(132, 114, 86, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txttelefono.setBounds(132, 151, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		txtweb = new JTextField();
		txtweb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtweb.setBounds(132, 182, 86, 20);
		contentPane.add(txtweb);
		txtweb.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtobservacion.setBounds(132, 220, 86, 20);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnGuardar = new JButton("SAVE");
		btnGuardar.setBackground(new Color(149, 215, 247));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencias ag = new Agencias();
			
				
				ag.create(txtubicacion.getText(), 
						txtnombre.getText(), 
						txtdireccion.getText(),
						txtcorreo.getText(), 
						Integer.parseInt(txttelefono.getText()), 
						txtweb.getText(), 
						txtobservacion.getText(), 
						Integer.parseInt(txtidcompania.getText()));
				
				txtubicacion.setText(" ");
				txtnombre.setText(" ");
				txtdireccion.setText(" ");
				txtcorreo.setText(" ");
				txttelefono.setText(" ");
				txtweb.setText(" ");
				txtobservacion.setText(" ");
				txtidcompania.setText(" ");
			}
		});
		btnGuardar.setBounds(36, 297, 150, 71);
		contentPane.add(btnGuardar);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setBackground(new Color(149, 215, 247));
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencias ag = new Agencias();
				ag.delete(Integer.parseInt(txtidagencia.getText()));
				
				txtidagencia.setText(" ");
			
			}
		});
		btndelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btndelete.setBounds(274, 73, 150, 58);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_8 = new JLabel("id Agencia");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(314, 21, 78, 19);
		contentPane.add(lblNewLabel_8);
		
		txtidagencia = new JTextField();
		txtidagencia.setBounds(306, 48, 86, 20);
		contentPane.add(txtidagencia);
		txtidagencia.setColumns(10);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencias ag = new Agencias();
				ag.readOne(Integer.parseInt(txtidagencia.getText()), txtubicacion, txtnombre, txtdireccion, 
				              txtcorreo, txttelefono, txtweb, txtobservacion, txtidcompania);

			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(279, 182, 145, 51);
		contentPane.add(btnbuscar);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(280, 271, 144, 51);
		contentPane.add(btnNewButton);
	}
}
