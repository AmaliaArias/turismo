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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = 
				new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnagencia = new JButton("AGENCIA");
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
		btnagencia.setBounds(20, 26, 89, 23);
		contentPane.add(btnagencia);
		
		JButton btncliente = new JButton("CLIENTE");
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
		btncliente.setBounds(142, 26, 89, 23);
		contentPane.add(btncliente);
		
		JButton btncompania = new JButton("COMPAÑIA");
		btncompania.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Compania compania = new frm_Compania();
				
				compania.setVisible(true);
			}
		});
		btncompania.setBounds(262, 26, 89, 23);
		contentPane.add(btncompania);
		
		JButton btnmedios = new JButton("MEDIOS");
		btnmedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				frm_Medios medios = new frm_Medios();
				
				medios.setVisible(true);
			}
		});
		
		
		btnmedios.setBounds(20, 97, 89, 23);
		contentPane.add(btnmedios);
		
		JButton btnoperadores = new JButton("OPERADORES");
		btnoperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Operadores operadores = new frm_Operadores();
				
				operadores.setVisible(true);
			}
		});
		btnoperadores.setBounds(142, 97, 101, 23);
		contentPane.add(btnoperadores);
		
		JButton btnpaquetes = new JButton("PAQUETES");
		btnpaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_paquetes  Paquetes = new frm_paquetes();
				
				Paquetes.setVisible(true);
				
			}
		});
		btnpaquetes.setBounds(276, 97, 89, 23);
		contentPane.add(btnpaquetes);
		
		JButton btnpromotor = new JButton("PROMOTOR");
		btnpromotor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Promotor Promotor = new frm_Promotor();
				
				Promotor.setVisible(true);
			
			}
		});
		btnpromotor.setBounds(20, 160, 112, 23);
		contentPane.add(btnpromotor);
		
		JButton btntipomed = new JButton("TIPO MEDIOS");
		btntipomed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_TipoMedios TipoMedios = new frm_TipoMedios();
				
				TipoMedios.setVisible(true);
				
			}
		});
		btntipomed.setBounds(142, 160, 101, 23);
		contentPane.add(btntipomed);
		
		JButton btntipovehic = new JButton("TIPO VEHICULO");
		btntipovehic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_TipoVehiculo  TipoVehiculo = new frm_TipoVehiculo();
				
				TipoVehiculo.setVisible(true);
				
				
			}
		});
		btntipovehic.setBounds(276, 160, 112, 23);
		contentPane.add(btntipovehic);
		
		JButton btnvehiculo = new JButton("VEHICULO");
		btnvehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frm_Vehiculo Vehiculo = new frm_Vehiculo();  
				
				Vehiculo.setVisible(true);
				
			}
		});
		btnvehiculo.setBounds(20, 227, 89, 23);
		contentPane.add(btnvehiculo);
	}

}
