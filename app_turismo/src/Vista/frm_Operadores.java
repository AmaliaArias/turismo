package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Operadores;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm_Operadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtmatricula;
	private JTextField txtnumeroDocum;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtResidencia;
	private JTextField txtCorreo;
	private JLabel lblNewLabel_5;
	private JTextField txtTelefono;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtidvehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Operadores frame = new frm_Operadores();
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
	public frm_Operadores() {
		setTitle("Operadores Turismo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(7, 214, 87, 14);
		contentPane.add(lblNewLabel);
		
		txtmatricula = new JTextField();
		txtmatricula.setBounds(111, 211, 86, 20);
		contentPane.add(txtmatricula);
		txtmatricula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setBounds(7, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbxTipoDoc = new JComboBox();
		cbxTipoDoc.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "PS", "CE", "PAP"}));
		cbxTipoDoc.setToolTipText("");
		cbxTipoDoc.setBounds(124, 21, 95, 22);
		contentPane.add(cbxTipoDoc);
		
		txtnumeroDocum = new JTextField();
		txtnumeroDocum.setToolTipText("Escriba Su Numero de Documento");
		txtnumeroDocum.setBounds(243, 22, 86, 20);
		contentPane.add(txtnumeroDocum);
		txtnumeroDocum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(7, 92, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(93, 54, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion Residencia");
		lblNewLabel_3.setBounds(7, 122, 105, 14);
		contentPane.add(lblNewLabel_3);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(93, 89, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtResidencia = new JTextField();
		txtResidencia.setBounds(133, 119, 86, 20);
		contentPane.add(txtResidencia);
		txtResidencia.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(7, 159, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(63, 156, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JButton btnGuardarOperadores = new JButton("Guardar");
		btnGuardarOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				Operadores op = new Operadores();
				
				op.create(String.valueOf(cbxTipoDoc.getSelectedItem()), 
						txtNombre.getText(), 
						txtApellido.getText(),
						txtResidencia.getText(), 
						txtCorreo.getText(), 
						Integer.parseInt(txtTelefono.getText()),
						Integer.parseInt(txtidvehiculo.getText()),
						txtmatricula.getText(),
						Integer.parseInt(txtnumeroDocum.getText()));
				
				
				txtNombre.setText(" ");
				txtnumeroDocum.setText(" ");
				txtApellido.setText(" ");
				txtResidencia.setText(" ");
				txtCorreo.setText(" ");
				txtTelefono.setText(" ");
				txtidvehiculo.setText(" ");
				txtmatricula.setText(" ");
				txtnumeroDocum.setText(" ");
			}
		});
		btnGuardarOperadores.setBounds(302, 232, 89, 23);
		contentPane.add(btnGuardarOperadores);
		
		lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setBounds(7, 186, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(111, 183, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Tipo de Documento");
		lblNewLabel_6.setBounds(10, 25, 104, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("id Vehiculo");
		lblNewLabel_7.setBounds(7, 236, 87, 14);
		contentPane.add(lblNewLabel_7);
		
		txtidvehiculo = new JTextField();
		txtidvehiculo.setBounds(111, 233, 86, 20);
		contentPane.add(txtidvehiculo);
		txtidvehiculo.setColumns(10);
	}
}
