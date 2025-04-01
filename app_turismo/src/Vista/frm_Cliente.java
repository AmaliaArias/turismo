package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class frm_Cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdocumento;
	private JTextField txtNombres;
	private JTextField txtapellidos;
	private JTextField txtdireccion;
	private JTextField txteps;
	private JTextField txtalegias;
	private JTextField txtfechanacimiento;
	private JTextField txtcorreo;
	private JTextField txtestadocivil;
	private JTextField txttelefono;
	private JTextField txtidcliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Cliente frame = new frm_Cliente();
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
	public frm_Cliente() {
		setTitle("Tabla Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(10, 85, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setBounds(10, 117, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dirección");
		lblNewLabel_4.setBounds(10, 146, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EPS");
		lblNewLabel_5.setBounds(10, 182, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Alergias");
		lblNewLabel_6.setBounds(10, 211, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_7.setBounds(10, 245, 123, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setBounds(10, 284, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Estado Civil");
		lblNewLabel_9.setBounds(10, 321, 74, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Telefono");
		lblNewLabel_10.setBounds(10, 359, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JComboBox cbxtipodoc = new JComboBox();
		cbxtipodoc.setModel(new DefaultComboBoxModel(new String[] {"CC ", "CE", "TI", "PS", "PEP"}));
		cbxtipodoc.setBounds(167, 52, 142, 22);
		contentPane.add(cbxtipodoc);
		
		txtdocumento = new JTextField();
		txtdocumento.setToolTipText("Escriba su numero de documnto");
		txtdocumento.setBounds(319, 53, 86, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		JButton btnGuardarCliente = new JButton("Guardar");
		btnGuardarCliente.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGuardarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			Cliente cm = new Cliente();
			
			//JOptionPane.showConfirmDialog(null, String.valueOf(cbxtipodoc.getSelectedItem()));
			
			cm.create(String.valueOf(cbxtipodoc.getSelectedItem()), 
					Integer.parseInt(txtdocumento.getText()), 
					txtNombres.getText(), 
					txtapellidos.getText(),
					txteps.getText(), 
					txtalegias.getText(), 
					txtfechanacimiento.getText(),
					txtcorreo.getText(), 
					txtestadocivil.getText(), 
					Integer.parseInt(txttelefono.getText()),
					txtdireccion.getText()); 
				
			
			
			txtNombres.setText(" ");
			txteps.setText(" ");
			txtapellidos.setText(" ");
			txtalegias.setText(" ");
			txtfechanacimiento.setText(" ");
			txtcorreo.setText(" ");
			txtestadocivil.setText(" ");
			txttelefono.setText(" ");
			txtdireccion.setText(" ");
			}
		});
		btnGuardarCliente.setBounds(260, 321, 133, 52);
		contentPane.add(btnGuardarCliente);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(155, 82, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setBounds(155, 114, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(155, 143, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txteps = new JTextField();
		txteps.setBounds(155, 179, 86, 20);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtalegias = new JTextField();
		txtalegias.setToolTipText("escriba si o no y cual");
		txtalegias.setBounds(155, 208, 86, 20);
		contentPane.add(txtalegias);
		txtalegias.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setBounds(155, 242, 86, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(155, 281, 86, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setBounds(155, 318, 86, 20);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(155, 356, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo Documento");
		lblNewLabel.setBounds(10, 56, 123, 14);
		contentPane.add(lblNewLabel);
		
		JButton btndelete = new JButton("ELIMINAR");
		btndelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Cliente cm = new Cliente();
				
				cm.delete(Integer.parseInt(txtidcliente.getText()));
				
				txtidcliente.setText(" ");
			}
		});
		btndelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btndelete.setForeground(Color.BLACK);
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btndelete.setBackground(new Color(255, 255, 255));
		btndelete.setBounds(260, 188, 155, 57);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_1 = new JLabel("id Clientes");
		lblNewLabel_1.setBounds(309, 146, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidcliente = new JTextField();
		txtidcliente.setBounds(285, 164, 86, 20);
		contentPane.add(txtidcliente);
		txtidcliente.setColumns(10);
	}
}
