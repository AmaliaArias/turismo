package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Promotor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;

public class frm_Promotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfechanac;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtdireccion;
	private JTextField txtcorreopersonal;
	private JTextField txtcorreocorpo;
	private JTextField txtnumerod;
	private JTextField txttelefono;
	private JTextField txttipodocumento;
	private JLabel lblNewLabel_1;
	private JTextField txtidpromotor;
	private JButton btnNewButton;
	private JButton btnbuscar;
	private JTextField txtcontrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Promotor frame = new frm_Promotor();
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
	public frm_Promotor() {
		setTitle("Tabla Promotor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 434);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(132, 255, 132));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtfechanac = new JTextField();
		txtfechanac.setColumns(10);
		txtfechanac.setBounds(143, 220, 86, 20);
		contentPane.add(txtfechanac);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(10, 223, 86, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(10, 82, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtnombre = new JTextField();
		txtnombre.setColumns(10);
		txtnombre.setBounds(143, 79, 86, 20);
		contentPane.add(txtnombre);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellidos");
		lblNewLabel_2_1.setBounds(10, 110, 86, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		txtapellido.setBounds(143, 107, 86, 20);
		contentPane.add(txtapellido);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dirección");
		lblNewLabel_2_2.setBounds(10, 138, 86, 14);
		contentPane.add(lblNewLabel_2_2);
		
		txtdireccion = new JTextField();
		txtdireccion.setColumns(10);
		txtdireccion.setBounds(143, 135, 86, 20);
		contentPane.add(txtdireccion);
		
		txtcorreopersonal = new JTextField();
		txtcorreopersonal.setColumns(10);
		txtcorreopersonal.setBounds(143, 166, 86, 20);
		contentPane.add(txtcorreopersonal);
		
		JLabel lblNewLabel_2_3 = new JLabel("Correo Personal");
		lblNewLabel_2_3.setBounds(10, 169, 86, 14);
		contentPane.add(lblNewLabel_2_3);
		
		txtcorreocorpo = new JTextField();
		txtcorreocorpo.setColumns(10);
		txtcorreocorpo.setBounds(143, 197, 86, 20);
		contentPane.add(txtcorreocorpo);
		
		JLabel lblNewLabel_2_4 = new JLabel("Correo Corporativo");
		lblNewLabel_2_4.setBounds(10, 200, 110, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JButton btnGuardar = new JButton("SAVE");
		btnGuardar.setBackground(new Color(128, 255, 0));
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Promotor pm = new Promotor();

				pm.create(txttipodocumento.getText(),
						Integer.parseInt(txtnumerod.getText()), 
						txtnombre.getText(), 
						txtapellido.getText(),
						txtdireccion.getText(), 
						txtcorreopersonal.getText(), 
						txtcorreocorpo.getText(), 
						txtfechanac .getText(),
						Integer.parseInt(txttelefono.getText()),
						txtcontrasena.getText());
						
					
				
			
				
						txttipodocumento.setText(" ");
						txtnumerod.setText(" ");
						txtnombre.setText(" ");
						txtapellido.setText(" ");
						txtdireccion.setText(" ");
						txtcorreopersonal.setText(" ");
						txtcorreocorpo.setText(" ");
						txtfechanac.setText(" ");
						txttelefono.setText(" ");
			}
		});
		btnGuardar.setBounds(41, 300, 135, 62);
		contentPane.add(btnGuardar);
		
		txtnumerod = new JTextField();
		txtnumerod.setToolTipText("Escriba el numero de  documento");
		txtnumerod.setColumns(10);
		txtnumerod.setBounds(143, 48, 86, 20);
		contentPane.add(txtnumerod);
		
		JLabel lblNewLabel_2_5 = new JLabel("Telefono");
		lblNewLabel_2_5.setBounds(10, 254, 86, 14);
		contentPane.add(lblNewLabel_2_5);
		
		txttelefono = new JTextField();
		txttelefono.setColumns(10);
		txttelefono.setBounds(143, 251, 86, 20);
		contentPane.add(txttelefono);
		
		JLabel lblNewLabel = new JLabel("Tipo De Documento");
		lblNewLabel.setBounds(10, 15, 99, 14);
		contentPane.add(lblNewLabel);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setToolTipText("Escriba el numero de  documento");
		txttipodocumento.setColumns(10);
		txttipodocumento.setBounds(143, 9, 86, 20);
		contentPane.add(txttipodocumento);
		
		JLabel lblNumeroDeDocumento = new JLabel("Numero de Documento");
		lblNumeroDeDocumento.setBounds(10, 51, 123, 14);
		contentPane.add(lblNumeroDeDocumento);
		
		lblNewLabel_1 = new JLabel("ID Promotor");
		lblNewLabel_1.setBounds(289, 51, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidpromotor = new JTextField();
		txtidpromotor.setBounds(289, 79, 86, 20);
		contentPane.add(txtidpromotor);
		txtidpromotor.setColumns(10);
		
		btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotor pm = new Promotor();
				
				pm.delete(Integer.parseInt(txtidpromotor.getText()));
				
				txtidpromotor.setText(" ");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setBounds(289, 104, 135, 62);
		contentPane.add(btnNewButton);
		
		btnbuscar = new JButton("SEARCH");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Promotor pm = new Promotor();
				
				pm.readOne(Integer.parseInt(txtidpromotor.getText()), txttipodocumento,txtnumerod, txtnombre, txtapellido, txtdireccion, txtcorreopersonal, txtcorreocorpo, txtfechanac, txttelefono);
				
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(274, 200, 150, 51);
		contentPane.add(btnbuscar);
		
		txtcontrasena = new JTextField();
		txtcontrasena.setText("ESTO NO ES NADA");
		txtcontrasena.setToolTipText("");
		txtcontrasena.setColumns(10);
		txtcontrasena.setBounds(288, 342, 123, 20);
		contentPane.add(txtcontrasena);
	}
}
