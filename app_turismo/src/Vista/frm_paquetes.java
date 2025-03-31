package Vista;

import java.awt.BorderLayout;
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
		setBounds(100, 100, 374, 433);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 240, 142));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id Medios");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(20, 275, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("idDestino");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(20, 14, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("idOrigen");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBounds(20, 39, 54, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha Venta");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(20, 72, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hora Venta");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setBounds(20, 103, 75, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Fecha Salida");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setBounds(20, 134, 75, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Hora Salida");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setBounds(20, 163, 75, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		txtidmedios = new JTextField();
		txtidmedios.setBounds(132, 272, 86, 20);
		contentPane.add(txtidmedios);
		txtidmedios.setColumns(10);
		
		txtIDDestino = new JTextField();
		txtIDDestino.setColumns(10);
		txtIDDestino.setBounds(132, 11, 86, 20);
		contentPane.add(txtIDDestino);
		
		txtIDOrigen = new JTextField();
		txtIDOrigen.setColumns(10);
		txtIDOrigen.setBounds(132, 39, 86, 20);
		contentPane.add(txtIDOrigen);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(20, 200, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Observaciones");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(15, 225, 80, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnGurdarPaquete = new JButton("Guardar");
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
		btnGurdarPaquete.setBounds(242, 310, 89, 23);
		contentPane.add(btnGurdarPaquete);
		
		txtFechaVenta = new JTextField();
		txtFechaVenta.setBounds(132, 69, 86, 20);
		contentPane.add(txtFechaVenta);
		txtFechaVenta.setColumns(10);
		
		txtHoraVenta = new JTextField();
		txtHoraVenta.setBounds(132, 100, 86, 20);
		contentPane.add(txtHoraVenta);
		txtHoraVenta.setColumns(10);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setBounds(132, 131, 86, 20);
		contentPane.add(txtFechaSalida);
		txtFechaSalida.setColumns(10);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setBounds(132, 160, 86, 20);
		contentPane.add(txtHoraSalida);
		txtHoraSalida.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(132, 191, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setBounds(132, 222, 86, 41);
		contentPane.add(txtObservaciones);
		txtObservaciones.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setForeground(Color.BLACK);
		lblMatricula.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMatricula.setBounds(20, 303, 75, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(132, 300, 86, 20);
		contentPane.add(txtMatricula);
		
		JLabel lblIdPromotor = new JLabel("id Promotor");
		lblIdPromotor.setForeground(Color.BLACK);
		lblIdPromotor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblIdPromotor.setBounds(20, 331, 75, 14);
		contentPane.add(lblIdPromotor);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setColumns(10);
		txtidpromotor.setBounds(132, 328, 86, 20);
		contentPane.add(txtidpromotor);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("id Agencia");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(20, 356, 75, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBounds(132, 356, 86, 20);
		contentPane.add(txtidagencia);
	}
}
