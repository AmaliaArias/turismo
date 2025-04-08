package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Agencias;
import Modelo.Cliente;
import Modelo.Compania;
import Modelo.Medios;
import Modelo.Operadores;
import Modelo.Paquetes;
import Modelo.Promotor;
import Modelo.TipoMedios;
import Modelo.TipoVehiculo;
import Modelo.Vehiculo;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class frm_icon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_icon frame = new frm_icon();
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
	public frm_icon() {
		setTitle("Turismo Magdalena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 574);
		contentPane = 
				new JPanel();
		contentPane.setBackground(new Color(159, 255, 255));
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnagencia = new JButton("AGENCY");
		btnagencia.setBackground(new Color(196, 255, 255));
		btnagencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\290144_building_office_finance buildings_icon.png"));
		btnagencia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnagencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				frm_Agencias agencia = new frm_Agencias();
				agencia.setVisible(true);
			
				
				
			}
		});
		btnagencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnagencia.setBounds(254, 71, 161, 60);
		contentPane.add(btnagencia);
		
		JButton btncliente = new JButton("CLIENTE");
		btncliente.setBackground(new Color(196, 255, 255));
		btncliente.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\1564534_customer_man_user_account_profile_icon.png"));
		btncliente.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btncliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frm_Cliente cliente = new frm_Cliente();
						cliente.setVisible(true);
;				
			}
		});
		btncliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btncliente.setBounds(28, 168, 161, 60);
		contentPane.add(btncliente);
		
		JButton btncompania = new JButton("COMPAÑIA");
		btncompania.setBackground(new Color(196, 255, 255));
		btncompania.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7067453_building_office_property_icon.png"));
		btncompania.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btncompania.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Compania compania = new frm_Compania();
				
				compania.setVisible(true);
			}
		});
		btncompania.setBounds(28, 71, 166, 60);
		contentPane.add(btncompania);
		
		JButton btnmedios = new JButton("MEDIOS");
		btnmedios.setBackground(new Color(196, 255, 255));
		btnmedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\290136_communication_internet_media_news_newspaper_icon.png"));
		btnmedios.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				frm_Medios medios = new frm_Medios();
				
				medios.setVisible(true);
			}
		});
		
		
		btnmedios.setBounds(254, 262, 166, 60);
		contentPane.add(btnmedios);
		
		JButton btnoperadores = new JButton("OPERADOR");
		btnoperadores.setBackground(new Color(196, 255, 255));
		btnoperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7019499_operator_costumer_admin_ecommerce_business_icon.png"));
		btnoperadores.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnoperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Operadores operadores = new frm_Operadores();
				
				operadores.setVisible(true);
			}
		});
		btnoperadores.setBounds(254, 355, 166, 66);
		contentPane.add(btnoperadores);
		
		JButton btnpaquetes = new JButton("PAQUETES");
		btnpaquetes.setBackground(new Color(196, 255, 255));
		btnpaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9057046_gift_icon.png"));
		btnpaquetes.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnpaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_paquetes  Paquetes = new frm_paquetes();
				
				Paquetes.setVisible(true);
				
			}
		});
		btnpaquetes.setBounds(254, 168, 161, 60);
		contentPane.add(btnpaquetes);
		
		JButton btnpromotor = new JButton("PROMOTOR");
		btnpromotor.setBackground(new Color(196, 255, 255));
		btnpromotor.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8673598_ic_fluent_people_money_filled_icon.png"));
		btnpromotor.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnpromotor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Promotor Promotor = new frm_Promotor();
				
				Promotor.setVisible(true);
			
			}
		});
		btnpromotor.setBounds(28, 355, 179, 66);
		contentPane.add(btnpromotor);
		
		JButton btntipomed = new JButton("T. MEDIOS");
		btntipomed.setBackground(new Color(196, 255, 255));
		btntipomed.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2559814_google_media_network_plus_social_icon.png"));
		btntipomed.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btntipomed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_TipoMedios TipoMedios = new frm_TipoMedios();
				
				TipoMedios.setVisible(true);
				
			}
		});
		btntipomed.setBounds(28, 262, 161, 60);
		contentPane.add(btntipomed);
		
		JButton btntipovehic = new JButton("T. VEHICULO");
		btntipovehic.setBackground(new Color(196, 255, 255));
		btntipovehic.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3671652_anchor_icon.png"));
		btntipovehic.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btntipovehic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_TipoVehiculo  TipoVehiculo = new frm_TipoVehiculo();
				
				TipoVehiculo.setVisible(true);
				
				
			}
		});
		btntipovehic.setBounds(254, 462, 179, 55);
		contentPane.add(btntipovehic);
		
		JButton btnvehiculo = new JButton("VEHICULO");
		btnvehiculo.setBackground(new Color(196, 255, 255));
		btnvehiculo.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8541772_car_transport_icon.png"));
		btnvehiculo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnvehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Vehiculo Vehiculo = new frm_Vehiculo();  
				
				Vehiculo.setVisible(true);
				
			}
		});
		btnvehiculo.setBounds(26, 460, 163, 57);
		contentPane.add(btnvehiculo);
		
		JLabel lblNewLabel = new JLabel("CONTENIDO");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel.setBounds(168, 23, 153, 23);
		contentPane.add(lblNewLabel);
	}
}
