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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

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
	private JButton btnNewButton;

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
		setBounds(100, 100, 465, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 164));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdVehiculo = new JLabel("Matricula");
		lblIdVehiculo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblIdVehiculo.setBounds(65, 74, 113, 14);
		contentPane.add(lblIdVehiculo);
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(227, 71, 122, 20);
		contentPane.add(txtMatricula);
		
		txtidVehiculo = new JTextField();
		txtidVehiculo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtidVehiculo.setColumns(10);
		txtidVehiculo.setBounds(227, 44, 122, 20);
		contentPane.add(txtidVehiculo);
		
		JLabel Matricula = new JLabel("Id Vehiculo");
		Matricula.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Matricula.setBounds(65, 47, 122, 14);
		contentPane.add(Matricula);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(65, 102, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		txtmarca = new JTextField();
		txtmarca.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtmarca.setColumns(10);
		txtmarca.setBounds(227, 99, 122, 20);
		contentPane.add(txtmarca);
		
		JButton btnGuardar = new JButton("SAVE");
		btnGuardar.setBackground(Color.YELLOW);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
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
				
				txtMatricula.setText("  ");
				txtmarca.setText("  ");
				txtpuestos.setText("  ");
				txtmodelo.setText("  ");
				txtnumeromotor.setText("  ");
				txtcategoria.setText("  ");
				txtidtipovh.setText("  ");
				txtidVehiculo.setText("  ");
			}
		});
		btnGuardar.setBounds(31, 287, 156, 69);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_2_1 = new JLabel("Puestos");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(65, 130, 122, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtpuestos = new JTextField();
		txtpuestos.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtpuestos.setColumns(10);
		txtpuestos.setBounds(227, 127, 122, 20);
		contentPane.add(txtpuestos);
		
		JLabel lblNewLabel_2_2 = new JLabel("Modelo");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(65, 158, 113, 14);
		contentPane.add(lblNewLabel_2_2);
		
		txtmodelo = new JTextField();
		txtmodelo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(227, 155, 122, 20);
		contentPane.add(txtmodelo);
		
		JLabel lblNewLabel_2_3 = new JLabel("Numero Motor");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(65, 186, 127, 14);
		contentPane.add(lblNewLabel_2_3);
		
		txtnumeromotor = new JTextField();
		txtnumeromotor.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtnumeromotor.setColumns(10);
		txtnumeromotor.setBounds(227, 183, 122, 20);
		contentPane.add(txtnumeromotor);
		
		JLabel lblNewLabel_2_4 = new JLabel("Categoria");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(65, 217, 122, 14);
		contentPane.add(lblNewLabel_2_4);
		
		txtcategoria = new JTextField();
		txtcategoria.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtcategoria.setColumns(10);
		txtcategoria.setBounds(227, 214, 122, 20);
		contentPane.add(txtcategoria);
		
		JLabel lblNewLabel = new JLabel("id Tipo de Vehiculo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(65, 245, 122, 14);
		contentPane.add(lblNewLabel);
		
		txtidtipovh = new JTextField();
		txtidtipovh.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtidtipovh.setBounds(227, 245, 122, 20);
		contentPane.add(txtidtipovh);
		txtidtipovh.setColumns(10);
		
		btnNewButton = new JButton("DELETE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculo vh = new Vehiculo();
				
				vh.delete(Integer.parseInt(txtidVehiculo.getText()));
				
				txtidVehiculo.setText(" ");
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setBounds(226, 290, 156, 66);
		contentPane.add(btnNewButton);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.setBackground(new Color(255, 255, 0));
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculo vh = new Vehiculo();
				
				vh.readOne(txtMatricula.getText(), txtidtipovh, txtmarca, txtpuestos, txtmodelo, txtnumeromotor, txtcategoria, txtidVehiculo);
				
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(227, 380, 145, 68);
		contentPane.add(btnbuscar);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculo vh = new Vehiculo();
				
				vh.update(txtMatricula.getText(), 
						txtmarca.getText(), 
						Integer.parseInt(txtpuestos.getText()), 
						txtmodelo.getText(), 
						Integer.parseInt(txtnumeromotor.getText()), 
						txtcategoria.getText(), 
						Integer.parseInt(txtidtipovh.getText()),
						Integer.parseInt(txtidVehiculo.getText()));
				
				
				txtidVehiculo.setText(" ");
				txtMatricula.setText(" ");
				txtmarca.setText(" ");
				txtpuestos.setText(" ");
				txtmodelo.setText(" ");
				txtnumeromotor.setText(" ");
				txtcategoria.setText(" ");
				txtcategoria.setText(" ");
				txtidtipovh.setText(" ");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(31, 380, 144, 68);
		contentPane.add(btnNewButton_1);
	}
}
