package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Medios;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class frm_Medios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtidtipomedio;
	private JTextField txtNombreMedios;
	private JTextField txtObservacionMedio;
	private JTextField txtidMedios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Medios frame = new frm_Medios();
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
	public frm_Medios() {
		setTitle("Medios de Turismo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 434);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 159, 207));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(319, 11, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observación");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 146, 117, 14);
		contentPane.add(lblNewLabel_2);
		
		txtidtipomedio = new JTextField();
		txtidtipomedio.setBackground(new Color(255, 236, 255));
		txtidtipomedio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtidtipomedio.setBounds(170, 42, 112, 20);
		contentPane.add(txtidtipomedio);
		txtidtipomedio.setColumns(10);
		
		txtNombreMedios = new JTextField();
		txtNombreMedios.setBackground(new Color(255, 236, 255));
		txtNombreMedios.setToolTipText("Escriba el medio ");
		txtNombreMedios.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtNombreMedios.setBounds(312, 42, 112, 20);
		contentPane.add(txtNombreMedios);
		txtNombreMedios.setColumns(10);
		
		JButton btnGuardarMedios = new JButton("Guardar");
		btnGuardarMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2931176_diskette_guardar_save_disk_drive_icon.png"));
		btnGuardarMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarMedios.setBackground(new Color(255, 45, 255));
		btnGuardarMedios.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardarMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				Medios cm = new Medios();
				
				cm.create(txtNombreMedios.getText(), 
						txtObservacionMedio.getText(), 
						Integer.parseInt(txtidtipomedio.getText()));	
			
				txtNombreMedios.setText(" ");
				txtObservacionMedio.setText(" ");
				txtidtipomedio.setText(" ");
			}
		});
		btnGuardarMedios.setBounds(288, 193, 146, 57);
		contentPane.add(btnGuardarMedios);
		
		JLabel lblNewLabel_2_1 = new JLabel("id Tipo Medios");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(180, 11, 117, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtObservacionMedio = new JTextField();
		txtObservacionMedio.setBackground(new Color(255, 236, 255));
		txtObservacionMedio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtObservacionMedio.setColumns(10);
		txtObservacionMedio.setBounds(10, 170, 136, 57);
		contentPane.add(txtObservacionMedio);
		
		JTextPane txtpnRedesSociales = new JTextPane();
		txtpnRedesSociales.setEditable(false);
		txtpnRedesSociales.setBackground(new Color(255, 236, 255));
		txtpnRedesSociales.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtpnRedesSociales.setText("    Tipos de Medios\r\n\r\n1. Llamada face to face\r\n6. Redes Sociales \r\n7.  Mapas Digitales \r\n8. Oficinas Turisticas");
		txtpnRedesSociales.setBounds(10, 11, 154, 108);
		contentPane.add(txtpnRedesSociales);
		
		JLabel lblNewLabel = new JLabel("id Medios");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(215, 73, 82, 27);
		contentPane.add(lblNewLabel);
		
		txtidMedios = new JTextField();
		txtidMedios.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtidMedios.setBounds(312, 73, 56, 27);
		contentPane.add(txtidMedios);
		txtidMedios.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(new Color(255, 45, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Medios cm = new Medios();
				
				cm.delete(Integer.parseInt(txtidMedios.getText()));	
			
				txtidMedios.setText(" ");
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8664938_trash_can_delete_remove_icon.png"));
		btnNewButton.setBounds(288, 112, 136, 57);
		contentPane.add(btnNewButton);
		
		JButton btnbuscar = new JButton("SEARCH");
		btnbuscar.setBackground(new Color(255, 45, 255));
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Medios cm = new Medios();
				
				cm.readOne(Integer.parseInt(txtidMedios.getText()), txtNombreMedios, txtObservacionMedio, txtidtipomedio);
				
			}
		});
		btnbuscar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\211817_search_strong_icon.png"));
		btnbuscar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnbuscar.setBounds(288, 277, 150, 51);
		contentPane.add(btnbuscar);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setBackground(new Color(255, 45, 255));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Medios cm = new Medios();
				
				cm.update(Integer.parseInt(txtidMedios.getText()), 
						txtNombreMedios.getText(), 
						txtObservacionMedio.getText(), 
						Integer.parseInt(txtidtipomedio.getText()));
				
				
				txtidMedios.setText(" ");
				txtNombreMedios.setText(" ");
				txtObservacionMedio.setText(" ");
				txtidtipomedio.setText(" ");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\172618_update_icon.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(125, 277, 144, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("BACK");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				frm_icon icon = new frm_icon ();
				
				icon.setVisible(true);
				
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4470662_app_back_mobile_ui_ux_icon.png"));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(11, 339, 135, 46);
		contentPane.add(btnNewButton_1_1);
	}
}
