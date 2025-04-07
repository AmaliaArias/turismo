package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Cliente;

import javax.swing.JLabel;
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
	private JTextField txttipodocumen;

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
		setBounds(100, 100, 443, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 85, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 117, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dirección");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 146, 74, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EPS");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 182, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Alergias");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_6.setBounds(10, 211, 74, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 245, 135, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8.setBounds(10, 284, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Estado Civil");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_9.setBounds(10, 321, 93, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Telefono");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_10.setBounds(10, 359, 74, 14);
		contentPane.add(lblNewLabel_10);
		
		txtdocumento = new JTextField();
		txtdocumento.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtdocumento.setToolTipText("Escriba su numero de documnto");
		txtdocumento.setBounds(155, 51, 86, 20);
		contentPane.add(txtdocumento);
		txtdocumento.setColumns(10);
		
		JButton btnGuardarCliente = new JButton("SAVE");
		btnGuardarCliente.setBackground(new Color(36, 146, 255));
		btnGuardarCliente.setFont(new Font("Times New Roman", Font.BOLD, 14));
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
			
			cm.create(txttipodocumen.getText(), 
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
				
			
			txttipodocumen.setText(" ");
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
		btnGuardarCliente.setBounds(40, 388, 155, 55);
		contentPane.add(btnGuardarCliente);
		
		txtNombres = new JTextField();
		txtNombres.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtNombres.setBounds(155, 82, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtapellidos = new JTextField();
		txtapellidos.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtapellidos.setBounds(155, 114, 86, 20);
		contentPane.add(txtapellidos);
		txtapellidos.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtdireccion.setBounds(155, 143, 86, 20);
		contentPane.add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txteps = new JTextField();
		txteps.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txteps.setBounds(155, 179, 86, 20);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtalegias = new JTextField();
		txtalegias.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtalegias.setToolTipText("escriba si o no y cual");
		txtalegias.setBounds(155, 208, 86, 20);
		contentPane.add(txtalegias);
		txtalegias.setColumns(10);
		
		txtfechanacimiento = new JTextField();
		txtfechanacimiento.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtfechanacimiento.setBounds(155, 242, 86, 20);
		contentPane.add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);
		
		txtcorreo = new JTextField();
		txtcorreo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtcorreo.setBounds(155, 281, 86, 20);
		contentPane.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtestadocivil.setBounds(155, 318, 86, 20);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txttelefono.setBounds(155, 356, 86, 20);
		contentPane.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tipo Documento");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 123, 14);
		contentPane.add(lblNewLabel);
		
		JButton btndelete = new JButton("DELETE");
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
		btndelete.setBackground(new Color(36, 146, 255));
		btndelete.setBounds(260, 188, 155, 57);
		contentPane.add(btndelete);
		
		JLabel lblNewLabel_1 = new JLabel("id Clientes");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(285, 145, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		txtidcliente = new JTextField();
		txtidcliente.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtidcliente.setBounds(285, 164, 56, 20);
		contentPane.add(txtidcliente);
		txtidcliente.setColumns(10);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Cliente cm = new Cliente();
				
				cm.readOne(Integer.parseInt(txtidcliente.getText()), txttipodocumen, txtdocumento, txtNombres, txtapellidos, txteps, txtalegias, txtfechanacimiento, txtcorreo, txtestadocivil, txttelefono, txtdireccion);
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(265, 284, 150, 51);
		contentPane.add(btnbuscar);
		
		txttipodocumen = new JTextField();
		txttipodocumen.setBounds(155, 8, 86, 20);
		contentPane.add(txttipodocumen);
		txttipodocumen.setColumns(10);
		
		JLabel lblNumeroDocumento = new JLabel("Numero Documento");
		lblNumeroDocumento.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNumeroDocumento.setBounds(10, 54, 123, 14);
		contentPane.add(lblNumeroDocumento);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Cliente cm = new Cliente();
				
				cm.update(Integer.parseInt(txtidcliente.getText()), 
						txttipodocumen.getText(), 
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
				
				
				txtidcliente.setText(" ");
				txttipodocumen.setText(" ");
				txtdocumento.setText(" ");
				txtNombres.setText(" ");
				txtapellidos.setText(" ");
				txteps.setText(" ");
				txtalegias.setText(" ");
				txtfechanacimiento.setText(" ");
				txtcorreo.setText(" ");
				txtestadocivil.setText(" ");
				txttelefono.setText(" ");
				txtdireccion.setText(" ");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(260, 372, 144, 51);
		contentPane.add(btnNewButton_1);
	}
}
