package Vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Paquetes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm_paquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtidmedios;
	private JTextField txtIDDestino;
	private JTextField txtIDOrigen;
	private JTextField txtFechaVenta;
	private JTextField txtHoraVenta;
	private JTextField txtFechaSalida;
	private JTextField txtHoraSalida;
	private JTextField txtPrecio;
	private JTextField txtObservaciones;
	private JTextField txtMatricula;
	private JTextField txtidpromotor;
	private JTextField txtidagencia;
	private JTextField txtcodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_paquetes frame = new frm_paquetes();
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
	public frm_paquetes() {
		setTitle("Paquete Turismo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 697);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 240, 142));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id Medios");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(41, 330, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("idDestino");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(41, 40, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("idOrigen");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBounds(231, 40, 54, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha Venta");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(41, 115, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hora Venta");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBounds(231, 115, 75, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Fecha Salida");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setBounds(41, 185, 75, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hora Salida");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setBounds(231, 185, 75, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(41, 355, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		txtIDDestino = new JTextField();
		txtIDDestino.setColumns(10);
		txtIDDestino.setBounds(41, 65, 86, 20);
		contentPane.add(txtIDDestino);
		
		txtIDOrigen = new JTextField();
		txtIDOrigen.setColumns(10);
		txtIDOrigen.setBounds(231, 65, 86, 20);
		contentPane.add(txtIDOrigen);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(41, 255, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Observaciones");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(231, 255, 80, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnGurdarPaquete = new JButton("SAVE");
		btnGurdarPaquete.setBackground(Color.YELLOW);
		btnGurdarPaquete.setForeground(new Color(0, 0, 0));
		btnGurdarPaquete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGurdarPaquete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGurdarPaquete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Paquetes pq = new Paquetes(); 
				
				pq.create (Integer.parseInt(txtIDDestino.getText()),
						Integer.parseInt(txtIDOrigen.getText()),
						txtFechaVenta.getText(), 
						txtHoraVenta.getText(), 
						txtFechaSalida.getText(), 
						txtHoraSalida.getText(), 
						txtObservaciones.getText(),
						Integer.parseInt(txtidmedios.getText()), 
						txtMatricula.getText(),
						Integer.parseInt(txtidpromotor.getText()),
						Float.valueOf(txtPrecio.getText()),
						Integer.parseInt(txtidagencia.getText()));
			
				
				txtIDDestino.setText(" ");
				txtIDOrigen.setText(" ");
				txtFechaVenta.setText(" ");
				txtHoraVenta.setText(" ");
				txtFechaSalida.setText(" ");
				txtHoraSalida.setText(" ");
				txtObservaciones.setText(" ");
				txtidmedios.setText(" ");
				txtMatricula.setText(" ");
				txtidpromotor.setText(" ");
				txtPrecio.setText(" ");
				txtidagencia.setText(" ");
				
			}
			
		});
		btnGurdarPaquete.setBounds(20, 455, 155, 60);
		contentPane.add(btnGurdarPaquete);
		
		txtFechaVenta = new JTextField();
		txtFechaVenta.setBounds(41, 140, 86, 20);
		contentPane.add(txtFechaVenta);
		txtFechaVenta.setColumns(10);
		
		txtHoraVenta = new JTextField();
		txtHoraVenta.setBounds(231, 140, 86, 20);
		contentPane.add(txtHoraVenta);
		txtHoraVenta.setColumns(10);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setBounds(41, 210, 86, 20);
		contentPane.add(txtFechaSalida);
		txtFechaSalida.setColumns(10);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setBounds(231, 210, 86, 20);
		contentPane.add(txtHoraSalida);
		txtHoraSalida.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(41, 280, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(231, 277, 119, 42);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setForeground(Color.BLACK);
		lblMatricula.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMatricula.setBounds(231, 330, 75, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(231, 355, 86, 20);
		contentPane.add(txtMatricula);
		
		JLabel lblIdPromotor = new JLabel("id Promotor");
		lblIdPromotor.setForeground(Color.BLACK);
		lblIdPromotor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblIdPromotor.setBounds(41, 389, 75, 14);
		contentPane.add(lblIdPromotor);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setColumns(10);
		txtidpromotor.setBounds(41, 410, 86, 20);
		contentPane.add(txtidpromotor);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("id Agencia");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(231, 389, 75, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBounds(231, 410, 86, 20);
		contentPane.add(txtidagencia);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paquetes pq = new Paquetes(); 
				
				pq.delete(Integer.parseInt(txtcodigo.getText()));
				
				txtcodigo.setText(" ");
				
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setBounds(195, 509, 155, 60);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Codigo");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(231, 446, 75, 20);
		contentPane.add(lblNewLabel_5);
		
		txtcodigo = new JTextField();
		txtcodigo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtcodigo.setBounds(231, 477, 75, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.setBackground(new Color(255, 255, 0));
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paquetes pq = new Paquetes();
				
				pq.readOne(Integer.parseInt(txtcodigo.getText()), txtIDDestino, txtIDOrigen, txtFechaVenta, txtHoraVenta, txtFechaSalida, txtHoraSalida, txtObservaciones, txtidmedios, txtMatricula, txtidpromotor, txtPrecio, txtidagencia);
				
				
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(25, 526, 150, 51);
		contentPane.add(btnbuscar);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paquetes pq = new Paquetes();
				
				pq.update(Integer.parseInt(txtcodigo.getText()),
						Integer.parseInt(txtIDDestino.getText()), 
						Integer.parseInt(txtIDOrigen.getText()), 
						txtFechaVenta.getText(), 
						txtHoraVenta.getText(), 
						txtFechaSalida.getText(), 
						txtHoraSalida.getText(), 
						txtObservaciones.getText(), 
						Integer.parseInt(txtidmedios.getText()), 
						txtMatricula.getText(), 
						Integer.parseInt(txtidpromotor.getText()), 
						Float.valueOf(txtPrecio.getText()),
						Integer.parseInt(txtidagencia.getText()));
				
				
				txtIDDestino.setText(" ");
				txtIDOrigen.setText(" ");
				txtFechaVenta.setText(" ");
				txtHoraVenta.setText(" ");
				txtFechaSalida.setText(" ");
				txtHoraSalida.setText(" ");
				txtObservaciones.setText(" ");
				txtidmedios.setText(" ");
				txtMatricula.setText(" ");
				txtidpromotor.setText(" ");
				txtPrecio.setText(" ");
				txtidagencia.setText(" ");
				txtcodigo.setText(" ");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(115, 596, 144, 51);
		contentPane.add(btnNewButton_1);
	}
}
