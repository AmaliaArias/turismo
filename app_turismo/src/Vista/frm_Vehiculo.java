package Vista;

import java.awt.EventQueue;
import java.awt.ImageCapabilities;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm_Vehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtidVehiculo;
	private JTextField txtmarca;
	private JTextField txtpuestos;
	private JTextField txtmodelo;
	private JTextField txtnumeromotor;
	private JTextField txtcategoria;
	private JTextField txtidtipovh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Vehiculo frame = new frm_Vehiculo();
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
	public frm_Vehiculo() {
		setTitle("Tabla Vehiculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdVehiculo = new JLabel("Matricula");
		lblIdVehiculo.setBounds(10, 59, 99, 14);
		contentPane.add(lblIdVehiculo);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(143, 56, 86, 20);
		contentPane.add(txtMatricula);
		
		txtidVehiculo = new JTextField();
		txtidVehiculo.setColumns(10);
		txtidVehiculo.setBounds(143, 29, 86, 20);
		contentPane.add(txtidVehiculo);
		
		JLabel Matricula = new JLabel("Id Vehiculo");
		Matricula.setBounds(10, 32, 86, 14);
		contentPane.add(Matricula);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(10, 87, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtmarca = new JTextField();
		txtmarca.setColumns(10);
		txtmarca.setBounds(143, 84, 86, 20);
		contentPane.add(txtmarca);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculo vh = new Vehiculo();
				
				vh.create(txtMatricula.getText(), 
						txtmarca.getText(),
						Integer.parseInt(txtpuestos.getText()), 
						txtmodelo.getText(), 
						Integer.parseInt(txtnumeromotor.getText()), 
						txtcategoria.getText(),
						Integer.parseInt(txtidtipovh.getText()), 
						Integer.parseInt(txtidVehiculo.getText()));				
			}
		});
		btnGuardar.setBounds(322, 221, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2_1 = new JLabel("Puestos");
		lblNewLabel_2_1.setBounds(10, 115, 86, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtpuestos = new JTextField();
		txtpuestos.setColumns(10);
		txtpuestos.setBounds(143, 112, 86, 20);
		contentPane.add(txtpuestos);
		
		JLabel lblNewLabel_2_2 = new JLabel("Modelo");
		lblNewLabel_2_2.setBounds(10, 143, 86, 14);
		contentPane.add(lblNewLabel_2_2);
		
		txtmodelo = new JTextField();
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(143, 140, 86, 20);
		contentPane.add(txtmodelo);
		
		JLabel lblNewLabel_2_3 = new JLabel("Numero Motor");
		lblNewLabel_2_3.setBounds(10, 171, 86, 14);
		contentPane.add(lblNewLabel_2_3);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setColumns(10);
		txtnumeromotor.setBounds(143, 168, 86, 20);
		contentPane.add(txtnumeromotor);
		
		JLabel lblNewLabel_2_4 = new JLabel("Categoria");
		lblNewLabel_2_4.setBounds(10, 196, 86, 14);
		contentPane.add(lblNewLabel_2_4);
		
		txtcategoria = new JTextField();
		txtcategoria.setColumns(10);
		txtcategoria.setBounds(143, 199, 86, 20);
		contentPane.add(txtcategoria);
		
		JLabel lblNewLabel = new JLabel("id Tipo de Vehiculo");
		lblNewLabel.setBounds(10, 230, 114, 14);
		contentPane.add(lblNewLabel);
		
		txtidtipovh = new JTextField();
		txtidtipovh.setBounds(143, 230, 86, 20);
		contentPane.add(txtidtipovh);
		txtidtipovh.setColumns(10);
	}

}
