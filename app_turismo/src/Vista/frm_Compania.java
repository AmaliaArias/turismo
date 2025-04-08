package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Compania;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class frm_Compania extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRazonSocial;
	private JTextField txtdireccion;
	private JTextField txtcorreoelectronicocompania;
	private JTextField txttelefonocompania;
	private JTextField txtfechacreacion;
	private JTextField txtpaginaweb;
	private JTextField txtobservacion;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField txtidcompania;
	private JButton btnbuscar;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Compania frame = new frm_Compania();
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
	public frm_Compania() {
		setTitle("Compañia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 449);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 242, 234));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Razon Social");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 31, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dirección Residencia");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 61, 142, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo Electronico");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(21, 98, 117, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(21, 133, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha Creación");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(21, 169, 99, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Pagina Web");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(21, 206, 99, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Observaciones");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(21, 236, 99, 14);
		contentPane.add(lblNewLabel_7);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRazonSocial.setBounds(173, 28, 86, 20);
		contentPane.add(txtRazonSocial);
		txtRazonSocial.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtdireccion.setBounds(173, 58, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtcorreoelectronicocompania = new JTextField();
		txtcorreoelectronicocompania.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcorreoelectronicocompania.setBounds(173, 95, 86, 20);
		contentPane.add(txtcorreoelectronicocompania);
		txtcorreoelectronicocompania.setColumns(10);
		
		txttelefonocompania = new JTextField();
		txttelefonocompania.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txttelefonocompania.setBounds(173, 130, 86, 20);
		contentPane.add(txttelefonocompania);
		txttelefonocompania.setColumns(10);
		
		txtfechacreacion = new JTextField();
		txtfechacreacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtfechacreacion.setBounds(173, 166, 86, 20);
		contentPane.add(txtfechacreacion);
		txtfechacreacion.setColumns(10);
		
		txtpaginaweb = new JTextField();
		txtpaginaweb.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtpaginaweb.setBounds(173, 203, 86, 20);
		contentPane.add(txtpaginaweb);
		txtpaginaweb.setColumns(10);
		
		txtobservacion = new JTextField();
		txtobservacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtobservacion.setBounds(173, 233, 142, 68);
		contentPane.add(txtobservacion);
		txtobservacion.setColumns(10);
		
		JButton btnGuardarCompania = new JButton("SAVE");
		btnGuardarCompania.setBackground(new Color(0, 255, 255));
		btnGuardarCompania.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGuardarCompania.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGuardarCompania.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Compania cm = new Compania();
				
				cm.create(txtRazonSocial.getText(), 
						txtdireccion.getText(), 
						txtcorreoelectronicocompania.getText(), 
						Integer.parseInt(txttelefonocompania.getText())						, 
						txtfechacreacion.getText(), 
						txtpaginaweb.getText(), 
						txtobservacion.getText());
				
				txtRazonSocial.setText(" ");
				txtdireccion.setText(" ");
				txtcorreoelectronicocompania.setText(" ");
				txttelefonocompania.setText(" ");
				txtfechacreacion.setText(" ");
				txtpaginaweb.setText(" ");
				txtobservacion.setText(" ");
				
			}
		});
		btnGuardarCompania.setBounds(361, 342, 155, 57);
		contentPane.add(btnGuardarCompania);
		
		btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Compania cm = new Compania();
				
				cm.delete(Integer.parseInt(txtidcompania.getText()));
				
				txtidcompania.setText(" ");
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setBounds(363, 115, 135, 51);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("id Compañias");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(363, 28, 117, 20);
		contentPane.add(lblNewLabel);
		
		txtidcompania = new JTextField();
		txtidcompania.setBounds(361, 59, 86, 20);
		contentPane.add(txtidcompania);
		txtidcompania.setColumns(10);
		
		btnbuscar = new JButton("SEARCH");
		btnbuscar.setBackground(new Color(0, 255, 255));
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Compania cm = new Compania();
				
				cm.readOne(Integer.parseInt(txtidcompania.getText()), txtRazonSocial, txtdireccion, txtcorreoelectronicocompania, txttelefonocompania, txtfechacreacion, txtpaginaweb, txtobservacion);
				
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(363, 188, 150, 51);
		contentPane.add(btnbuscar);
		
		btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Compania cm = new Compania();
				
				cm.update(Integer.parseInt(txtidcompania.getText()), 
						txtRazonSocial.getText(), 
						txtdireccion.getText(), 
						txtcorreoelectronicocompania.getText(), 
						Integer.parseInt(txttelefonocompania.getText()), 
						txtfechacreacion.getText(), 
						txtpaginaweb.getText(), 
						txtobservacion.getText());
				
				
				txtidcompania.setText(" ");
				txtRazonSocial.setText(" ");
				txtdireccion.setText(" ");
				txtcorreoelectronicocompania.setText(" ");
				txttelefonocompania.setText(" ");
				txtfechacreacion.setText(" ");
				txtpaginaweb.setText(" ");
				txtobservacion.setText(" ");
	
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(363, 260, 144, 51);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1_1 = new JButton("BACK");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_icon icon = new frm_icon ();
				
				icon.setVisible(true);
				
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4470662_app_back_mobile_ui_ux_icon.png"));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(3, 360, 135, 46);
		contentPane.add(btnNewButton_1_1);
	}

}
